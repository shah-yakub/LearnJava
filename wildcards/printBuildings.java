package wildcards;

import java.util.ArrayList;
import java.util.List;

public class printBuildings {
    public static void main(String[] args) {

        List<Buildings> buildings = new ArrayList<>();
        buildings.add(new Buildings());
        buildings.get(0).setRooms(21);
        buildings.add(new Buildings());
        buildings.get(1).setRooms(40);

        printBuildingList(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office(5));
        offices.add(new Office(10));

        /*
         * this will not work as there is a type mis match.
         * printBuildings(offices);
         */

         printGenericBuildings(buildings);
         printGenericBuildings(offices);
    }

    private static void printGenericBuildings(List<? extends Buildings> buildings) {
        for(int i=0; i<buildings.size(); i++){
            System.out.println(buildings.get(i).toString());
        }
    }

    private static void printBuildingList(List<Buildings> pbuildings) {
        for (Buildings lbuilding : pbuildings) {
            System.out.println(lbuilding.toString());
        }
    }
}
