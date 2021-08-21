public class CreditPaymentService {
    public double calculate(double month, double loanValue) {
        double percent = 9_99;
        double monthPercent = percent / 100 / 100 / 12;
        double monthPercentPlusOne = 1 + monthPercent;
        double value = monthPercentPlusOne;
        double powValue = -month;
        double total = loanValue * monthPercent / (1 - (Math.pow(value, powValue)));
        return total;
    }

    public static double pow(double value, double powValue) {
        return (double) Math.pow(value, powValue);
    }
}



