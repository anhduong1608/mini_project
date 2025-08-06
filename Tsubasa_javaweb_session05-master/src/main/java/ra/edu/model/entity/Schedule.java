package ra.edu.model.entity;

import java.util.Date;

public class Schedule {
    private Integer id;
    private String movieTitle;
    private Integer movieId;
    private Date showTime;
    private Integer screenRoomId;
    private Integer availableSeats;
    private String format;

    public Schedule() {
    }

    public Schedule(Integer id, String movieTitle, Integer movieId, Date showTime, Integer screenRoomId, Integer availableSeats, String format) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.movieId = movieId;
        this.showTime = showTime;
        this.screenRoomId = screenRoomId;
        this.availableSeats = availableSeats;
        this.format = format;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public Integer getScreenRoomId() {
        return screenRoomId;
    }

    public void setScreenRoomId(Integer screenRoomId) {
        this.screenRoomId = screenRoomId;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
