
import java.util.Scanner;

/**
 * @author Nikita Belan
 * Задание №4
 * <p>
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 * <p>
 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */
public class Main extends Utils {
    public static void main(String[] args) {
        int changer = 0;
        //Создаем новый сканер
        Scanner scanner = new Scanner(System.in);
        //Выбираем программу
        System.out.println("Выбери программу:\n   1 - Массивы\n   2 - Подарки");
        changer = scanner.nextInt();

        switch (changer) {
            case 1:
                sortCustomArray();
                break;
            case 2:
                takeMyGift();
                break;
            case 666:
                Salat.egg();
                break;
            default:
                System.out.println("Здесь ничего нет.");
        }
        //Закрываем сканнер
        scanner.close();

    }
}
