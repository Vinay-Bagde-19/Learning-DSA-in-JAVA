public class LS_String_usingForEach {
    public static void main(String[] args) {
        String name = "Vinay";
        char target = 'y';
        System.out.println(search2(name, target));
    }

    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        //Check for Character in the String using forEach
        /**
         * We can not Directly use ForEach on String, since it iterate over collection only.
         * So we have to convert our String into Array of Char
         * Using String_name.toCharArray() function ('here replace String_name with given string')
         */
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }

        // If character not found return false
        return false;
    }
}
