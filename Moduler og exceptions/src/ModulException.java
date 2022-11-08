public class ModulException extends Exception {
    
    private SoftwareModul modul;

    public ModulException(SoftwareModul modul){
        this.modul = modul;
    }

    public int fåFejlModulNummer(){
        return modul.getModulNummer();
    }

    public SoftwareModul fåFejlModul(){
        return modul;
    }
}
