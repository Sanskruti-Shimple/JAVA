public class primitive_variable_range {
    public static void main(String[] args) {
        int value = 1000;
        int maxRange = Byte.MAX_VALUE;
        int minRange = Byte.MIN_VALUE;
        System.out.println("Byte Max Value is: " + maxRange);
        System.out.println("Byte Min Value is: " + minRange);

        short maxValue = Short.MAX_VALUE;
        short minValue = Short.MIN_VALUE;
        System.out.println("Short Max Value is: " + maxValue);
        System.out.println("Short Min Value is: " + minValue);

        long maxVal = Long.MAX_VALUE;
        long minVal = Long.MIN_VALUE;
        System.out.println("Long Max Value is: " + maxVal);
        System.out.println("Long Min Value is: " + minVal);

        float floatmaxvalue = Float.MAX_VALUE;
        float floatminvalue = Float.MIN_VALUE;
        System.out.println("Float Max Value is: " + floatmaxvalue);
        System.out.println("Float Min Value is: " + floatminvalue);

        double DoubleMaxValue = Double.MAX_VALUE;
        double DoubleMinValue = Double.MIN_VALUE;
        System.out.println("Double Max Value is: " + DoubleMaxValue);
        System.out.println("Double Min Value is: " + DoubleMinValue);
    }
}
