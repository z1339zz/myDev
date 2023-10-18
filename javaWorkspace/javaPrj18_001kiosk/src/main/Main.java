package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int orderNumber = 1; // 주문 번호표

    private static final Map<String, Double> MENU_PRICES = new HashMap<>();
    static {
        MENU_PRICES.put("매운버거", 6.99);
        MENU_PRICES.put("안매운버거", 5.99);
        MENU_PRICES.put("달달한버거", 7.49);
        MENU_PRICES.put("감자튀김", 2.99);
        MENU_PRICES.put("치즈스틱", 3.49);
        MENU_PRICES.put("코울슬로", 2.79);
        MENU_PRICES.put("콜라", 1.49);
        MENU_PRICES.put("사이다", 1.49);
        MENU_PRICES.put("환타", 1.99);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("맥도날드 키오스크에 오신 것을 환영합니다!");
        System.out.println("주문을 시작합니다. 메뉴를 선택하세요:");

        Map<String, Integer> menuQuantity = new HashMap<>();
        for (String menu : MENU_PRICES.keySet()) {
            menuQuantity.put(menu, 0);
        }

        while (true) {
            System.out.println("1. 버거  2. 사이드  3. 음료  4. 주문 완료");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                processOrder(choice, menuQuantity, scanner);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("올바른 메뉴 번호를 선택하세요.");
            }
        }

        double totalPrice = calculateTotalPrice(menuQuantity);

        System.out.println("주문이 완료되었습니다!");
        System.out.println("주문 번호표: " + orderNumber);
        System.out.println("주문 내역:");
        printOrderSummary(menuQuantity);
        System.out.println("총 결제 금액: ₩" + (int) totalPrice);

        orderNumber++; // 다음 주문을 위해 주문 번호표 증가

        scanner.close();
    }

    private static void processOrder(int category, Map<String, Integer> menuQuantity, Scanner scanner) {
        String[] categories = {"버거", "사이드", "음료"};
        System.out.println("선택할 " + categories[category - 1] + "의 메뉴를 선택하세요:");

        int index = 1;
        for (String menu : MENU_PRICES.keySet()) {
            if ((category == 1 && menu.contains("버거")) ||
                (category == 2 && menu.contains("튀김")) ||
                (category == 3 && menu.contains("음료"))) {
                System.out.println(index + ". " + menu);
                index++;
            }
        }

        int menuChoice = scanner.nextInt();
        String selectedMenu = getMenuByCategoryAndChoice(category, menuChoice);

        System.out.println(selectedMenu + "의 개수를 입력하세요:");
        int quantity = scanner.nextInt();
        menuQuantity.put(selectedMenu, menuQuantity.get(selectedMenu) + quantity);
    }

    private static String getMenuByCategoryAndChoice(int category, int choice) {
        int index = 1;
        for (String menu : MENU_PRICES.keySet()) {
            if ((category == 1 && menu.contains("버거")) ||
                (category == 2 && menu.contains("튀김")) ||
                (category == 3 && menu.contains("음료"))) {
                if (index == choice) {
                    return menu;
                }
                index++;
            }
        }
        return "";
    }

    private static double calculateTotalPrice(Map<String, Integer> menuQuantity) {
        double totalPrice = 0;
        for (String menu : MENU_PRICES.keySet()) {
            totalPrice += menuQuantity.get(menu) * MENU_PRICES.get(menu);
        }
        return totalPrice;
    }

    private static void printOrderSummary(Map<String, Integer> menuQuantity) {
        for (String menu : menuQuantity.keySet()) {
            if (menuQuantity.get(menu) > 0) {
                System.out.println(menu + " - " + menuQuantity.get(menu) + "개");
            }
        }
    }
}
