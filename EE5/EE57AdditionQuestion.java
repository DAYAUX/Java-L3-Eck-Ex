package EE5;

public class EE57AdditionQuestion implements IntQuestion {

	
		private int a, b;  // The numbers in the problem.

		/**
		 * Prend deux entiers au hasard entre 1 et 50 et v�rifie que la r�ponse � la soustraction ne peut �tre n�gative
		 */
		public EE57AdditionQuestion() { // constructor
			a = (int)(Math.random() * 50 + 1);
			b = (int)(Math.random() * 50);
			if (a - b < 0) { // swap a and b so answer won't be negative
		          int temp = a;
		          a = b;
		          b = temp;
		       }
		}

		/**
		 * Retourne l'�nonc� de la question
		 */
		public String getQuestion() {
			return "What is " + a + " - " + b + " ?";
		}

		/**
		 * Retourne la bonne r�ponse � la question
		 */
		public int getCorrectAnswer() {
			return a - b;
		}


}
