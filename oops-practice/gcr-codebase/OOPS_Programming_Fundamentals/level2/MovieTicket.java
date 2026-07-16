class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String seat, double amount) {
        seatNumber = seat;
        price = amount;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.movieName = "Avengers";

        ticket.bookTicket("A10", 350);

        ticket.displayTicket();
    }
}