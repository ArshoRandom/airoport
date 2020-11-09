import models.Plane;
import service.PlaneService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlaneService planeService = new PlaneService();
        Plane plane = planeService.createPlane();


    }
}
