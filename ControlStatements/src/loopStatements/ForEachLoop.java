package loopStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] city = {"Bangalore", "Delhi" , "Mumbai" , "Chennai"};
		
		System.out.println("Printing the content of array city : \n");
		for (String value : city) {
			System.out.println(value);
		}

	}

}
