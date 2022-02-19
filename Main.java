import java.util.Arrays;
class Main {
   public static void main(String[] args) { 
  //   int [][] int2DArray;
  //   int2DArray = new int[2][2];
  //   int2DArray[0][0] = 1;
  //   int2DArray[0][1] = 2;
  //   int2DArray[1][0] = 3;
  //   int2DArray[1][1] = 4;  
  //   System.out.println(Arrays.deepToString(int2DArray));

  //   String str2DArray[][] = {{"a" , "b"} , {"c" , "d"}};
  //   System.out.println(Arrays.deepToString(str2DArray));
  
  TwoDimensionArray tda = new TwoDimensionArray(3,3);
  tda.insertValueInArray(1,1,20);    
  tda.insertValueInArray(2,2,30);    
  tda.insertValueInArray(0,0,10);    
  tda.accessCell(0,2);
  tda.traverseArray();
  tda.searchingInArray(50);
  // System.out.println(Arrays.deepToString(tda.arr));
  System.out.println(Arrays.deepToString(tda.arr));
  tda.deleteInArray(2,2);
  System.out.println(Arrays.deepToString(tda.arr));
  }
}