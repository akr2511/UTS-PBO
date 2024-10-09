package hotel.room;

public class Room {
    public int roomNumber;
    public String customerName;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.customerName = null;
    }

    public void bookRoom(String customerName) {
        if (this.customerName == null) {
            this.customerName = customerName;
            System.out.println("Kamar " + roomNumber + " berhasil dipesan oleh " + customerName);
        } else {
            System.out.println("Kamar " + roomNumber + " sudah dipesan.");
        }
    }

    public void roomDetails() {
        System.out.println("Kamar Nomor: " + roomNumber);
        if (customerName == null) {
            System.out.println("Status: Kamar kosong");
        } else {
            System.out.println("Dipesan oleh: " + customerName);
        }
    }
}
