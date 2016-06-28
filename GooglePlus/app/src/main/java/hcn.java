import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

final class hcn
  extends Handler
{
  hcn(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (hcl.a == null) {}
    hcl localhcl;
    List localList;
    int i;
    do
    {
      do
      {
        return;
        switch (paramMessage.what)
        {
        default: 
          int m = paramMessage.what;
          throw new AssertionError(28 + "unknown message: " + m);
        case 4: 
          if ((paramMessage.obj instanceof Cursor))
          {
            hcl.a.d.a((Cursor)paramMessage.obj);
            return;
          }
          hcl.a.d.a(null);
          return;
        case 1: 
          hcl.a.b(((Integer)paramMessage.obj).intValue());
          return;
        case 2: 
          localhcl = hcl.a;
          localList = ((hba)mbb.a(localhcl.b, hba.class)).e();
        }
      } while (localList.isEmpty());
      Iterator localIterator1 = localList.iterator();
      i = 0;
      while (localIterator1.hasNext())
      {
        int k = ((Integer)localIterator1.next()).intValue();
        i += hbm.b(localhcl.c, k, 40);
      }
    } while (i != 0);
    Iterator localIterator2 = localList.iterator();
    while (localIterator2.hasNext())
    {
      int j = ((Integer)localIterator2.next()).intValue();
      Message.obtain(localhcl.e, 1, Integer.valueOf(j)).sendToTarget();
    }
    hcl.a.a(((Integer)paramMessage.obj).intValue());
    return;
    hcl.a.b();
    return;
    hcl.a.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcn
 * JD-Core Version:    0.7.0.1
 */