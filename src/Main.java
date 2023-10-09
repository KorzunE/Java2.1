public class Main {
    public static void main(String[] args) {

        int balance = 210;
        int payment = 1200;
        int bonus = payment / 100;

        int totalBonusBalance, totalBalance;
        if (payment > 1000) {
            totalBonusBalance = balance + payment + bonus;
            System.out.println("Итого на вашем счету " + totalBonusBalance);

        } else {
            totalBalance = balance + payment;

            System.out.println("Итого на вашем счету" + totalBalance);
        }
    }
}