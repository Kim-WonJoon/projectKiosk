package Lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems;
    Scanner sc;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        String exit;

        do {
            System.out.println("[ SHACKSHACK MENU ]");

            for (int i=1 ; i<menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println(i +". " + item.menuName + " | " + item.price + " | " + item.menuDescription);
            }
            System.out.println("0. 종료");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    MenuItem choiceItem = menuItems.get(choice);
                    System.out.println("선택한 메뉴 : " + choiceItem.menuName);
                    System.out.println("결제금액 : " + choiceItem.price);
                    System.out.println("메뉴설명 : " + choiceItem.menuDescription);
                    break;
                case 2:
                    choiceItem = menuItems.get(choice);
                    System.out.println("선택한 메뉴 : " + choiceItem.menuName);
                    System.out.println("결제금액 : " + choiceItem.price);
                    System.out.println("메뉴설명 : " + choiceItem.menuDescription);
                    break;
                case 3:
                    choiceItem = menuItems.get(choice);
                    System.out.println("선택한 메뉴 : " + choiceItem.menuName);
                    System.out.println("결제금액 : " + choiceItem.price);
                    System.out.println("메뉴설명 : " + choiceItem.menuDescription);
                    break;
                case 4:
                    choiceItem = menuItems.get(choice);
                    System.out.println("선택한 메뉴 : " + choiceItem.menuName);
                    System.out.println("결제금액 : " + choiceItem.price);
                    System.out.println("메뉴설명 : " + choiceItem.menuDescription);
                    break;
                default:
                    System.out.println("잘못 선택하셨습니다.");
            }
            System.out.println("메뉴를 추가하려면 임의 값을 입력하세요.(종료하려면 '0'입력)");
            exit = sc.next();

        } while (!exit.equals("0"));
        System.out.println("종료");

    }
}
