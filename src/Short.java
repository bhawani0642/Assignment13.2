/*
 * Creating a class Short
 */
public class Short {
// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a string 
		 String Str = new String(" My-name-is-Prienc");
	      System.out.println("Output Value :" );      
	      //Applying for each loop
	      for (String retval: Str.split("-")) {
	         System.out.println(retval);
	      }
	      //Creating another string 
	         String Str1 = new String(" M-y-n-a-m-e-i-s-P-r-i-e-n-c ");
	         System.out.println("Output value:");
	         //Applying for each loop
	         for(String sgg:Str1.split("-")){
	        	 System.out.println(sgg);
	         }
	      }
	   }
	

	


