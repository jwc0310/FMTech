import android.content.Context;
import android.os.Bundle;

final class imp
  extends gzf
{
  private final gjm a;
  
  public imp(String paramString, gjm paramgjm)
  {
    super(paramString);
    this.a = paramgjm;
  }
  
  protected final hae a(Context paramContext)
  {
    try
    {
      gjj[] arrayOfgjj = this.a.a();
      String[] arrayOfString = new String[arrayOfgjj.length];
      for (int i = 0; i < arrayOfString.length; i++) {
        arrayOfString[i] = arrayOfgjj[i].a;
      }
      hae localhae = new hae(true);
      localhae.a().putStringArray("account_name_array", arrayOfString);
      return localhae;
    }
    catch (gjo localgjo) {}
    return new hae(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imp
 * JD-Core Version:    0.7.0.1
 */