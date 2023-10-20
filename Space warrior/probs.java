public class probs 
{
    void easy(int x)
    {
        int e1 = (int)Math.random();
        int e2 = (int)Math.random();
        int k=0;
        System.out.println("What is the sum of "+e1+" and "+e2+" is?");
        if(x==e1+e2)
          System.out.println("your right! your rocket is gaining momentum!");
        else 
        {
          System.out.println("uh oh... aliens are onto us! run!");
          k++;
         if(k==3)
              System.out.println("shit...the aliens have got us");
       
        }
       
    }
}
