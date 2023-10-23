import java.util.Scanner;
public class Main 
{
   public static void main (String args[])
  {
    // class initialisation
    Scanner sc = new Scanner (System.in); 
    
    
    // variable initialisation
    //int i,j,k=0; // general variables
    char wel=' ',lev=' '; // Scanner variables
    
    // method stuffs
    figlet fig=new figlet();
    Welcome wl=new Welcome();
    level lvl=new level();
    probs sums=new probs();
    rules rules=new rules();
    
    // begin
    fig.logo();
    wl.welcome();
    wel=sc.next().charAt(0);

    switch(wel) // main switch case
    {
      case 'p': // play
        //setting upperlim
        fig.logo();
        System.out.println("                                         what do u want your upper-limit to be?                                                                                 ");
        int upperlimit=sc.nextInt();
        
        // asking lvl
        fig.logo();
        lvl.lvl();
        lev=sc.next().charAt(0); 
       
       switch(lev) // level switch case (internal switch case)
       {
         case 'e': //lvl easy 
           fig.logo();
           sums.easy(upperlimit);
          break;
        }
      break;

      case 'h': // highscore
        lvl.lvl();
        int ans=sc.nextInt();

        switch(ans)
        {
          case 'e':
            int ehigh=sums.ehigh;
            fig.logo();
            System.out.println("the high score is! "+ehigh);
          break;
        }  

      break;

      case 'r':
      fig.logo();
      rules.rules();
      break;
       
    }
      
     
  }
}


