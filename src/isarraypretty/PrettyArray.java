package isarraypretty;

/* Завдання №4
Гарним масивом вважається такий масив, в якому для кожного елемента n,
в масиві також існує n-1 або n+1.

Наприклад:

```
[2,10,3,9]` - pretty array, because:
2 = 3 - 1
10 = 9 + 1
3 = 2 + 1
9 = 10 - 1

```
Напишіть метод isArrayPretty, який повертає true, якщо параметр array є гарним,
інакше повертає false.

Також потрібно повернути false, якщо переданий масив порожній.
Задача */

public class PrettyArray {
    public static boolean isArrayPretty(int[] array) {

        boolean prettiness = false;
        int count = 0;
        if (array.length == 0) {
            System.out.println("Array is pretty? : " + prettiness);
            return prettiness;
        }
        for (int find = 0; find < array.length; find++) {

        for (int i = 0; i < array.length; i++) {
            if (array[find] == array[i] + 1 | array[find] == array[i] - 1) {
                count++;
            }
        }
        }
        if (count >= array.length) {
            prettiness = true;
        }
        System.out.println("Array is pretty? : " + prettiness);
        return prettiness;
    }


    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        int[] ugly = new int[]{1, 1, 5, 9};
        int[] pretty = new int[]{2, 10, 3, 9, 8};
        isArrayPretty(emptyArray);
        isArrayPretty(ugly);
        isArrayPretty(pretty);

    }
}
