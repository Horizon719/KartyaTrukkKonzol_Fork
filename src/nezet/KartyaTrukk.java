package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukk {

    private Pakli pakli;
    private static final Scanner sc = new Scanner(System.in);
    
    public KartyaTrukk(){
        this.pakli = new Pakli();
    }
    
    public void indit(){
        for (int i = 0; i < 3; i++) {
            kiir(this.pakli.kirak());
            int oszlop = melyik();
            this.pakli.kever(oszlop);
        }
        kiir("A választott lap: " + this.pakli.ezVolt());
    }

    public void kiir(String txt){
        System.out.println(txt);
    }
    
    public int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
}
