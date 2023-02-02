package utilities;

import transport.enums.BodyType;
import transport.enums.LoadCapacity;

public class Utilities {
    public static String validationAndDefaultSet(String input, String defaultValue) {
        return input == null || input.isBlank() ? defaultValue : input;
    }
    public static double validationAndDefaultSet(double input, double defaultValue) {
        return input > 0 ? input : defaultValue;
    }
    public static int validationAndDefaultSet(int input, int defaultValue) {
        return input > 0 ? input : defaultValue;
    }

}
