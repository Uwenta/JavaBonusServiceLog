public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 100_060;
        boolean registered = true;

        int bonus = (int) service.calculate(amount, registered);
        System.out.println("Начислено бонусов: " + bonus);
    }
}

