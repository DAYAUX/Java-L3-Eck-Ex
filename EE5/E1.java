package EE5;

import java.util.*;

/**
 * Cette classe cr�� trois listes cha�n�es, en remplit deux avec des nombres saisis par
 * l'utilisateur et remplit la troisi�me en faisant l'union des deux premi�res.
 * @author Guillaume
 *
 */
public class E1 {
	
	private LinkedList<Integer> list1; // Premi�re s�rie de nombres
	private LinkedList<Integer> list2; // Seconde s�rie de nombres
	private LinkedList<Integer> union; // Liste qui sera l'union de list1 et list2
	
	/**
	 * Initialise trois listes cha�n�es vides
	 */
	public E1() {
		
		list1 = new LinkedList<Integer>();
		list2 = new LinkedList<Integer>();
		union = new LinkedList<Integer>();
	}
	
	/**
	 * Cette m�thode permet de rechercher un entier dans une liste cha�n�e donn�e.
	 * @param value int qui correspond � la valeur que l'on recherche
	 * @param list LinkedList qui correspond � la liste cha�n�e dans laquelle on
	 * cherche le param�tre value
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
	 * Cette m�thode demande � l'utilisateur de rentrer successivement des entiers � ins�rer dans
	 * la liste cha�n�e en param�tre. Quand l'utilisateur rentre 0, cela signifie qu'aucun entier
	 * suppl�mentaire ne va �tre saisi.
	 * @param list LinkedList dans laquelle on va ins�rer les entiers entr�s par l'utilisateur
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
		System.out.println("Fin de la s�rie de nombres");
		
	}
	
	/**
	 * Cette m�thode d�clenche successivement la m�thode askNumber appliqu�e aux param�tres list1 puis list2.
	 */
	public void launchAsk() {
		askNumber(list1);
		askNumber(list2);
	}
	
	/**
	 * Cette m�thode permet d'ins�rer dans la liste chain�e union, l'union des deux listes list1 et list2.
	 * Elle g�re le cas des doublons en les supprimant.
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
	 * Affiche la liste chain�e union.
	 * @param args
	 */
	public static void main(String[] args) {
		
		E1 Ens1 = new E1();
		
		Ens1.launchAsk();
		Ens1.makeUnion();
		
		
		System.out.println(Ens1.union);
		

	}

}
