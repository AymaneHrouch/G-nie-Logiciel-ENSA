package designPatterns.iterator;

public class Main {
    public static void main(String[] args) {
        DesignPatternsRepository repository = new DesignPatternsRepository();
        Iterator it = repository.getReversedIterator();
        int i = 0;
        while(it.hasNext()) {
            System.out.println(++i + " " + it.next());
        }
    }

}
