
public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog("�󸶴�", "��������", 3, "������");
		Dog dog2 = new Dog("��Ǫ", "Ǫ��", 2, "����");
		System.out.println("�̸� : " + dog1.name + "\n��  : " + dog1.breed + "\n���� : " + dog1.age + "\n���� : " + dog1.color);
		System.out.println("���� : " + dog1.name + "�� " + dog1.bakrking());
		System.out.println("���� : " + dog1.name + "�� " + dog1.hungry());
		System.out.println("���� : " + dog1.sleeping());
		System.out.println();
		System.out.println("�̸� : " + dog2.name + "\n�� : " + dog2.breed + "\n���� : " + dog2.age + "\n���� : " + dog2.color);
		System.out.println("���� : " + dog2.name + "�� " + dog2.bakrking());
		System.out.println("���� : " + dog2.name + "�� " + dog2.hungry());
		System.out.println("���� : " + dog2.sleeping());

	}

}
