package GitTest;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	static void mestKaulinu (int reizes) {
		int skaitlis, lielakais = 0, sum = 0;
		Random rand = new Random ();
		for (int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
			sum+=skaitlis;
			if(lielakais < skaitlis) {

				lielakais = skaitlis;
			}
		}
		System.out.println("Lielākais skaitlis metienu piegājienā ir " + lielakais + " un visu metienu iegūtā punktu summa ir " + sum);

	}

	public static void main(String[] args) {
		int reizes;
		int izv;
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		izv = scan.nextInt();
		do {
		System.out.print("1 - Mest kauliņu\n2 - Apturēt\n 3 - saskaitīt 3+3");	
		switch(izv) {
		
		case 1:
			
			System.out.println("Cik reizes mest kauliņu?");
			reizes = scan.nextInt();
			mestKaulinu(reizes);
	
				
			break;
		case 2: 
			System.out.println("Programma ir apturēta!");
			break;
		case 4: 
			System.out.println("3+3 = " + (3+3));
			break;
		}
		}while(izv!=2);
		
				
		scan.close();
	
	}
	
    }
	
	
	
	


