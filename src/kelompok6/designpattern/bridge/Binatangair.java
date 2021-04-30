package kelompok6.designpattern.bridge;

public abstract class Binatangair implements Binatang {

    @Override
    public boolean hidupDiAir() {
        return true;
    }

    @Override
    public boolean hidupDiDarat() {
        return false;
    }
}

