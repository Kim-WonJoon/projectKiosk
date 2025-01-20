package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    String categoryName;
    List<MenuItem> menuItems;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // 메뉴 항목 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 출력
    public void displayMenuItems() {
        for (int i=1 ; i<menuItems.size() ; i++) {
            MenuItem item = menuItems.get(i);
            System.out.println(i +". " + item.menuName + " | " + item.price + " | " + item.menuDescription);
        }
        System.out.println("0. 뒤로가기");
    }
}
