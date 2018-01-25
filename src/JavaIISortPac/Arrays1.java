package JavaIISortPac;

public class Arrays1
{
  
  private static int howMany = 10;
  private static int [] numList = new int[howMany];

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    
          for(int i = 0; i< numList.length; i++)
          {
            numList[i] = (int)(Math.random() * 100)  + 1;
            //took out other stuff about winning the lottery...
          }
          
          System.out.println(java.util.Arrays.toString(numList));
          System.out.println( "The lowest number in the list is " + findLowest());

  }
  
  public static int findLowest()
  {
    
       int lowValue = numList[0];
       for(int i = 1; i< numList.length; i++)
       {
           if(numList[i] < lowValue)
           {
             lowValue = numList[i];
           }
       }
       
       return lowValue;
  }
  
  
  public static void generateNumbers() 
  {
          for(int i = 0; i< numList.length; i++)
          {
            numList[i] = (int)(Math.random() * 100)  + 1;
          }
    
  }

}
