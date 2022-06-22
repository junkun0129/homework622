import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) throws Exception {
        // Make a record to store information about a car. It should contain fields for: - make (String) - model (String) - year (int)
        // Create an ArrayList of Car objects.
        // Sort the ArrayList of cars by year (Ascending) and print them out.
        
        ArrayList<Car> car = new ArrayList<>();
        car.add(new Car("mazda", "MP5", 1975));
        car.add(new Car("mazda", "MP4", 1885));
        car.add(new Car("mazda", "MP3", 1895));
        car.add(new Car("mazda", "MP2", 1455));
        car.add(new Car("mazda", "MP1", 1265));

        System.out.println(car);
        for(Car cars: car){
            System.out.println(cars.printCar());
        }
        
        System.out.println("-------------------------------------");

        Collections.sort(car, (o1, o2) -> o1.year - o2.year);
        System.out.println(car);
        for(Car cars: car){
            System.out.println(cars.printCar());
        }

        
        


    }

    }







class Car implements Comparable <Car>{
    private String make;
    private String model;
    int year;

    public Car(String make, String model, int year){
      this.make = make;  
      this.model = model;  
      this.year = year;  
    }

    public String printCar(){
        return make + " " + model + " " + year;
    }

    @Override
    public int compareTo(Car o){
        return 0;
    }

    
   
}

