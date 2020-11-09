package util;

import models.Plane;

public class SortingUtil {

    private void swapByIndex(Plane[] array, int index1, int index2) {
        Plane temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void decidingSortBySeats(Plane[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getSeats() < arr[j].getSeats()) {
                    swapByIndex(arr, i, j);
                }
            }
        }

    }

    public void decidingSortByCosts(Plane[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getCost() < arr[j].getCost()) {
                    swapByIndex(arr, i, j);
                }
            }
        }

    }

    public void sortByYear(Plane[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getCost() > arr[j].getCost()) {
                    swapByIndex(arr, i, j);
                }
            }
        }

    }


}
