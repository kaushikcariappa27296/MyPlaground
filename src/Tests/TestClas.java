package Tests;

public class TestClas {

	public static void main(String[] args) {
		String a1="amma";
		String a2="boy";
		String s3=a1+a2;
		a1=s3.substring(a1.length());
		a2=s3.substring(0,s3.length()-a1.length());
		System.out.println(a1);
		System.out.println(a2);
		
	}

}
