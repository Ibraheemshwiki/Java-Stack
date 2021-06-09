import java.util.Scanner;
public class FizzBuzz{
    FizzBuzz_fun newInstance = new FizzBuzz_fun();
    public static void main (String[]args){
      System.out.println("enter your num");
      Scanner sc= new Scanner(System.in);
      int num=sc.nextInt();
       String x= FizzBuzz_fun.resalte(num);
      System.out.println(x);
    }
}