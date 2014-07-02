package codeeval.easy;

import java.io.File;

/**
 * Created by liyuntao on 2014/6/23.
 */
public class FILE_SIZE {
    public static void main(String[] args) {
        System.out.println(new File(args[0]).length());
    }
}
