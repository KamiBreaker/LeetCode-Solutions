
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> abc = new ArrayList<>();
     if( matrix.length == 0){
        return abc;
     }
     int rowA = 0;
     int rowB = matrix.length - 1;
    int colA = 0;
     int colB = matrix[0].length - 1;
        while(rowA <= rowB && colA <= colB){ 
        for(int i = colA ; i <= colB ; i++){//Right 
            abc.add(matrix[rowA][i]);
            }
        rowA++;
        for(int i = rowA ; i <=rowB ; i++){//down
            abc.add(matrix[i][colB]);
        }
        colB--; 
        if(rowA <= rowB){
        for(int i = colB ; i >= colA ; i--){//left
            abc.add(matrix[rowB][i]);
        }
         rowB--;
        }
        if(colA <= colB){ 
        for(int i = rowB ; i >= rowA ; i--){//up
            abc.add(matrix[i][colA]);
    }
         colA++;
        }
        }
    return abc;
}
}