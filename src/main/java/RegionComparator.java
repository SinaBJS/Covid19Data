import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data region1, Covid19Data region2) {
       return String.CASE_INSENSITIVE_ORDER.compare(region1.getRegion(), region2.getRegion());

    }
}
