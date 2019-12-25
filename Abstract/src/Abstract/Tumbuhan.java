package Abstract;

public class Tumbuhan extends MakhlukHidup{
    private String Akar;

    public Tumbuhan(String akar) {
        Akar = akar;
    }

    @Override
    public void berdiri() {
        System.out.println("Tumbuhan berdiri Menggunakan : "+ Akar);
    }
}
