import java.util.Scanner;

public class MinMaxArray {
    static class values {
        int minimum;
        int maximum;
    }

    private static values minmax(int[] array, int n) {
        values minmax = new values();

        if (array[0] > array[1]) {
            minmax.maximum = array[0];
            minmax.minimum = array[1];
        } else {
            minmax.maximum = array[1];
            minmax.minimum = array[0];
        }
        for (int i = 2; i < n; i++) {
            if (array[i] > minmax.maximum)
                minmax.maximum = array[i];
            else if (array[i] < minmax.minimum)
                minmax.minimum = array[i];
        }

        return minmax;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        int n;
        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Enter" + " " + n + " " + "Numbers:");
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        values minmax = minmax(array, n);
        System.out.println("Maximum Number" + " " + minmax.maximum);
        System.out.println("Minimum Number" + " " + minmax.minimum);

    }

}
