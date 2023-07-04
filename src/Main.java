public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;

        System.out.println("Your bonus is " + service.calculate(price) + " miles");
    }
}