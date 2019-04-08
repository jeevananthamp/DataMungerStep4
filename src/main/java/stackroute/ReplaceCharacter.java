package stackroute;

public class ReplaceCharacter {
    public String characcterReplace(String query){
        query = query.replaceAll("[L|l]","t");
        return query.replaceAll("[D|d]", "f");
    }
}
