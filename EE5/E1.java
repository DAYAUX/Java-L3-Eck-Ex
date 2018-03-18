package EE5;

import java.util.*;

/**
 * Cette classe créé trois listes chaînées, en remplit deux avec des nombres saisis par
 * l'utilisateur et remplit la troisième en faisant l'union des deux premières.
 * @author Guillaume
 *
 */
public class E1 {
	
	private LinkedList<Integer> list1; // Première série de nombres
	private LinkedList<Integer> list2; // Seconde série de nombres
	private LinkedList<Integer> union; // Liste qui sera l'union de list1 et list2
	
	/**
	 * Initialise trois listes chaînées vides
	 */
	public E1() {
		
		list1 = new LinkedList<Integer>();
		list2 = new LinkedList<Integer>();
		union = new LinkedList<Integer>();
	}
	
	/**
	 * Cette méthode permet de rechercher un entier dans une liste chaînée donnée.
	 * @param value int qui correspond à la valeur que l'on recherche
	 * @param list LinkedList qui correspond à la liste chaînée dans laquelle on
	 * cherche le paramètre value
	 * @return true si on trouve la valeur sinon false
	 */
	public boolean searchNumber(int value, LinkedList<Integer> list) {
		if (list.size()!=0) {
			for(int i = 0; i< list.size();i++) {
				if (list.get(i)== value){
					return true;
				}

			}
		}
		return false;
	}
	
	/**
	 * Cette méthode demande à l'utilisateur de rentrer successivement des entiers à insérer dans
	 * la liste chaînée en paramètre. Quand l'utilisateur rentre 0, cela signifie qu'aucun entier
	 * supplémentaire ne va être saisi.
	 * @param list LinkedList dans laquelle on va insérer les entiers entrés par l'utilisateur
	 */
	public void askNumber(LinkedList<Integer> list) {
		int i=-1;
		while(i!=0) {
			if(searchNumber(i,list)==false && i!=-1) {
				list.add(i);
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisir un nombre = ");
			i = sc.nextInt();
		}
		System.out.println("Fin de la série de nombres");
		
	}
	
	/**
	 * Cette méthode déclenche successivement la méthode askNumber appliquée aux paramètres list1 puis list2.
	 */
	public void launchAsk() {
		askNumber(list1);
		askNumber(list2);
	}
	
	/**
	 * Cette méthode permet d'insérer dans la liste chainée union, l'union des deux listes list1 et list2.
	 * Elle gère le cas des doublons en les supprimant.
	 */
	public void makeUnion(){

		union = list2 ;
		boolean bool = false;
		
		for (int i=0;i<list1.size();i++) {
			for (int j=0; j<list2.size();j++) {
				if (list1.get(i)==list2.get(j)) {
					bool = true;
				}
			}
			if (bool == false) {
				union.add(list1.get(i));
			}
		}
	}

	/**
	 * Affiche la liste chainée union.
	 * @param args
	 */
	public static void main(String[] args) {
		
		E1 Ens1 = new E1();
		
		Ens1.launchAsk();
		Ens1.makeUnion();
		
		
		System.out.println(Ens1.union);
		

	}

}
