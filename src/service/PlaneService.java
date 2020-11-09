package service;

import models.Plane;
import util.SortingUtil;
import util.ValidatorUtil;

import java.util.Scanner;

public class PlaneService {


    private SortingUtil sortingUtil;
    private Scanner scanner;
    public PlaneService() {
        this.sortingUtil = new SortingUtil();
        this.scanner = new Scanner(System.in);
    }

    public Plane createPlane(){
        System.out.println("Enter model");

        String model = scanner.nextLine();

        System.out.println("Enter country");

        String country = scanner.nextLine();

        System.out.println("Enter year");
        int year = scanner.nextInt();

        System.out.println("Enter hours");
        double hours = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Enter engine type");
        String engineType = scanner.nextLine();

        System.out.println("Enter weight");
        double weight = scanner.nextDouble();

        System.out.println("Enter wingspan");
        double wingspan = scanner.nextDouble();

        System.out.println("Enter top speed");
        double topSpeed = scanner.nextDouble();

        System.out.println("Enter seats number");
        int seats = scanner.nextInt();

        System.out.println("Enter cost");
        double cost = scanner.nextDouble();

        System.out.println("Enter is military");
        boolean isMilitary = scanner.nextBoolean();

        Plane plane = new Plane(model,country,year);
        plane.setCost(cost);
        plane.setEngineType(engineType);
        plane.setHours(hours);
        plane.setTopSpeed(topSpeed);
        plane.setWeight(weight);
        plane.setWingspan(wingspan);
        plane.setSeats(seats);
        plane.setMilitary(true);
        return plane;
    }

    public void printPlane(Plane plane) {
        System.out.printf("country : %s , model : %s, year : %d\n", plane.getCountry(), plane.getModel(), plane.getYear());
        System.out.printf("hours : %f , isMilitary : %s, engine : %s\n", plane.getHours(), plane.isMilitary(), plane.getEngineType());
        System.out.printf("weight : %f , wingspan : %f, speed : %f\n", plane.getWeight(), plane.getWingspan(), plane.getTopSpeed());
        System.out.printf("seats number : %d , cost : %f\n", plane.getSeats(), plane.getCost());
    }

    public void printCostAndSpeedIfMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.printf("Cost : %f, topSpeed : %f", plane.getCost(), plane.getTopSpeed());
        } else {
            System.out.println("Plane is not military type");
            System.out.printf("CCountry : %s, model : %s", plane.getCountry(), plane.getModel());
        }
    }

    public Plane getNewerPlane(Plane firstPlane, Plane secondPlane) {
        if (firstPlane.getYear() > secondPlane.getYear()) {
            return firstPlane;
        } else if (firstPlane.getYear() == secondPlane.getYear()) {
            return firstPlane;
        } else {
            return secondPlane;
        }
    }

    public String getBiggerWingspanPlaneModel(Plane firstPlane, Plane secondPlane) {
        if (firstPlane.getWingspan() > secondPlane.getWingspan()) {
            return firstPlane.getModel();
        } else if (firstPlane.getWingspan() == secondPlane.getWingspan()) {
            return secondPlane.getModel();
        } else {
            return secondPlane.getModel();
        }
    }

    public Plane getValuablePlaneModel(Plane firstPlane, Plane secondPlane, Plane thirdPlane) {

        Plane[] planes = {firstPlane, secondPlane, thirdPlane};
        sortingUtil.decidingSortByCosts(planes);
        return planes[0];

    }

    public void printSmallestSeatsPlane(Plane firstPlane, Plane secondPlane, Plane thirdPlane) {
        Plane[] planes = {firstPlane, secondPlane, thirdPlane};
        sortingUtil.decidingSortBySeats(planes);
        printPlane(planes[0]);
    }

    public void sortAndPrintByYear(Plane[] planes) {
        sortingUtil.sortByYear(planes);
        printArray(planes);
    }

    private void printArray(Plane[] planes) {
        for (Plane plane : planes) {
            printPlane(plane);
        }
    }

    public void printAndSortNotMilitaryPlanes(Plane[] planes) {
        Plane[] notMilitaryPlanes = new Plane[planes.length];
        int index = 0;
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                notMilitaryPlanes[index] = plane;
                index++;
            }
        }
        sortingUtil.decidingSortBySeats(notMilitaryPlanes);
        printArray(planes);
    }

    public Plane getMinimalCostPlane(Plane[] planes) {
        sortingUtil.decidingSortByCosts(planes);
        return planes[planes.length - 1];
    }

    public void printNotMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                printPlane(plane);
            }
        }
    }


}
