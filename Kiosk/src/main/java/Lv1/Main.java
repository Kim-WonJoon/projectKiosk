package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit;

        String[] menuName = {"종료", "ShackBurger", "SmokeShack", "CheeseShack", "HamBurger"};
        double[] price = {0, 6.9, 8.9, 6.9, 5.4};
        String[] menuDescription = {"종료", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", "비프패티를 기반으로 야채가 들어간 기본버거"};

        do {
            System.out.println("[ SHACKSHACK MENU ]");
            System.out.println("1. " + menuName[1] + " | W " + price[1] + " | " + menuDescription[1]);
            System.out.println("2. " + menuName[2] + " | W " + price[2] + " | " + menuDescription[2]);
            System.out.println("3. " + menuName[3] + " | W " + price[3] + " | " + menuDescription[3]);
            System.out.println("4. " + menuName[4] + " | W " + price[4] + " | " + menuDescription[4]);
            System.out.println("0. 종료");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("선택한 메뉴 : " + menuName[choice]);
                    System.out.println("결제금액 : " + price[choice]);
                    break;
                case 2:
                    System.out.println("선택한 메뉴 : " + menuName[choice]);
                    System.out.println("결제금액 : " + price[choice]);
                    break;
                case 3:
                    System.out.println("선택한 메뉴 : " + menuName[choice]);
                    System.out.println("결제금액 : " + price[choice]);
                    break;
                case 4:
                    System.out.println("선택한 메뉴 : " + menuName[choice]);
                    System.out.println("결제금액 : " + price[choice]);
                    break;
                    default:
                        System.out.println("잘못 선택하셨습니다.");
            }
            System.out.println("메뉴를 추가하려면 임의 값을 입력하세요.(종료하려면 '0' 입력.)");
            exit = sc.next();

        } while (!exit.equals("0"));
        System.out.println("종료");



    }
}
