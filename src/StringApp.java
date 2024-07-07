public class StringApp {
    public static void checkSubString(String mainString, String subString) {
        boolean contain = mainString.contains(subString);
        if (contain) {
            System.out.println("Chuoi " + subString + "co trong chuoi chinh.");
        }
        else {
            System.out.println("Chuoi " + subString + "khong co trong chuoi chinh.");
        }
    }
    public static int CountCharlnString(String mainString, char searchChar) {
        int count = 0;
        for (int i = 0; i < mainString.length(); i++) {
            char ch = mainString.charAt(i);
            if (ch == searchChar);
            count ++;
        }
        return count;
    } 
    public static String UpperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }
}