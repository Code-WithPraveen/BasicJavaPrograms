package javaPrograms;

public class CountofIntegersinString2 {

	public static void main(String[] args) {

		String Input = "asdf1qwer9as8d7";
		
		int sum = 0;
		
		for (int i = 0; i < Input.length(); i++) {
			char a = Input.charAt(i);
			if(Character.isDigit(a))
			{
				int c = Integer.parseInt(String.valueOf(a));
				sum = sum+c;
			}
			
		}
		System.out.println(sum);
		
		
	}

}
