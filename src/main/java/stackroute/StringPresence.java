package stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPresence {
    public String findWord(String query){
        Pattern pattern = Pattern.compile("[H|h]arry");
        Matcher m = pattern.matcher(query);
        if(m.find()){
            return "is Harry here ? True";
        }
        else
            return "is Harry here ? False";
    }
}
