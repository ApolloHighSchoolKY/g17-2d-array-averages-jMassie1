import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int avg = 0;
    for(int[] row: ray){
      avg = 0;
      for(int col: row){
        avg+=col;
      }
      avg = avg/row.length;
      System.out.println("The average of " + row + "is: " + avg);
    }
  }

  public void columnAverages(){
    //Column major order
    //Take each column and go through all of the rows
    //Top down left to right
  }

  public void arrayAverage(){

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
