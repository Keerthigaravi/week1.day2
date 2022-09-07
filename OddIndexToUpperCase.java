package week1.day2;

public class OddIndexToUpperCase {
	 public static void main(String[] args) { 

 String test ="changeme";
 char[] chars = test.toCharArray();{
	 for(int i=0;i< chars.length;i++)
	 {
		 char c = chars[i];
		 if(i % 2 != 0) {
			 c=Character.toUpperCase(c);
			 
		 }
		 System.out.print(c); 
 }

 }	 

}
}