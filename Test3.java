// functionality of values() ,ordinal(),valueOf() 
//values() : can be used to return all the values present in the class enum 
// by using ordinal() method each enum constant index can be found just like array 
//valueOf() returns the enum constant of the string if present 
// enum as an argument to switch statement 
import java.io.* ;
import java.util.Scanner;
enum Color
{
RED, PINK , VIOLET;
}
public class Test {
public static void main(String[] args){
Color arr[] = Color.values();
for(Color col: arr )
{
System.out.println(col+"at index "+col.ordinal());

}
System.out.println(Color.valueOf("RED"));
}
}
