import java.util.Arrays;

public class RerferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
       
        
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
