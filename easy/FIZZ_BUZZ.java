package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/19.
 */
public class FIZZ_BUZZ {
    private static void fizz_buzz(int a, int b, int total) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < total; i++) {
            if((i + 1) % a == 0 && (i + 1) % b == 0) { //这里错，不是乘积是最小公倍数!!
                sb.append("FB ");
            } else if((i + 1) % a == 0) {
                sb.append("F ");
            } else if((i + 1) % b == 0) {
                sb.append("B ");
            } else {
                sb.append(i + 1 + " ");
            }
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\liyuntao\\IdeaProjects\\TestAndPractice\\src\\codeeval\\easy\\FizzBuzz.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] input_nums = line.split("\\s+");
            fizz_buzz(Integer.parseInt(input_nums[0]), Integer.parseInt(input_nums[1]), Integer.parseInt(input_nums[2]));
        }
//        fizz_buzz(2, 20, 92);
//        fizz_buzz(11, 1, 93);
//        fizz_buzz(16, 3, 41);
    }
}
