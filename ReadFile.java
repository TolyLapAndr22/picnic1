package picnic1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {


    public List<String>  ReadData(String Patch) {
        List<String> DataF =new ArrayList<>();
        String line = "";
        try {
            int i =0;
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat(Patch);

            File file = new File(pathFile);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            line = reader.readLine();
            while (line != null) {

                //System.out.println(line);
                // считываем остальные строки в цикле
                DataF.add(i,line);
                line = reader.readLine();

                i++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return DataF;
    }

}
