public class StringCompare {
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // if(s1 == s2) {
        //     System.out.println("Strings are equal");
        //     } else {
        //         System.out.println("String are not equal");
        // }
        //  if(s1 == s3) {
        //     System.out.println("Strings are equal");//it will print nor equal to because we dont use new string in s2
        //     } else {
        //     System.out.println("String are not equal");
        // }

        if(s1.equals(s3)) { //we use this when we want to compare the value of two Strings. .equal will return a bullean type value
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
}
