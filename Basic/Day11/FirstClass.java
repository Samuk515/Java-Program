package Day11;
  class Car{
      String brand;
      String color;
      int speed;
  }
   public class FirstClass{
       static void main(String[] args) {
           Car c1 = new Car();
           c1.brand = "Toyota";
           c1.color = "Red";
           c1.speed = 120;
            Car c2 = new Car();
            c2.brand = "Honda";
            c2.color = "Blue";
            c2.speed = 100;

           System.out.println("Car 1:" + c1.brand + ", " +c1.color + ", " +c1.speed + "km/h");
           System.out.println("Car 2:" + c2.brand + ", " +c2.color + ", " +c2.speed  + "km/h");
       }
   }