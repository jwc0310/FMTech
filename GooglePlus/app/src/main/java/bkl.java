import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class bkl
  extends cun<mxf, mxg>
{
  private final int a;
  private final giz b;
  private final ArrayList<mjk> c;
  private final brm d;
  
  public bkl(Context paramContext, int paramInt, ArrayList<mjk> paramArrayList, brm parambrm)
  {
    super(paramContext, paramInt, "notificationsack", new mxf(), new mxg());
    this.c = paramArrayList;
    this.d = parambrm;
    this.a = paramInt;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final long a(long paramLong)
  {
    try
    {
      long l1 = this.b.a(this.a).a("NotificationsAckOperationTag", 0L);
      long l2 = Math.max(l1, paramLong);
      this.b.b(this.a).b("NotificationsAckOperationTag", l2).d();
      if (Log.isLoggable("NotificationsAckOp", 3))
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.a);
        arrayOfObject[1] = Long.valueOf(l1);
        arrayOfObject[2] = Long.valueOf(paramLong);
        String.format("lastAckVersion with Account Id %d is: %d. maxAckVersion from MonitorPayloads is: %d", arrayOfObject);
      }
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
 * Qualified Name:     bkl
 * JD-Core Version:    0.7.0.1
 */