
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) throws Exception {
        // Create an ArrayList of Integers
        // Fill each of the 10 slots with a random value from 1-50.
        // Display those values on the screen, and then prompt the user for an integer.
        // Search through the ArrayList, and if the item is present, print a message that the number is in the list.
        // If the value is not in the ArrayList, print a message that the number is not in the list
        
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i <= 9; i++){
            int num = rand.nextInt(50);
            numbers.add(num);
        }

        System.out.println("-------------------------------");

        System.out.println(numbers);
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exter the number:");
        int numberSearch = scanner.nextInt();
    
        
        if(numbers.indexOf(numberSearch) != -1){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }
    
    }

}
