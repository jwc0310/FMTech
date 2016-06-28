import android.app.Application;
import android.content.Context;

final class gdf
{
  private static gdf b;
  final gda a;
  private final gdi<rhc, gcy> c;
  
  private gdf(geh paramgeh, Application paramApplication, gdh paramgdh)
  {
    if (paramgeh == null) {
      throw new NullPointerException();
    }
    if (paramApplication == null) {
      throw new NullPointerException();
    }
    this.c = new gdo(new gcz(), paramgeh, new gde(), paramgdh, paramApplication.getPackageName(), gdn.b);
    this.a = new gda(this.c, paramApplication);
  }
  
  static gdf a(geh paramgeh, Application paramApplication, gdh paramgdh)
  {
    try
    {
      if (b == null) {
        b = new gdf(paramgeh, paramApplication, paramgdh);
      }
      gdf localgdf = b;
      return localgdf;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gdf
 * JD-Core Version:    0.7.0.1
 */