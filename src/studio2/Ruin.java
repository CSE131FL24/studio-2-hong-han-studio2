package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int n=0;
		
		/*
		while(startAmount<=winLimit&&startAmount>0) {
			if(Math.random()<winChance) {
				startAmount ++;
				System.out.println("you won");
			}
			else {
				startAmount --;
				System.out.println("you lost");
			}
			n++;
		}
		System.out.println(n);
		if(startAmount>0) {
			System.out.println("It was a successful day!");
		}
		else {
			System.out.println("ruin");
		}
		*/
		
		int totalSimulations = in.nextInt();
		int i = 0; 
		double runRate = 0;
		double win = 0;
		double lose = 0;
		double expectedRuin =0;
		while (i<totalSimulations) {
			i++;
			System.out.print("Simulation ");
			System.out.print(i + ": ");
			n=0;
			int money = startAmount;
			while(money<=winLimit&&money>0) {
				if(Math.random()<winChance) {
					money ++;
				}
				else {
					money --;
				}
				n++;
			}
			
			System.out.println(n);
			if(money>0) {
				System.out.println("WIN");
				win ++;
			}
			else {
				System.out.println("LOSE");
				lose ++;
			}
		}
		System.out.print("Losses: " + lose);
		System.out.println(" Simulations: " + i);
		System.out.println("ruin rate from simulation: " + lose/(win + lose));
		
		System.out.println(winChance);
		System.out.println(startAmount);
		System.out.println(winLimit);

		if(winChance == 0.5) {
			expectedRuin = 1.0 - ((double)startAmount/winLimit);
			System.out.print(expectedRuin);
		}
		else {
			double a = (1.0 - startAmount)/startAmount;
			double b = (1.0-winLimit)/winLimit;
			expectedRuin = (a - b)/(1-b);
			System.out.print(expectedRuin);
		}
	}
}
