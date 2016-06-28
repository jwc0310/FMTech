import android.content.Context;
import android.os.Bundle;

public final class bmy
  extends gzf
{
  private final int a;
  private final bic b;
  private final String c;
  
  public bmy(Context paramContext, int paramInt, bic parambic, String paramString)
  {
    super(paramContext, "CreateShareByLinkTask");
    this.a = paramInt;
    this.b = parambic;
    this.c = paramString;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    kbu localkbu = (kbu)mbb.a(localContext, kbu.class);
    bib localbib = new bib(localContext, this.a, this.b);
    localkbu.a(localbib);
    if (!localbib.n()) {}
    for (boolean bool = true;; bool = false)
    {
      hae localhae = new hae(bool);
      if (bool) {
        localhae.a().putString("link", localbib.a);
      }
      return localhae;
    }
  }
  
  public final String b()
  {
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmy
 * JD-Core Version:    0.7.0.1
 */