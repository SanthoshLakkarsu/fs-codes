import java.util.*;
public class date
{
    
     static boolean isLeap(int y)
    {
        return (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0));
    }
    static boolean checkDate(int d1,int m1,int y1)
    {
         if (m1 < 1 || m1 > 12)
            return false;
        if (d1 < 1 || d1 > 31)
            return false;
        if (m1 == 2)
        {
            if (isLeap(y1))
                return (d1 <= 29);
            else
                return (d1 <= 28);
        }
        if(m1==4 || m1==6 || m1==9 || m1==11)
        {
            return (d1<=30);
        }
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String date= sc.next();
        String d= date.substring(0,2);
        int d1= Integer.parseInt(d);
        String m= date.substring(2,4);
        int m1=Integer.parseInt(m);
        String y= date.substring(4);
        int y1= Integer.parseInt(y);
        if(checkDate(d1,m1,y1)== true)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
