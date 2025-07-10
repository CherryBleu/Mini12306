import java.util.Scanner;

import Role.Person;
import Exception.ChoiceOutOfIndex;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mini12306系统");
        System.out.println("---------------------");
        System.out.println("请选择操作：");
        System.out.println("1. 登录");
        System.out.println("2. 注册");
        System.out.println("3. 退出");

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入您的选择：");
        while(choice != 1 && choice != 2 && choice != 3) {
            String input = sc.nextLine();
            try {
                choice = Integer.parseInt(input);
                checkChoice(choice);
            }
            catch (NumberFormatException e) {
                System.out.println("只能输入数字！");
                System.out.print("请重新输入：");
            }
            catch (ChoiceOutOfIndex ex) {
                System.out.println(ex.getMessage());
                System.out.print("请重新输入：");
            }
        }

        switch (choice){
            case 1:
                Person.login();
                break;
            case 2:
                Person.register();
                break;
            case 3:
                System.out.println("欢迎下次再来！");
                break;
        }
    }

    static void checkChoice(int choice) {
        if(choice != 1 && choice != 2 && choice != 3)
            throw new ChoiceOutOfIndex("输入数字范围超过可供选择的范围。");
    }
}