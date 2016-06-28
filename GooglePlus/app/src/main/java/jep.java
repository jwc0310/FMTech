import java.util.ArrayList;
import java.util.List;

public final class jep<T>
{
  final List<jer<? super T>> a = new ArrayList();
  private final ky<List<jer<? super T>>> b;
  
  public jep()
  {
    jxs localjxs = jxr.a;
    this.b = new jxp(new kz(20), localjxs);
  }
  
  public final void a(T paramT)
  {
    List localList = (List)this.b.a();
    localList.addAll(this.a);
    int i = localList.size();
    for (int j = 0; j < i; j++)
    {
      jer localjer = (jer)localList.get(j);
      if (this.a.contains(localjer)) {
        localjer.a_(paramT);
      }
    }
    this.b.a(localList);
  }
  
  public final void a(jer<? super T> paramjer)
  {
    if (!this.a.contains(paramjer)) {
      this.a.add(paramjer);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jep
 * JD-Core Version:    0.7.0.1
 */