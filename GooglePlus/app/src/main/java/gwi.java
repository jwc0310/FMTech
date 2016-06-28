import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public class gwi
  implements Handler.Callback, Runnable
{
  final Set<gwf> a;
  final Executor b;
  private final Context c;
  private final Handler d;
  
  public gwi(Context paramContext)
  {
    this(paramContext, AsyncTask.THREAD_POOL_EXECUTOR);
  }
  
  private gwi(Context paramContext, Executor paramExecutor)
  {
    efj.e(paramContext, "context must be non-null");
    this.c = paramContext;
    this.d = new Handler(Looper.getMainLooper(), this);
    this.a = Collections.synchronizedSet(new HashSet());
    this.b = paramExecutor;
  }
  
  private final void a(Collection<gvq> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      gvq localgvq = (gvq)localIterator.next();
      gvt localgvt = new gwn(this.c, localgvq.a).c(localgvq);
      this.d.dispatchMessage(this.d.obtainMessage(1, localgvt));
    }
  }
  
  public final void a(gvq paramgvq)
  {
    HashSet localHashSet = new HashSet();
    for (;;)
    {
      gvq localgvq;
      int i;
      synchronized (this.a)
      {
        Iterator localIterator = this.a.iterator();
        if (!localIterator.hasNext()) {
          break label163;
        }
        gwf localgwf = (gwf)localIterator.next();
        localgvq = localgwf.b;
        if (localgvq.a != paramgvq.a)
        {
          i = 0;
          if (i == 0) {
            continue;
          }
          localgwf.c = false;
          localHashSet.add(localgwf.b);
        }
      }
      if ((localgvq.b != null) && (!localgvq.b.equals(paramgvq.b)))
      {
        i = 0;
      }
      else if ((localgvq.c != -1L) && (localgvq.c != paramgvq.c))
      {
        i = 0;
        continue;
        label163:
        a(localHashSet);
      }
      else
      {
        i = 1;
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      gvt localgvt = (gvt)paramMessage.obj;
      synchronized (this.a)
      {
        Iterator localIterator = this.a.iterator();
        while (localIterator.hasNext())
        {
          gwf localgwf = (gwf)localIterator.next();
          if (localgwf.b.equals(localgvt.a)) {
            localgwf.a.a(localgvt);
          }
        }
      }
      return true;
    }
    return false;
  }
  
  public void run()
  {
    HashSet localHashSet = new HashSet();
    synchronized (this.a)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        gwf localgwf = (gwf)localIterator.next();
        if (localgwf.c)
        {
          localgwf.c = false;
          localHashSet.add(localgwf.b);
        }
      }
    }
    a(localHashSet);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwi
 * JD-Core Version:    0.7.0.1
 */