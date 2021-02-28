package wildcards;

public class Office extends Buildings {

    Office(int Cubicles) {
        super.setRooms(Cubicles);
    }

    @Override
    public String toString() {

        return "Office with " + this.getRooms() + " Cubicles";
    }

}
