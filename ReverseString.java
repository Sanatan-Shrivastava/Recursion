public class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        
        helper(start, end, s);
        for(char c: s) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
    public static void helper(int start, int end, char[] s) {
        // Base:
        if(start >= end) {
            return;
        }
        // Hypothesis
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;
        
        // Induction
        helper(start + 1, end - 1, s);
    }


    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        reverseString(s);
    }
}