package esc02.exam07;


public class TireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		//SnowTire.run();
		tire.run();
	}

}
