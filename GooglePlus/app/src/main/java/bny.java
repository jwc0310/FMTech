import android.content.Context;
import android.os.Bundle;

public final class bny
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final boolean d;
  
  public bny(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, "ReadCollectionAudienceTask");
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
    blc localblc = new blc(localContext, this.a, this.b, this.c, this.d);
    localkbu.a(localblc);
    if (localblc.n()) {
      return new hae(false);
    }
    hae localhae = new hae(true);
    Bundle localBundle = localhae.a();
    localBundle.putParcelable("audience", localblc.a);
    localBundle.putParcelable("people_list", localblc.b);
    return localhae;
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.jn);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bny
 * JD-Core Version:    0.7.0.1
 */