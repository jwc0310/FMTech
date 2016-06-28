import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;

public final class bni
  extends gzf
{
  private static final Intent a;
  private static HashSet<String> p;
  private final int b;
  private final boolean c;
  private final kbu d;
  private final String l;
  private final String m;
  private final String n;
  private final String o;
  
  static
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    a = localIntent;
    localIntent.setData(Uri.parse("http://www.com"));
  }
  
  public bni(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramContext, "GetRedirectUrlTask");
    this.l = paramString1;
    this.b = paramInt;
    this.n = paramString2;
    this.m = paramString3;
    this.o = paramString4;
    if (p == null)
    {
      p = new HashSet();
      List localList = paramContext.getPackageManager().queryIntentActivities(a, 65536);
      int i = localList.size();
      for (int j = 0; j < i; j++) {
        p.add(((ResolveInfo)localList.get(j)).activityInfo.packageName);
      }
    }
    this.d = ((kbu)mbb.a(paramContext, kbu.class));
    bvn localbvn = (bvn)mbb.b(paramContext, bvn.class);
    if (localbvn != null)
    {
      this.c = localbvn.a();
      return;
    }
    this.c = false;
  }
  
  public static String a(hae paramhae)
  {
    return a(paramhae, "activity_id");
  }
  
  private static String a(hae paramhae, String paramString)
  {
    if (paramhae == null) {
      return null;
    }
    return paramhae.a().getString(paramString);
  }
  
  public static String b(hae paramhae)
  {
    return a(paramhae, "author_gaia_id");
  }
  
  public static String c(hae paramhae)
  {
    return a(paramhae, "creation_source_id");
  }
  
  public static String d(hae paramhae)
  {
    return a(paramhae, "redirect_url");
  }
  
  protected final hae a()
  {
    hae localhae = new hae(true);
    Bundle localBundle = localhae.a();
    localBundle.putString("activity_id", this.l);
    localBundle.putString("creation_source_id", this.n);
    localBundle.putString("author_gaia_id", this.m);
    if (this.c)
    {
      localBundle.putString("redirect_url", this.o);
      return localhae;
    }
    Uri localUri = Uri.parse(this.o);
    int i;
    switch (new dam(localUri).a)
    {
    default: 
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        break label241;
      }
      localBundle.putString("redirect_url", this.o);
      return localhae;
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(localUri);
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      List localList = this.e.getPackageManager().queryIntentActivities(localIntent, 65536);
      if (localList != null)
      {
        int j = localList.size();
        for (int k = 0;; k++)
        {
          if (k >= j) {
            break label229;
          }
          if (!p.contains(((ResolveInfo)localList.get(k)).activityInfo.packageName)) {
            break;
          }
        }
        label229:
        i = 0;
      }
      else
      {
        i = 1;
      }
    }
    label241:
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    bjn localbjn = new bjn(this.e, this.b, this.o);
    this.d.a(localbjn);
    String str;
    if (localbjn.n())
    {
      localbjn.c("GetRedirectUrlTask");
      str = null;
    }
    while (str != null)
    {
      localBundle.putString("redirect_url", str);
      return localhae;
      str = localbjn.a;
      if (TextUtils.isEmpty(str)) {
        str = this.o;
      }
    }
    localBundle.putString("redirect_url", this.o);
    return localhae;
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.jp);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bni
 * JD-Core Version:    0.7.0.1
 */