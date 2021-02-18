package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
     //4.feladat
        System.out.println("4 feladat: üres tábla megjelenít:");
        Tabla tabla=  new Tabla('#');
        tabla.megjelenit();
        System.out.println("6 feladat: feltölt tábla:");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
