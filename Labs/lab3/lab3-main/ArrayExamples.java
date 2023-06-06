

public class ArrayExamples {

  // Changes the input array to be in reversed order
  /*
   * added / 2 to the array length that our int i uses as a condition, created a
   * temporary array to be our reversed array, and set our array equal to the
   * reversed temp array 
   */
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr [i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  /*
   * fixed, set arr equal to the array made in the loop, then set newArray = arr
   */
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  /*
   * fixed to where if there's 2 instances of the lowest, we will subtrct one
   * instance of the lowest before finding the average
   */
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      //if(num != lowest) { sum += num; }
      sum += num;
    }
    return (sum - lowest) / (arr.length - 1);
  }


}

