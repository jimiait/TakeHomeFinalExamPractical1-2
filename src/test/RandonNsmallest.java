package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandonNsmallest {

	public static void main(String[] args) {

		Scanner ui = new Scanner(System.in);

		List<Integer> mydata = new ArrayList<Integer>();

		Random rand = new Random();
		

		for (int i=0; i<500; i++) {
			int randomNumbers = rand.nextInt(500);
			mydata.add(randomNumbers);
		}
		Collections.sort(mydata);
		System.out.println(mydata);
		System.out.println("Enter Nth Number");
		int NthNumber = ui.nextInt();

		System.out.println("The " + NthNumber + "th smallest number is: " + mydata.get(NthNumber - 1));
		
		ui.close();

	}

}
