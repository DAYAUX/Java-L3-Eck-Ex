package EE4;
import java.util.*;

/**
* Ce programme simule rouler une paire de dés encore et encore jusqu'à la
* L'affichage total sur les deux dés est 2. Il rapporte le nombre de rouleaux 
* il a fallu pour obtenir un 2.
*/

public class EE43EyeSnake {
	
	/** Simule le lancers de deux dés jusqu'à ce que le total donné en paramètre soit atteint
	 * à condition que ce total soit compris entre 2 et 12.
	 * @parameter total : total que doivent faire les dés 
	 * @return le nombre de fois que les dés ont été lancés
	 * @throws IllegalArgumentException quand le total des dés est incohérent*/
	public static int lanceDes(int total) {
		if (total<2 || total>12) {
			throw new IllegalArgumentException("Total impossible");
		}
		
		int i=1;
		double de1 = (int)((Math.random()*6)) + 1;
		double de2 = (int)((Math.random()*6)) + 1;
		
		while ((de1+de2)!=total) {
			de1 = (int)((Math.random()*6)) + 1;
			de2 = (int)((Math.random()*6)) + 1;
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		
		System.out.println("Il a fallu " + lanceDes(2) + " lancers pour obtenir des yeux de serpents.");

	}

}
