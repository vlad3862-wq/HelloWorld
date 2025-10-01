public class SwichCase {
    static void main(String[] args) {
//        int numberOfmanth = 84;
//
//        if (numberOfmanth == 1){
//            System.out.println("January");
//        }if (numberOfmanth == 2){
//            System.out.println("February");
//        }if (numberOfmanth == 3){
//            System.out.println("March");
//        }if (numberOfmanth == 4){
//            System.out.println("April");
//        }if (numberOfmanth == 5){
//            System.out.println("May");
//        }if (numberOfmanth == 6){
//            System.out.println("June");
//        }if (numberOfmanth == 7){
//            System.out.println("July");
//        }if (numberOfmanth == 8){
//            System.out.println("August");
//        }if (numberOfmanth == 9){
//            System.out.println("September");
//        }if (numberOfmanth == 10){
//            System.out.println("October");
//        }if (numberOfmanth == 11){
//            System.out.println("November");
//        }if (numberOfmanth == 12){
//            System.out.println("December");
//        }


//        String[] namesOfMonths = new String[13];
//        namesOfMonths[0] = "January";
//        namesOfMonths[1] = "February";
//        namesOfMonths[2] = "March";
//        namesOfMonths[3] = "April";
//        namesOfMonths[4] = "May";
//        namesOfMonths[5] = "June";
//        namesOfMonths[6] = "July";
//        namesOfMonths[7] = "August";
//        namesOfMonths[8] = "September";
//        namesOfMonths[9] = "October";
//        namesOfMonths[10] = "November";
//        namesOfMonths[11] = "December";
//        System.out.println(namesOfMonths[numberOfmanth-1]);


//        String[] months = {
//                "January",
//                "February",
//                "March",
//                "April",
//                "May",
//                "June",
//                "July",
//                "August",
//                "September",
//                "October",
//                "November",
//                "December" };
//        System.out.println(months[numberOfmanth-1]);


//        switch (numberOfmanth){
//            case 1:
//                System.out.println("January");
//                break;
//        case 2:
//                System.out.println("February");
//                break;
//        case 3:
//                System.out.println("March");
//                break;
//        case 4:
//                System.out.println("April");
//                break;
//        case 5:
//                System.out.println("May");
//                break;
//        case 6:
//                System.out.println("June");
//                break;
//        case 7:
//                System.out.println("July");
//                break;
//        case 8:
//                System.out.println("August");
//                break;
//        case 9:
//                System.out.println("September");
//                break;
//        case 10:
//                System.out.println("October");
//                break;
//        case 11:
//                System.out.println("November");
//                break;
//        case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Unknoun");
//        }


        String month = "March";

        switch (month){
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
        }
    }
}
