package nascimento_italo_maratonaJava.Intro;

import java.util.Scanner;

public class testArrayMinMax {
    public static void main(String[] args) {
        ///encontra o valor minnimo e maximo de um Array
        int[] nums = new int [10];
        /// 1:tipo, 2: nome ,3: = , 4: new , 5: tipo , 6: o tamanho entre cochete;

        int [] nums02 = {778,78,54,45,4578,12,45,787,78,123,456,789,};
        int min01,min02;
        int min,max;
        nums[0]= 307;
        nums[1]= 7417;
        nums[2]= 57;
        nums[3]= 7;
        nums[4]= 448;
        nums[5]= 4587;
        nums[6]= 963;
        nums[7]= 789;
        nums[8]= 635;
        nums[9]= 1245;
        min = max = nums[0];

        for (int i = 0; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];

        }

        System.out.println(" O minimo e o maximo e :"+min+" "+max);


        }
    }

