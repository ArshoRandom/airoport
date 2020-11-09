package util;

public class ValidatorUtil {

    public boolean isValidCountryName(String model){
        for (int i = 0; i < model.length(); i++) {
            char symbol = model.charAt(i);
            if (!((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z'))){
                return false;
            }
        }
        return true;
    }

    public boolean isValidHours(double hours){
        return hours >= 0 && hours <= 10_000;
    }

    public boolean isValidYear(int year){
        return year >= 1903 && year <= 2020;
    }

    public boolean isEmptyOrIsNull(String model){
        return model == null || model.trim().length() == 0;
    }

    public boolean isValidWingspan(double wingspan){
        return wingspan >= 10 && wingspan <= 45;
    }

    public boolean isValidSpeed(double speed){
        return speed > 0 && speed <= 1000;
    }

    public boolean isValidSeatsNumber(int seats){
        return seats > 0 && seats <= 450;
    }

    public boolean isValidCoast(double coast){
        return coast > 0;
    }

    public boolean isValidWeight(double weight) {
        return weight >= 1000 && weight <= 160_000;

    }
}
