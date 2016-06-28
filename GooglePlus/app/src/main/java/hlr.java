import android.content.Context;
import android.os.Bundle;

public final class hlr
  extends gzf
{
  private final int a;
  private final int b;
  private final String c;
  private final int d;
  private final boolean l;
  
  public hlr(int paramInt1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean)
  {
    super("UpdateCollectorSettingsTask");
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    this.d = paramInt3;
    this.l = paramBoolean;
  }
  
  protected final hae a(Context paramContext)
  {
    ndq localndq = new ndq();
    localndq.a = this.b;
    localndq.b = this.c;
    localndq.c = this.d;
    hkq localhkq = new hkq(paramContext, new kch().a(paramContext, this.a).a(), localndq);
    localhkq.i();
    hae localhae1 = new hae(localhkq.o, localhkq.q, null);
    localhae1.a().putBoolean("trigger_follow_state_update", this.l);
    if (localhkq.n()) {
      return localhae1;
    }
    if (localhkq.x) {}
    for (qat localqat = localhkq.w; (nca)localqat == null; localqat = null)
    {
      hae localhae2 = new hae(0, null, null);
      localhae2.a().putBoolean("trigger_follow_state_update", this.l);
      return localhae2;
    }
    hot localhot = (hot)mbb.a(paramContext, hot.class);
    if (this.b == 2) {
      localhot.c(this.a);
    }
    localhot.a(this.a, this.d);
    return localhae1;
  }
  
  public final String b(Context paramContext)
  {
    if (this.l) {}
    for (int i = efj.In;; i = efj.Is) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlr
 * JD-Core Version:    0.7.0.1
 */