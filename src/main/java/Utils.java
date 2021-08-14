public class Utils {
    /**
     * Программа формирует массив int из 20 элементов от -10 до 10. Находит наименьшее положительное число и наибольшее отрицательное. Далее производит их свап местами.
     */
    public static void sortCustomArray() {
        int plus = 11, plusIndex = 0, minus = 0, minusIndex = 0, temp;
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = -10 + (int) (Math.random() * 20);
            System.out.printf("%4s",array[i] + " ");
            if (array[i] > 0) {
                if (plus > array[i]) {
                    plus = array[i];
                    plusIndex = i;
                }
            } else if (array[i] < 0) {
                if (minus > array[i]) {
                    minus = array[i];
                    minusIndex = i;
                }
            }
        }
        temp = array[minusIndex];
        array[minusIndex] = array[plusIndex];
        array[plusIndex] = temp;
        System.out.println("\nМинимальное значение и индекс " + minus + " : " + minusIndex);
        System.out.println("Максимальное  значение и индекс " + plus + " : " + plusIndex);
        for (int i : array) {
            System.out.printf("%4s",i + " ");
        }
    }

    /**
     * Программа создает подарки, считает общий вес, стоимость и выводит всю информацию о подарках.
     */

    public static void takeMyGift() {
        Gift gift = new Gift();
        //создаем подарки
        gift.add(new Candy("candy1", 1, 1, "tasty"));
        gift.add(new Candy("candy2", 2, 5, "tasty"));
        gift.add(new Jellybean("jellybean1", 3, 4, "yellow"));
        gift.add(new Jellybean("jellybean1", 5, 5, "yellow"));
        gift.add(new Chocolate("choco1", 1, 3, "dark"));
        gift.add(new Chocolate("choco2", 1, 3, "dark"));
        gift.add(new Chocolate("choco3", 1, 3, "dark"));
        // выводим информацию
        gift.info();
    }

}
