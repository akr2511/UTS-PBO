package hotel.user;

import hotel.room.Room;

public class Admin extends User implements UserInterface {

    public Admin(String name) {
        super(name);  // Mewarisi konstruktor dari kelas User
    }

    public void checkRoomAvailability(Room room1, Room room2, Room room3, Room room4, Room room5) {
        checkRoom(room1);
        checkRoom(room2);
        checkRoom(room3);
        checkRoom(room4);
        checkRoom(room5);
    }

    public void checkRoom(Room room) {
        if (room.customerName == null) {
            System.out.println("Kamar Nomor: " + room.roomNumber + " - Kamar kosong");
        } else {
            System.out.println("Kamar Nomor: " + room.roomNumber + " - Dipesan oleh " + room.customerName);
        }
    }

    @Override
    public void performAction() {
        System.out.println("Admin " + name + " sedang mengecek ketersediaan kamar.");
    }
}
