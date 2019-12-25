import Abstract.Hewan;
import Abstract.Manusia;
import Abstract.Tumbuhan;

public class Main {
    public static void main(String[] args) {
        Manusia ningen = new Manusia("Dua Kaki");
        Hewan doubutsu = new Hewan("Empat Kaki", "Dua Kaki");
        Tumbuhan habu = new Tumbuhan("Akar");

        ningen.berdiri();
        ningen.oksigen();
        System.out.println("------------------------------------");
        doubutsu.berdiri();
        doubutsu.oksigen();
        System.out.println("------------------------------------");
        habu.berdiri();
        habu.oksigen();
    }
}
