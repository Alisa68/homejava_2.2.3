public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double paymentPeriodYear = service.calculate(1000000.0, 12);
        System.out.printf("Выплата период год = %.0f%n", paymentPeriodYear);


        double paymentPeriodTwoYeas = service.calculate(1000000.0, 24);
        System.out.printf("Выплата период 2 года= %.0f%n", paymentPeriodTwoYeas);


        double paymentPeriodThreeYeas = service.calculate(1000000.0, 36);
        System.out.printf("Выплата период 3 года = %.0f%n", paymentPeriodThreeYeas);
                }
}

