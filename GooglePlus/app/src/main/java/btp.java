import android.net.Uri;
import android.net.Uri.Builder;

final class btp
  extends bts
{
  private final String d;
  
  public btp(btl parambtl, int paramInt, String paramString)
  {
    super(parambtl, paramInt);
    this.d = paramString;
  }
  
  protected final String[] d()
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = this.d;
    arrayOfString[1] = Integer.toString(4);
    return arrayOfString;
  }
  
  protected final String h()
  {
    return "Clusters";
  }
  
  protected final Uri i()
  {
    String str = jrf.a(0, new String[] { this.e.a.a(this.e.k.a).b("gaia_id") });
    return jrf.a.buildUpon().appendEncodedPath(str).build();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btp
 * JD-Core Version:    0.7.0.1
 */