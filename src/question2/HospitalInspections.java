/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
public class HospitalInspections extends Inspection {

    public HospitalInspections(String Hospitallocation, String Hospitalname, int YearsSinceInspection) {
        super(Hospitallocation, Hospitalname, YearsSinceInspection);
    }

    public void printInspectionReport() {
        String isInspectionDue = "No";

        if (getYearsSinceInspection() > 2) {
            isInspectionDue = "Yes";
        }

        System.out.println("**************************************************");
        System.out.println("HOTEL INSPECTION REPORT");
        System.out.println("**************************************************");
        System.out.println("HOSPITAL LOCATION: " + getHospitallocation());
        System.out.println("HOSPITAL NAME: " + getHospitalname());
        System.out.println("YEARS SINCE INSPECTION: " + getYearsSinceInspection());
        System.out.println("INSPECTION NEEDED: " + isInspectionDue);
        System.out.println("**************************************************");

    }

    @Override
    public String getInspectionNeeded() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
