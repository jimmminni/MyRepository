package mygit;

public class A {

	public static void main(String[] args) {
		System.out.println("A.");
//<<<<<<< HEAD
		System.out.println("devC => A");
//=======
		System.out.println("devB => A");
//>>>>>>> refs/heads/devB
	}

}
