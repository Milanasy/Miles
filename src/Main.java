
public class Main {
    public static void main(String[] args) {
        double ticketPrice = 14770;
        int milesPerRuble = 10;

        int miles = (int) (ticketPrice / milesPerRuble);
        System.out.println(miles);
    }

}
