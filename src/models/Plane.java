package models;

import util.ValidatorUtil;

public class Plane {

//    model - name of the plane (Any not empty string)
//    country - country the plane belongs to (Any not empty string)
//    year - year of publishing  (from 1903 to 2020)
//    hours - hours in air (from 0 to 10000)
//    military - is military or not
//    engineType - type of engine (Any not empty string, for ex: "Rolls-Royce Trent 900" )
//    weight - weight of plane (from 1000 KG to 160000 KG)
//    wingspan - the maximum extent across the wings of an aircraft (from 10 - 45)
//    topSpeed - maximal speed per hour (1000 km/h) (any not negative value)
//    seats - number of seats (any not negative value)
//    cost - cost of the plane (ex: 445.6$) (any not negative value)
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean isMilitary;
    private String engineType;
    private double weight;
    private double wingspan;
    private double topSpeed;
    private int seats;
    private double cost;

    private String defaultString = "SECRET";
    private ValidatorUtil validatorUtil;

    public Plane(String model, String country, int year) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.validatorUtil = new ValidatorUtil();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!validatorUtil.isEmptyOrIsNull(model)){
            this.model = model;
        }else {
            this.model = defaultString;
        }

    }
    


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if ((!validatorUtil.isEmptyOrIsNull(country)) && (validatorUtil.isValidCountryName(country))){
            this.country = country;
        }
        this.country = defaultString;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (validatorUtil.isValidYear(year)) {
            this.year = year;
        }else {
            this.year = -1;
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (validatorUtil.isValidHours(hours)) {
            this.hours = hours;
        }else {
            this.hours = 0;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        this.isMilitary = military;
    }



    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (!validatorUtil.isEmptyOrIsNull(engineType)){
            this.engineType = engineType;
        }else {
            this.engineType = defaultString;
        }

    }



    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {
        if (validatorUtil.isValidWeight(weight)){
            this.weight = weight;
        }else {
            this.weight = -1;
        }

    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        if (validatorUtil.isValidWingspan(wingspan)) {
            this.wingspan = wingspan;
        }
        else {
            this.wingspan = -1;
        }
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if (validatorUtil.isValidSpeed(topSpeed)) {
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed = -1;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (validatorUtil.isValidSeatsNumber(seats)){
            this.seats = seats;
        }else {
            this.seats = -1;
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (validatorUtil.isValidCoast(cost)) {
            this.cost = cost;
        }else {
            this.cost = -1;
        }
    }
    
    
    


}
