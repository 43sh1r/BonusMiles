public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculate(20000);
        System.out.println("20000");
        System.out.println(bonusMiles);
        System.out.println();
        System.out.println("30000");
        System.out.println(service.calculate(30000));
        System.out.println();
        System.out.println("40000");
        System.out.println(service.calculate(40000));
        System.out.println();
        System.out.println("50000");
        System.out.println(service.calculate(50000));
        System.out.println();
    }
}