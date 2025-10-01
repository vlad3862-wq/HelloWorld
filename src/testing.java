public class testing {
    static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,7};
        String[] teams = {"Vlad", "Gena", "Vika", "Simen"};
        for (int i = 0; i < numbers.length; i++){
            //System.out.println("1");
            if (i == 3){
                System.out.println(teams[i]);
                break;
            }else {
                System.out.println(teams[i] + numbers[ i]);
            }
        }

    }
}
