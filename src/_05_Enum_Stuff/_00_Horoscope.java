package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	Zodiac  z;
	
	static void horoInput(Zodiac  z){
		
		switch(z) {
		case ARIES:
			System.out.println("You will be happy");
			break;
		case TAURUS:
			System.out.println("You will be sad");
			break;
		case GEMINI:
			System.out.println("You will be confused");
			break;
		case CANCER:
			System.out.println("You will be in pain");
			break;
		case LEO:
			System.out.println("You will die");
			break;
		case VIRGO:
			System.out.println("You will be rewarded");
			break;
		case LIBRA:
			System.out.println("You will be surprised");
			break;
		case SCORPIO:
			System.out.println("You will have fun");
			break;
		case SAGITTARIUS:
			System.out.println("You will be bored");
			break;
		case CAPRICORN:
			System.out.println("You will be enlightened");
			break;
		case AQUARIUS:
			System.out.println("You will be attacked");
			break;
		case PISCES:
			System.out.println("You will meet an interesting person");
			break;
		
		
		
		}
		
	}
	
	
	
	// 3. Make a main method to test your method

	
	
	
	
	public static void main(String[] args) {
		
		horoInput(Zodiac.LIBRA);
		
	}
	
	
}
