package foreach;

import java.util.Scanner;

/**
 * Created by Vlad on 22.01.2016.
 */
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {6,7,8,9,4,2,44,0};

        System.out.println("Enter value");
        int val = sc.nextInt();
        boolean found  = false;

        for(int x : nums){
            if(x == val){
                found = true;
            }
        }
        if(found){
            System.out.println("Value found");
        }else{
            System.out.println("Value not found");
        }
    }
}
