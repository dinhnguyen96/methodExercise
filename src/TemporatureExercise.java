import java.io.IOException;
import java.util.Scanner;

public class TemporatureExercise
{
    public static double celsiusToFahrenheit(double celsius)
    {
        return (9 * celsius) /5 +32;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("3.Exit");
        int c;
        do {
            System.out.print("Enter menu number : ");
            c = input.nextInt();
            switch (c)
            {
                case 1:
                    System.out.print("Nhập giá trị Celsius : ");
                    double celsius   = input.nextDouble();
                    System.out.println("Sau khi chuyển đổi sang độ F : " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("Nhập giá trị Fahrenheit: ");
                    double fahrenheit = input.nextDouble();
                    System.out.println("Sau khi chuyển đổi sang độ C : " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    System.exit(3);
            }
        }
        while (c < 1 || c > 3);

    }
}