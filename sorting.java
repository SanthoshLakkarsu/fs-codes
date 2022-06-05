import java.util.*;
class  sorting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(",");
        String x=sc.next();
        for(int i=0;i<s.length-1;i++){
            for(int j=0;j<s.length-i-1;j++){
                String p=s[j].split(" ")[1];
                String p1=s[j+1].split(" ")[1];
              if(p.compareTo(p1)>0){
                   System.out.print(s[j]);
                   System.out.println(s[j+1]);
                  
                  String p2=s[j];
                  s[j]=s[j+1];
                  s[j+1]=p2;
              } 
            }
        }
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<s.length;i++){
            a.add(s[i]);
        }
        if(x.equals("DESC")){
            Collections.reverse(a);
            System.out.print(a);
            return;
        }
        
        System.out.println(a);
        
        
     }
}
