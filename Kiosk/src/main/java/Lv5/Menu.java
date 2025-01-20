package Lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> menuItems;

    // 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // Getter와 Setter
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 메뉴 항목 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 메뉴 항목 출력
    public void displayMenuItems() {
        for (int i = 1; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println(i +"." + item.getMenuName() + " | " + item.getPrice() + " | " + item.getMenuDescription());
        }
        System.out.println("0. 뒤로가기");
    }
}
