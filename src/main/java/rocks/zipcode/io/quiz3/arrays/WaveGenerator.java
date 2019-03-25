package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> waveList = new ArrayList<>();
        String lStr = str.toLowerCase();
        for(int i = 0; i<str.length();i++) {
            String newWave = waveMaker(lStr, i);

            if (newWave != null) {
                waveList.add(waveMaker(lStr, i));
            }
        }
        return waveList.toArray(new String[0]);
    }



    public static String waveMaker(String s , int i) {


        if(Character.isLetter(s.charAt(i))){
           return  s.substring(0,i) +
            Character.toUpperCase(s.charAt(i) ) +
            s.substring(i+1);

        }
       return null;
    }
}
