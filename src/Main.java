public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_333;
        int milePerticket = 20;
        int bonusMiles = ticketPrice / milePerticket;
        System.out.println("Количество начисленных миль:" + bonusMiles);
    }
}
