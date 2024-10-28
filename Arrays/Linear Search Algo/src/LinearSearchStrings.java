public class LinearSearchStrings {
    public static void main(String[] args) {
        String name = "Vinay";
        char target = 'a';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target_value){
        if (str.length() == 0){
            return false;
        }

        //Check for Character in the String
        for (int i = 0; i < str.length(); i++) {
            if (target_value == str.charAt(i)){
                return true;
            }
        }
        // If character not found return false
        return false;
    }
}
