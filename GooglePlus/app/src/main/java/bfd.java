import android.os.Handler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bfd
{
  public static final aip a = new bfb();
  public static final aip b = new bfb();
  final Set<bfh> c = new HashSet();
  public final Set<aip> d = new HashSet();
  public final Set<aip> e = new HashSet();
  public final Set<aip> f = new HashSet();
  public final Runnable g = new bfe(this);
  private final Map<aip, Set<bfg>> h = new HashMap();
  
  private final boolean b(aip paramaip)
  {
    Set localSet = (Set)this.h.get(paramaip);
    return (localSet != null) && (!localSet.isEmpty());
  }
  
  public final void a(aip paramaip)
  {
    if (!b(paramaip)) {
      return;
    }
    bff localbff = new bff(this, (Set)this.h.get(paramaip), paramaip);
    efj.m().post(localbff);
  }
  
  public final void a(aip paramaip, bfg parambfg)
  {
    Object localObject = (Set)this.h.get(paramaip);
    if (localObject == null)
    {
      localObject = new HashSet();
      this.h.put(paramaip, localObject);
    }
    ((Set)localObject).add(parambfg);
  }
  
  public final void a(aip paramaip, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (boolean bool = this.e.add(paramaip);; bool = this.e.remove(paramaip))
    {
      if (bool)
      {
        Runnable localRunnable = this.g;
        efj.m().post(localRunnable);
      }
      return;
    }
  }
  
  public final void b(aip paramaip, bfg parambfg)
  {
    if (!b(paramaip)) {
      return;
    }
    ((Set)this.h.get(paramaip)).remove(parambfg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfd
 * JD-Core Version:    0.7.0.1
 */