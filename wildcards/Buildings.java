package wildcards;

public class Buildings {

    private int numberOfRooms = 7;

    @Override
    public String toString() {
        return "Building Default " + this.numberOfRooms;
    }

    public void setRooms(int roomCount) {
        numberOfRooms = roomCount;
    }

    public int getRooms() {
        return numberOfRooms;
    }

}