import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data aldersGruppe1, Covid19Data aldersGruppe2) {
        return String.CASE_INSENSITIVE_ORDER.compare(aldersGruppe1.getAldersgruppe(), aldersGruppe2.getAldersgruppe());
    }
}
