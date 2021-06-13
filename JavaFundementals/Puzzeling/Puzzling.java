import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class Puzzling{
    public static void main(String[] args){

        //No1:

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        int[] array = {3,5,1,2,7,9,8,13,25,32};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum += array[i];
//            if (array[i] > 10){
//                numbers.add(array[i]);
//            }
//        }
//        System.out.println(numbers);
//        System.out.println("and the sum is: "+sum);

        //No2:

//        ArrayList<String> strArray = new ArrayList<String>();
//       String[] strList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
//       for (int i = 0; i < strList.length; i++){
//          if( strList[i].length()>5){
//              System.out.println(strList[i]);
//          }
//           strArray.add(strList[i]);
//       }
//       Collections.shuffle(strArray);
//       System.out.println(strArray);

        //No3:

//        ArrayList<Character> charArray = new ArrayList<Character>();
//        for(char i = 'a' ; i<'z';i++){
//            charArray.add(i);
//        }
//        Collections.shuffle(charArray);
//        System.out.println(charArray.get(charArray.size() -1));
//        System.out.println(charArray.get(0));
//        ArrayList<Character> vowelArray = new ArrayList<Character>();
//        vowelArray.add('a');
//        vowelArray.add('e');
//        vowelArray.add('o');
//        vowelArray.add('u');
//        vowelArray.add('i');
//        if (vowelArray.contains(charArray.get(0))){
//            System.out.println("Hello vowel character!!!!!!!!!!!!");
//        }

        //No4:

//        int[] myArray;
//        myArray = new int[10];
//        for (int i = 0; i < 10; i++){
//            Random r = new Random();
//            int low = 55;
//            int high = 100;
//            myArray[i] = r.nextInt(high-low) + low;
//
//            System.out.println(myArray[i]);
//        }

//No5:
       ArrayList<Integer> intArray = new ArrayList<Integer>();
       int[] myArray;
       myArray = new int[10];
       for (int i = 0; i < 10; i++){
           Random r = new Random();
           int low = 55;
           int high = 100;
           myArray[i] = r.nextInt(high-low) + low;
        intArray.add(myArray[i]);
       }
        Arrays.sort(myArray);
        System.out.println(intArray);
        System.out.println(myArray[0]);
        System.out.println(myArray[myArray.length -1]);

//No6:

//No7:

    }
}