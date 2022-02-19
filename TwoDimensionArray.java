class TwoDimensionArray {
  int arr[][] = null;
  public TwoDimensionArray(int rows , int cols) {
    this.arr = new int[rows][cols];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        arr[i][j] = Integer.MIN_VALUE;
      }
    }
  }
  public void insertValueInArray(int rows, int cols, int value) {
    try
    {
      if(arr[rows][cols] == Integer.MIN_VALUE) {
      arr[rows][cols] = value;
      System.out.println("The value is successfully inserted");
    }
    else {
      System.out.println("Cell is occupied");
    }
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Invalid index");
    }

  }

  public void accessCell(int row , int col) {
    System.out.println("\nAccessing Row->" +row+",Col->"+col);
    try{
      System.out.println("Cell value is" + arr[row][col]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("invalid index");
    }
  }


  public void traverseArray() {
    for(int rows = 0; rows < arr.length; rows++) {
      for(int cols = 0; cols < arr[0].length; cols++) {
        System.out.print(arr[rows][cols] + " ");
      }
      System.out.println();
    }
  }

  public void searchingInArray(int value) {
    for(int rows=0; rows < arr.length; rows++) {
      for(int cols = 0; cols < arr[0].length; cols++) {
        if(arr[rows][cols] == value) {
          System.out.println("Value found at index no "+ rows + ", "+cols);
          return;
        }
      }
    }
  System.out.println("Value not found ERROR 404 not Found! ");
  }

  public void deleteInArray(int row, int col) {
    try {
      System.out.println("Successfully Deleted " +arr[row][col]);
      arr[row][col] = Integer.MIN_VALUE;
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid");
    }
  }

}