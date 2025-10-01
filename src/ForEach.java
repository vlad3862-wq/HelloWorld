public class ForEach {
    static void main(String[] args) {
//        String[] pupels = {"Vlad", "Gleb", "Vika", "Artur", "Logan", "Albert"};
//
//       for (int i = 0; i < pupels.length; i++){
//          System.out.println(pupels[i]);
//      }
//        for (String pupel : pupels){
//
//            if (pupel == "Vika"){
//                System.out.println(pupel);
//                break;
//            }
//        }
        int[] numbers = new int[100];

//        int g = 0;
//        int i = 100;
//
//        while (g < numbers.length) {
//
//                numbers[g] = i;
//                g++;
//                i++;
//
//            }
//        for (int number : numbers){
//            System.out.println(number);
//       }



        for (int i = 0; i < numbers.length; i++){
    numbers[i] = i + 100;
}

        for (int number : numbers){
    System.out.println(number);
}









       // numbers[0] = i;
//        for (int i = 100; i < 201; i++){
//            numbers[g] = i;
//            numbers[g]++;
//        }
//        for (int number : numbers){
//            System.out.println(number);
//        }





    }
}
