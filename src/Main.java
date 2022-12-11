import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverterTemperature convert = new ConverterTemperature();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature value in Celsius");
        convert.convert(in.nextDouble());
    }
}