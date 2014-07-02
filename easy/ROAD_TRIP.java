package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by liyuntao on 2014/6/24.
 */
public class ROAD_TRIP {
    private static void output(String line) {
        String[] citys = line.split(";");
        int[] distances = new int[citys.length + 1];
        for(int i=0; i<citys.length;i++) {
            String dis = citys[i].substring(citys[i].indexOf(',') + 1);
            distances[i+1] = Integer.parseInt(dis);
        }
        Arrays.sort(distances);
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<distances.length;i++) {
            sb.append(distances[i] - distances[i - 1]).append(",");
        }
        System.out.println(sb.substring(0, sb.length()-1));

    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            output(line);
        }
    }
}
