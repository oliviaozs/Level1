public class Disease {
	boolean isPandemic;
	String symptoms;
	float chanceOfSurvival;

	public void printDisease() {
		System.out.println(isPandemic + ", " + symptoms + ", "
				+ chanceOfSurvival);
	}

	Disease(boolean isPandemic, String symptoms, float chanceOfSurvival) {
		this.isPandemic = isPandemic;
		this.symptoms = symptoms;
		this.chanceOfSurvival = chanceOfSurvival;
	}

	public static void main(String[] args) {
		Disease blackPlague = new Disease(true, "death", 0);
		blackPlague.printDisease();
	}
}
