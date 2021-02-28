package wildcards;

public class RowHouse extends Buildings {

    RowHouse(int houseCount) {
        super.setRooms(houseCount);
    }

    @Override
    public String toString() {
        return "Row House with house count " + this.getRooms();
    }

}
