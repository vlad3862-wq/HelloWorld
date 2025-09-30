public class Veriable {
    static void main(String[] args) {
        int days = 10000;
        int years = days / 365;
        int month = (days - (years * 365)) / 30;
        int deysleft = days - (month * 30) - (years * 365);


        System.out.println(years);
        System.out.println(month);
        System.out.println(deysleft);


    }
}
