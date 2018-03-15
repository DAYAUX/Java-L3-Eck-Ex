package EE5;

/**
 * Cette classe simule la création de deux dés et a pour but de voir combien de lancers il faut faire
 * pour obtenir deux 1.
 * @author Guillaume
 *
 */

public class PairOfDice {
	
	private int die1;
	private int die2;
	static int nblances=0;

	/**
	 * Le constructeur PairOfDice initialise la valeur des deux dés à 0 pour signifier que les
	 * dés n'ont pas été lancés.
	 */
	public PairOfDice() {
		die1 = 0;
		die2 = 0;
	}
	
	/**
	 * La méthode permet de récupérer la valeur du premier dé.
	 * @return die1, la valeur du premier dé
	 */
	public int getDe1() {
		return die1;
	}
	
	/**
	 * La méthode permet de récupérer la valeur du second dé.
	 * @return die2, la valeur du second dé
	 */
	public int getDe2() {
		return die2;
	}
	
	/**
	 * La méthode simule le lancement des deux dés et actualise leurs valeurs.
	 * Elle actualise également le nombre de fois que les dés ont été lancés depuis leur création.
	 */
	public void lance() {
		die1 = (int)((Math.random()*6)) + 1;
		die2 = (int)((Math.random()*6)) + 1;
		nblances++;
	}
	
	/**
	 * La méthode renvoie l'affichage des deux dés.
	 * @return Les dés sont "die1" et "die2"
	 */
	public String toString() {
		return ("Les dés sont "+die1+" et "+die2);
	}
	
	/**
	 * Cette méthode permet de trouver en combien de coups on tombe sur une paire de 2.
	 * @return i le nombre de lancers pour obtenir une somme égale des dés égale à 2.
	 */
	public static int EyeSnake() {
		int s = 0;
		int i =0 ;
		PairOfDice d = new PairOfDice();
		while(s!=2) { // Tant que la somme des dés est différente de 2
			d.lance(); // on relance les dés
			s = d.getDe1() + d.getDe2(); // on actualise la somme des deux dés
		}
		i = nblances;
		nblances =0;
		return i;
	}
	
	/**
	 * 
	 * @return le nombre de coups qu'il faut pour obtenir le total en paramètre
	 */
	public static int NbCoupsPourNombre(int total) {
		int s = 0;
		int i =0 ;
		PairOfDice d = new PairOfDice();
		while(s!=total) { // Tant que la somme des dés est différente de total
			d.lance(); // on relance les dés
			s = d.getDe1() + d.getDe2(); // on actualise la somme des deux dés
		}
		i = nblances;
		nblances =0;
		return i;
	}

	/**
	 * Le main affiche le résultat de la méthode EyeSnake().
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Les dés ont été lancés "+EyeSnake()+" fois pour obtenir deux 1");

	}

}
