//Вариант 3
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static double determinant(double[][] matrix)//Функция по вычислению определителя матрицы
    {
        if (matrix.length == 4 || matrix[0].length == 4)
        {
            return matrix[0][0] * (matrix[1][1] * (matrix[2][2] * matrix[3][3] - matrix[2][3] * matrix[3][2]) -
                    matrix[1][2] * (matrix[2][1] * matrix[3][3] - matrix[2][3] * matrix[3][1]) +
                    matrix[1][3] * (matrix[2][1] * matrix[3][2] - matrix[2][2] * matrix[3][1])) -

                    matrix[0][1] * (matrix[1][0] * (matrix[2][2] * matrix[3][3] - matrix[2][3] * matrix[3][2]) -
                            matrix[1][2] * (matrix[2][0] * matrix[3][3] - matrix[2][3] * matrix[3][0]) +
                            matrix[1][3] * (matrix[2][0] * matrix[3][2] - matrix[2][2] * matrix[3][0])) +

                    matrix[0][2] * (matrix[1][0] * (matrix[2][1] * matrix[3][3] - matrix[2][3] * matrix[3][1]) -
                            matrix[1][1] * (matrix[2][0] * matrix[3][3] - matrix[2][3] * matrix[3][0]) +
                            matrix[1][3] * (matrix[2][0] * matrix[3][1] - matrix[2][1] * matrix[3][0])) -

                    matrix[0][3] * (matrix[1][0] * (matrix[2][1] * matrix[3][2] - matrix[2][2] * matrix[3][1]) -
                            matrix[1][1] * (matrix[2][0] * matrix[3][2] - matrix[2][2] * matrix[3][0]) +
                            matrix[1][2] * (matrix[2][0] * matrix[3][1] - matrix[2][1] * matrix[3][0]));
        }
        if (matrix.length == 3 || matrix[0].length == 3)
        {
            return  matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                    matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                    matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        if (matrix.length == 2 || matrix[0].length == 2)
        {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        if (matrix.length == 1 || matrix[0].length == 1)
        {
            return matrix[0][0];
        }
        return 0;
    }
    public static List<String> findPalindromes(String sentence) //Функция по поиску слов палиндромов в предложении
    {
        List<String> palindromes = new ArrayList<>();
        String[] words = sentence.toLowerCase().split("\\s+"); // Разбиваем предложение на слова

        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
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