package csomag;

public class Equalizer {
    public static void main(String[] args){
        eq();
        eq();
        eq();
        eq();
        eq();
    }

    private static void eq() {
        int vel = (int) (Math.random() * 5) + 3;
        String szin = "\u001B[45m";
        for (int i = 0; i < vel; i++) {
            System.out.print(szin + " ");
        }
        System.out.println("");

    }
}
