/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
abstract public class Inspection implements iInspection {

    private String Hospitallocation;
    private String Hospitalname;
    private int YearsSinceInspection;

    @Override
    public String getHospitallocation() {
        return Hospitallocation;
    }

    @Override
    public String getHospitalname() {
        return Hospitalname;
    }

    @Override
    public int getYearsSinceInspection() {
        return YearsSinceInspection;
    }

    public Inspection(String Hospitallocation, String Hospitalname, int YearsSinceInspection) {
        this.Hospitallocation = Hospitallocation;
        this.Hospitalname = Hospitalname;
        this.YearsSinceInspection = YearsSinceInspection;
    }
}
