package java101;

public class BoksOyunu {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("a",10,120,100);
        Fighter f2 = new Fighter("b",20,85,85);

        Match match =new Match(f1,f2,85,100);
        match.run();

    }

}
