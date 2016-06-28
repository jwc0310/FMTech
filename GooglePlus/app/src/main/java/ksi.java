import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class ksi
  implements gxd
{
  private Map<Class<? extends gwv>, ksj<? extends gwv>> a = new HashMap();
  private final kqy b;
  private final kqz c;
  private final int d;
  
  public ksi(Context paramContext)
  {
    if (efj.b(efj.K(paramContext))) {}
    for (int i = 3;; i = 2)
    {
      this.d = i;
      this.b = new kqy();
      this.c = ((kqz)mbb.a(paramContext, kqz.class));
      List localList = mbb.c(paramContext, ksj.class);
      for (int j = 0; j < localList.size(); j++)
      {
        ksj localksj = (ksj)localList.get(j);
        this.a.put(localksj.a(), localksj);
      }
    }
  }
  
  public final void a(Context paramContext, gwv paramgwv, Bundle paramBundle)
  {
    if (!this.a.containsKey(paramgwv.getClass())) {
      return;
    }
    kqy.a(paramContext, paramgwv, paramBundle);
    kqy.a(paramContext, paramBundle);
  }
  
  public final boolean a(gwv paramgwv, Bundle paramBundle)
  {
    ksj localksj = (ksj)this.a.get(paramgwv.getClass());
    if (localksj == null) {
      return false;
    }
    int i = kqy.b(paramBundle);
    String str1 = "SOCIAL";
    Locale localLocale;
    Object[] arrayOfObject;
    switch (i)
    {
    default: 
      String str2 = kqy.a(paramBundle);
      mja localmja = new mja();
      localmja.a = new qof();
      localmja.a.b = i;
      localmja.a.a = this.d;
      localmja.a.c = 2;
      localksj.a(paramgwv, localmja, paramBundle);
      this.c.a(str2, str1, localmja, paramBundle);
      if (Log.isLoggable("SocialExtensionHandler", 3))
      {
        String.format(Locale.US, "SocialExtension: %s", new Object[] { localmja });
        localLocale = Locale.US;
        arrayOfObject = new Object[2];
        arrayOfObject[0] = paramgwv.toString();
        if (str2 == null) {
          break label258;
        }
      }
      break;
    }
    label258:
    for (boolean bool = true;; bool = false)
    {
      arrayOfObject[1] = Boolean.valueOf(bool);
      String.format(localLocale, "Handled event: %s signed-in: %b", arrayOfObject);
      return true;
      str1 = "PHOTOS";
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ksi
 * JD-Core Version:    0.7.0.1
 */