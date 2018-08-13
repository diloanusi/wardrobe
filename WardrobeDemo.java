//Dabeluchukwu 
//Demo displaying how the wardrobe works 

import javax.swing.JoptionPane;

public class WardrobeDemo
{
   public static void main(String[] args)
   {  
      Wardrobe w = new Wardrobe;
      int option;
      
      do 
      {
         //Menu that shows the user days of the week   
         wardrobe.menu();
         
         Scanner keyboard = new Scanner(System.in);
         option = keyboard.nextInt();

         //make sure the user makes a valid choice 
         while(option < 1 || option > 7)
         {  
            option = keyboard.nextInt();
         }
         
 
         switch(option)
         {
            case 1: 
            System.out.println();
            System.out.println("Happy Monday!");
            System.out.println("The weather today is " + /*weather*/);
            
         }
      
   }
}