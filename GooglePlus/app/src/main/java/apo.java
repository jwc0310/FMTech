import android.content.Context;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class apo
{
  private static final Map<Integer, apo> a = new HashMap();
  private EnumMap<apn, kq<Long, apm>> b = new EnumMap(apn.class);
  
  private apo()
  {
    this.b.put(apn.a, new kq(500));
    this.b.put(apn.b, new kq(10));
  }
  
  public static apo a(int paramInt)
  {
    try
    {
      apo localapo = (apo)a.get(Integer.valueOf(paramInt));
      if (localapo == null)
      {
        localapo = new apo();
        a.put(Integer.valueOf(paramInt), localapo);
      }
      return localapo;
    }
    finally {}
  }
  
  public final apm a(long paramLong, apn paramapn)
  {
    return (apm)((kq)this.b.get(paramapn)).a(Long.valueOf(paramLong));
  }
  
  public final apm a(Context paramContext, int paramInt, long paramLong, apn paramapn)
  {
    apm localapm = apk.a(paramContext, paramInt, Long.valueOf(paramLong), paramapn);
    a(localapm);
    return localapm;
  }
  
  public final void a(apm paramapm)
  {
    if (paramapm == null) {
      return;
    }
    if (paramapm.a == apn.b)
    {
      apm localapm = new apm(apn.a, paramapm.b, paramapm.c, paramapm.d, paramapm.e, paramapm.f, null);
      ((kq)this.b.get(apn.a)).a(Long.valueOf(localapm.b), localapm);
    }
    ((kq)this.b.get(paramapm.a)).a(Long.valueOf(paramapm.b), paramapm);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apo
 * JD-Core Version:    0.7.0.1
 */