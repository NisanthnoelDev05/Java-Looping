import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=reverse(n);
        int sq1=n*n;
        int sq2=rev*rev;
        if(sq1==reverse(sq2))
            System.out.println("Adam's Number");
        else
            System.out.println("Not an Adam's Number");
        sc.close();
    }
    static int reverse(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
}
