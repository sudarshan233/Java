import java.lang.*;

public class CLI {
    public static void main(String[] args) {
        if(args.length == 0) System.out.printf("No values");
        else {
            for(String element : args) System.out.printf("%s, ", element);
        }
    }
}
