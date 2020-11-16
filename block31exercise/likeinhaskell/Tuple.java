package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public class Tuple<T,U> {

    private T first;
    private U second;

    public Tuple(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T fst() {
        return first;
    }

    public U snd() {
        return second;
    }


    public static void main(String[] args) {
        String foo = "nice";
        int bar = 69;
        Tuple<String,Integer> tuple = new Tuple(foo, bar);
        System.out.println(tuple.fst());
        System.out.println(tuple.snd());

    }


}

