
package principal;

import modelo.Sudoku;
import vista.FromSudoku;

public class Principal {
    
    public static void main(String[] args) {
        
        FromSudoku sudoku = new FromSudoku();
        sudoku.setVisible(true);
        sudoku.setTitle("SUDOKU");
    }
    
}
