package MainPackage;

import java.util.Scanner;

public class Quiz1Question1 {

	public static void main(String[] args) {
		// Quiz 1 Question 1
		//Ask user to input the quarterback's stats
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How many passes did the QB throw?");
		float att = scnr.nextFloat();
		
		System.out.println("How many passes did the QB complete?");
		float comp = scnr.nextFloat();
		
		System.out.println("How many yards did the QB throw for?");
		float yards = scnr.nextFloat();
		
		System.out.println("How many interceptions did the QB throw?");
		float interceptions = scnr.nextFloat();
		
		System.out.println("How many touchdowns did the QB throw for?");
		float td = scnr.nextFloat();
		
		//calculate numbers that make up QBR
		
		double a = ((comp/att - 0.3) * 5);
		double b = (yards / att - 3) * 0.25;
		double c = (td / att) * 20;
		double d = 2.375 - (interceptions / att * 25);
		
		double QBR = ((a + b + c + d) / 6) * 100;
		System.out.println(QBR);

	}

}
