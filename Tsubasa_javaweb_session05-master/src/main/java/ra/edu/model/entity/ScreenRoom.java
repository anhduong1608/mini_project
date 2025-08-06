package ra.edu.model.entity;

public class ScreenRoom {
    private Integer id;
    private String screenRoomName;
    private Integer totalSeat;

    public ScreenRoom() {
    }

    public ScreenRoom(Integer id, String screenRoomName, Integer totalSeat) {
        this.id = id;
        this.screenRoomName = screenRoomName;
        this.totalSeat = totalSeat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScreenRoomName() {
        return screenRoomName;
    }

    public void setScreenRoomName(String screenRoomName) {
        this.screenRoomName = screenRoomName;
    }

    public Integer getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }
}
