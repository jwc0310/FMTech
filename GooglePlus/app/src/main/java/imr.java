import android.content.Context;
import android.util.Log;

final class imr
  extends gzf
{
  private final imt a;
  
  imr(String paramString, imt paramimt)
  {
    super(paramString);
    this.a = paramimt;
  }
  
  protected final hae a(Context paramContext)
  {
    try
    {
      hae localhae = imm.a(this.a.b(imt.b()));
      return localhae;
    }
    catch (gjo localgjo)
    {
      String str = String.valueOf(localgjo);
      Log.e("LoginHelperFragment", 29 + String.valueOf(str).length() + "Device accounts load failed: " + str);
      return new hae(0, localgjo, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imr
 * JD-Core Version:    0.7.0.1
 */