import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int a=0;a*a*a<n;a++){
        for (int b=a+1;b*b*b<n;b++){
                if (a*a*a+b*b*b==n){
                    System.out.println(n+"="+a+"^3+"+b+"^3");
                    count++;
                }
            }
        }
        if(count>=2){
            System.out.println(n+" is a ramanujan number");
        }
        else{
           System.out.println(n+" is not a ramanujan number"); 
        }
        sc.close();    
    }
}