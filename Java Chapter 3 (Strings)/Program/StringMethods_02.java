package Program;

public class StringMethods_02 {
    public static void main(String[] args) {
        String name = "Saandipndipndip";
        System.out.println(name);

        // name.length() method
        int value = name.length();
        System.out.println(value);

        // name.toLowerCase() method
        String lString = name.toLowerCase();
        System.out.println(lString);

        // name.toUpperCase() method
        String uString = name.toUpperCase();
        System.out.println(uString);

        // name.trim() String
        String nonTrimmedString = "    Sandip         ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println(nonTrimmedString);
        System.out.println(trimmedString);
        String nonTrimmedString1 = "    Sandip      Maity     ";
        String trimmedString1 = nonTrimmedString1.trim();
        System.out.println(nonTrimmedString1);
        System.out.println(trimmedString1);

        // name.substring() method
        System.out.println(name.substring(2));
        // name.substring(start , end) method
        System.out.println(name.substring(2,5));

        // name.replace() method
        System.out.println(name.replace('S','M'));
        System.out.println(name.replace("n","xyz"));
        System.out.println(name.replace("andi","onlg"));

        // name.startsWith("String") method
        System.out.println(name.startsWith("Sa"));
        // name.endsWith("String") method
        System.out.println(name.endsWith("dip"));

        // name.charAt(int) method
        System.out.println(name.charAt(4));

        // name.indexOf("String",) method
        System.out.println(name.indexOf("ip"));
        System.out.println(name.indexOf("dip"));

        // name.indexOf("String",int) method
        System.out.println(name.indexOf("n",2));
        System.out.println(name.indexOf("n",6));

        // name.lastIndexOf("String")
        System.out.println(name.lastIndexOf("ip"));
        System.out.println(name.lastIndexOf("ip",10));

        // name.equals("String")
        System.out.println(name.equals("Sandip"));
        System.out.println(name.equals("Saandipndipndip"));

        // name.equalsIgnoreCase("String") ("String")
        System.out.println(name.equalsIgnoreCase("Saandipndipndip"));
        System.out.println(name.equalsIgnoreCase("SaAnDipNdiPndip"));

        // Escape sequence characters
        // use of "\n" and " \" "
        System.out.println("I am \"Sandip Maity\".\nI am a ECE student at TECB.");
        //use of "\t" and "\\"
        System.out.println("I am Sandip Maity.\tI am a ECE student at TECB \\ tecb.");

    }
}
