import java.util.Random;
import java.util.Scanner;
public class probs 
{
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    int k=0,ehigh=0;
    
    void easy(int x) // lvl easy
    {
     for(int i=0;i<10;i++)
     {
         int  rand1=rand.nextInt(x); 
         int  rand2=rand.nextInt(x);
      
         System.out.println();
         System.out.println("                                         what is "+rand1+" plus (+) "+rand2+"? ");
         int ans=sc.nextInt();
              
         if(ans==rand1+rand2)
         {
             System.out.println("                                     your Right!.... Your rocket it gaining momentum,lets keep this going!");
             ehigh++;
         }
         else 
         {
            k++;
              if(k==3)
              {     
                 System.out.println("                              looks like we have been beaten by the aliens.. return to base  ");
                 break;
              }
              else
                System.out.println("                                      opps:(.... looks like ur losing momuntum... lets comeback!");
         }
       }

    }

    void mid(int x)
    {
     for(int i=0;i<10;i++)
     {
         int  rand1=rand.nextInt(x); 
         int  rand2=rand.nextInt(x);
      
         System.out.println();
         System.out.println("                                         what is "+rand1+" plus (+) "+rand2+"into (*) "+(rand2*2)+rand1/10);
         int ans=sc.nextInt();
             
         if(ans==rand1+rand2)
         {
             System.out.println("                                     your Right!.... Your rocket it gaining momentum,lets keep this going!");
             ehigh++;
         }
         else 
         {
            k++;
              if(k==3)
              {     
                 System.out.println("                              looks like we have been beaten by the aliens.. return to base  ");
                 break;
              }
              else
                System.out.println("                                      opps:(.... looks like ur losing momuntum... lets comeback!");
         }
       }

    }

    void hard(int x)
    {
     for(int i=0;i<10;i++)
     {
         int  rand1=rand.nextInt(x); 
         int  rand2=rand.nextInt(x);
      
         System.out.println();
         System.out.println("                                         what is "+rand1+" plus (+) "+rand2+"into (*) "+((rand2*2)+rand1/10)+" divided (/) by "+(rand1+rand2)/2);
         int ans=sc.nextInt();
              
         if(ans==rand1+rand2)
         {
             System.out.println("                                     your Right!.... Your rocket it gaining momentum,lets keep this going!");
             ehigh++;
         }
         else 
         {
            k++;
              if(k==3)
              {     
                 System.out.println("                              looks like we have been beaten by the aliens.. return to base  ");
                 break;
              }
              else
                System.out.println("                                      opps:(.... looks like ur losing momuntum... lets comeback!");
         }
       }

    }
  }

