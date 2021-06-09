public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        return str1.trim().concat(str2.trim());
    }

    public Integer getIndexOrNull(String input, char c) {
        if (input.indexOf(c) == -1) {
            return null;
        } else {
            return input.indexOf(c);
        }
    }
    public Integer getIndexOrNull(String stringA,String stringB){
        Integer result;
        result = stringA.indexOf(stringB);
        if (result < 0){
            return null;
        }
        return result;
    }
       public String concatSubstring(String stringA, int a, int b, String stringB){
           return stringA.substring(a,b).concat(stringB);
       }

}
