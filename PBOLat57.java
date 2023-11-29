/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Bicycle {
    String brand;
    String model;
    int jumlahGear;

    void displayInfo() {
        System.out.println("Bicycle");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Jumlah Gear : " + jumlahGear);
    }
}

class Skateboard {
    String brand;
    String model;
    double panjangBoard;

    void displayInfo() {
        System.out.println("\nSkateBoard");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Panjangnya Board : " + panjangBoard);
    }
}

public class PBOLat57 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.brand = "Trek Bike";
        bicycle.model = "7.4FX";
        bicycle.jumlahGear = 23;

        Skateboard skateboard = new Skateboard();
        skateboard.brand = "Ally Skate";
        skateboard.model = "Rocket";
        skateboard.panjangBoard = 54.5;

        bicycle.displayInfo();
        skateboard.displayInfo();
    }
}
