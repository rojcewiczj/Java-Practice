package AlgoExpert;

public class AlgoExpert6_12_2 {
    public static boolean isPalindrome(String str) {
        String reversedString = "";
            for(int i = str.length() - 1; i >= 0; i--){
            reveresedString += st.charAt(i);
            }
        return str.equals(reversedString);
      }
}
