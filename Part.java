import java.awt.print.Book;
import java.util.Scanner;

public class tt {
    public void showMenu() {
        System.out.println("========图书管理系统========");
        System.out.println("1.------查询");
        System.out.println("2.------删除");
        System.out.println("0.------结束");
        System.out.println("=============================================");
    }
    public void menu(){
        Book b=new Book();
        Scanner sc=new Scanner(System.in);
        showMenu();
        System.out.print("请输入选择：");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("是否知道作者名？知道输入1，不知道输入2");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("请输入作者名：");
                String name = sc.next();
                sc.nextLine();
                System.out.print("请输入书名：");
                String book = sc.nextLine();
                System.out.println(sc.query(name, book));
            } else {
                String name = sc.nextLine();
                System.out.print("请输入书名：");
                String book = sc.nextLine();
                System.out.println(sc.query(name, book));
            }
            menu();
        }
    }
}
