package activities;

public class Activity2 {

    public static void main(String args[]){
        int[] arr= {10,77,10,54,-11,10};
        int sum=0;
        for(int x: arr){
            if (arr[x]==10){
                //sum=0;
                sum = sum +arr[x];
            }
        }
        if (sum==30){
            System.out.println("TRUE");
        }
        else
            System.out.println("FALSE");

    }

}
