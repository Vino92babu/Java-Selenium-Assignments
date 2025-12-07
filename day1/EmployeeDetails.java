package week1.day1;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "John Doe";
		int age = 30;
		double salary = 55000.75;
		char gender = 'M';
		boolean acceptTerms = true;
		float rating = 4.5f;
		long mobileNumber = 9876543210l;
		int pinCode = 56001;
		int luckyNumber = 7;
		
		System.out.println(
				"Please Check Your Details below: \n\n	" +
				"Name		: "+name+"\n	" +
				"Age		: "+age+"\n	" +
				"Salary		: "+salary+"\n	"+
				"Gender		: "+ gender+"\n	"+
				"AcceptTerms	: "+ acceptTerms+"\n	"+
				"Rating		: "+rating+"\n	"+
				"Mobile Number	: "+mobileNumber+"\n	"+
				"Pincode		: "+pinCode+"\n	"+
				"LuckyNumber	: "+luckyNumber);
	}

}
