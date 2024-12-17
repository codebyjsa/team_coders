public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name ="jasdeep";
        System.out.println(name);

        int value = name.length();
        System.out.println(value); //Length of string

        System.out.println(name.toLowerCase()); //return lowercase of name

        System.out.println(name.toUpperCase()); //returns uppercase of name

        String ntstring = "   Jasdeep   ";
        System.out.println(ntstring);
        System.out.println(ntstring.trim()); //Returns string by removing trailing and further spaces

        System.out.println(name.substring(3)); //returns string from given index to end

        System.out.println(name.substring(3,5)); //returns string from given index to given index

        System.out.println(name.replace('s','r')); //returns string with replaces character temporarily
        System.out.println(name);

        System.out.println(name.startsWith("ja")); //returns true if they are present in that string

        System.out.println(name.charAt(4)); //return the value of index at string

        System.out.println(name.indexOf("a")); //returns the index number of string
        System.out.println(name.indexOf("a", 4));

        System.out.println(name.lastIndexOf("a")); //returns the index number of string from last char
        System.out.println(name.lastIndexOf("a", 4));

        System.out.println(name.equals("jasdeep"));//return boolean value if the string matches

        System.out.println(name.equalsIgnoreCase("JAsdeep"));
    }
}
