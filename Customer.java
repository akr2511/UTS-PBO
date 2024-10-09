package hotel.user;

import hotel.room.Room;
import hotel.reservation.Reservation;
import java.util.Scanner;

public class Customer extends User implements UserInterface {
    public Reservation reservation;

    public Customer(String name) {
        super(name);  // Mewarisi konstruktor dari kelas User
    }

    public void makeReservation(Room room1, Room room2, Room room3, Room room4, Room room5) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih kamar (101-105): ");
        int roomChoice = scanner.nextInt();

        Room chosenRoom = null;
        if (roomChoice == 101) {
            chosenRoom = room1;
        } else if (roomChoice == 102) {
            chosenRoom = room2;
        } else if (roomChoice == 103) {
            chosenRoom = room3;
        } else if (roomChoice == 104) {
            chosenRoom = room4;
        } else if (roomChoice == 105) {
            chosenRoom = room5;
        }

        if (chosenRoom != null) {
            if (chosenRoom.customerName == null) {
                chosenRoom.bookRoom(name);
                reservation = new Reservation(chosenRoom, name);
            } else {
                System.out.println("Kamar tidak tersedia.");
            }
        } else {
            System.out.println("Pilihan kamar tidak valid.");
        }
    }

    public void viewReservations() {
        if (reservation == null) {
            System.out.println("Anda belum memiliki pesanan.");
        } else {
            reservation.reservationDetails();
        }
    }

    @Override
    public void performAction() {
        System.out.println("Customer " + name + " sedang melakukan reservasi.");
    }
}
