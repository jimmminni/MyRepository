package mygit;

public class MyClass {
	public static void main(String[] args) {
		System.out.println("HELLO GIT!");
		System.out.println("This is the 2nd version");
//<<<<<<< HEAD
		System.out.println("My changed in master branch");
//=======

		YourClass your = new YourClass();
		your.sayHello("Everyone!!");
//>>>>>>> refs/heads/dev
	}
}
