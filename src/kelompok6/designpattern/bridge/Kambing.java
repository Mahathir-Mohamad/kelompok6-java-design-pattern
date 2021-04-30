package kelompok6.designpattern.bridge;

public class Kambing extends Binatangdarat {

    @Override
    public String getNama() {
        return "Kambing";
    }

    public Integer getJumlahKaki(){
        return 4;
    }

    @Override
    public Integer jumlahTelinga() {
        return 2;
    }
}
