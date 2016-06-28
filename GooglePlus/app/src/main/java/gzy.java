import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class gzy
{
  final Context a;
  final SparseArray<gzj> b;
  public final List<gzf> c;
  final Queue<gzf> d;
  final Handler e;
  final gzp f;
  int g;
  private final gzh h;
  
  gzy(Context paramContext)
  {
    this.a = paramContext;
    this.b = new SparseArray();
    this.c = new ArrayList();
    this.d = new LinkedBlockingQueue();
    this.e = new Handler(Looper.getMainLooper());
    this.f = new gzp(paramContext, "background_results.bin");
    this.g = PreferenceManager.getDefaultSharedPreferences(this.a).getInt("bom_last_listener_id", 0);
    this.h = ((gzh)mbb.a(paramContext, gzh.class));
  }
  
  public final int a(gzj paramgzj, String paramString)
  {
    efj.k();
    int i = paramgzj.c.b;
    int j = this.c.size();
    int k = 0;
    int m = 0;
    if (k < j)
    {
      gzf localgzf = (gzf)this.c.get(k);
      if ((localgzf.h != i) || (!localgzf.f.equals(paramString))) {
        break label91;
      }
    }
    label91:
    for (int n = m + 1;; n = m)
    {
      k++;
      m = n;
      break;
      return m;
    }
  }
  
  public final void a(gzf paramgzf, gzj paramgzj)
  {
    efj.k();
    paramgzf.f();
    int i = 0;
    if (paramgzj != null) {
      i = paramgzj.c.b;
    }
    paramgzf.h = i;
    this.c.add(paramgzf);
    this.d.add(paramgzf);
    this.h.a();
    if (Log.isLoggable("BackgroundTask", 3))
    {
      String str = String.valueOf(paramgzf.f);
      new StringBuilder(45 + String.valueOf(str).length()).append("Start background task: ").append(str).append(", manager: ").append(i);
    }
  }
  
  final boolean a()
  {
    return !this.c.isEmpty();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzy
 * JD-Core Version:    0.7.0.1
 */