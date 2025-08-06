package ra.edu.controller.movie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ra.edu.model.entity.Movie;
import ra.edu.service.impl.MovieServiceImpl;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/LoadMovies")
public class LoadMovies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Movie> movies = new MovieServiceImpl().getMovies();
        req.setAttribute("movies", movies);
        req.getRequestDispatcher("movie/movies.jsp").forward(req, resp);
    }
}
