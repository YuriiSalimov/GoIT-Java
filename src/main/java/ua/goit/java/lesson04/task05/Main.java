package ua.goit.java.lesson04.task05;

/**
 * 4.5 Создайте следующую структуру:
 * Класс Main с методом main, где вы должны создать 6 объектов класса User
 * (2 - USBank, 2 - EUBank, 2 - ChinaBank).
 * <p>
 * Создать интерфейс BankSystem с методами:
 * ```
 * void withdrawOfUser(User user, int amount)
 * void fundUser(User user, int amount)
 * void transferMoney(User fromUser, User toUser, int amount)
 * void paySalary(User user)
 * ```
 * и его релизацию.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Bank usdBank1 = new USBank(11111, "USA", Currency.USD, 150, 3510.50, 10, 2500000);
        final Bank usdBank2 = new USBank(11112, "USA", Currency.EUR, 100, 1250.50, 25, 1200000);
        final Bank eurBank1 = new EUBank(22222, "France", Currency.EUR, 85, 2500.20, 21, 200000);
        final Bank eurBank2 = new EUBank(22221, "Ukraine", Currency.EUR, 15, 800.15, 125, 50000);
        final Bank chinaBank1 = new ChinaBank(33333, "China", Currency.USD, 125, 1500.10, 145, 615000);
        final Bank chinaBank2 = new ChinaBank(33332, "India", Currency.EUR, 58, 505.50, 145125, 15000);

        final User user1 = new User(1001, "Vasya", 10000, 5, "Google", 2000, usdBank1);
        final User user2 = new User(1002, "Kolya", 11000, 4, "Yandex", 3000, usdBank2);
        final User user3 = new User(1003, "Petya", 20100, 8, "Goit", 5000, eurBank1);
        final User user4 = new User(1004, "Grisha", 20000, 9, "Zavod im.Lenina", 1000, eurBank2);
        final User user5 = new User(1005, "Tolya", 15000, 6, "Velyka kyshenya", 500, chinaBank1);
        final User user6 = new User(1006, "Olya", 6300, 1, "Silpo", 2500, chinaBank2);
    }
}
