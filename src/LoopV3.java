public class LoopV3 {
    static void main(String[] args) {
//        int indeksArray = 0;
//        int[] nambers = new int[16];
//        for (int i = 5; i < nambers.length; i++){
//            nambers[indeksArray] = i;
//            System.out.println(nambers[indeksArray]);
//            if (nambers[indeksArray] == i ){
//                System.out.println("Мы выводим значение " + i);
//                for (int k = 1; k <= nambers[indeksArray]; k++){
//                    System.out.println(k);
//                    if (k == nambers.length-1){
//                        System.out.println("Это конец");
//                    }
//                }
//            }
//            }
//            indeksArray++;
//
//
//
//
//
//    int[] newNambers = {8, 11, 5, 4, 21, 10};
//
//    for (int i = 0; i < newNambers.length; i++){
//        for (int k = 0; k <= newNambers[i]; k++){
//            if (k == newNambers[i]){
//                System.out.println("Мы выводим значение " + k);
//                for (int j = 1; j <= newNambers[i]; j++){
//                    System.out.println(j);
//                }
//            }
//        }
//        if (i == newNambers.length - 1){
//            System.out.println("Это конец!");
//        }
//    }


        int[] arr = {5, 20, 13};

        for (int i = 0; i < arr.length; i++){
            System.out.println("Мы выводим значение " + arr[i]);
            for (int k = 0; k < arr[i]; k++){
                System.out.println(k + 1);
            }
            if (i == arr.length - 1){
                System.out.println("Это конец");
            }

        }

        }

    }

