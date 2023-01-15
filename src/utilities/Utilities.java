package utilities;

public class Utilities {
    public static int a = 0;
    public static String validationAndDefaultSet(String input, String defaultValue) {
        return input == null || input.isBlank() ? defaultValue : input;
    }
    public static double validationAndDefaultSet(double input, int defaultValue) {
        return input > 0 ? input : defaultValue;
    }
    public static int validationAndDefaultSet(int input, int defaultValue) {
        return input > 0 ? input : defaultValue;
    }
}
