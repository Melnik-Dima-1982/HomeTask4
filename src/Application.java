import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        punktOne();
//        punktSecond();
        punktThird();
//        punktFourth();
//        punktSixth(5);
//        punktSeventh();
//        punktEighth();
    }


    public static void punktOne() {
        double[] nums = new double[10];
        int amountOfNegativeNumbers = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Create massive from 10 numbers" + '\n' + "Enter nums - ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextDouble();
            if (nums[i] < 0) {
                amountOfNegativeNumbers++;
            }
        }
        System.out.println("Amount of negative numbers in entered massive is " + amountOfNegativeNumbers);
    }

    public static void punktSecond() {
        double[] nums = new double[1000];
        double averageFirstPart = 0, averageSecondPart = 0, averageThirdPart = 0, averageFourthPart = 0;
        int lastIndexFirstPart = 249, lastIndexSecondPart = 499, lastIndexThirdPart = 749, lastIndexFourthPart = 999;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) Math.random() * 10;
        }

        for (int i = 0; i < lastIndexFirstPart + 1; i++) {
            averageFirstPart += nums[i];
        }
        averageFirstPart = averageFirstPart / (lastIndexFirstPart + 1);
        System.out.printf("Average of first part is " + "%.2f", averageFirstPart);
//        System.out.println();
//        System.out.println(averageFirstPart);

        for (int i = lastIndexFirstPart + 1; i < lastIndexSecondPart + 1; i++) {
            averageSecondPart += nums[i];
        }
        averageSecondPart /= (lastIndexFirstPart + 1);
        System.out.printf('\n' + "Average of second part is " + "%.2f", averageSecondPart);
//        System.out.println();
//        System.out.println(averageSecondPart);

        for (int i = lastIndexSecondPart + 1; i < lastIndexThirdPart + 1; i++) {
            averageThirdPart += nums[i];
        }
        averageThirdPart /= (lastIndexFirstPart + 1);
        System.out.printf('\n' + "Average of third part is " + "%.2f", averageThirdPart);
//        System.out.println();
//        System.out.println(averageThirdPart);

        for (int i = lastIndexThirdPart + 1; i < lastIndexFourthPart + 1; i++) {
            averageFourthPart += nums[i];
        }
        averageFourthPart /= (lastIndexFirstPart + 1);
        System.out.printf('\n' + "Average of fourth part is " + "%.2f", averageFourthPart);
//        System.out.println();
//        System.out.println(averageFourthPart);

        double[] averages = {averageFirstPart, averageSecondPart, averageThirdPart, averageFourthPart};
        int indexMaxAverage = 0;
        for (int j = 1; j < averages.length; j++) {
            if (averages[j] > averages[j - 1]) {
                indexMaxAverage = j;
            }
        }
        System.out.println();
//        System.out.println("indexMaxAverage - " + indexMaxAverage);
        switch (indexMaxAverage) {
            case 0:
                System.out.println("Max average in first quarter - " + averages[indexMaxAverage]);
                break;
            case 1:
                System.out.println("Max average in second quarter - " + averages[indexMaxAverage]);
                break;
            case 2:
                System.out.println("Max average in third quarter - " + averages[indexMaxAverage]);
                break;
            case 3:
                System.out.println("Max average in fourth quarter - " + averages[indexMaxAverage]);
                break;
        }


    }

    public static void punktThird() {
        int N = 5;
        int T = 0;
        int[] massFirst = new int[(N + (int) (Math.random() * 3))];
        int[] massSecond = new int[(N + (int) (Math.random() * 21))];
        for (int i = 0; i < massFirst.length; i++) {
            massFirst[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < massSecond.length; i++) {
            massSecond[i] = (int) (Math.random() * 11);
        }
        System.out.println("First massive -" + Arrays.toString(massFirst));
        System.out.println("Second massive -" + Arrays.toString(massSecond));

        for (int j : massSecond) {
            for (int r : massFirst) {
                if (r == j) {
                    T++;
                    break;
                }
            }
            if (T == N) {
                break;
            }
        }

        if (T == N) {
            System.out.println("Massives are equals");
        } else {
            System.out.println("Massives aren't equals");
        }
    }

    public static void punktFourth() {
        try {
            int[] nums = {1};
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Output beyond the massive length");
        }

    }

    //    punktFifth
    public static void print() {
        System.out.println("Method Print");
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(String message, String message1) {
        System.out.println(message + message1);
    }

    public static void print(String message, int a) {
        System.out.println(message + a);
    }

    public static void print(int a, String message) {
        System.out.println(message + a);
    }

    public static void punktSixth(int intValue) {
        switch (intValue) {
            case 3:
                System.out.println("first");
            case 4:
                System.out.println("Second");
            default:
                System.out.println("Third");
        }
    }

    public static void punktSeventh() {
        System.out.print("Enter any integer number - ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        recur(userInput);
    }

    public static void recur(int a) {
        if (a < 10) {
            System.out.println(a);
        } else {
            int y = a % 10;
            System.out.println(y + " ");
            int t = a / 10;
            recur(t);
        }
    }


    public static void punktEighth() {
        System.out.print("Enter any integer number - ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println(sumRec(userInput));
    }

    public static int sumRec(int a) {
        if (a < 10) {
            return a;
        } else {
            int rt = a / 10;
            int sum = a % 10 + sumRec(rt);
            return sum;
        }
    }
}

