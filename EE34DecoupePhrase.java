import java.util.*;

public class EE34DecoupePhrase {
	
	public static void DecoupePhrase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une phrase :");
		String phrase = sc.nextLine();
		
		int i=0;
		int longueur=phrase.length();
		
		while (i<longueur) {
			if (Character.isLetter(phrase.charAt(i))==true) {
				System.out.print(phrase.charAt(i));
				i++;
				
			}
			else {
				System.out.println(' ');
				i++;
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		DecoupePhrase();
		

	}

}
