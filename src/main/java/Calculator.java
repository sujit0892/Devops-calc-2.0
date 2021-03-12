import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        long a, b;
        while(true)
        {
            try {
                System.out.print("Menu\n1. Factorial\n2. Power\n3. Log\n4. Sqrt\n5. Exit\nEnter choice: ");
                ch = sc.nextInt();
                switch (ch)
                {
                    case 1: System.out.print("Enter a number: ");
                        a = sc.nextLong();
                        System.out.println(fact(a));
                        break;
                    case 2: System.out.print("Enter two number a^b : ");
                        a = sc.nextLong();
                        b = sc.nextLong();
                        System.out.println((long)power(a,b));
                        break;
                    case 3: System.out.print("Enter a number: ");
                        a = sc.nextLong();
                        System.out.println(log(a));
                        break;
                    case 4: System.out.print("Enter a number: ");
                        a = sc.nextLong();
                        System.out.println(sqrt(a));
                        break;
                    case 5: System.exit(0);
                        break;

                    default: System.out.println("Wrong Input");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Wrong Input");

            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Input cant be negative");
            }


        }



    }

    public static long fact(long n){
        if(n<0)
            throw new IllegalArgumentException();
        long fact=1;
        for(long i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static double power(long a,long b){
        return java.lang.Math.pow(a,b);
    }

    public static double log(long a){
        if(a<0)
            throw new IllegalArgumentException();
        return java.lang.Math.log(a);
    }

    public static double sqrt(long a){
        if(a<0)
            throw new IllegalArgumentException();
        return java.lang.Math.sqrt(a);
    }





}