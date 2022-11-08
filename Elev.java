import java.util.List;

public class Elev {
    private String name;
    private List<Integer> tabellerLæert;

    public Elev(String name, List<Integer> tabellerLært) {
        this.name = name;
        this.tabellerLæert = tabellerLært;
    }

    public void lærTabel(int n) {
        tabellerLæert.add(n);
    }

    public void sigTabel(int n) throws Exception {
        if (tabellerLæert.contains(n)) {
            for (int i = n; i < (n * 10); i += n) {
                System.out.println(i);
            }
        } else {
            throw new Exception("Elev kan ikke tabel");
        }
    }
}
