import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class mbj<K, T extends mbi<K>>
{
  public final HashMap<K, T> a = new HashMap();
  
  public mbj(Context paramContext)
  {
    this(paramContext, lll.class);
  }
  
  public mbj(Context paramContext, byte paramByte)
  {
    this(paramContext, llm.class);
  }
  
  public mbj(Context paramContext, Class<T> paramClass)
  {
    Iterator localIterator = mbb.c(paramContext, paramClass).iterator();
    while (localIterator.hasNext())
    {
      mbi localmbi = (mbi)localIterator.next();
      Object localObject = localmbi.a();
      if (localObject == null) {
        throw new IllegalArgumentException("Extension key must not be null");
      }
      if (this.a.put(localObject, localmbi) != null) {
        throw new IllegalArgumentException("Instantiating multiple extensions with the same key");
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbj
 * JD-Core Version:    0.7.0.1
 */