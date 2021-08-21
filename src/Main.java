public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double annuityPaymentTwelveMonth  =  service.calculate(12, 1_000_000);
        System.out.println((int)annuityPaymentTwelveMonth);

        double annuityPaymentTwentyForMonth =  service.calculate(24, 1_000_000);
        System.out.println((int)annuityPaymentTwentyForMonth);

        double annuityPaymentThirtySixMonth =  service.calculate(36, 1_000_000);
        System.out.println((int)annuityPaymentThirtySixMonth);
    }
}
