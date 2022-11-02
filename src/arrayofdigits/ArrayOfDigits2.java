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
//Solution use char
public class ArrayOfDigits2 {
    public static int[] toArrayOfDigits(int n) {
        if (n < 0) {
            n = n * -1;
        }
        int lengthArray = 0;
        int m = n;
        for ( ;m > 10; lengthArray++) {
            m = m / 10;
        }
        int[] array = new int[lengthArray + 1];

        for (int j = 0; j < array.length; j++) {
                array[j] = n % 10;
                n = n / 10;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        toArrayOfDigits(-1);
        toArrayOfDigits(-12);
        toArrayOfDigits(123);
        toArrayOfDigits(-1234);
        toArrayOfDigits(0);
        toArrayOfDigits(-123456789);

    }
}