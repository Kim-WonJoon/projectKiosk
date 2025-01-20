package Lv5;

public class MenuItem {
    private String menuName;
    private double price;
    private String menuDescription;

    // 생성자
    public MenuItem(String menuName, double price, String menuDescription) {
        this.menuName = menuName;
        this.price = price;
        this.menuDescription = menuDescription;
    }

    // Getter와 Setter
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }
}
