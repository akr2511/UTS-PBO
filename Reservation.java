package hotel.reservation;

import hotel.room.Room;

public class Reservation {
    public Room room;
    public String customerName;

    public Reservation(Room room, String customerName) {
        this.room = room;
        this.customerName = customerName;
    }

    public void reservationDetails() {
        System.out.println("Nama Customer: " + customerName);
        System.out.println("Kamar Nomor: " + room.roomNumber);
    }
}
