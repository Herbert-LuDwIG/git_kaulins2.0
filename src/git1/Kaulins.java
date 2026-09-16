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
		System.out.print("1 - Mest kauliņu\n2 - Apturēt");
		izv = scan.nextInt();
		
		switch(izv) {
		
		case 1:
			do {
			System.out.println("Cik reizes mest kauliņu?");
			reizes = scan.nextInt();
			mestKaulinu(reizes);
		}while(reizes>1 || izv!=2);
				
			break;
		case 2: 
			System.out.println("Programma ir apturēta!");
			break;
		}
		
		
				
		scan.close();
	
	}
	
    }
	
	
	
	


