import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String strLine = sc.nextLine() ;
        sc.close() ;
        printLastChar(strLine);
    }
    public static void printLastChar(String strLine){
        strLine = strLine.trim() ;
        String[] str = strLine.split("\\s+") ;
        for (String string : str){
            char c = string.charAt(string.length() - 1) ;
            if(Character.isAlphabetic(c))
                System.out.print(c);
        }
    }
}
