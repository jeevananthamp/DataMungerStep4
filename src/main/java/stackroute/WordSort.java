package stackroute;

import java.util.Arrays;

public class WordSort {
    public String[] sortString(String para){
        String [] arr = para.trim().toLowerCase().split(" ");
        Arrays.sort(arr);
        return arr;
    }
}
