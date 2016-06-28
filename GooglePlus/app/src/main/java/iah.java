import android.os.Build.VERSION;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class iah
{
  static final Set<iag<?>> a = Collections.newSetFromMap(new WeakHashMap());
  
  public static void a()
  {
    
    if (Build.VERSION.SDK_INT < 14) {
      a(80);
    }
  }
  
  public static void a(int paramInt)
  {
    efj.k();
    new StringBuilder(28).append("Trimming memory: ").append(paramInt);
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((iag)localIterator.next()).a(paramInt);
    }
  }
  
  static void a(iag<?> paramiag)
  {
    if (efj.j())
    {
      a.add(paramiag);
      return;
    }
    iai localiai = new iai(paramiag);
    efj.m().post(localiai);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iah
 * JD-Core Version:    0.7.0.1
 */