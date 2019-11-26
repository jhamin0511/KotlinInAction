package list3;

import list3.strings.JoinKt;
import list3.strings.StringFunnctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List3_3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(JoinKt.joinToString(list, "~ ", "<", ">"));

        System.out.println(StringFunnctions.joinToString2(list, "~ ", "<", ">"));
    }

}
