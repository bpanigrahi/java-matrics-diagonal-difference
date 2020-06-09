package play;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
try {
    List<List<Integer>> arr = new ArrayList<>();


    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);

    List<Integer> b = new ArrayList<>();
    b.add(4);
    b.add(5);
    b.add(6);

    List<Integer> c = new ArrayList<>();
    c.add(7);
    c.add(8);
    c.add(9);

    arr.add(a);
    arr.add(b);
    arr.add(c);


    int forwardSum =0;
    int reverseSum = 0;
    int arrarySize = arr.size();

    for (int i = 0; i < arrarySize; i++) {
        int j = arrarySize-1-i;

        forwardSum += arr.get(i).get(i);
        reverseSum += arr.get(j).get(i);

    }


    int diff = Math.abs(forwardSum - reverseSum);

    System.out.println(diff);
    System.out.println(diff ==0);
}catch(Exception e){
    e.printStackTrace();
}



    }


}
