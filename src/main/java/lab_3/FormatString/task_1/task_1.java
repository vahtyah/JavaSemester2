package lab_3.FormatString.task_1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class task_1 {
    public static class CurrencyConversion{
        private long currencyUS;
        private long currencyRU;

        public CurrencyConversion(long currencyUS){
            this.currencyUS = currencyUS;
            this.currencyRU = this.currencyUS * 59;
        }

        public long getCurrencyRU() {
            return currencyRU;
        }

        public long getCurrencyUS() {
            return currencyUS;
        }
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print("Enter amount (USD): ");
        long amountUS = in.nextLong();
        System.out.print(currency.format(new CurrencyConversion(amountUS).getCurrencyUS()));
        currency = NumberFormat.getCurrencyInstance(new Locale("ru","RU"));
        System.out.print(" = " + currency.format(new CurrencyConversion(amountUS).getCurrencyRU()));
    }
}
