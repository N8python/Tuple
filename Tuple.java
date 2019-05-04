import java.util.function.*;
class Tuple<T, U> {
  protected T val0;
  protected U val1;
  public Tuple(T val0, U val1){
    this.val0 = val0;
    this.val1 = val1;
  };
  public T v0(){
    return val0;
  }
  public U v1(){
    return val1;
  }
  public Tuple<T, U> add(Tuple<T, U> tup, BiFunction<T, T, T> firstAdder, BiFunction<U, U, U> secondAdder){
    return new Tuple(firstAdder.apply(val0, tup.v0()), secondAdder.apply(val1, tup.v1()));
  }
}
