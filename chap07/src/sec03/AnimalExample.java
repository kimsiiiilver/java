package sec03;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//animal �߻� Ŭ������ ��ü ���� �Ұ���
		
		dog.sound();
		cat.sound();

		//�ڵ� Ÿ�� ��ȯ
		Animal animal = new Dog();
		animal.sound();   //�������̵���  dog�� �޼ҵ� ȣ��
		
		animalSound(new Dog());
		
	}

	//�Ű������� AnimalŸ�� �޼ҵ�
		public static void animalSound(Animal animal) {
			animal.sound();
		}
}
