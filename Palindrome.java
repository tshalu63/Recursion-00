package Recursion;

 class Palindrome {
    static boolean isPali(String str, int start, int end){
        if(start >= end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        return isPali(str,start+1,end-1);
    }
    public static void main(String[] args) {
        System.out.println(isPali("madam",0,4));
    }
}
