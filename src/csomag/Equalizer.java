package csomag;

public class Equalizer {
    public static void main(String[] args){
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq(34);
        eq(false);
    }

    private static void eq() {
        int vel = (int) (Math.random() * 5) + 3;
        eq(vel, false);
    }

    private static void eq(int szam){
        eq(szam, false);
    }

    private static void eq(boolean szam_kiiras){
        int vel = (int) (Math.random() * 5) + 3;
        eq(vel, szam_kiiras);
    }

    private static void eq(int szam, boolean szam_kiiras){
        String szin = "\u001B[45m";
        for (int i = 0; i < szam; i++) {
            System.out.print(szin + " ");
        }
        if (szam_kiiras) {
            System.out.println(szam);
        } else {
            System.out.println();
        }
    }
}
