import java.util.ArrayList;
import java.util.List;

public final class bu
{
  public final bv<?> a;
  
  bu(bv<?> parambv)
  {
    this.a = parambv;
  }
  
  public final int a()
  {
    ArrayList localArrayList = this.a.d.b;
    if (localArrayList == null) {
      return 0;
    }
    return localArrayList.size();
  }
  
  public final List<bk> a(List<bk> paramList)
  {
    if (this.a.d.b == null) {
      return null;
    }
    paramList.addAll(this.a.d.b);
    return paramList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bu
 * JD-Core Version:    0.7.0.1
 */