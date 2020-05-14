package javaPrograms;

public class OccurrenceOfString1 {

	public static void main(String[] args) {

		String Input = "You have no choice other than following me!";
		int sum = 0;
		for (int i = 0; i < Input.length(); i++) {
			
			if (Input.charAt(i) == 'o')
				sum = sum+1;	
				;
			
		}
		System.out.println(sum);
		
		
	}

}
