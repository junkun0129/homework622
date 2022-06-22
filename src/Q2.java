import java.util.ArrayList;
import java.util.Random;

public class Q2 {
public static void main(String[] args) throws Exception {
// Create an ArrayList of Integers
// Fill the ArrayList with ten random numbers (1-50)
// Copy each value from the ArrayList into another ArrayList of the same capacity
// Change the last value in the first (original) ArrayList to a -5
// Display the contents of both ArrayLists
ArrayList<Integer> numbers2 = new ArrayList<>();
Random rand = new Random();


for(int i = 0; i <= 9; i++){

    int num = rand.nextInt(50);
    numbers2.add(num);
}



ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);
//numbers3.forEach(System.out::println);


numbers3.set(numbers3.size()-1, -5);

System.out.println("-------------------------------");

System.out.println(numbers3);

System.out.println("-------------------------------");

System.out.println(numbers2);



//System.out.println(numbers2);


}

// public static void displayList(ArrayList<Integer> numAll){
//     for(int i = 0; i < numAll.size() - 1; i++){
//         System.out.println(numAll.get(i));
//     }
// }


}
