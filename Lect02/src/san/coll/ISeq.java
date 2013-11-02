package san.coll;

public interface ISeq {

  Object first();

  ISeq rest();
  
  ISeq cons(Object obj);

  boolean isEmpty();
  
  ISeq interpose(String separator, ISeq seq); 

}
