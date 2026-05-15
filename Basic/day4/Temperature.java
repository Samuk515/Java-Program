package day4;

public class Temperature {
    static void main(String[] args) {
        double celsius = 37.0;
        double kelvin = celsius + 273.15;
        double fahrenheit = kelvin - 32;
        System.out.println("Celsius:" +celsius);
        System.out.println("Kelvin:" +kelvin);
        System.out.println("Fahrenheit:" +fahrenheit);
    }
}
