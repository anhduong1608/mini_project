package ra.edu.controller.movie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ra.edu.model.entity.Movie;
import ra.edu.repo.MovieRepo;
import ra.edu.service.impl.MovieServiceImpl;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/update")
public class update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("updateHome")) {
            int id = Integer.parseInt(req.getParameter("id"));
            Movie movie = new MovieServiceImpl().getMovie(id);
            System.out.println(movie);
            req.setAttribute("movie", movie);
            req.getRequestDispatcher("movie/movieupdate.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        Movie movie = new Movie();
        movie.setId(Integer.parseInt(req.getParameter("id")));
        movie.setTitle(req.getParameter("title"));
        movie.setDirector(req.getParameter("director"));
        movie.setDescription(req.getParameter("description"));
        movie.setDuration(req.getParameter("duration"));
        movie.setGenre(req.getParameter("genre"));
        movie.setLanguage(req.getParameter("language"));
        System.out.println(movie);
        boolean result = new MovieRepo().updateMovie(movie);
        System.out.println(result);
        if (result) {
            List<Movie> movies = new MovieRepo().getMovies();
            req.setAttribute("movies", movies);
            req.getRequestDispatcher("movie/moviesAdmin.jsp").forward(req, resp);
        }else {
            req.setAttribute("msg", "Cập nhật không thành công!");
            req.getRequestDispatcher("movie/movieupdate.jsp").forward(req, resp);
        }

    }
}
