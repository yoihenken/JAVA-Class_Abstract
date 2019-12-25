package Abstract;

public class Hewan extends MakhlukHidup {
    private String kakiEmpat;
    private String kakiDua;

    public Hewan(String kakiEmpat, String kakiDua) {
        this.kakiEmpat = kakiEmpat;
        this.kakiDua = kakiDua;
    }

    @Override
    public void berdiri() {
        System.out.println("Kambing berdiri Menggunakan : "+ kakiEmpat);
        System.out.println("Ayam berdiri Menggunakan : "+ kakiDua);
    }
}
