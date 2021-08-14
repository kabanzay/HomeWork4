import java.util.ArrayList;

public class Gift implements Gift_Interface {
    private ArrayList<Sweety> box = new ArrayList<>();

    // добавляем в коробку подарок
    public void add(Sweety point) {
        box.add(point);
    }

    private int weightBox() {
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.weight;
        }
        return i;
    }
    private int costBox(){
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.cost;
        }
        return i;
    }

    // выводим всю информацию о подарках
    public void info() {
        System.out.println("Общий вес подарка: "+ weightBox());
        System.out.println("Общая стоимость: "+ costBox());
        for (Sweety sweety : box) {

            if (sweety instanceof Candy) {
                Candy candy = (Candy) sweety;
                System.out.println("Я " + candy.name + ". Вешу - " + candy.weight + ". Цена - " + candy.cost + " Моя фишка -" + candy.wowParameter);
            }
            if (sweety instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) sweety;
                System.out.println("Я " + chocolate.name + ". Вешу - " + chocolate.weight + ". Цена - " + chocolate.cost + " Моя фишка -" + chocolate.wowParameter);
            }
            if (sweety instanceof Jellybean) {
                Jellybean jellyBeans = (Jellybean) sweety;
                System.out.println("Я " + jellyBeans.name + ". Вешу - " + jellyBeans.weight + ". Цена - " + jellyBeans.cost + " Моя фишка -" + jellyBeans.wowParameter);
            }
        }
    }
}

