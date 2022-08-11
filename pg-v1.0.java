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
