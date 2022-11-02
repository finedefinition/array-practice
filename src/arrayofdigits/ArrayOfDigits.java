package arrayofdigits;

import java.util.Arrays;

/* Реалізуйте метод toArrayOfDigits: метод приймає натуральне число
n і повертає масив з його цифрами у зворотному порядку.

Наприклад, для n = 46156 потрібно повернути [6, 5, 1, 6, 4].

Елементи масиву повинні бути числами.
['6', '5', '1', '6', '4'] - неправильна відповідь.

Note: якщо число від'ємне, ігноруйте знак -:

- для n = -123 потрібно повернути [3, 2, 1].

Задача */
public class ArrayOfDigits {
    public static char[] toArrayOfDigits(int n) {
        StringBuilder a = new StringBuilder(n + "").reverse();
        //System.out.println(a);
        //System.out.println(a.length());
        int length;
        if (a.charAt(a.length() - 1) == '-') {
            length = a.length() -1;
        } else {
            length = a.length();}
        char[] array = new char[length];
        for (int i = 0; i < array.length; i++) {
                array[i] = a.charAt(i);
                //System.out.println(a.charAt(i));
            }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        toArrayOfDigits(-123);
        toArrayOfDigits(-12345);
        toArrayOfDigits(123456789);

    }
}