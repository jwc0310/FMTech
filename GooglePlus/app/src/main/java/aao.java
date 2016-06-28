import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class aao
{
  public static final boolean a = Log.isLoggable("MediaRouter", 3);
  public static aas b;
  final Context c;
  final ArrayList<aaq> d = new ArrayList();
  
  aao(Context paramContext)
  {
    this.c = paramContext;
  }
  
  public static aao a(Context paramContext)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context must not be null");
    }
    a();
    if (b == null)
    {
      aas localaas = new aas(paramContext.getApplicationContext());
      b = localaas;
      localaas.g = new abq(localaas.a, localaas);
      abq localabq = localaas.g;
      if (!localabq.c)
      {
        localabq.c = true;
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        localIntentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        localIntentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        localIntentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        localIntentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        localIntentFilter.addDataScheme("package");
        localabq.a.registerReceiver(localabq.d, localIntentFilter, null, localabq.b);
        localabq.b.post(localabq.e);
      }
    }
    return b.a(paramContext);
  }
  
  public static void a()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }
  }
  
  public static boolean a(aam paramaam, int paramInt)
  {
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    a();
    return b.a(paramaam, paramInt);
  }
  
  static <T> boolean a(T paramT1, T paramT2)
  {
    return (paramT1 == paramT2) || ((paramT1 != null) && (paramT2 != null) && (paramT1.equals(paramT2)));
  }
  
  private final int b(aap paramaap)
  {
    int i = this.d.size();
    for (int j = 0; j < i; j++) {
      if (((aaq)this.d.get(j)).b == paramaap) {
        return j;
      }
    }
    return -1;
  }
  
  public final void a(aam paramaam, aap paramaap, int paramInt)
  {
    int i = 1;
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (paramaap == null) {
      throw new IllegalArgumentException("callback must not be null");
    }
    a();
    if (a) {
      new StringBuilder("addCallback: selector=").append(paramaam).append(", callback=").append(paramaap).append(", flags=").append(Integer.toHexString(paramInt));
    }
    int j = b(paramaap);
    aaq localaaq;
    if (j < 0)
    {
      localaaq = new aaq(this, paramaap);
      this.d.add(localaaq);
      if ((paramInt & (0xFFFFFFFF ^ localaaq.d)) == 0) {
        break label240;
      }
      localaaq.d = (paramInt | localaaq.d);
    }
    label240:
    for (int k = i;; k = 0)
    {
      aam localaam = localaaq.c;
      boolean bool = false;
      if (paramaam != null)
      {
        localaam.a();
        paramaam.a();
        bool = localaam.b.containsAll(paramaam.b);
      }
      if (!bool) {
        localaaq.c = new aan(localaaq.c).a(paramaam).a();
      }
      for (;;)
      {
        if (i != 0) {
          b.c();
        }
        return;
        localaaq = (aaq)this.d.get(j);
        break;
        i = k;
      }
    }
  }
  
  public final void a(aap paramaap)
  {
    if (paramaap == null) {
      throw new IllegalArgumentException("callback must not be null");
    }
    a();
    if (a) {
      new StringBuilder("removeCallback: callback=").append(paramaap);
    }
    int i = b(paramaap);
    if (i >= 0)
    {
      this.d.remove(i);
      b.c();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aao
 * JD-Core Version:    0.7.0.1
 */