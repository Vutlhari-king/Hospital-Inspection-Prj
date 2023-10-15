package question1;

import java.text.DecimalFormat;

/**
 *
 * @author ST10380779 || Vutlhari Mabasa ||
 */
public class MabasaHospitalInspectionPrj {

    public static void main(String[] args) {
        //used to handle decimals for the double 
        DecimalFormat myAvgFormat = new DecimalFormat("##.##");

        String[] arrHospitals = new String[]{"Hospital 1: -->", "Hospital 2: -->", "Hospital 3: -->"};
//2D parallel array 
        double[][] arrInspections = new double[][]{
            {4, 8, 6},
            {5, 4, 2},
            {4, 2, 8}
        };
// used double to make it easier to calculate the average as it has decimals
        double[] arrRowTotal = new double[3];
        double average = 0.0;
        double rowTotal = 0;

        System.out.println("**********************************************************");
        System.out.println("HEALTH INSPECTION REPORT");
        System.out.println("**********************************************************");
        System.out.println("\t\tJAN\tFEB\tMARCH\tAVG");

        for (int r = 0; r < arrInspections.length; r++) {
            System.out.print(arrHospitals[r]);

            for (int c = 0; c < arrInspections[r].length; c++) {
                System.out.print("\t" + arrInspections[r][c]);
                rowTotal += arrInspections[r][c];
            }
            // to calculate average
            average = rowTotal / arrInspections[r].length;
// display the average and row total
            System.out.print("\t" + myAvgFormat.format(average));
            System.out.println("");
            arrRowTotal[r]=rowTotal;
         
            rowTotal=0;
          

        }
        System.out.println("**********************************************************");
        System.out.println("MONTHLY REPORT");
        System.out.println("**********************************************************");
        // for loop to help dislay the row total 
        for (int i = 0; i < arrRowTotal.length ; i++) {
            System.out.println("Hospital "+(i+1)+": "+arrRowTotal[i]);
        }

        System.out.println("**********************************************************");
    }

}
