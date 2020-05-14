package javaPrograms;

public class CountofIntegersinString1 {

	public static void main(String[] args) {

		String Input = "asdf1qwer9as8d7";
		
		String strInputInt = Input.replaceAll("\\D", "");
		int InputInt = Integer.parseInt(strInputInt);
		
		int rem = 0;
		
		while(InputInt>0)
		{
			rem = rem+InputInt%10;
			InputInt = InputInt/10;
		}
		System.out.println(rem);
		
		
	}

}
