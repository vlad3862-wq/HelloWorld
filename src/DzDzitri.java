public class DzDzitri {
    static void main(String[] args) {
        int[] numbers = new int[10];
        int[] voidd = new int [10];
        int param = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i +1;
            if (i == numbers.length-1) {
                for (int j = numbers[0]; j < 10; j++){
                    if (j % 2 == 0){
                        voidd[param] = numbers[j]-1+1;
                        param++;
                    }
                }



                System.out.println("test");
            }

        }



        for (int number : numbers){
            System.out.println(number);
        }
        for (int voids : voidd){
            System.out.println(voids);
        }
    }
}
