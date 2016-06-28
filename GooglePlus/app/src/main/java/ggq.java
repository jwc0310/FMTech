import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import java.util.Iterator;
import java.util.List;

public abstract class ggq
{
  FilterParameter a;
  List<Integer> b;
  
  public int a()
  {
    return this.b.size();
  }
  
  public abstract CharSequence a(int paramInt);
  
  public void a(FilterParameter paramFilterParameter, List<Integer> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      if (!paramFilterParameter.a(((Integer)localIterator.next()).intValue())) {
        throw new IllegalArgumentException("Not all the adjustable parameters are present within the filter parameter keys!");
      }
    }
    this.a = paramFilterParameter;
    this.b = paramList;
  }
  
  public int b()
  {
    return h(this.a.getActiveParameterKey());
  }
  
  public abstract CharSequence b(int paramInt);
  
  public Object c(int paramInt)
  {
    return Float.valueOf(this.a.b(g(paramInt)));
  }
  
  public Object d(int paramInt)
  {
    return Float.valueOf(this.a.c(g(paramInt)));
  }
  
  public Object e(int paramInt)
  {
    return this.a.getParameterValue(g(paramInt));
  }
  
  public boolean f(int paramInt)
  {
    return (paramInt >= 0) && (paramInt < this.b.size());
  }
  
  public int g(int paramInt)
  {
    if (f(paramInt)) {
      return ((Integer)this.b.get(paramInt)).intValue();
    }
    return -1;
  }
  
  public int h(int paramInt)
  {
    return this.b.indexOf(Integer.valueOf(paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggq
 * JD-Core Version:    0.7.0.1
 */