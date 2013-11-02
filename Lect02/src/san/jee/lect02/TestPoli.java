package san.jee.lect02;

public class TestPoli {

  public static void bar( T obj) {
    obj.foo();
    
    obj = T.create();
  }
  
  public static void main(final String[] args) {
    T obj = T.create();
    bar(new S(null));

  }

}
