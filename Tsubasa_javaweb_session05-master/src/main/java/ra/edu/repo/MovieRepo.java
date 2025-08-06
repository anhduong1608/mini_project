package ra.edu.repo;

import ra.edu.db.DBUtility;
import ra.edu.model.entity.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRepo {
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        conn = DBUtility.openConnection();
        try {
            pstmt = conn.prepareStatement("select * from Movie");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setDirector(rs.getString("director"));
                movie.setDescription(rs.getString("description"));
                movie.setDuration(rs.getString("duration"));
                movie.setGenre(rs.getString("genre"));
                movie.setLanguage(rs.getString("language"));
                movies.add(movie);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtility.closeConnection(conn);
        }
        return movies;
    }

    public boolean isExistsTittle(String title) {
        Connection conn = null;
        CallableStatement callStmt = null;
        try {
            conn = DBUtility.openConnection();
            callStmt = conn.prepareCall("{call mini_project_tsubasplus.is_tittle_exists(?)}");
            callStmt.setString(1, title);
            callStmt.execute();
            int result = callStmt.getInt(1);
            if (result == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtility.closeConnection(conn);
        }
        return false;
    }

    public boolean creatMovie(Movie movie) {
        Connection conn = null;
        CallableStatement callStmt = null;
        try {
            conn = DBUtility.openConnection();
            callStmt = conn.prepareCall("{CALL mini_project_tsubasplus.creat_movie(?,?,?,?,?,?)}");
            callStmt.setString(1, movie.getTitle());
            callStmt.setString(2, movie.getDirector());
            callStmt.setString(4, movie.getDescription());
            callStmt.setString(5, movie.getDuration());
            callStmt.setString(3, movie.getGenre());
            callStmt.setString(6, movie.getLanguage());
            int affected = callStmt.executeUpdate();
            if (affected > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtility.closeConnection(conn);
        }
        return false;
    }

    public Movie getMovie(int id) {
        Connection conn = null;
        CallableStatement callStmt = null;
        ResultSet rs = null;
        Movie movie = null;
        try {
            conn = DBUtility.openConnection();
            callStmt = conn.prepareCall("{CALL mini_project_tsubasplus.find_movie_by_id(?)}");
            callStmt.setInt(1, id);
            rs = callStmt.executeQuery();
            if (rs.next()) {
                movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setDirector(rs.getString("director"));
                movie.setDescription(rs.getString("description"));
                movie.setDuration(rs.getString("duration"));
                movie.setGenre(rs.getString("genre"));
                movie.setLanguage(rs.getString("language"));
                return movie;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtility.closeConnection(conn);
        }
        return movie;
    }

    public boolean updateMovie(Movie movie) {
        Connection conn = null;
        CallableStatement callStmt = null;
        try {

            conn = DBUtility.openConnection();
            callStmt = conn.prepareCall("{CALL mini_project_tsubasplus.update_movie(?,?,?,?,?,?,?)}");
            callStmt.setInt(1, movie.getId());
            callStmt.setString(2, movie.getTitle());
            callStmt.setString(3, movie.getDirector());
            callStmt.setString(5, movie.getDescription());
            callStmt.setString(6, String.valueOf(Integer.parseInt(movie.getDuration())));
            callStmt.setString(4, movie.getGenre());
            callStmt.setString(7, movie.getLanguage());
            int affected = callStmt.executeUpdate();
            if (affected > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtility.closeConnection(conn);
        }
        return false;
    }
}
