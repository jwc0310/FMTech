import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.HashMap;

final class geb
{
  private static geb b;
  final gdi<rhg, gdy> a;
  
  private geb(geh paramgeh, Application paramApplication, gdh paramgdh)
  {
    if (paramgeh == null) {
      throw new NullPointerException();
    }
    if (paramApplication == null) {
      throw new NullPointerException();
    }
    this.a = new gdo(new gdz(), paramgeh, new gea(), paramgdh, paramApplication.getPackageName(), gdn.b);
    Collections.synchronizedMap(new HashMap());
  }
  
  static geb a(geh paramgeh, Application paramApplication, gdh paramgdh)
  {
    try
    {
      if (b != null) {
        break label52;
      }
      if (paramgeh == null) {
        throw new NullPointerException();
      }
    }
    finally {}
    if (paramApplication == null) {
      throw new NullPointerException();
    }
    b = new geb(paramgeh, paramApplication, paramgdh);
    label52:
    geb localgeb = b;
    return localgeb;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     geb
 * JD-Core Version:    0.7.0.1
 */