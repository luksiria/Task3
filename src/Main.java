public class Main {
    public static void main(String[] args) {
        int price = 1000;
        int bonus = 1;
        int fix = 100;
        int amount = 100;

        int account;
        if (price >= 1000) {
            System.out.println(price / fix * bonus+amount+price);
        }
    }
}