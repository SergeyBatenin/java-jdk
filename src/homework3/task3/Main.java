package homework3.task3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Double> pair = new Pair<>("Pi", 3.14159265358979);
        System.out.println(pair.getFirstElement());
        System.out.println(pair.getSecondElement());
        System.out.println(pair);
    }
}
