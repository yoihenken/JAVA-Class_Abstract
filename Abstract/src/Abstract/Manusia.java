package Abstract;

public class Manusia extends MakhlukHidup {
    private String duaKaki;

    public Manusia(String duaKaki) {
        this.duaKaki = duaKaki;
    }

    @Override
    public void berdiri() {
        System.out.println("Manusia berdiri Menggunakan : "+ duaKaki);
    }
}
