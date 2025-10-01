public class DzV2 {
    static void main(String[] args) {
        int[] numbers = new int[10];
        int[] oddnumbers = new int[10];
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i +1;
//            if(numbers[i] % 2 == 0){
//                oddnumbers[count] = numbers[i];
//                count++;
//            }
        }
        for (int k = 0; k < numbers.length; k++){
            if(k % 2 == 0){
            oddnumbers[count] = numbers[k];
            count++;


            }

        }







        for (int number : numbers){
            System.out.println(number);
        }
        for (int oddnumber : oddnumbers){
            System.out.println(oddnumber);
        }
    }
}
