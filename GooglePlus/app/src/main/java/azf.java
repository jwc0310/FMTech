import android.content.Context;
import android.util.Log;

final class azf
  extends gzf
{
  azf(azd paramazd, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    ptl localptl = brx.a(this.a.bn, this.a.a);
    int k;
    if (localptl != null)
    {
      if (Log.isLoggable("PhotoAutoEnhancePromo", 3))
      {
        int m = localptl.a.length;
        new StringBuilder(29).append("Number of promos: ").append(m);
      }
      ptk[] arrayOfptk = localptl.a;
      int j = arrayOfptk.length;
      k = 0;
      if (k < j) {
        if (arrayOfptk[k].a != 1) {}
      }
    }
    for (int i = 1;; i = 0)
    {
      boolean bool1 = false;
      if (i != 0)
      {
        boolean bool2 = azd.c;
        bool1 = false;
        if (!bool2) {
          bool1 = true;
        }
      }
      azd.b = bool1;
      return new hae(true);
      k++;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azf
 * JD-Core Version:    0.7.0.1
 */