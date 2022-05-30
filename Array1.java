
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores; //Declare an int array
		scores = new int[4]; //Instantiate an int array object of 4 elements
		//All the array elements are initialized to default values, in this case 0
		
		//Print all the array elements before assigning the values
		System.out.println(scores[0]); //Prints 1st array element
		System.out.println(scores[1]); //Prints 2nd array element
		System.out.println(scores[2]); //Prints 3rd array element
		System.out.println(scores[3]); //Prints 4th array element.
		
		//Assign values to array elements.
		scores[0] = 85; //Assigns 85 to 1st element
		scores[1] = 70; //Assigns 70 to 2nd element
		scores[2] = 95; //Assigns 95 to 3rd element
		scores[3] = 90; //Assigns 90 to 4th element
		
		//Print all the array elements after assigning the values
		System.out.println(scores[0]); //Prints 1st array element
		System.out.println(scores[1]); //Prints 2nd array element
		System.out.println(scores[2]); //Prints 3rd array element
		System.out.println(scores[3]); //Prints 4th array element.
		
		String [] names = new String [5]; //Declare and instantiate a String array object of 5 elements
		//All the array elements are initialized to default values, in this case null
		
		//Print all the array elements before assigning the values
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		//Assign String objects to array elements
		names[0] = "Jack";
		names[1] = "Lucy";
		names[2] = "Joe";
		names[3] = "John";
		names[4] = "Kate";
		
		//Print all the array elements after assigning the values
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		int score1 = 85;
		String name = "Ankita";
		int [] scores1 = new int[4];
		String [] names1 = new String[5];
		
		System.out.println(score1); 
		System.out.println(name); 
		System.out.println(scores1); 
		System.out.println(names1); 
	}

}
