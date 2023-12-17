public class casting {
    public static void main(String[] args) {
        int number = 10;
        Byte number2 = 15;
        short number3 = 5;
        long longSum = 1000 * (number + number2 + number3);
        System.out.println(longSum);
        short shortSum = ((short) (1000 * number + number2 + number3));
        System.out.println(shortSum);
    }

}
