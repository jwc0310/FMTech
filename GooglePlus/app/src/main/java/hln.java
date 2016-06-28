import android.content.Context;
import android.os.Bundle;

public final class hln
  extends gzf
{
  private final int a;
  private final boolean b;
  
  public hln(int paramInt, boolean paramBoolean)
  {
    super("ReadCollectorSettingsTask");
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  protected final hae a(Context paramContext)
  {
    hkm localhkm = new hkm(paramContext, new kch().a(paramContext, this.a).a());
    localhkm.i();
    hae localhae1 = new hae(localhkm.o, localhkm.q, null);
    localhae1.a().putBoolean("trigger_follow_state_update", this.b);
    if (localhkm.n()) {
      return localhae1;
    }
    if (localhkm.x) {}
    mzk localmzk;
    for (qat localqat = localhkm.w;; localqat = null)
    {
      localmzk = (mzk)localqat;
      if ((localmzk.a != null) && (localmzk.a.a != null)) {
        break;
      }
      hae localhae2 = new hae(0, null, null);
      localhae2.a().putBoolean("trigger_follow_state_update", this.b);
      return localhae2;
    }
    hot localhot = (hot)mbb.a(paramContext, hot.class);
    if (localmzk.a.a.a == 2) {
      localhot.c(this.a);
    }
    localhot.a(this.a, localmzk.a.a.c);
    return localhae1;
  }
  
  public final String b(Context paramContext)
  {
    if (this.b) {}
    for (int i = efj.In;; i = efj.Io) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hln
 * JD-Core Version:    0.7.0.1
 */