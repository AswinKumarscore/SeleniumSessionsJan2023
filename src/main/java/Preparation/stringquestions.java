package Preparation;

public class stringquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="$531k";
		String b = a.replaceAll("[$k]","");
		System.out.println("The value of a is "+a.replaceAll("[$]",""));
		System.out.println(b);

	}

}
