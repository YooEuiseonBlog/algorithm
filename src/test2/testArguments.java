package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testArguments {

    public static void objArgumentsParam(String... objects) {
        System.out.println(Arrays.toString(objects));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        objArgumentsParam("string", "stirng2", Arrays.toString(list.toArray()));
    }
    
}
