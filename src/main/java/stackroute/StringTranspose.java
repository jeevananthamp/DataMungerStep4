package stackroute;

public class StringTranspose {
    public String transpose(String query) {
        String transpose = "";
        String[] rev = query.toLowerCase().split(" ");
        for (String sub : rev) {
            StringBuilder string = new StringBuilder(sub);
            transpose += string.reverse() + " ";
        }
        return transpose.trim();
    }
}
