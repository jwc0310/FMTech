import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class kbf
  implements kbe
{
  private static final int b = Math.max(1, -1 + Runtime.getRuntime().availableProcessors());
  public final Context a_;
  final Handler c = new Handler(Looper.getMainLooper(), new kbg(this));
  final HashMap<kba, kaz> d = new HashMap();
  public kbl e;
  private final ExecutorService f;
  private final kbj g = new kbj(this);
  
  public kbf(Context paramContext)
  {
    this.a_ = paramContext;
    this.f = Executors.newFixedThreadPool(b, new kbh(this));
  }
  
  public final void a(kaz paramkaz, int paramInt)
  {
    this.c.sendMessage(this.c.obtainMessage(0, paramInt, 0, paramkaz));
  }
  
  public void a(kaz paramkaz, int paramInt1, int paramInt2)
  {
    this.c.sendMessage(this.c.obtainMessage(2, paramInt1, paramInt2, paramkaz));
  }
  
  public final void a(kaz paramkaz, int paramInt, Object paramObject)
  {
    this.c.sendMessage(this.c.obtainMessage(1, paramInt, 0, new kbk(paramkaz, paramObject)));
  }
  
  public final void a(kaz paramkaz, Object paramObject)
  {
    this.f.execute(new kbi(this, paramkaz, paramObject));
  }
  
  final boolean a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      kaz localkaz4 = (kaz)paramMessage.obj;
      localkaz4.q = paramMessage.arg1;
      localkaz4.p();
      continue;
      kaz localkaz3 = (kaz)paramMessage.obj;
      localkaz3.q = paramMessage.arg1;
      localkaz3.r = paramMessage.arg2;
      localkaz3.p();
      continue;
      kbk localkbk = (kbk)paramMessage.obj;
      kaz localkaz2 = localkbk.a;
      localkaz2.p = localkbk.b;
      localkaz2.q = paramMessage.arg1;
      localkaz2.p();
      continue;
      kaz localkaz1 = (kaz)paramMessage.obj;
      localkaz1.s = paramMessage.arg1;
      localkaz1.p();
      continue;
      ((kaz)paramMessage.obj).b(this.g);
    }
  }
  
  public final void b(kaz paramkaz, int paramInt)
  {
    this.c.sendMessage(this.c.obtainMessage(3, paramInt, 0, paramkaz));
  }
  
  public final void c(kaz paramkaz)
  {
    kba localkba = paramkaz.o;
    if (a(localkba) != null) {
      return;
    }
    if (paramkaz.t)
    {
      String str = String.valueOf(localkba);
      new StringBuilder(21 + String.valueOf(str).length()).append("Preloading resource: ").append(str);
    }
    this.d.put(localkba, paramkaz);
    a(paramkaz, this.g);
  }
  
  public final void d(kaz paramkaz)
  {
    paramkaz.b(this.g);
    kba localkba = paramkaz.o;
    if (localkba != null) {
      this.d.remove(localkba);
    }
  }
  
  public final Context r()
  {
    return this.a_;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbf
 * JD-Core Version:    0.7.0.1
 */