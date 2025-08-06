package ra.edu.controller.movie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ra.edu.model.entity.Movie;
import ra.edu.service.MovieService;
import ra.edu.service.impl.MovieServiceImpl;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/AddMovie")
public class AddMovie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String director = req.getParameter("director");
        String duration = req.getParameter("duration");
        String genre = req.getParameter("genre");
        String language = req.getParameter("language");
        String description = req.getParameter("description");
        MovieServiceImpl movieService = new MovieServiceImpl();
        if(movieService.isExistsTittle(title)){
            Movie movie = new Movie();
            movie.setTitle(title);
            movie.setDirector(director);
            movie.setDuration(duration);
            movie.setGenre(genre);
            movie.setLanguage(language);
            movie.setDescription(description);
            boolean addResult=new MovieServiceImpl().createMovie(movie);
            if(addResult){
                List<Movie> movies = new MovieServiceImpl().getMovies();
                req.setAttribute("movies", movies);
                req.getRequestDispatcher("movie/moviesAdmin.jsp").forward(req, resp);

            }else {
                req.setAttribute("msg","Thêm không thành công!");
                req.getRequestDispatcher("movie/addHome.jsp").forward(req,resp);
            }

        }else {
            req.setAttribute("msg","tiêu đề không được trùng lặp!");
            req.getRequestDispatcher("movie/addHome.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
