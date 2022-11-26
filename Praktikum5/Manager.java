public class Manager extends Pegawai {
    protected double tunjangan;

    public Manager(String nama, int gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // SETTER
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // GETTER
    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakTunjangan();
    }

    public void cetakTunjangan() {
        setNama("Yuyun Fatimah");
        setGajiPokok(5000000);
        setTunjangan(4000000);

        System.out.println("Nama: " + getNama());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + getTunjangan());


    }
}
