package javaPrograms;

public class OccurrenceOfStringChar {

	public static void main(String[] args) {

		String Input = "You have no choice other than following me!";
		int sum = 0;
		
		char[] InputArray = Input.toCharArray();
		
		for (int i = 0; i < InputArray.length; i++) {
			if(InputArray[i] == 'o')
			{
				sum++;
			
		}
	
		}
		System.out.println(sum);
}
}
