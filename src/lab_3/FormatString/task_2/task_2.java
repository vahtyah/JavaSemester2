package src.lab_3.FormatString.task_2;

import src.lab_3.FormatString.task_1.task_1;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class task_2 {
    public static abstract class Currency{
        private long vnd;
        private long us;
        private long ru;
        public Currency(long currency){
               this.us = currency;
               this.ru = this.us * 59;
               this.vnd = this.us * 23710;
        }

        public long getRu() {
            return ru;
        }

        public long getUs() {
            return us;
        }

        public long getVnd() {
            return vnd;
        }
    }
    public static class Phone extends Currency{
        private String name;

        public Phone(long currency, String name){
            super(currency);
            this.name = name;
        }
        public long getCurrency(String type){
            if(type == "us") return super.getUs();
            else if(type == "ru") return super.getRu();
            else return super.getVnd();
        }
    }

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the phone store");
        System.out.println("You want to buy:" + "\n1. iPhone 14 - 799$" + "\n2 .iPhone 14 Plus - 899$" + "\n3 .iPhone 14 Pro - 999$"+ "\n4 .iPhone 14 Pro Max - 1099$");
        System.out.print("Please choose: ");
        String namePhone = null;
        int select = in.nextInt();
        long pay = 0;
        switch (select){
            case 1: namePhone = "iPhone 14"; pay = 799; break;
            case 2: namePhone = "iPhone 14 Plus"; pay = 899; break;
            case 3: namePhone = "iPhone 14 Pro"; pay = 999; break;
            case 4: namePhone = "iPhone 14 Pro Max"; pay = 1099; break;
            default: break;
        }
        do {
            System.out.println("Please select a currency for payment: ");
            System.out.println("1. RUB" + "\n2. VND" + "\n3. USD");
            System.out.print("Please choose: ");
            int currency = in.nextInt();
            String typeCurrency = null;
            Locale locale = null;
            switch (currency){
                case 1: typeCurrency = "ru" ; locale = new Locale("ru","RU"); break;
                case 2: typeCurrency = "vnd"; locale = new Locale("vi","VN"); break;
                case 3: typeCurrency = "us"; locale = Locale.getDefault(); break;
                default: break;
            }
            Phone phone = new Phone(pay,namePhone);
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            System.out.println(namePhone + " cost: " + numberFormat.format(phone.getCurrency(typeCurrency)));
            System.out.println("1. Pay" + "\n2. Currency change.");
            select = in.nextInt();
            if(select == 1) System.out.print("Payment success!");
        }while (select == 2);
    }
}
