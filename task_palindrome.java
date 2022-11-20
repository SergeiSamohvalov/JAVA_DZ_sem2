
package Java_DZ.JAVA_DZ_sem2;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;
public class task_palindrome {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = iScanner.nextLine();
        iScanner.close();
        System.out.println(Palindrome(str));
    }
    public static boolean Palindrome(String str) {
        StringBuffer strc = new StringBuffer(str);
        strc.reverse();
    
        if (strc.toString().equals(str)) {
            return true;
        } else {
            return false;
        }
}
}