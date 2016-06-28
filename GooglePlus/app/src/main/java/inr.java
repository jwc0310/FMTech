import android.content.Context;
import android.os.Bundle;

final class inr
  extends gzf
{
  private final kbu a;
  private final String b;
  private final String c;
  private final obw d;
  private final ocd[] l;
  private final boolean m;
  private final boolean n;
  
  inr(Context paramContext, String paramString1, String paramString2, String paramString3, obw paramobw, ocd[] paramArrayOfocd, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext, paramString1);
    this.a = ((kbu)mbb.a(paramContext, kbu.class));
    this.b = paramString2;
    this.c = null;
    this.d = paramobw;
    this.l = null;
    this.m = paramBoolean1;
    this.n = paramBoolean2;
  }
  
  protected final hae a()
  {
    inq localinq = new inq(g(), this.b, this.c, 0, this.d, this.l, this.m, this.n);
    this.a.a(localinq);
    if (localinq.n()) {
      return new hae(localinq.o, localinq.q, localinq.p);
    }
    if (localinq.x) {}
    for (qat localqat = localinq.w;; localqat = null)
    {
      oci localoci1 = ((mws)localqat).a;
      boolean bool = efj.b(localoci1.b);
      oci localoci2 = null;
      if (!bool) {
        localoci2 = localoci1;
      }
      hae localhae = new hae(true);
      Bundle localBundle = localhae.a();
      if (localoci2 != null) {
        localBundle.putParcelable("oob_response", new hqw(localoci2));
      }
      localBundle.putBoolean("allow_non_google_accounts", this.m);
      return localhae;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     inr
 * JD-Core Version:    0.7.0.1
 */