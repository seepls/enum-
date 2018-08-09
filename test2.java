// enum as an argument to switch statement 
import java.io.* ;
import java.util.Scanner;
enum Day {
 SUN , MON , TUE ,WED,THU , FRI , SAT ;
 }
 
 public class Test {
 Day day ;
 public Test (Day day ) {
 this.day =day ;
 }
 
 public void dayIsLike()
 {
     switch(day)
      {
      case MON:
      System.out.println("good start to week ");
      break;
      case FRI:
      System.out.println("friday is all that i wait for " ) ;
      break;
      case SAT:
      case SUN:
      System.out.println("weekend yaya!!");
 		break ;
 		}
 		}
 		
 		
 		public static void main(String[] args)
 		{
 		String str = "MON";
 			Test t1 =new Test(Day.valueOf(str));
 			t1.dayIsLike();
 			}
 			}
