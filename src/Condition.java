public class Condition {
    static void main(String[] args) {

        int time = 21;
        int temp = 25;
        boolean hot = temp >= 25;
        boolean cold = temp <= 20;
        boolean isTime = time >= 22 || temp <= 6;

        if (!isTime && hot ){
            System.out.println("Кондиционер включен!");
        } else if (cold){
            System.out.println("Кондиционер выключен!");
        } else{
            System.out.println("Кондиционеру пофиг!");
        }
    }
}
