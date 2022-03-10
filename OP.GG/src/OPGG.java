import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class OPGG {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("input data");
        String input = in.nextLine();
        int place = 0;
        String dummy = "";
        for(int i=0;i<input.length()-18;i++){
            if(input.substring(i,i+17).equals(" joined the lobby")){
                dummy = input.substring(place,i);
                dummy = dummy.replaceAll(" ", "%20");
                dummy = "https://na.op.gg/summoners/na/" + dummy;
                Desktop.getDesktop().browse(new URI(dummy));
                place=i+18;
            }
        }
        dummy = input.substring(place,input.length()-17);
        dummy = dummy.replaceAll(" ", "%20");
        dummy = "https://na.op.gg/summoners/na/" + dummy;
        Desktop.getDesktop().browse(new URI(dummy));
    }
}
