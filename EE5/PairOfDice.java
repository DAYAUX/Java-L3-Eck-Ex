package EE5;

/**
 * Cette classe simule la cr�ation de deux d�s et a pour but de voir combien de lancers il faut faire
 * pour obtenir deux 1.
 * @author Guillaume
 *
 */

public class PairOfDice {
	
	private int die1;
	private int die2;
	static int nblances=0;

	/**
	 * Le constructeur PairOfDice initialise la valeur des deux d�s � 0 pour signifier que les
	 * d�s n'ont pas �t� lanc�s.
	 */
	public PairOfDice() {
		die1 = 0;
		die2 = 0;
	}
	
	/**
	 * La m�thode permet de r�cup�rer la valeur du premier d�.
	 * @return die1, la valeur du premier d�
	 */
	public int getDe1() {
		return die1;
	}
	
	/**
	 * La m�thode permet de r�cup�rer la valeur du second d�.
	 * @return die2, la valeur du second d�
	 */
	public int getDe2() {
		return die2;
	}
	
	/**
	 * La m�thode simule le lancement des deux d�s et actualise leurs valeurs.
	 * Elle actualise �galement le nombre de fois que les d�s ont �t� lanc�s depuis leur cr�ation.
	 */
	public void lance() {
		die1 = (int)((Math.random()*6)) + 1;
		die2 = (int)((Math.random()*6)) + 1;
		nblances++;
	}
	
	/**
	 * La m�thode renvoie l'affichage des deux d�s.
	 * @return Les d�s sont "die1" et "die2"
	 */
	public String toString() {
		return ("Les d�s sont "+die1+" et "+die2);
	}
	
	/**
	 * Cette m�thode permet de trouver en combien de coups on tombe sur une paire de 2.
	 * @return i le nombre de lancers pour obtenir une somme �gale des d�s �gale � 2.
	 */
	public static int EyeSnake() {
		int s = 0;
		int i =0 ;
		PairOfDice d = new PairOfDice();
		while(s!=2) { // Tant que la somme des d�s est diff�rente de 2
			d.lance(); // on relance les d�s
			s = d.getDe1() + d.getDe2(); // on actualise la somme des deux d�s
		}
		i = nblances;
		nblances =0;
		return i;
	}
	
	/**
	 * 
	 * @return le nombre de coups qu'il faut pour obtenir le total en param�tre
	 */
	public static int NbCoupsPourNombre(int total) {
		int s = 0;
		int i =0 ;
		PairOfDice d = new PairOfDice();
		while(s!=total) { // Tant que la somme des d�s est diff�rente de total
			d.lance(); // on relance les d�s
			s = d.getDe1() + d.getDe2(); // on actualise la somme des deux d�s
		}
		i = nblances;
		nblances =0;
		return i;
	}

	/**
	 * Le main affiche le r�sultat de la m�thode EyeSnake().
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Les d�s ont �t� lanc�s "+EyeSnake()+" fois pour obtenir deux 1");

	}

}
