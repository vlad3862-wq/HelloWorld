public class Dz {
    static void main(String[] args) {
        int time = 22;
        boolean weathergood = true;
        boolean isnight = time >= 22 || time <= 6;

        if (weathergood && !isnight){
            System.out.println("Гулять!");
        }
        if (!weathergood && !isnight){
            System.out.println("Читать книгу!");
        }
        if (isnight){
            System.out.println("Спать!");
        }
    }
}
