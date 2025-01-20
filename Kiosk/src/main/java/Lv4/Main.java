package Lv4;

public class Main {
    public static void main(String[] args) {
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("종료", 0, "종료"));
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem(new MenuItem("종료", 0, "종료"));
        drinkMenu.addMenuItem(new MenuItem("코카콜라", 1.9, "콜라"));
        drinkMenu.addMenuItem(new MenuItem("스프라이트", 1.9, "스프라이트"));

        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem(new MenuItem("종료", 0, "종료"));
        dessertMenu.addMenuItem(new MenuItem("감자튀김", 1.5, "바삭한 감자튀김"));
        dessertMenu.addMenuItem(new MenuItem("치즈스틱", 2.0, "쭉 늘어나는 치즈스틱"));

        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(burgerMenu);
        kiosk.addMenu(drinkMenu);
        kiosk.addMenu(dessertMenu);

        kiosk.start();
    }
}
