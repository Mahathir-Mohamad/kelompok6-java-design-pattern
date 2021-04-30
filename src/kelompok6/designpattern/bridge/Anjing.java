package kelompok6.designpattern.bridge;

public class Anjing extends Binatangdarat {
    @Override
    public String getNama() {
        return "Anjing";
    }

    public Integer getJumlahKaki(){
        return 4;
    }

    @Override
    public Integer jumlahTelinga() {
        return 2;
    }
}