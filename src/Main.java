public class Main {
    public static void main(String[] args) {
        int balance = 0; // текущий баланс
        int money = 1900; // сумма пополнения
        int bonus = 100; // бонус за каждые 100р равен 1р
        System.out.println("Баланс абонента равен:");
        if (money > 1000) {
            System.out.println(balance + money + (money / bonus));
            System.out.println("Получено бонусов:");
            System.out.println(money / bonus);
        } else {
            System.out.println(balance + money);

        }

    }

}


