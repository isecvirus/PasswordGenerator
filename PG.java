// import java.lang.Thread;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String upper_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower_letters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String punctuations = "~`!@#$%^&*()_-+=}]{[\"':;?/>.<,|\\";
		String all = upper_letters + lower_letters + numbers + punctuations;
		
//		char prompt = 62; // 62 = >
		help();
		do {
			try {
				Scanner Scan_obj = new Scanner(System.in);
				System.out.print(prompt());
				int pg = Scan_obj.nextInt();
				
				if (pg == 0) {
					help();
				}
				else {
					for (int i=0;i<pg;i++) {
						int random = (int) (Math.random() * all.length());
						System.out.print(all.charAt(random));					
					}
					System.out.println();
					
					// int random = (int) (Math.random() * 100);
					// Thread.sleep(0);
				}

			} catch (Exception error) {
				continue;
			}
		} while (true);
	}
	
	public static String prompt() {
		String Tool_short_name = "PG"; // PG = Password generator
		char prompt_char = 62;
		return Tool_short_name + " " + prompt_char + " ";
	}
	
	public static void help() {
		System.out.println("0) To show this help menu."
			 + "\n"
			 + "<num>) To get (<num> length) random password.");
	}
	
}



// IGNORE:

/*
byte	    1 byte	     Stores whole numbers from -128 to 127
short	    2 bytes	     Stores whole numbers from -32,768 to 32,767
int	        4 bytes	     Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	     Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    8 bytes  	 Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean 	1 bit	     Stores true or false values
char	    2 bytes	     Stores a single character/letter or ASCII values
 */