
public class Pyramid {
    /**
     * TODO: Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
     * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
     * current 'row'.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        String pyramidStr = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                pyramidStr += "*";
            }
            pyramidStr += "\n";
        }
        return pyramidStr;
    }
}
