import java.util.ArrayList;

public class Database {
    private ArrayList<PersonData> personDataList;

    public Database(ArrayList<PersonData> personDataList) {
        this.personDataList = personDataList;
    }

    public void tilføjData(String navn, int alder, int højde) {
        try {
            personDataList.add(new PersonData(navn, alder, højde));
        } catch (HøjdeUgyldigException e) {
            int højdeICM =  (int) (højde / 2.54);
            if (højdeICM > 130) {
                try {
                    personDataList.add(new PersonData(navn, alder, højdeICM));
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                }
            } else {
                System.out.println("Højde er umenneskelig");
            }
        }
    }
}
