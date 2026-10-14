package app;

import nezet.KonzolNezet;
import modell.Filmek;
import nezet.Controller;


public class MVC_Program {

    public static void main(String[] args) {
       KonzolNezet n = new KonzolNezet();
       Filmek m = new Filmek();
        Controller v = new Controller(m, v);
    }
    
}
