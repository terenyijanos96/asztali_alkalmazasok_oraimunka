package csomag;

public class Main {
    public static void main(String[] args) {
        kiir("az első 10 szám összege:" + elso10SzamOsszege() + "\n");
        kiir("a + b = " + osszead(2, 3) + "\n");
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int a, int b) {
        return a + b;
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }

}