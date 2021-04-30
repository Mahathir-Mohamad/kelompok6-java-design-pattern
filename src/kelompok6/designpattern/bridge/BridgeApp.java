package kelompok6.designpattern.bridge;

import java.util.Arrays;
import java.util.List;

public class BridgeApp {

    public static void main(String[] args) {

        List<Binatang> binatangs = Arrays.asList(
                new Anjing(),
                new Kucing(),
                new Kambing(),
                new Lele(),
                new Koi(),
                new Hiu()
        );

        binatangs.forEach(binatang -> {
            if(binatang instanceof Binatangair){
                Binatangair binatangAir = (Binatangair) binatang;
                System.out.println(binatangAir.getNama() + " hidup di air");
            }else if(binatang instanceof Binatangdarat){
                Binatangdarat binatangDarat = (Binatangdarat) binatang;
                System.out.println(binatangDarat.getNama() + " hidup di darat dengan kaki " + binatangDarat.getJumlahKaki());
            }
        });

    }
}