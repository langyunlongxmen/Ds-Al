import java.util.ArrayList;
// import java.util.List;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(4);

        // for(int i = 0; i<list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        list.stream().forEach(System.out::println);
    }
    
}

