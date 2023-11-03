import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Covid19Data> covid19Data;

        //Load data fra cvs og assign det til en arrayliste
        try {
           covid19Data=fileHandler.restoreData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Ønsker du at sortere dataen ud fra region[tast 1] eller aldersgruppe[tast 2]");
        int brugerInput = Integer.valueOf(scanner.nextLine());

        if (brugerInput == 1) {
                Collections.sort(covid19Data, new RegionComparator());
                System.out.println(covid19Data);
            } if (brugerInput == 2) {
                    Collections.sort(covid19Data, new AldersGruppeComparator());
                    System.out.println(covid19Data);

            }
        }
}
