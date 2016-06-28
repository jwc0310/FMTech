import android.content.Context;
import android.os.Bundle;

public final class bon
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final boolean d;
  
  public bon(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, "UpdateCollectionShareLinkTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    kbu localkbu = (kbu)mbb.a(localContext, kbu.class);
    bmm localbmm = new bmm(localContext, this.a, this.b, this.c);
    localbmm.b(this.d);
    localkbu.a(localbmm);
    hae localhae = new hae(localbmm.o, null, null);
    Bundle localBundle = localhae.a();
    localBundle.putBoolean("allow_share_via_link", this.d);
    if (!localbmm.n()) {
      localBundle.putString("album_link_url", localbmm.a);
    }
    return localhae;
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.bY);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bon
 * JD-Core Version:    0.7.0.1
 */