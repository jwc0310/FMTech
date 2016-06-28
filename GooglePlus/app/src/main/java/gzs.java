import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.libraries.social.async.BackgroundTaskService;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class gzs
  implements gzg, gzh
{
  private static final ThreadFactory f;
  private static final Executor g;
  final Context a;
  final Intent b;
  gzy c;
  gzf d;
  final Runnable e = new gzt(this);
  
  static
  {
    gzu localgzu = new gzu();
    f = localgzu;
    g = Executors.newCachedThreadPool(localgzu);
  }
  
  gzs(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.b = new Intent(this.a, BackgroundTaskService.class);
    this.d = new gzx();
  }
  
  public final void a()
  {
    if (this.c == null) {
      this.c = ((gzy)mbb.a(this.a, gzy.class));
    }
    for (;;)
    {
      gzf localgzf = (gzf)this.c.d.poll();
      if (localgzf == null) {
        break;
      }
      localgzf.g = this;
      g.execute(pdt.a(new gzv(this, localgzf)));
    }
    this.a.startService(this.b);
  }
  
  public final void a(gzf paramgzf, hae paramhae)
  {
    this.c.e.post(pdt.a(new gzw(this, paramgzf, paramhae)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzs
 * JD-Core Version:    0.7.0.1
 */