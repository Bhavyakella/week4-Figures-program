/*Bhavya Kella Summer
 Programming fundamentals
Programming Assignment 2 – Figures 
*/

import java.util.Scanner;
public class Figures {
	static void printBox(int size) {     	
		int i, j;							 
		for (i = 1; i <= size; i++) {		
			for (j = 1; j <= size; j++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}
	static void printDiamond(int size) {	
		int i, j, D;						
		size = size + 1;
		D = (size / 2);
		for (i = 1; i <= D; i++) {
			for (j = 1; j <= (D - i); j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");

				for (j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.print("\n");
		}
		for (i = D + 1; i < size; i++) {
			for (j = 1; j <= i - D; j++) {
				System.out.print(" ");
			}
			if (i == size - 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");

				for (j = 1; j <= 2 * (size - i) - 3; j++) {

					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}
	
    static void printx(int size) {				
		int i, j;								
		for (i = 1; i <= size; i++) {
			for (j = 1; j <= size; j++) {
				if (j == i) {
					System.out.print("X");
				} else if (j == size - (i - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}
	}

	static void quitprogram() {						
		System.out.println("\nGood bye!");		
		System.exit(0);
	}
        public static void main(String[] args) {

		int size, option;//declare variables  

		Scanner var = new Scanner(System.in);//Create scanner object 
		System.out.println("Enter the size of the figure (odd number):");
		size = var.nextInt();//allowing user for input 
		while (size % 2 == 0) {    			  
			System.out.println("\nInvalid figure size - must be an odd number");
			System.out.println("\nRenter the size of the figure:");
			size = var.nextInt();       
		}
		do {
			System.out.println("\nMENU:");
			System.out.println("\n1.Print Box");
			System.out.println("\n2.Print diamond");
			System.out.println("\n3.Print X");
			System.out.println("\n4.Quit Program");
			System.out.println("\nPlease select an option:");
			option = var.nextInt();//create scanner object
			switch (option) {     //select menu using switch
			case 1:printBox(size);//calling printbox() method        		  
				break;
			case 2:printDiamond(size);
				break;
			case 3:printx(size);
				break;
			case 4:quitprogram();
				break;
			default:System.out.println("Invalid option");
			}

		} while (option != 4);//execute or allow user to select the menu until he or quits the program

	}
}  