package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public interface Function<T> {
    // public ... apply(...);
    // public ... compose(...);

    public T compose(T t);

}
