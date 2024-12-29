package mygit;

public class A {

	public static void main(String[] args) {
		System.out.println("A.");
//<<<<<<< HEAD
//<<<<<<< HEAD
		System.out.println("devC => A");
//=======
		System.out.println("devB => A");
//>>>>>>> refs/heads/devB
//=======
		System.out.println("devB -> A");
//=======
		System.out.println("devC -> A");
//>>>>>>> refs/heads/devC
//>>>>>>> refs/remotes/origin/master
	}

}
