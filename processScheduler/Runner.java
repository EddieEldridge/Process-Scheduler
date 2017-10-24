// Project by Edward Eldridge (G00337490)
// Software Development (Year 3) (GMIT)

package processScheduler;


// Java Project implementing the following Process Scheduling Algorithms
// 1. First Come First Serve
// 2. Shortest Job First
// 3. Round Robin

// Import Scanner for our user input
import java.util.Scanner;

// Import Util for List
import java.util.*;


class Runner
{
	
	public static void main(String[] args) 
	{	
		// Variables
		int i;
		int numProcesses = 0;
		
		// Array to store processes
		Process[] myclass = new Process[numProcesses];

		
		// Import Scanner
		Scanner scan = new Scanner(System.in);
		
		// Headers
		System.out.println("==================================");
		System.out.println("    Process Scheduler Program	");
		System.out.println("==================================");
		
		// Info
		System.out.println("\nPlease read the readMe included for more info\n");

		// User input
		// Prompt user for number of processes
		System.out.println("How many processes would you like to schedule?");
		numProcesses = scan.nextInt();

		
		// For loop depending on number of processes
		for(i=0; i<myclass.length; i++)
		{
			System.out.printf("Process Time for Guess %d", numProcesses);
		}
		// Prompt user for processing time of each process
	
	}


}