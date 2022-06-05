import java.util.*;
class vowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int n=sc.nextInt();
        String p="aeiou";
        String k="";
        for(int i=0;i<s.length();i++){
            if(p.contains(Character.toString(s.charAt(i)))){
                k=k+s.charAt(i);
            }
        }
           if(k.length()<n){
                System.out.println("invalid");
            }
            else{
                System.out.println(k.substring(0,n));
            }
        
    }
}
