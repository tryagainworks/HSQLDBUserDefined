/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Windows2K
 */
public class clsFunctions {

    public static boolean fnIsMatchedStartWith(String strColValue, String strCondition) {
        String strAry[] = strCondition.split(",");
        if (strColValue == null) {
            return false;
        }
        if (("" + strColValue).trim().isEmpty()) {
            return false;
        }
        for (int iCount = 0; iCount < strAry.length; iCount++) {
            if (strColValue.startsWith(strAry[iCount])) {
                return true;
            }
        }
        return false;
    }

    public static boolean fnIsMatchedEndWith(String strColValue, String strCondition) {
        String strAry[] = strCondition.split(",");
        for (int iCount = 0; iCount < strAry.length; iCount++) {
            if (strColValue == null) {
                return false;
            }
            if (("" + strColValue).trim().isEmpty()) {
                return false;
            }
            if (strColValue.endsWith(strAry[iCount])) {
                return true;
            }
        }
        return false;
    }

    public static boolean fnIsMatchedContains(String strColValue, String strCondition) {

        String strAry[] = strCondition.split(",");
        if (strColValue == null) {
            return false;
        }
        if (("" + strColValue).trim().isEmpty()) {
            return false;
        }
        for (int iCount = 0; iCount < strAry.length; iCount++) {
            if (strColValue.contains(strAry[iCount])) {
                return true;
            }
        }

        return false;
    }
}
