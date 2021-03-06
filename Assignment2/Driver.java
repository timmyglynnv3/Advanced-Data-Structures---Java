package assignment2;

/* Driver class tests the Josephus problem
 *  - enter the input values n, k 
 *  - calls necessary methods to perform the Josephus algorithm
 */

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = input.nextInt(); // user enters the number of people in the 'circle' (list)
        System.out.println();
        
        System.out.print("Enter the step count: ");
        int k = input.nextInt(); // user enters the k count, starting with the first person in the list
        System.out.println();
        Josephus perform = new Josephus();
        perform.addToLL(0, n); // adds members to the linked list
        perform.Josephus1(n,k); // runs the recursive Josephus method/algorithm 
        }
}
