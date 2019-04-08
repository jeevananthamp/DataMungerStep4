package stackroute;

public class CharacterCount {
    public int countCharacter(String query,String bit){
        if(query.contains(bit)) {
            String[] count = query.split("("+bit+"|"+bit.toUpperCase()+")",-2);
            for(int i=0;i<count.length;i++)
            System.out.print(count[i]);
            return (count.length-1);
        }
        else
            return 0;
    }
}
