public class Loopv2 {
    static void main(String[] args) {
        String[] namesOfMonths = new String[18];
        namesOfMonths[0] = "January";
        namesOfMonths[1] = "February";
        namesOfMonths[2] = "March";
        namesOfMonths[3] = "April";
        namesOfMonths[4] = "May";
        namesOfMonths[5] = "June";
        namesOfMonths[6] = "July";
        namesOfMonths[7] = "August";
        namesOfMonths[8] = "September";
        namesOfMonths[9] = "October";
        namesOfMonths[10] = "November";
        namesOfMonths[11] = "December";
        namesOfMonths[12] = "Potato";
        namesOfMonths[13] = "Cat";
        namesOfMonths[14] = "Snowman";
        namesOfMonths[15] = "Bike";
        namesOfMonths[16] = "Helicopter";
        namesOfMonths[17] = "Car";
        int k = 0;

        for (int i = 0; i < namesOfMonths.length; i++) {
            switch (namesOfMonths[i]) {
                case "December":
                case "January":
                case "February":
                    System.out.println("Холодно");
                    break;
                case "March":
                case "April":
                case "May":
                    System.out.println("Тепло");
                    break;
                case "June":
                case "July":
                case "August":
                    System.out.println("Жарко");
                    break;
                case "September":
                case "October":
                case "November":
                    System.out.println("Прохладно");
                    break;
//                case "Potato":
//                    System.out.println("Это не месяц, иди поплачь");
//                    break;
//                case "Cat":
//                    System.out.println("Это не месяц, иди погладь котика");
//                    break;
//                case "Snowman":
//                    System.out.println("Это не месяц, это снеговик");
//                    break;
//                case "Bike":
//                    System.out.println("Это не месяц, время кататься на мотоцикле");
//                    break;
//                case "Helicopter":
//                    System.out.println("Это не месяц, музыка из армии");
//                    break;

                 default:
                     k++;
                     //System.out.println(m);

            }

            if (k != 0){
            if (namesOfMonths[i] == "Potato"){
                System.out.println("Это не месяц, иди поплачь");
            } else if (namesOfMonths[i] == "Cat") {
                System.out.println("Это не месяц, иди погладь котика");
            } else if (namesOfMonths[i] == "Snowman") {
                System.out.println("Это не месяц, это снеговик");
            } else if (namesOfMonths[i] == "Bike") {
                System.out.println("Это не месяц, время кататься на мотоцикле");
            } else if (namesOfMonths[i] == "Helicopter") {
                System.out.println("Это не месяц, музыка из армии");
            }else {
                System.out.println("Я не знаю этого слова");
            }
                k--;



            }

        }
    }
}