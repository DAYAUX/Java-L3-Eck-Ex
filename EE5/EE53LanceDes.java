package EE5;

public class EE53LanceDes {

	public static void StatLanceDes() {
		
		StatCalc stat = new StatCalc();
		
		System.out.println("Total On Dice   Average   Standard Deviation   Max");
		System.out.println("-------------   -------   ------------------   ---");		
		for(int i=2;i<=12;i++) {
			for (int j=0;j<1000;j++) {
				stat.enter(PairOfDice.NbCoupsPourNombre(i));
			}
			System.out.println(i+"               "+stat.getMean()+"   "+stat.getStandardDeviation()+"   "+stat.getMax());
			stat = new StatCalc();
		}
		
		
		
	}

	public static void main(String[] args) {
		StatLanceDes();

	}

}
