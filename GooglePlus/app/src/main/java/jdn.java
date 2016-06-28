import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public final class jdn
  extends kde<mxf, mxg>
{
  private static final String a = jdr.a(jdn.class);
  private final int b;
  private final giz c;
  private final ArrayList<mjd> d;
  private final jan e;
  
  public jdn(Context paramContext, int paramInt, ArrayList<mjd> paramArrayList, jan paramjan)
  {
    super(paramContext, new kcg(paramContext, paramInt), "notificationsack", new mxf(), new mxg());
    this.d = paramArrayList;
    this.e = paramjan;
    this.b = paramInt;
    this.c = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final long a(long paramLong)
  {
    try
    {
      long l1 = this.c.a(this.b).a("NotificationsAckOperationTag", 0L);
      long l2 = Math.max(l1, paramLong);
      this.c.b(this.b).b("NotificationsAckOperationTag", l2).d();
      String str = a;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(this.b);
      arrayOfObject[1] = Long.valueOf(l1);
      arrayOfObject[2] = Long.valueOf(paramLong);
      jdr.b(str, String.format("lastAckVersion with Account Id %d is: %d. maxAckVersion from MonitorPayloads is: %d", arrayOfObject));
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static long a(ArrayList<mjy> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    long l2;
    for (long l1 = 0L; localIterator.hasNext(); l1 = l2)
    {
      mka localmka = (mka)((mjy)localIterator.next()).b(mka.a);
      if (localmka != null)
      {
        mjz[] arrayOfmjz = localmka.b;
        int i = arrayOfmjz.length;
        l2 = l1;
        int j = 0;
        while (j < i)
        {
          long l3 = Math.max(arrayOfmjz[j].a.longValue(), l2);
          j++;
          l2 = l3;
        }
      }
      l2 = l1;
    }
    return l1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdn
 * JD-Core Version:    0.7.0.1
 */