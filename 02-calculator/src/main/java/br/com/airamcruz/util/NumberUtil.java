package br.com.airamcruz.util;

public class NumberUtil {
	
    public static Double convertToDouble(String strNumber) throws NumberFormatException {
        return Double.parseDouble(strNumber.replace(",", "."));
	}


    public static boolean isNumeric(String strNumber) {
		try {
			convertToDouble(strNumber);
            return true;
        } catch ( NumberFormatException e){
            return false;
        }
    }

}
