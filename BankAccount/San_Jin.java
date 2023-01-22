import java.util.Scanner;

public class San_Jin {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入账户：");
        int AccNum = scanner.nextInt();
        Account account = new Account("San·Jin",AccNum,Double.POSITIVE_INFINITY);

        System.out.println(account);
    }
}
