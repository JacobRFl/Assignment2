/**
 * 
 */
package com.ss.a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob
 *
 */
public class Assignment {

	public static void main(String[] args) throws IOException {
		int random = (int) (Math.random() * 100);
		System.out.println("Please guess a number between 1-100");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int guesses =0;
		
		while(guesses<5) {
			int guess = Integer.parseInt(reader.readLine());
			if(guess>=random-10&&guess<=random+10) {
				System.out.println("That is within ten. the number is "+ random);
				break;
			}
			else {
				guesses++;
				if (guesses<5) {
					System.out.println("Please guess again");
				}
				else {
					System.out.println("Sorry the number was "+ random);
				}
			}
				
		}
	}
}
