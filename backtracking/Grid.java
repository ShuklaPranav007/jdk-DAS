public class Grid {
    public static int gridWays(int i, int j, int row, int col){
        if(i==row-1 && j == col-1){
            return 1;
        }else if(i == row || j == col){
            return 0;
        }
        return gridWays(i+1, j, row, col) + gridWays(i, j+1, row, col);
    }
    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 3, 4));
    }
}
