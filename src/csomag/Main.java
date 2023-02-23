package csomag;

public class Main {
    public static void main(String[] args) {
        feladatok();

    }

    private static void feladatok() {
        elso_feladat();
        masodik_feladat();
        harmadik_feladat();
        negyedik_feladat();
    }

    private static void elso_feladat() {
        kiir("az első 10 szám összege:" + elso10SzamOsszege() + "\n");
    }

    private static void masodik_feladat() {
        kiir("a + b = " + osszead(2, 3) + "\n");
    }

    private static void harmadik_feladat() {
        int elso_szam = 3;
        int masodik_szam = 4;
        int harmadik_szam = 5;
        int negyedik_szam = 6;

        int osszeg_1 = osszead(elso_szam, masodik_szam);
        int osszeg_2 = osszead(harmadik_szam, negyedik_szam);

        int vegosszeg = osszead(osszeg_1, osszeg_2);
        kiir("Négy szám összege: 3 + 4 + 5 + 6 = " + vegosszeg + "\n");
    }

    private static void negyedik_feladat() {
        int szam_1 = 3;
        int szam_2 = 4;
        int szam_3 = 2;

        int osszeg = osszead(osszead(szam_1, szam_2), szam_3);
        double gyok = Math.sqrt(osszeg);

        kiir("3+4+2 gyöke: " + gyok + "\n");
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