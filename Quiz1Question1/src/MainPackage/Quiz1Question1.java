package MainPackage;

import java.util.Scanner;

public class Quiz1Question1 {

	public static void main(String[] args) {
		// Quiz 1 Question 1
		//Ask user to input the quarterback's stats
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How many passes did the QB throw?");
		int att = scnr.nextInt();
		
		System.out.println("How many passes did the QB complete?");
		int comp = scnr.nextInt();
		
		System.out.print("How many yards did the QB throw for?");
		int yards = scnr.nextInt();
		
		System.out.println("How many interceptions did the QB throw?");
		int interceptions = scnr.nextInt();
		
		System.out.println("How many touchdowns did the QB throw for?");
		int td = scnr.nextInt();
		
		//calculate numbers that make up QBR
		
		double a = (comp / att - .3) * .5;
		double b = (yards / att -3) * .25;
		double c = (td / att)* 25;
		double d = 2.375 - (interceptions / att *25);
		
		double QBR = ((a + b + c + d) / 6) * 100;
		
		System.out.println(QBR);
		

	}

}
