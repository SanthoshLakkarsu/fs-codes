import java.util.*;
public class Test
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    String alpha = sc.next();
    String theta = sc.next();
    int start=str.indexOf(alpha);
    int end=str.lastIndexOf(theta);
    
    String sub= str.substring(start,end+1);
    System.out.println(sub);
}
}
