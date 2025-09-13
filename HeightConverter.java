import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm → inches
        double totalInches = heightCm / 2.54;

        // Convert inches → feet + inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + String.format("%.2f", inches));
    }
}
