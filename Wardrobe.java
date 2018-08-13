// Dabeluchukwu 
// This the class for the wardrope organizer 
/* Goal of this is: A program that sorts out your clothes
   and picks the ideal outfit of that day. */
   
public class Wardrobe
{
   //Fields 
   
   //User to pick an option from the 
   private int option; 
   
   //Store the users option 
   public void setOption(int opt)
   {
      opt = option;
   }
   
   //Call the input
   public int getOption()
   {
      return option; 
   }
   
   public void menu()
   {
      System.out.println("Hello, welcome to Wardrobe 2.0");
      System.out.println("Choose a day below" + "\n" +
                         "1. Sunday" + "\n" +
                         "2. Monday" + "\n" + 
                         "3. Tuesday" + "\n" +
                         "4. Wednesday" + "\n" + 
                         "5. Thursday" + "\n" +
                         "6. Friday" + "\n" + 
                         "7. Saturday" + "\n"); 
   }
}
   