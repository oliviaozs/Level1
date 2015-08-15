public class Person {
	String name;
	String superpower;
	boolean isFriend;
	int age;

	Person(String name, String superpower, boolean isFriend, int age) {
		this.name = name;
		this.superpower = superpower;
		this.isFriend = isFriend;
		this.age = age;
	}

	void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	void setName(String name) {
		this.name = name;
	}

	void setIsFriend(boolean isFriend) {
		this.isFriend = isFriend;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	boolean getIsFriend() {
		return isFriend;
	}

	int getAge() {
		return age;
	}

	String getSuperpower() {
		return superpower;
	}
	
	public String toString() {
		return "name: "+name+", superpower: "+superpower+", friend: "+isFriend+", age: "+age;
	}

	public static void main(String[] args) {
		Person olivia = new Person("Olivia", "flying", true, 16);
		olivia.setSuperpower("invisibility");
		System.out.println(olivia.getSuperpower());
	}
}
