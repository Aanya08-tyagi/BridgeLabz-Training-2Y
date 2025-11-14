class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        ticket1.bookTicket("A12", 300);
        ticket1.displayTicket();
    }
}
