package picnic1;


import java.util.HashMap;

public class Prisenter {
    View view;
    Modell model;
    public Prisenter(View v, Modell m) {
        this.view = v;
        this.model = m;
    }
    public void Task1(String Patch){
        model.SetData(Patch);
        int res = model.resultSum();
        view.printData(res,"Задание 1. Количество слов в файле `input.txt`: ");
    }
    public void Task2 (String Patch){
        model.SetData(Patch);
        String res = model.resultWord();
        view.printStr(res,"Задание 2. Самое длинное слово в файле `input.txt`: " );
        }

    public void Task3 (String Patch){
        model.SetData(Patch);
        HashMap res = model.resultSumWord();
        view.printHM(res,"Задание 3. Частота слов в файле `input.txt`: " );
    }

}
