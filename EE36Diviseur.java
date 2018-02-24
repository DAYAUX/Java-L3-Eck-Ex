import java.util.LinkedList;

public class EE36Diviseur {
	
	public static boolean IsDiviseur(int i,int j) { //Vérifie si i divise j
		if (i%j==0) {
			return true;
		}
		return false;
	}
	
	public static int[] CalculDiviseur() {
		int[] tableau = new int[10000];
		
		for(int i=1;i<=10000;i++) {
			int compteur = 0;
			for (int j=1; j<=i;j++) {
				if (IsDiviseur(i,j)==true) {
					compteur++;
				}
			}
			tableau[i-1]=compteur;
		}
		
		return tableau;
	}
	
	public static int RechercheMax(int[] tableau) {
		
		int max=0;
		for (int i=0;i<tableau.length;i++) {
			if (tableau[i]>max){
				max = tableau[i];
			}
		}
		return max;
	}
	
	public static LinkedList PositionMax(int max,int[] tableau) {
		
		LinkedList position = new LinkedList();
		for (int i=0;i<tableau.length;i++) {
			if (tableau[i]==max){
				position.add(i+1);
			}
		}
		
		return position;
	}

	public static void main(String[] args) {
		
		int[] tableau = CalculDiviseur();
		int max = RechercheMax(tableau);
		LinkedList position = new LinkedList();
		
		position = PositionMax(max,tableau);
		
		System.out.println("Parmi les entiers entre 1 et 10000,");
		System.out.println("Le nombre maximum de diviseurs était de "+max);
		System.out.println("Les nombres avec autant de diviseurs incluent: ");
		
		for(int i=0; i<position.size();i++) {
			System.out.println(position.get(i));
		}



	}

}
