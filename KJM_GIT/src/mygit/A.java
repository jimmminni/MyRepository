package mygit;

public class A {

	public static void main(String[] args) {
		System.out.println("A.");
//<<<<<<< HEAD
		System.out.println("devB -> A");
//=======
		System.out.println("devC -> A");
//>>>>>>> refs/heads/devC
	}

}
