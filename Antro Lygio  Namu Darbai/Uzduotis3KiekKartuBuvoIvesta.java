package Uzduotys;

import java.util.Scanner;

public class Uzduotis3KiekKartuBuvoIvesta {

	public static void main(String[] args) {
		
		int[] skaiciai = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Prasome ivesti 10 skaiciu nuo 1 iki 5");
		
		for (int i = 0; i<skaiciai.length;i++) {
			skaiciai[i] =0;
		}
		
		for (int i = 1;i<11;i++) {
			int skaicius = scanner.nextInt();
			
			switch (skaicius) {
			case 1: skaiciai[0]++;
			break;
			case 2: skaiciai[1]++;
			break;
			case 3: skaiciai[2]++;
			break;
			case 4: skaiciai[3]++;
			break;
			case 5: skaiciai[4]++;
			break;
			default: 
				break;
			}
		}
	
		System.out.println("Vienetas buvo ivestas "+skaiciai[0]+" kartus");

	}

}
