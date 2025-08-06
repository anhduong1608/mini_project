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

@WebServlet(urlPatterns = "/AdminManagementMovie")
public class AdminManagementMovie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
    List<Movie> movies = new MovieServiceImpl().getMovies();
    request.setAttribute("movies", movies);
    request.getRequestDispatcher("movie/moviesAdmin.jsp").forward(request, response);

    }
}
