package ColorSearch;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;


public class ColorSearch {

//Method SearchColor
	public static void SearchColor(List<String> colors, String color) {
		
		int count = 0;
		boolean lookUp = false;
		
// Search & Counter 
		for(String search : colors) {
			count++;
			if(search.equals(color)) {
				lookUp = true;
				break;
			}
		}
		
// If found
		if(lookUp) {
			System.out.println("The color " + color + " was found after " + count + " searches");
		}
		
// If not found
		else {
			System.out.println("The color " + color + " was not found after " + count + " searches");
		}
	}// end Method

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
// ArrayList Colors
			List<String> colors = new ArrayList<String>();
			
//Enter colors
			while(true) {
				System.out.println("Enter a color or 'Q' to quit: ");
				String color = scan.nextLine();
				
//Quit Enter
				if(color.equals("Q")) {
					break;
				}
				
//Enter Color
				else {
					colors.add(color);
				}
			}//end enter color
			
			
//Search for Color
			while(true) {
				System.out.println("Enter a color to search for, or 'Q' to quit: ");
				String color = scan.nextLine();
				
//Quit Search
				if(color.equals("Q")) {
					break;
				}
				
//Search for Color
				else {
					SearchColor(colors, color);
				}
			}//end search color

			
}
}
