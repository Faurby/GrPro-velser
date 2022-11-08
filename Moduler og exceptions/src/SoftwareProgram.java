import java.util.ArrayList;
import java.util.List;

public class SoftwareProgram {

    private String navn;
    private List<SoftwareModul> moduller = new ArrayList<>();

    public SoftwareProgram(String navn) {
        this.navn = navn;
    }

    public void tilføjModul(SoftwareModul modul) {
        moduller.add(modul);
    }

    public void kørProgram() throws ModulException {
        int modullerKørt = 0;
        for (SoftwareModul modul : moduller) {
            if (!modul.getOpdateret()) {
                // throw new ModulException(modul);
                modul.opdaterModul();
                modullerKørt++;
                
            } else
                modullerKørt++;
        }
        if (modullerKørt == moduller.size()) {
            System.out.println("Program kørt.");
        }
    }
}
