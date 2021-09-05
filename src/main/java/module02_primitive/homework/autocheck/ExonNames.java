package module02_primitive.homework.autocheck;

public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }
    public String makeFullName(String firstName, String lastName) {
        //return firstName.toLowerCase() + " " + lastName.toUpperCase();
        String space = " ";
        String fullName = String.join(space, firstName.toLowerCase(), lastName.toUpperCase());
        return fullName;
    }
    public boolean isNameLucky(String name) {
        /*
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
        */
        return name.contains("o") || name.contains("a") && name.contains("O") || name.contains("A");
    }
    public String getNameCode(String name) {
        /*
        String code = name.charAt(0) + String.valueOf( name.charAt(name.length() - 1));
        return code.toUpperCase();
         */

        //return name.substring(0, 1) + name.charAt(name.length() -1);
        String codeName = name.substring(0, 1) + name.substring(name.length() -1);
        String UpperCaseCodeName = codeName.toUpperCase();
        return  UpperCaseCodeName;
    }
    public boolean isMoneyName(String name) {
        /*
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';

        return firstLetterOk && lastLetterOk;
         */
        return name.charAt(0) >= '0' && name.charAt(0) <= '9' && (name.charAt(name.length() -1)) >= '0' && (name.charAt(name.length() -1)) <= '9';
    }
    public boolean isInvisibleName(String name) {
        return name.trim().isEmpty();
    }
    public String makeNamePositive(String name) {
        /*
        return name
                .replace("no", "yes")
                .replace("No", "yes")
                .replace("nO", "yes")
                .replace("NO", "yes");
         */
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.replace("no", "yes");
    }
    public String makeNameClean(String name) {
        String clean = "CLEAN";
        return clean + name.trim() + clean;
    }
    public String makeHalfOfName(String name) {
/*
        String halfName = name.substring(name.length() / 2);
        return halfName;
*/
        String halfName = name.substring(0, name.length() / 2);
        return halfName;
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();
        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);
        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);
        boolean isNameLucky1 = names.isNameLucky("ExmA");
        System.out.println("names.isNameLucky(\"ExmA\") = " + isNameLucky1);
        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);
        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
        boolean isMoneyName1 = names.isMoneyName("7Max9");
        System.out.println("names.isMoneyName(\"7Max9\") = " + isMoneyName1);
        //Should be false
        boolean isMoneyName2 = names.isMoneyName("77Hero");
        System.out.println("names.isMoneyName(\"77Hero\") = " + isMoneyName2);
        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisible(\" \") = " + isInvisible);
        boolean isInvisible1 = names.isInvisibleName("\n");
        System.out.println("names.isInvisible(\"\n\") = " + isInvisible1);
        //Sould be false
        boolean isInvisible2 = names.isInvisibleName("\nMiag");
        System.out.println("names.isInvisible(\"\nMiag\") = " + isInvisible2);
        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);
        //Should be Heyest
        String positive1 = names.makeNamePositive("Henot");
        System.out.println("names.makeNamePositive(\"Henot\") = " + positive1);
        //Should be Berul
        String positive2 = names.makeNamePositive("Berul");
        System.out.println("names.makeNamePositive(\"Berul\") = " + positive2);
        //Should be CLEANdirtyCLEAN
        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);
        //Should be CLEANbigarCLEAN
        String cleanName1 = names.makeNameClean("bigar");
        System.out.println("names.makeNameClean(\"bigar\") = " + cleanName1);
        //Should be CLEANytukiCLEAN
        String cleanName2 = names.makeNameClean(" ytuki");
        System.out.println("names.makeNameClean(\" ytuki\") = " + cleanName2);
        //Should be Gu
        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + halfOfName);
        //Should be Magic
        String halfOfName1 = names.makeHalfOfName("Magicoraxi");
        System.out.println("names.makeHalfOfName(\"Magicoraxi\") = " + halfOfName1);
        //Should be Java
        String halfOfName2 = names.makeHalfOfName("Javametro");
        System.out.println("names.makeHalfOfName(\"Javametro\") = " + halfOfName2);
    }
}
