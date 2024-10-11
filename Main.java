//Вариант 3

import java.util.List;

import static first_laba.DeterminantCalculator.determinant;
import static first_laba.PalindromeFinder.findPalindromes;

public class Main {
    public static void main(String[] args) {

//a.       Определить количество строк только с положительными/отрицательными элементами матрицы.

        double[][] matrix = {
                {1, 2, 4, 3},
                {-1, 4, -10, -3},
                {4, 4, 5, 6},
                {4, 4, 4, 4,}
        };
        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//Подсчет кол-ва строк толькок с отрицательными и неотрицательными эл. матрицы
        int positivestroki = 0, negativestroki = 0;
        for (int i = 0; i < matrix.length; i++) {
            boolean cntpositive = true, cntnegative = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= 0) cntpositive = false;
                if (matrix[i][j] >= 0) cntnegative = false;
            }
            if (cntpositive == true) positivestroki++;
            if (cntnegative == true) negativestroki++;
        }
        System.out.println("Кол-во строк только с положительными эл. матрицы: " + positivestroki);
        System.out.println("Кол-во строк только с отрицательными эл. матрицы: " + negativestroki);

//b.      Если число строк и столбцов матрицы меньше пяти, то найти определитель матрицы.
//        Поиск определителя матрицы
        if (matrix.length >= 5 || matrix[0].length >= 5) {
            System.out.println("Кол-во строк и столбцов заданной матрицы > 5. Невозможно рассчитать определитель");
        } else {
            double determinant = determinant(matrix);
            System.out.println("Определитель матрицы: " + determinant);
        }
//c.       Среднее арифметическое значение элементов матрицы.

//Среднее арифметическое матрицы
        double sum = 0, count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        System.out.println("Среднее арифметическое матрицы: " + (sum / count));
//d.

// Найти в предложении все слова-палиндромы.
        String sentence = "Тянул дед репку";
        List<String> palindromes = findPalindromes(sentence);

        if (palindromes.isEmpty()) {
            System.out.println("В предложении нет палиндромов.");
        } else {
            System.out.println("Палиндромы в предложении:");
            for (String palindrome : palindromes) {
                System.out.println(palindrome);
            }
        }
    }
}