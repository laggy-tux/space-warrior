import java.util.Scanner;

public class Main 
{

  static char Lvl=' '; 
  static int high=0;
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    
    figlet fig=new figlet();
    fig.logo();
    Welcome wl=new Welcome();
    wl.welcome();
    probs sums=new probs();
    
    
    
    char wel=sc.next().charAt(0);
  
    switch(wel)
    { 
        case 'p':
         fig.logo();
         level ll=new level();
         ll.lvl();
         Lvl=sc.next().charAt(0);
         switch(Lvl)
         {
            case 'e':
             fig.logo();
             sums.easy();

            break;

            case 'm':
             fig.logo();
             System.out.println("medium");
            break;
            
            case 'h':
             fig.logo();
             System.out.println("hard");
            break;
            
            case 'b':
             ll.lvl();
             break;
        }
        break;

   
        case 'h':
            highScore hscr=new highScore();
            fig.logo();
            hscr.highscr(high);
        
    
          break; 
    
        case 'q':
    
            Quit qt=new Quit();
            qt.quit();
            
    
        break;
    
    }
    
    
  }
     
    
  }


