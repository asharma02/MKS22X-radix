import java.util.*;



public class Radix {

//HELPERRRS



  public static int finddigit(int x, int i){ //return the digit given by i
    if(i > numDigits(x)){ //check if invalid i
      return 0;
    }
    if(x < 0) { //turn into positive
      x = x * -1;
    }
    while(i > 1){ //keep going until i > 1
      x = x / 10;
      i--; //cut from the back until u get to i
    }
    return x % 10; //cut off the last digit and return
  }


  public static int numDigits(int x){ //number of digits
    if(x < 0){ //if neg, turn into postive
      x = x * -1;
    }
    int count = 0;
    while(x > 0){
      x = x / 10; //chop one off and count
      count++;
    }
    return count;
  }


public static int findlongest(int[] data) { //length of largest number in the array
  int max = Math.abs(data[0]);
  for(int i = 1; i < data.length ; i++){ //uses numdigits
    if(Math.abs(data[i]) >= max){
      max = Math.abs(data[i]);
    }
  }
  return numDigits(max);
}


  public static void radixsort(int[]data){
        @SuppressWarnings("unchecked")
        MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
        for(int i = 0; i < 20; i++){
          if ( buckets[i] == null){
            buckets[i] = new MyLinkedList<Integer>(); //make buckets
          }
        }
        int passthroughs = findlongest(data);//how many pass trhoguhs
        for( int i = 1; i <= passthroughs; i++){
          for(int j = 0; j < data.length ; j++){
            int index = finddigit(data[j], i); // gets the needed digit from the right
            if(data[j] >= 0){ //if greater than 0
              buckets[index+10].add(data[j]); //add the number to the corressponding bucket (add 10 because postive)
            }
            else { //took too long
              buckets[9 - index].add(data[j]); //add number to bucket corect (sub 9 becasue neg)
            }
          }
          int count = 0;
          for(int j = 0; j < 20; j++){
            int x = buckets[j].size(); //had to make varibale here becasue therwise it couldnt access j
            for(int k = 1; k <= x; k++){
              int addition = buckets[j].removeFront(); //remove the smallest one
              data[count] = addition; //make data  eqaul to this smallest one
              count++;//just iterate until all are added in order
            }
          }
          //System.out.println(Arrays.toString(data));
        }
    }









  }
