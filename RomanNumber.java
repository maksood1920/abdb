package converters;
// use Logger 
// We need to use as specific exception as possible. Avoiding parent exception is the necessary. 
public class RomanNumber
{
   private int number;

   private static final int maxValue = 3000;
   
   public RomanNumber(int number) throws RomanException
   {
      if(number > maxValue) 
    	  throw new RomanException("RomanNumber only supports numbers up to 3000");
      this.number = number;
   }

   // change the name of method - SetNumber to setNumber(follows camel Case) 
   // catch the Number Format Exception and throw more generic exception. Though it's Runtime Exception but it could cause trouble 
   // for the end use. It's always best practice to catch them. 
   public void setNumber(String number) throws RomanException
   {
	   try {
		   
      this.number = Integer.parseInt(number);
      if(this.number > maxValue) 
    	  throw new RomanException("RomanNumber only supports numbers up to 3000");
	   }
	   catch (Exception e) {
	    	  throw new RomanException(number+ " is not a number");

	}


   }
   

   //Sting is Immutable object whenver we are using concating with the other string, it creates the new String. Whichis wastage to the 
   // the memory. This can be avoided by using StringBuilder. In case if we have to maintain thread safety then StringBuffer is best.
   // I have corrected the logic too which was wrong. 
   public String convert() throws RomanException
   {
      StringBuilder resultSb = new StringBuilder();
      try {
         int thousands = this.number / 1000;
         if(thousands>0) {
        	 resultSb.append(times(thousands, "M"));
         this.number=this.number%1000;
         }
         
         int hundreds = this.number / 100 ;
         if(hundreds>0) {
        	 resultSb.append(times(hundreds, "C", "D", "M"));
         this.number=this.number%100;
         }  
         
         int tens = this.number / 10 ;
         if(tens>0) {
        	 resultSb.append(times(tens, "X", "L", "C"));
         this.number=this.number%10;

         } 
         int ones = this.number % 10;
         if(ones>0)
        	 resultSb.append(times(ones, "I", "V", "X"));
      } 
      catch (Exception ex){
    	  // remove sop use log
    	  throw new RomanException("An error occured "+ex);
      }
      return resultSb.toString();
   }

   // use StringBuilder 
   private String times(int number, String character)
   {
	      StringBuilder resultSb = new StringBuilder();

      for(int i = 0; i < number; i++)
      {
    	  resultSb.append(character);
      }
      return resultSb.toString();
   }
 
   // This is fine // but we should avoid switch statements as it is prone to NPE. In this case even range based conditional if
   // and else suffice.
   private String times(int number, String o, String f, String t) throws RomanException
   {
      switch(number)
      {
         case 0:
            return "";
         case 1:
         case 2:
         case 3:
            return times(number, o);
         case 4:
            return o + f;
         case 5:
         case 6:
         case 7:
         case 8:
            return f + times(number - 5, o);
         case 9:
            return o + t;
         default:
            throw new RomanException("Only single digits allowed - not " + number);
      }
   }
   
}

class RomanException extends Exception
{
	
public RomanException(String message) {
	super(message);
}

}
