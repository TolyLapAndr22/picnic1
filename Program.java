package picnic1;

public class Program {
    public static void main(String[] args) {
        String Patch = "/src/picnic1/input.txt";
        var m = new Modell();
        var v = new View();
        //Prisenter p;
        var p = new Prisenter(v,m);
        p.Task1(Patch);
        p.Task2(Patch);
        p.Task3(Patch);

    }
}
