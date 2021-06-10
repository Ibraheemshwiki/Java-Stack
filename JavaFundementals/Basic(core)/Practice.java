import java.util.ArrayList;
public class Practice{
    public static void main(String[] args){

        //No1:
//
//        for (int i = 0; i <= 255; i++){
//        System.out.println(i);
//        }

        //No2:
//
//        for (int i = 0; i <= 255; i++){
//            if (i%2 != 0){
//                System.out.println(i);
//            }
//        }

        //No3:
//
//        int sum = 0;
//        for (int i = 0; i <= 255; i++){
//            sum += i;
//            System.out.println("New number is: " + i + " and the sum is: " + sum);
//        }

        //No4:
//
//        int[] X = {1,3,5,7,9,11,13};
//            for (int i = 0; i < X.length; i++){
//                int num = X[i];
//                System.out.println(num);
//                }

        //No5:
//
//        int[] Y = {1,3,0,-5,7,9,-11,13};
//        int max = Y[0];
//        for (int i = 0; i < Y.length; i++){
//            if (Y[i] > max){
//                max = Y[i];
//            }
//        }
//        System.out.println(max);

        //No6:
//
//        int[] Z = {3,2,10};
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i < Z.length; i++){
//            sum += Z[i];
//    }
//        avg = sum / Z.length;
//        System.out.println(avg);

        //No7:

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i <= 255; i++){
//            if (i%2 != 0){
//                arr.add(i);
//            }
//
//        }
//        System.out.println(arr);

        //No7:

//        int[] array = {1, 3, 5, 9, 7};
//        int y = 3;
//        int counter = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i] > y){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        //No8:

//        int[] X = {1, 5, 10, -2};
//        for (int i = 0; i < X.length; i++){
//            X[i] = X[i] * X[i];
//        System.out.println(X[i]);
//        }

        //No9:

//        int[] arr = {1, -3, -9, 6};
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < 0){
//                arr[i] = 0;
//            }
//
//        System.out.println(arr[i]);
//        }

        //No10:

//        int[] array = {1,3,5,7};
//        int[] newArray;
//        newArray = new int[3];
//        int min = array[0];
//        int max = array[0];
//        int avg = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i] < min){
//                min = array[i];
//            }
//            if (array[i] > max){
//                max = array[i];
//            }
//            sum += array[i];
//        }
//        avg = sum/array.length;
//        newArray[0] = max;
//        newArray[1] = min;
//        newArray[2] = avg;

        //No11:

        int[] arr = {1,5,7,12};
        for (int i =0; i < arr.length; i++){
            if (i == arr.length-1){
                arr[i] = 0;
                System.out.println(arr[i]);

                break;
            }
            arr[i] = arr[i+1];
            System.out.println(arr[i]);
        }
    }
}