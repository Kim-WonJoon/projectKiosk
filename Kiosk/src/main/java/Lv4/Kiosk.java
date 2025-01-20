package Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menus;
    Scanner scanner;

    public Kiosk() {
        this.menus = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {
        int categoryChoice;
        do {
            System.out.println("[ SHACKSHACk MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf(i+1 + "." + menus.get(i).getCategoryName());
                System.out.println();
            }
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요: ");
            categoryChoice = scanner.nextInt();

            switch (categoryChoice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                case 2:
                case 3:
                    if (categoryChoice >= 1 && categoryChoice <= menus.size()) {
                        Menu selectedMenu = menus.get(categoryChoice-1);
                        handleMenu(selectedMenu);
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        } while (categoryChoice != 0);  // 종료가 아닐 경우 반복
    }

    private void handleMenu(Menu menu) {
        int menuItemChoice;
        do {
            System.out.println("[ " + menu.getCategoryName().toUpperCase() + " MENU ]");
            menu.displayMenuItems();

            System.out.print("메뉴를 선택하세요: ");
            menuItemChoice = scanner.nextInt();

            switch (menuItemChoice) {
                case 0:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    if (menuItemChoice >= 1 && menuItemChoice <= menu.menuItems.size()) {
                        MenuItem selectedItem = menu.menuItems.get(menuItemChoice);
                        System.out.printf("선택한 메뉴: " + selectedItem.menuName +" | "+ selectedItem.price +" | "+ selectedItem.menuDescription);
                        System.out.println();
                        return;
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    }
            }
        } while (menuItemChoice != 0);  // 메뉴 아이템 선택이 종료가 아닐 경우 반복
    }
}
