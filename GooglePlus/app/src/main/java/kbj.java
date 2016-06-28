import android.os.Handler;
import java.util.HashMap;

final class kbj
  implements kbb
{
  kbj(kbf paramkbf) {}
  
  public final void a(kaz paramkaz)
  {
    if (paramkaz.q == 2) {
      return;
    }
    kbf localkbf = this.a;
    kba localkba = paramkaz.o;
    if (paramkaz.t)
    {
      String str = String.valueOf(localkba);
      new StringBuilder(30 + String.valueOf(str).length()).append("Finished preloading resource: ").append(str);
    }
    localkbf.d.remove(localkba);
    localkbf.c.sendMessage(localkbf.c.obtainMessage(4, paramkaz));
  }
  
  public final void ap_() {}
  
  public final void b() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbj
 * JD-Core Version:    0.7.0.1
 */