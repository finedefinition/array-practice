package matrixaddition;

/* Завдання №3

Напишіть метод, що приймає дві матриці (N x M - двовимірні масиви)
 і поверніть іншу матрицю: що являє собою їх суму.

Обидві матриці, що передаються у метод, мають розмір N x M і
містять лише цілі числа.

Як скласти дві матриці: Візьміть кожну комірку [n][m] з першої матриці
та додайте її до комірки [n][m] з другої матриці. Це буде комірка [n][m]
 матриці-результату.

Для прикладу:

```
|1 2 3 4|     |2 2 1 2|     |1+2 2+2 3+1 4+2|     |3 4 4 6|
|3 2 1 2|  +  |3 2 3 1|  =  |3+3 2+2 1+3 2+1|  =  |6 4 4 3|
|1 1 1 0|     |1 1 3 5|     |1+1 1+1 1+3 0
```

Задача */

import java.util.Arrays;

public class MatrixAddition {
    public static int[][] addMatrix(int[][] first, int[][] second) {
        int[][] result = new int[first.length][first[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println(result.length);
        System.out.println(Arrays.deepToString(result));
        return result;
    }

    public static void main(String[] args) {
        int[][] first = new int[][] {{1, 2, 3, 4, 5},{15, 14, 13, 12, 11}};
        int[][] second = new int[][] {{9, 8, 7, 6, 5},{15, 16, 17, 18, 19}};
        addMatrix(first, second);
    }
}
