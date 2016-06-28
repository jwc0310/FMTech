import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class mbv<T extends mbu>
{
  private final Context a;
  private final Class b;
  private HashMap<Class, List<T>> c;
  
  public mbv(Context paramContext, Class paramClass)
  {
    this.a = paramContext;
    this.b = paramClass;
  }
  
  private final void a()
  {
    try
    {
      if (this.c == null)
      {
        this.c = new HashMap();
        Iterator localIterator = mbb.c(this.a, this.b).iterator();
        while (localIterator.hasNext())
        {
          mbu localmbu = (mbu)localIterator.next();
          Class localClass = localmbu.a();
          Object localObject2 = (List)this.c.get(localClass);
          if (localObject2 == null)
          {
            localObject2 = new ArrayList();
            this.c.put(localClass, localObject2);
          }
          ((List)localObject2).add(localmbu);
        }
      }
    }
    finally {}
  }
  
  public final List<T> a(Class paramClass)
  {
    try
    {
      a();
      List localList = (List)this.c.get(paramClass);
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbv
 * JD-Core Version:    0.7.0.1
 */