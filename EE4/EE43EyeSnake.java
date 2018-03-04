package EE4;
import java.util.*;

/**
* Ce programme simule rouler une paire de d�s encore et encore jusqu'� la
* L'affichage total sur les deux d�s est 2. Il rapporte le nombre de rouleaux 
* il a fallu pour obtenir un 2.
*/

public class EE43EyeSnake {
	
	/** Simule le lancers de deux d�s jusqu'� ce que le total donn� en param�tre soit atteint
	 * � condition que ce total soit compris entre 2 et 12.
	 * @parameter total : total que doivent faire les d�s 
	 * @return le nombre de fois que les d�s ont �t� lanc�s
	 * @throws IllegalArgumentException quand le total des d�s est incoh�rent*/
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
