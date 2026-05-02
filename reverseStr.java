package Recursion;

 class reverseStr {
    static void reverse(String str,int index){
        if(index < 0) return;
        System.out.println(str.charAt(index));
        reverse(str,index-1);
    }
    public static void main(String[] args) {
        reverse("Hriday", 5);
    }
}
