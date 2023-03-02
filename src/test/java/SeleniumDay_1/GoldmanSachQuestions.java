package SeleniumDay_1;

import java.util.Arrays;

public class GoldmanSachQuestions {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        int targetnum = 5;

        int Arr[] = new int[arr.length+1];//1.2.3.4.0

        int temp=0;


        for(int i =0; i<arr.length;i++) {

            Arr[temp] =arr[i];
            temp++;
            Arr[Arr.length-1] =targetnum;


        }

        System.out.println(Arrays.toString(Arr));
    }
}
