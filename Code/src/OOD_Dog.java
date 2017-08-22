
public class OOD_Dog {

	public static void main(String[] args) {

		// Step1- Declaring a variable called Shepherd

		Dog Shepherd;// or Dog Shepherd= new Dog("male");

		// Step2- Creating Objects
		// Step3- Initialize Objects calling the constructor

		Shepherd = new Dog("male");
		// Using the method
		Shepherd.Walk();
		Shepherd.Eat();

	}

}
// step 1: A class declaration with a class name with a modifier type.

class Dog {
	// step 2: Declaring Member Variables.
	public String gender;

	public Dog(String _gender) {
		gender = _gender;

	}

	// step 3: Defining Methods.
	public void Walk() {
		System.out.println(gender + " puppy is walking");
	}

	public void Eat() {
		System.out.println(gender + " puppy is eing");
	}
}
