
public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str){
        
        // String rev = "";
        // int size =str.length();
       
        // if(size > 0)
        // {
        //     for(int i = str.length() - 1; i>= 0 ; i--)
        //     {
        //         rev = rev +  str.charAt(i);
        //     }
        // }
        // return rev;
        if(str == null || str.isEmpty()){
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
