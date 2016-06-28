import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public final class edu
{
  public static final efc<eea> a = new efc();
  public static final eew<eez> b = new eew("ClearcutLogger.API", d, a);
  private static eex<eea, eez> d = new edv();
  private static edy e = new eeh();
  public final edy c;
  private final String f;
  private final int g;
  private String h;
  private int i = -1;
  private String j;
  private String k;
  private final boolean l;
  private int m = 0;
  private final ejr n;
  private edx o;
  
  @Deprecated
  public edu(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    this(paramContext, -1, null, null, localedy, localejr);
  }
  
  @Deprecated
  private edu(Context paramContext, int paramInt, String paramString1, String paramString2, edy paramedy, ejr paramejr)
  {
    this(paramContext, paramInt, "", paramString1, paramString2, false, paramedy, paramejr);
  }
  
  private edu(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, edy paramedy, ejr paramejr)
  {
    this.f = paramContext.getPackageName();
    this.g = a(paramContext);
    this.i = paramInt;
    this.h = paramString1;
    this.j = paramString2;
    this.k = paramString3;
    this.l = false;
    this.c = paramedy;
    this.n = paramejr;
    this.o = new edx();
    this.m = 0;
    if (this.l)
    {
      String str = this.j;
      boolean bool = false;
      if (str == null) {
        bool = true;
      }
      efj.b(bool, "can't be anonymous with an upload account");
    }
  }
  
  private static int a(Context paramContext)
  {
    try
    {
      int i1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.wtf("ClearcutLogger", "This can't happen.");
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     edu
 * JD-Core Version:    0.7.0.1
 */