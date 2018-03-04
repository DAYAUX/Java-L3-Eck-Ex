package EE4;
import java.util.*;

/**
* Ce programme permet d'afficher une à une 10 questions sous forme d'additions.
* L'utilisateur peut répondre à chaque question.
* Puis le programme renvoie les questions avec les bonnes réponses en précisant si l'utilisateur a bien répondu.
*/

public class EE47Quizz {
	/**Cette méthode permet de renvoyer un entier pour signifier si l'utilisateur a bien répondu à la question.
	 * @parameter a : premier nombre de l'addition
	 * @parameter b : deuxième nombre de l'addition
	 * @parameter reponse : réponse donnée par l'utilisateur 
	 * @return 0 la réponse ne correspond pas à la somme des deux nombres en paramètres, 1 sinon
	 */
	public static int bonneReponse(int a, int b, int reponse) {
		if ((a+b)==reponse) {
			return 1;
		}
		return 0;
	}
	
	/**Cette méthode renvoie un tableau en deux dimensions contenant les questions du quizz ainsi que les réponses.
	 * Il indique également si la réponse de l'utilisateur est correcte ou non.
	 * La méthode affiche les questions et permet à l'utilisateur de répondre aux différents questions.
	 * @return un tableau en deux dimensions. Pour chaque case est associé un tableau de taille 4 contenant les deux membres de l'addition, la réponse de l'utilisateur et 0/1 pour vérifier l'exactitude de la réponse.
	 */
	
	public static int[][] genererQuizz() {
		int nombre1=0;
		int nombre2=0;
		int rep = 0;
		int[][] reponse = new int[10][4];
		for(int i=0;i<10;i++) {
			nombre1 = (int)(Math.random()*100) + 1;
			nombre2 = (int)(Math.random()*100) + 1;
			reponse[i][0]=nombre1;
			reponse[i][1]=nombre2;
			System.out.println(nombre1+"+"+nombre2+"=");
			Scanner sc = new Scanner(System.in);
			rep = sc.nextInt();
			reponse[i][2]=rep;
			reponse[i][3]=bonneReponse(nombre1,nombre2,rep);
		}
		return reponse;
	}
	
	/**Cette méthode permet l'affichage du résultat au quizz de l'utilisateur.
	 * @parameter reponse : tableau de taille [10][4] contenant les informations sur le quizz.
	 */
	
	public static void resultatQuizz(int[][] reponse) {
		int bonnerep=0;
		System.out.println("----------------------------");
		for(int i=0;i<10;i++) {
			if (reponse[i][3]==1) {
				System.out.println(reponse[i][0]+"+"+reponse[i][1]+"="+reponse[i][2]+" ... C'est une bonne réponse");
			}
			else {
				bonnerep = reponse[i][0] + reponse[i][1];
				System.out.println(reponse[i][0]+"+"+reponse[i][1]+"="+bonnerep+" ... C'est une mauvaise réponse");
			}
		}
	}

	public static void main(String[] args) {
		resultatQuizz(genererQuizz());

	}

}
