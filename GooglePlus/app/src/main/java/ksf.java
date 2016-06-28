import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;

final class ksf
  implements gxd
{
  private final kqy a = new kqy();
  private final frj b;
  
  ksf(Context paramContext)
  {
    this.b = ((frj)mbb.a(paramContext, frj.class));
  }
  
  public final void a(Context paramContext, gwv paramgwv, Bundle paramBundle)
  {
    if (!(paramgwv instanceof kpw)) {
      return;
    }
    kqy.a(paramContext, paramgwv, paramBundle);
  }
  
  public final boolean a(gwv paramgwv, Bundle paramBundle)
  {
    if (!(paramgwv instanceof kpw)) {
      return false;
    }
    String str = kqy.a(paramBundle);
    this.b.a("CRONET_SOCIAL", str, 0, ((kpw)paramgwv).a);
    if (Log.isLoggable("CronetHistogramHandler", 3))
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramgwv.toString();
      String.format(localLocale, "Handled event: %s", arrayOfObject);
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ksf
 * JD-Core Version:    0.7.0.1
 */