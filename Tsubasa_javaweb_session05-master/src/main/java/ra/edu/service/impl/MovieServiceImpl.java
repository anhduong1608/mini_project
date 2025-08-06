package ra.edu.service.impl;

import ra.edu.model.entity.Movie;
import ra.edu.repo.MovieRepo;
import ra.edu.service.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    @Override
    public List<Movie> getMovies() {
        return new MovieRepo().getMovies();
    }

    @Override
    public boolean isExistsTittle(String title) {
        return new MovieRepo().isExistsTittle(title);
    }

    @Override
    public boolean createMovie(Movie movie) {
        return new MovieRepo().creatMovie(movie);
    }

    @Override
    public Movie getMovie(int id) {
        return new MovieRepo().getMovie(id);
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return new MovieRepo().updateMovie(movie);
    }
}
