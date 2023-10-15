package question2;

import java.util.Scanner;

/**
 *
 * @author ST10380779 || Vutlhari Mabasa ||
 */
public class Use_Inspection {

    static HospitalInspections objhospitalInspections;

    public static void main(String[] args) {
        String Hospitallocation;
        String Hospitalname;
        int YearsSinceInspection;

        Scanner sc = new Scanner(System.in);
        System.out.println("HOSPITAL REPORT");
        System.out.println("**************************************************");
        System.out.print("ENTER HOSPITAL LOCATION: ");
        Hospitallocation = sc.nextLine();
        System.out.print("ENTER HOSPITAL NAME: ");
        Hospitalname = sc.nextLine();
        System.out.print("ENTER LAST INSPECTION: ");
        YearsSinceInspection = sc.nextInt();

        objhospitalInspections = new HospitalInspections(Hospitallocation, Hospitalname, YearsSinceInspection);
        objhospitalInspections.printInspectionReport();
    }

}
