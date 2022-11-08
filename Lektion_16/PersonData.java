public class PersonData {
    private String navn;
    private int alder;
    private int højdeICentimeter;

    public PersonData(String navn, int alder, int højdeICentimeter) throws HøjdeUgyldigException {

        if (alder < 0) {
            throw new AlderUgyldigException();
        } else {
            this.alder = alder;
        }

        this.navn = navn;

        if (højdeICentimeter > 220) {
            throw new HøjdeUgyldigException();
        } else {
            this.højdeICentimeter = højdeICentimeter;
        }
    }
}
