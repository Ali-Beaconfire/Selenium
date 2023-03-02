package SeleniumDay_1;

public class interviewQuestion {
    public static void main(String[] args) {

        int arr[]={0,0,0,1,2,3,4};

        int arrr[] = new int [arr.length];

        int temp =0;

        for(Integer j : arr){

            if(j!=0){

                arrr[temp] = j;
                temp++;
            }
        }
    }
}
