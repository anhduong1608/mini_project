package ra.edu.service;

import ra.edu.model.entity.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getMovies();
    public boolean isExistsTittle(String title);
    public boolean createMovie(Movie movie);
    public Movie getMovie(int id);
    public boolean updateMovie(Movie movie);
}
