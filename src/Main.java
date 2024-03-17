import employees.managers.SameName;

public class Main {

  public static void main(String[] args) {

    employees.directors.SameName director = new employees.directors.SameName();
    employees.managers.SameName manager = new employees.managers.SameName();

    director.say();
    manager.say();

    System.out.println("======================");
    Car car = new Car();
    car.start();
  }
}