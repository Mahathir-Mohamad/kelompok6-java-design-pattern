package kelompok6.designpattern.bridge;

public abstract class Binatangdarat implements Binatang{

    @Override
    public boolean hidupDiAir() {
        return false;
    }

    @Override
    public boolean hidupDiDarat() {
        return true;
    }

    public abstract Integer getJumlahKaki();

    public abstract Integer jumlahTelinga();
}
