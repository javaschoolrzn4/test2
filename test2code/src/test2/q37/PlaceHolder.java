package test2.q37;

public class PlaceHolder<K, V> { //1
    private K k;
    private V v;
    public PlaceHolder(K k, V v){ //2
        this.k = k;
        this.v = v;
    }
    public K getK() { return k; }
    public static <X> PlaceHolder<X, X> getDuplicateHolder(X x){ //3
        return new PlaceHolder<X, X>(x, x); //4
    }

}
//    Which line will cause compilation failure?
//        Select 1 option:
//        A. 1
//        B. 2
//        C. 3
//        D. 4
//        E. Some other unnumbered line.
//       !F. There is no problem with the code.
