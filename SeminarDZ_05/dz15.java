package SeminarDZ_05;

// Задача 4. На шахматной доске расставить 8 ферзей так,
// чтобы они не били друг друга. 

public class dz15 {

    public static void main(String[] args) {
        System.out.print("\nРасстановка ферзей - один вариант из 92.\n");
        int n = 8;  // количество ферзей и размер поля 8 x 8
        int[][] field = new int[n][n];

        if (setQueens(field, n, 0) == false) {
            System.out.print("Решения нет.");
        } else {
            System.out.println();
            printBoard(field);
        }
    }

    /* 
        Ферзи размещаются слева на право и проверяем левую сторону
        (колонки от 0 до -1) на наличие атакующих ферзей
    */
    private static boolean check(int board[][], int n, int row, int col) {
        int i, j;
 
        // проверяем строку на левой стороне
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
 
        // проверяем верхнюю диагональ с левой стороны
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        // проверяем нижнюю диагональ с левой стороны
        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }

    /* 
        Рекурсивная функция расстановки ферзей
    */
    private static boolean setQueens(int board[][], int n, int col) {
        // все ферзи размещены 
        if (col >= n)
            return true;
        
        //    Проверяем - можно ли разместить ферзь в этой колонке
        //    во всех строках
        for (int i = 0; i < n; i++) {
            // проверем можно ли поставить ферзя на доску[i][col]
            if (check(board, n, i, col)) {
                // помещаем этого ферзя на доску[i][col]
                board[i][col] = 1;
     
                // вернуться, чтобы разместить остальных ферзей
                if (setQueens(board, n, col + 1) == true)
                    return true;
                
                // если поставить ферзя не удалось,
                // то удалить ферзя с доски [i][col]
                board[i][col] = 0; 
            }
        }
        //если ферзя нельзя поставить ни в одном ряду
        // столбца col, возвращаем false    
        return false;
    }
        
    // вывод шахматной доски в консоль
    private static void printBoard(int[][] board){
        for (int[] array : board) {
            for (int cell: array) {
                System.out.printf("%2d ",cell);
            }
            System.out.println();
        }
    }
}
