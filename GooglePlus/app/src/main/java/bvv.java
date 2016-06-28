import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class bvv
  implements bvo
{
  private static final long a = TimeUnit.MINUTES.toMillis(10L);
  private String b;
  private b c;
  private efj d;
  private long e;
  
  bvv(Context paramContext)
  {
    this.b = efj.P(paramContext);
    this.e = SystemClock.elapsedRealtime();
    b(paramContext);
  }
  
  private final void b(Context paramContext)
  {
    if (this.b != null)
    {
      this.c = new b(this);
      Context localContext = paramContext.getApplicationContext();
      String str = this.b;
      b localb = this.c;
      Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
      if (!TextUtils.isEmpty(str)) {
        localIntent.setPackage(str);
      }
      localContext.bindService(localIntent, localb, 33);
    }
  }
  
  public final ih a(Context paramContext, efj paramefj)
  {
    if (this.d != null) {
      return new ih(this.d.a(paramefj));
    }
    b(paramContext);
    return new ih();
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final void a(Context paramContext)
  {
    if (this.e + a > SystemClock.elapsedRealtime()) {
      return;
    }
    String str = efj.P(paramContext);
    if (!mfx.a(str, this.b)) {}
    for (int i = 1;; i = 0)
    {
      this.b = str;
      this.e = SystemClock.elapsedRealtime();
      if (i == 0) {
        break;
      }
      if (this.c != null) {
        paramContext.getApplicationContext().unbindService(this.c);
      }
      b(paramContext);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvv
 * JD-Core Version:    0.7.0.1
 */