import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char choice;
        do{
            int n=sc.nextInt();
            int temp=n;
            while(temp>=0) {
                if(n%2==0)
                    System.out.println(n+" is Even");
                else
                    System.out.println(n+" is Odd");
                break;
            }
            System.out.print("Do you want to continue (y/n)? ");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
        sc.close();
    }
}
