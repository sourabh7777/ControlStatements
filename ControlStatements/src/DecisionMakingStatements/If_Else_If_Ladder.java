package DecisionMakingStatements;

public class If_Else_If_Ladder {

	public static void main(String[] args) {
		String city = "Bangalore";
		
		if(city == "Delhi")
			System.out.println("City is Delhi");
		else if(city == "Mumbai")
			System.out.println("City is Mumbai");
		else if (city == "Chennai")
			System.out.println("City is Chennai");
		else
			System.out.println(city);

	}

}
