import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

class frk
  implements frj
{
  boolean a;
  efd b;
  edu c;
  Handler d;
  final Runnable e = new frn(this);
  private final efo<Status> f = new fro(this);
  
  frk(Context paramContext)
  {
    this.b = new efe(paramContext).a(edu.b).a();
    this.b.a(new frl(this));
    this.b.a(new frm(this));
    this.c = new edu(paramContext, -1, null, null);
  }
  
  public void a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    if (this.d == null) {
      this.d = new Handler(Looper.myLooper());
    }
    this.d.removeCallbacks(this.e);
    edw localedw;
    synchronized (this.b)
    {
      if (!this.a)
      {
        this.b.b();
        this.a = true;
      }
      localedw = new edw(this.c, paramArrayOfByte);
      localedw.b = paramString1;
      if (paramString2 == null) {
        break label125;
      }
      if (edu.h(localedw.i)) {
        throw new IllegalArgumentException("setUploadAccountName forbidden on anonymous logger");
      }
    }
    localedw.c = paramString2;
    label125:
    if (paramInt != 0) {
      localedw.g.e = paramInt;
    }
    efd localefd2 = this.b;
    if (localedw.h) {
      throw new IllegalStateException("do not reuse LogEventBuilder");
    }
    localedw.h = true;
    edy localedy = edu.k(localedw.i);
    LogEventParcelable localLogEventParcelable = new LogEventParcelable(new PlayLoggerContext(edu.i(localedw.i), edu.j(localedw.i), localedw.a, localedw.b, localedw.c, localedw.d, edu.h(localedw.i), localedw.e), localedw.g, localedw.f, null, edu.a(null));
    localedy.a(localefd2, localLogEventParcelable).a(this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     frk
 * JD-Core Version:    0.7.0.1
 */