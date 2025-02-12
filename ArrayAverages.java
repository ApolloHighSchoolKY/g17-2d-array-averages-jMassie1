import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double avg = 0;
    for(int[] row: ray){
      avg = 0;
      for(int col: row){
        avg+=col;
      }
      avg = avg/row.length;
      System.out.println("The row average of " + Arrays.toString(row) + " is: " + avg);
    }
  }

  public void columnAverages(){
    //Column major order
    //Take each column and go through all of the rows
    //Top down left to right
    double avg=0;
    for(int col=0; col < ray[0].length; col++){
      avg = 0;
      for(int row=0; row < ray[0].length; row++){
        avg += ray[row][col];

      }
      avg = avg/ray[col].length;
      System.out.println("The column average of column " + col + " is: " + avg);

    }
    }
  public void arrayAverage(){
    double avg = 0;
    double lastNums = 0;
    int count = 0;
    for(int[] row: ray){
      lastNums = 0;
      for(int col: row){
        lastNums += col;
        count += 1;
    }
    avg += lastNums;
  }
    avg = avg/count;
    System.out.println("The array average is: " + avg);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    //goes from row on the outside to column on the inside
    //column in the outside to row on the outside
    

    return "";
  }
}
