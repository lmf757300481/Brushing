package LeeCode;
import java.util.Scanner;
 
import java.util.Scanner;


/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
     * �Ȱ�����ת��Ϊ�������ַ���,���ַ���תΪchar���飬����
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
     * ������תΪ�������ַ���������String��replaceAll�滻���е�0λ"",�ַ�����length��Ϊ1�ĸ���
     */
    public static int numberOfOne2(int n) {
    	System.out.println(Integer.toBinaryString(n));
    	
        return Integer.toBinaryString(n).replaceAll("0", "").trim().length();
    }
 
 
    /* ����&���������,��һ��������ȥ1���ٺ�ԭ�����������㣬��Ѹ��������ұ�һ��1���0.��ôһ�������Ķ������ж��ٸ�1���Ϳ��Խ��ж��ٴ������Ĳ��� */
    public static int numberOfOne3(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }
}