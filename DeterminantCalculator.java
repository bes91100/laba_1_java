package first_laba;
public class DeterminantCalculator {
    public static double determinant(double[][] matrix)
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
}