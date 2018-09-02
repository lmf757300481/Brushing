package LeeCode;
import java.util.Scanner;
 
import java.util.Scanner;


/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * @author Yin.Jason
 * 
 */
public class BinaryPractice {
 
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println("call numberOfOne1 result :"
                + numberOfOne1(inputNumber));
        System.out.println("call numberOfOne2 result :"
                + numberOfOne2(inputNumber));
        System.out.println("call numberOfOne3 result :"
                + numberOfOne3(inputNumber));
    }
 
 
    /*
     * 先把整数转换为二进制字符串,把字符串转为char数组，遍历
     */
    public static int numberOfOne1(int n) {
        int result = 0;
        char[] charArray = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '1') {
                result++;
            }
        }
        return result;
    }
 
 
    /*
     * 把整数转为二进制字符串后，利用String的replaceAll替换所有的0位"",字符串的length即为1的个数
     */
    public static int numberOfOne2(int n) {
    	System.out.println(Integer.toBinaryString(n));
    	
        return Integer.toBinaryString(n).replaceAll("0", "").trim().length();
    }
 
 
    /* 利用&运算的特性,把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作 */
    public static int numberOfOne3(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }
}