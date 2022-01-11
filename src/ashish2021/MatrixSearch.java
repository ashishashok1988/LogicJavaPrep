package ashish2021;

public class MatrixSearch {

    public static void main(String args[]) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 }, { 64, 65, 66, 69 } };
        int target = 3;
        
        int[][] matrix_1 = { {1}, {3}, {5}};

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        
        MatrixSearch matrixSearch = new MatrixSearch();
        System.out.println(matrixSearch.searchMatrix(matrix, target));
        
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null || matrix.length == 0) {
            return false;
        }
        
        int topRowIndex = 0;
        int bottomRowIndex = matrix.length-1;
        
        
        int lastColumnIndex = matrix[0].length-1;

        int midRowIndex = 0;
        while (topRowIndex < bottomRowIndex) {
            midRowIndex = topRowIndex + (bottomRowIndex-topRowIndex)/2;
            if(matrix[midRowIndex][lastColumnIndex] >= target) {
                bottomRowIndex = midRowIndex;
            } else {
                topRowIndex = midRowIndex+1;
            }
        }
        
        int rowIndex = topRowIndex;
        int leftColumnIndex = 0;
        int rightColumnIndex = matrix[0].length-1;

        int midColumnIndex = 0;
        while(leftColumnIndex <= rightColumnIndex) {
            midColumnIndex = leftColumnIndex + (rightColumnIndex-leftColumnIndex)/2;
            if (matrix[rowIndex][midColumnIndex]==target) {
                System.out.println(rowIndex+ " " + midColumnIndex);
                return true;
            } else if(matrix[rowIndex][midColumnIndex]>target) {
                rightColumnIndex = midColumnIndex-1;
            } else {
                leftColumnIndex = midColumnIndex+1;
            }
        }
        
        return false;
    }
}
