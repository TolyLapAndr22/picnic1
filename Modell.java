package picnic1;

import java.util.*;
import java.util.stream.Collectors;

public class Modell implements Model{
    protected List<String> Data;
    protected String StrData;
    protected HashMap KeyData;
    @Override
    public int resultSum() {
        return StrData.split("\s+").length;
    }

    @Override
    public String resultWord() {

        Set<String> uniques = new LinkedHashSet<>();
        Set<String> dups = new HashSet<>();
        for (String word : StrData.split(" "))
           uniques.add(word);

        Map<Integer, List<String>> result2 = uniques.stream()
                .collect(Collectors.groupingBy(String::length));
        return String.join(", ",result2.get(Collections.max(result2.keySet())));
    }

    @Override
    public HashMap resultSumWord() {
        String item[] = StrData.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }

        return map;
    }

    @Override
    public void SetData(String Patch) {
        ReadFile rf = new ReadFile();
        Data = rf.ReadData(Patch);
        RemDupSp();
        SumStrting();
    }

    protected void RemDupSp(){
        for (int i = 0; i < Data.size(); i++) {
            Data.set(i,(Data.get(i).replaceAll("\\s+", " ")));
        }
    }
    protected void SumStrting(){
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < Data.size(); i++) {
            buf.append(Data.get(i));
        }
        StrData = buf.toString();
    }
}
