package hotel.main;

import hotel.room.Room;
import hotel.user.Customer;
import hotel.user.Admin;
import hotel.user.UserInterface;
import java.util.Scanner;

public class HotelReservationApp {

    public static void main(String[] args) {
        // Membuat kamar-kamar
        Room room1 = new Room(101);
        Room room2 = new Room(102);
        Room room3 = new Room(103);
        Room room4 = new Room(104);
        Room room5 = new Room(105);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Menu Reservasi Hotel ===");
        System.out.println("1. Login sebagai Customer");
        System.out.println("2. Login sebagai Admin");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();

        UserInterface user = null;  // Gunakan tipe UserInterface

        if (choice == 1) {
            // Login sebagai customer
            System.out.println("Masukkan nama Anda: ");
            String customerName = scanner.next();
            user = new Customer(customerName);  // Buat objek Customer
            user.performAction();  // Panggil performAction() sesuai tipe user
            ((Customer) user).makeReservation(room1, room2, room3, room4, room5);  // Polimorfisme: Cast ke Customer
            System.out.println("Lihat pesanan Anda? (1 untuk Ya / 0 untuk Tidak)");
            int viewChoice = scanner.nextInt();
            if (viewChoice == 1) {
                ((Customer) user).viewReservations();
            }

        } else if (choice == 2) {
            // Login sebagai admin
            System.out.println("Masukkan nama Admin: ");
            String adminName = scanner.next();
            user = new Admin(adminName);  // Buat objek Admin
            user.performAction();  // Panggil performAction() sesuai tipe user
            ((Admin) user).checkRoomAvailability(room1, room2, room3, room4, room5);  // Polimorfisme: Cast ke Admin
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
