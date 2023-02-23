package csomag;

public class Main {
    public static void main(String[] args) {
    }

    private static void elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i <10; i++){
            osszeg+=i;
        }
        System.out.println("az első 10 szám összege: "+ osszeg);
    }

    private static void osszead(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }

}