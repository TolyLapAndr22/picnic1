package picnic1;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Comparator.*;

public class View {
    int With=30;
    public void printData(int data,String title){
        System.out.printf("-".repeat(With)+"\n");
        System.out.printf("%s %d\n", title, data);

    }
    public void printStr(String Str,String title){
        System.out.printf("-".repeat(With)+"\n");
        System.out.printf("%s %s\n", title, Str);

    }
    public void printHM(HashMap Res, String title){
        DecimalFormat dF = new DecimalFormat( "00" );
        DecimalFormat dF1 = new DecimalFormat( "000" );
        Set<String> keys = Res.keySet();
        System.out.printf("-".repeat(With)+"\n");
        System.out.printf("%s\n", title);

        Comparator<String> myComparator = comparingInt(String::length).thenComparing(naturalOrder());
        Map<String,Integer> map1 = new TreeMap<>(myComparator);
        map1.putAll(Res);
       String MStr=Collections.max(map1.keySet(), comparing(s -> s.length()));
        AtomicInteger i1= new AtomicInteger();
        map1.forEach((k, v) -> System.out.println(dF.format(i1.getAndIncrement()+1)+" "+k + "-".repeat(MStr.length()-k.length()+1) + dF1.format(v)));
    }

}
