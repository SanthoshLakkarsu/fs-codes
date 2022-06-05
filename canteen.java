import java.util.*; 
class canteen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String s=sc.next();
        char[] c=s.toCharArray();
        while(n2>0){
        for(int i=0;i<n1-1;i++){
            if(c[i]=='B'&&c[i+1]=='G'){
                char t=c[i+1];
                c[i+1]=c[i];
                c[i]=t;
                i++;
            }
        }
        n2--;
        }
        System.out.println(String.valueOf(c));
    }
}
