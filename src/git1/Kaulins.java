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
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Cik reizes mest kauliņu?");
			reizes = scan.nextInt();
		}while(reizes<1);		
		scan.close();
		mestKaulinu(reizes);
	}
	
    }