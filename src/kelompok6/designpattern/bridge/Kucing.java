package kelompok6.designpattern.bridge;

public class Kucing extends Binatangdarat {

    @Override
    public String getNama() {
        return "Kucing";
    }

    public Integer getJumlahKaki(){
        return 4;
    }

    @Override
    public Integer jumlahTelinga() {
        return 2;
    }
}
