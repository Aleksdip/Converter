public class ConverterTemperature {

     void convert(double celsius ) {
         double fahrenheit = celsius * 1.8 + 32;
         double kelvin = celsius + 273.15;
         System.out.println("Fahrenheit from celsius = " + fahrenheit);
         System.out.println("Kelvin from celsius = " + kelvin);
     }
}
