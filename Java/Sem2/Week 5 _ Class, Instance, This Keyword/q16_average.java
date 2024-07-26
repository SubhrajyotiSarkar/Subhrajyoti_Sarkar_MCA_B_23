import java.util.Scanner;

public class q16_average {
    static Scanner sc = new Scanner(System.in);

    private double[] numbers;

    public q16_average() {
        this.numbers = new double[10];
    }

    public void readNumbers() {

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            this.numbers[i] = sc.nextDouble();
        }

    }

    public void calculateAverageAndCountAbove() {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += this.numbers[i];
        }

        double average = sum / 10;

        System.out.println("Average: " + average);

        int countAboveAverage = 0;
        for (int i = 0; i < 10; i++) {
            if (this.numbers[i] > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Numbers above the average: " + countAboveAverage);
    }

    public static void main(String[] args) {
        q16_average obj = new q16_average();
        obj.readNumbers();
        obj.calculateAverageAndCountAbove();
    }
}
