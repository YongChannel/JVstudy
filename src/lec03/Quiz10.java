package lec03;

import java.util.HashMap;

public class Quiz10 {
//    quiz10
//    아래 메소드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선하라.
//    static void printCoffeePrice(int type) {
//        HashMap<Integer, Integer>priceMap = new HashMap<>();
//        priceMap.put(1, 3000);
//        priceMap.put(2, 4000);
//        priceMap.put(3, 5000);
//
//        int price = priceMap.get(type);
//        System.out.println(String.format("가격은 %d입니다.", price));
//    }
//
//    public static void main(String[] args) {
//        printCoffeePrice(1);
//        printCoffeePrice(99);
//    }

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer>priceMap = new HashMap<>(3);
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);

        int price = priceMap.get(type);
        System.out.println(String.format("%s의 가격은 %d원입니다.", type, price));
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.ICE_AMERICANO);
        printCoffeePrice(CoffeeType.CAFE_LATTE);
    }
}
