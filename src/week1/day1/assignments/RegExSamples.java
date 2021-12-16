package week1.day1.assignments;

public class RegExSamples {

	public static void main(String[] args) {
		  String stringWithLowerCase = "This is a Lower Case String";
		  System.out.println("before ==>"+stringWithLowerCase);
		  
		  System.out.println("after ==>"+stringWithLowerCase.replaceAll("[\\p{Upper}]", "_$0").toLowerCase());
		  System.out.println("==>"+stringWithLowerCase.replaceAll("_$0", "[\\p{Upper}]"));
		  System.out.println("****"+"_".concat(stringWithLowerCase).replace(" ", " _").toLowerCase());
		  
		  String s = "shellform";
		  String t = "sell";
		  String pattern = "[^"+t+"]";
		  System.out.println(s.replaceAll(pattern, ""));
	}
}
