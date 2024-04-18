
public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog("댕마니", "도베르만", 3, "검은색");
		Dog dog2 = new Dog("쪼푸", "푸들", 2, "갈색");
		System.out.println("이름 : " + dog1.name + "\n종  : " + dog1.breed + "\n나이 : " + dog1.age + "\n색깔 : " + dog1.color);
		System.out.println("상태 : " + dog1.name + "는 " + dog1.bakrking());
		System.out.println("상태 : " + dog1.name + "는 " + dog1.hungry());
		System.out.println("상태 : " + dog1.sleeping());
		System.out.println();
		System.out.println("이름 : " + dog2.name + "\n종 : " + dog2.breed + "\n나이 : " + dog2.age + "\n색깔 : " + dog2.color);
		System.out.println("상태 : " + dog2.name + "는 " + dog2.bakrking());
		System.out.println("상태 : " + dog2.name + "는 " + dog2.hungry());
		System.out.println("상태 : " + dog2.sleeping());

	}

}
