import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public final class iig
  implements gqh
{
  private final gxr a;
  
  public iig(iic paramiic, gxr paramgxr)
  {
    this.a = paramgxr;
  }
  
  public final boolean a(Activity paramActivity)
  {
    if (this.a != null)
    {
      Context localContext = this.b.b;
      new gwz(4, this.a).b(localContext);
    }
    iic localiic = this.b;
    if (localiic.h == null)
    {
      Intent localIntent = localiic.d.b();
      if (localIntent == null) {
        throw new NullPointerException();
      }
      localiic.h = ((Intent)localIntent);
      String str1 = localiic.d.a();
      if (str1 == null) {
        throw new NullPointerException();
      }
      localiic.g = ((String)str1);
      if (localiic.e == null) {
        break label154;
      }
      String str2 = localiic.e.a();
      if (str2 == null) {
        throw new NullPointerException();
      }
      localiic.j = ((String)str2);
      localiic.a();
    }
    for (;;)
    {
      return true;
      label154:
      localiic.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iig
 * JD-Core Version:    0.7.0.1
 */