import java.util.Random;
import java.util.Scanner;

public class ACC1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //ACC1
        System.out.print("请输入用户名：");
        Account ACC1 = new Account(scanner.next(),202201,101);
        System.out.println();

        ACC1.withdraw(random.nextDouble(0,500));
        ACC1.deposit(random.nextDouble(0,500));
        double balance1 = ACC1.Check();

        System.out.println(ACC1);

        //ACC2
        System.out.print("请输入用户名：");
        Account ACC2 = new Account(scanner.next(), 202202,102);

        ACC2.withdraw(random.nextDouble(0,500));
        ACC2.deposit(random.nextDouble(0,500));
        double balance2 = ACC2.Check();

        System.out.println(ACC2);
    }
}
