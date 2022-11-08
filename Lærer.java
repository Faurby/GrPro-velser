import java.util.List;

public class Lærer {
    private String name;
    private List<Integer> tabellerLært;

    public Lærer(String name, List<Integer> tabellerLært) {
        this.name = name;
        this.tabellerLært = tabellerLært;
    }

    public void hvadErNTabellen(int n, Elev elev) {
        try {
            elev.sigTabel(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            if (tabellerLært.contains(n)) {
                elev.lærTabel(n);
                try {
                    elev.sigTabel(n);
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                }
            } else {
                System.out.println("Lærer kan heller ikke den tabel...");
            }
        }
    }
}