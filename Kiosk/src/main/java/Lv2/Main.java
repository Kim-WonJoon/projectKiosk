package Lv2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit;

        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem("종료", 0, "선택을 종료합니다."));
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseShack", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

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
