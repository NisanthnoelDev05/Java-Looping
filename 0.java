import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=123;
        int sum=0;
        int pro=1;
        while(n!=0){
            int ren=n%10;
            sum=sum+ren;
            pro=pro+ren;
            n=n/16;
        }
        if(sum==pro)
        System.out.println("Spy number");
        else
        System.out.println("Not a Spy number");

    }
}