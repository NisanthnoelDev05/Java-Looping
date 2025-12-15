import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        if(sum==n)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
        sc.close();
    }
    static int factorial(int d){
        int fact=1;
        for(int i=1;i<=d;i++){
            fact*=i;
        }
        return fact;
    }
}
