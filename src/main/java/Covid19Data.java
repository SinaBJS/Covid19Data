public class Covid19Data {
    private String Region;
    private int aldersgruppe;
    private int bekræftedeTilfælde;
    private int antalDøde;
    private int indlagteIntensitiv;
    private int indlagte;

    public Covid19Data(String region, int aldersgruppe, int bekræftedeTilfælde, int antalDøde, int indlagteIntensitiv, int indlagte) {
        Region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.antalDøde = antalDøde;
        this.indlagteIntensitiv = indlagteIntensitiv;
        this.indlagte = indlagte;
    }
}
