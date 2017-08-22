
 public class HealthCaculator {
	 
	 //Declaring Member Variables: name
	public String name;
	
	//The constructor of  super class with a string type argument:  name

	public HealthCaculator(String _name){
		name= _name;
		}
	
	//Defining a public void method called ．getInfo・ to print  the user name
	public void getInfo() {
		System.out.println("my name is "+ name );

	}
}

 class BMICaculator extends HealthCaculator {
//The constructor of  subclass with two double type arguments: weight and height, and a string type argument: name
	 
	 //Declaring Member Variables: weight, and height
	public double w;
	public double h;
	public BMICaculator(String _name, double _weight, double _height){
		super(_name);
		name= _name;
		w=_weight;
		h=_height;
		}
	
	//Defining a public void method called ．getCalcular・ to get the  BMI value
	public void getCalcular(){
		//Using the method of super class to print the user-name
	   super.getInfo();
	   double bmi = w / (h * h); 
	   System.out.println("my bmi is " + bmi );
    }
}