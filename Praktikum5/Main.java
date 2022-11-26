public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Yuyun Fatimah", 7000000, 1300000);
        Programmer programmer = new Programmer("Jourdy Pranata", 8000000, 1000000);

        System.out.println("\n\n===== TUGAS PERT 9 =====\n");

        System.out.println("=== MANAGER ===");
        System.out.println("Nama: " + manager.nama);
        System.out.println("Gaji Pokok: " + manager.gajiPokok);
        System.out.println("Tunjangan: " + manager.tunjangan);

        System.out.println();

        System.out.println("=== PROGRAMMER ===");
        System.out.println("Nama: " + programmer.nama);
        System.out.println("Gaji Pokok: " + programmer.gajiPokok);
        System.out.println("Bonus: " + programmer.bonus);

    }
}