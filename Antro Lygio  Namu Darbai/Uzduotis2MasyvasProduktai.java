package Uzduotys;

import java.util.Random;
import java.util.Scanner;

public class Uzduotis2MasyvasProduktai {

	public static void main(String[] args) {
		
		String [] produktai = {"duona","suris","jogurtas","ketciupas","sviestas"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Iveskite darzoves pavadinima");
		String darzove = scanner.nextLine();
		
		Random random = new Random();
		int skaicius = random.nextInt(5);
		
		System.out.println(darzove + " labai skanu su " + produktai[skaicius]);
		

	}

}
