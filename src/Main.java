public class Main {
    public static void main(String[] args) {

        int account = 100;
        int replenish = 1000;
        int bonus = replenish / 100;

        if (replenish >= 1000) {
            account = replenish + account + bonus;
        } else {
            account = replenish + account;
        }
        {
            System.out.println(account + "_рублей.");
        }
    }
}