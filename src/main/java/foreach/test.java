package foreach;

/**
 * Created by Vlad on 21.01.2016.
 */
public class test {
    public static void main(String[] args) {
    int sum = 0;
    int nums[][] = new int[4][5];

        for(int i = 0; i < 4; i ++)
            for(int j = 0; j < 5; j ++)
                nums[i][j] = (i+1) * (j+1);

        for(int x[] : nums){
            for(int y : x){
                System.out.println("Значення рівне: " + y);
                sum += y;
            }
        }
        System.out.println("Сума: " + sum);
    }
}