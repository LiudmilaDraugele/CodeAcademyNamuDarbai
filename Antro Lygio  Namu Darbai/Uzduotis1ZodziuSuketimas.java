package Uzduotys;

import java.util.Scanner;

public class Uzduotis1ZodziuSuketimas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Iveskite teksta is 6 zodziu");
		String tekstas = scanner.nextLine();
		
		//sukeitimas6zodziu(tekstas);
		
		System.out.println("Iveskite teksta");
		String tekstas2 = scanner.nextLine();
		
		sukeitimasZodziu(tekstas2);
		
		
	}

	public static void sukeitimas6zodziu(String tekstas) {
		
		String pirmas = tekstas.substring(0, tekstas.indexOf(' '));
		String likutis = tekstas.substring(tekstas.indexOf(' ')+1);
		System.out.println(likutis);
		String antras = likutis.substring(0, likutis.indexOf(' '));
		likutis = likutis.substring(likutis.indexOf(' ')+1);
		String trecias = likutis.substring(0, likutis.indexOf(' '));
		likutis = likutis.substring(likutis.indexOf(' ')+1);
		String ketvirtas = likutis.substring(0, likutis.indexOf(' '));
		likutis = likutis.substring(likutis.indexOf(' ')+1);
		String penktas = likutis.substring(0, likutis.indexOf(' '));
		likutis = likutis.substring(likutis.indexOf(' ')+1);
		
		
		String naujas = likutis+" "+penktas+" "+ketvirtas+" "+trecias+" "+antras+" "+pirmas;
		System.out.println(naujas);
		
	}
	
	public static void sukeitimasZodziu(String tekstas) {
		
		String[] zodziai = tekstas.split(" ");
		
		String naujasString="";
		
		for (int i=zodziai.length-1;i>=0;i--) {
			naujasString= naujasString + " " +zodziai[i];
		}
		naujasString=naujasString.trim();
		System.out.println(naujasString);
		
	}
	
}
