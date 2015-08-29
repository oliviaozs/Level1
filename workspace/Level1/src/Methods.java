import org.teachingextensions.logo.Tortoise;

public class Methods {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.food("apples");
		method.truth(1);
		method.jump(15);
		method.jump("sun");
		// for (int i = 0; i < 4; i++) {
		// method.drawLine();
		// }
		method.iRock();
		method.rocker("Olivia");
		method.truth("Taylor Swift");
		method.echo("hello");
		method.repeat("hello", 5);
		System.out.println(method.getBestCoder());
		System.out.println(method.findSum(2, 3));
		System.out.println(method.oddOrEven(0));
	}

	void food(String fruit) {
		System.out.println("I like " + fruit);
	}

	void truth(int x) {
		if (x > 5)
			System.out.println("Geeks rule");
		else
			System.out.println("Nerds rule");
	}

	void jump(int height) {
		if (height > 100)
			System.out.println("The mouse jumped over the moon.");
		if (height > 50)
			System.out.println("The mouse jumped over the broom.");
		if (height > 5)
			System.out.println("The mouse jumped over the candlestick.");
	}

	void jump(String obstacle) {
		System.out.println("The mouse jumped over the " + obstacle);
	}

	void drawLine() {
		Tortoise.move(100);
		Tortoise.turn(90);
	}

	void iRock() {
		System.out.println("Olivia rocks");
	}

	void rocker(String name) {
		System.out.println(name + " rocks");
	}

	void truth(String favSinger) {
		if (favSinger.equals("Taylor Swift")) {
			System.out.println(favSinger + " is awesome");
		} else if (favSinger.equals("Justin Bieber")) {
			System.out.println("Justin Bieber is annoying");
		} else {
			System.out.println(favSinger);
		}
	}

	void echo(String echo) {
		System.out.println(echo + " " + echo);
	}

	void repeat(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(word + " ");
		}
	}

	String getBestCoder() {
		return "Olivia";
	}

	int findSum(int num1, int num2) {
		return num1 + num2;
	}
	
	String oddOrEven(int num) {
		if (num%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}

}
