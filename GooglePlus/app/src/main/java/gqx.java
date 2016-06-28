import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gqx
  implements gqn, mbo, mes, mfd
{
  private Context a;
  private git b;
  private gvj c;
  private iev d;
  private List<gqv> e;
  private ArrayList<x> f;
  
  public gqx(mek parammek)
  {
    parammek.a(this);
  }
  
  private Intent a(Uri paramUri, Bundle paramBundle, String paramString)
  {
    int i = this.b.c();
    Iterator localIterator1 = this.e.iterator();
    while (localIterator1.hasNext())
    {
      Intent localIntent2 = ((gqv)localIterator1.next()).a(i, paramUri, paramBundle);
      if (localIntent2 != null) {
        return localIntent2;
      }
    }
    if (paramUri.getHost().equals(paramString))
    {
      Intent localIntent1 = new Intent("android.intent.action.VIEW", paramUri);
      List localList = this.a.getPackageManager().queryIntentActivities(localIntent1, 65536);
      if (localList != null)
      {
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          ActivityInfo localActivityInfo = ((ResolveInfo)localIterator2.next()).activityInfo;
          if ((localActivityInfo != null) && (!this.a.getPackageName().equals(localActivityInfo.packageName)))
          {
            localIntent1.setComponent(new ComponentName(localActivityInfo.packageName, localActivityInfo.name));
            return localIntent1;
          }
        }
      }
      return null;
    }
    return new Intent("android.intent.action.VIEW", paramUri);
  }
  
  private final void b(gqm paramgqm)
  {
    int i = this.f.size();
    for (int j = 0; j < i; j++) {
      this.f.get(j);
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
    this.b = ((git)parammbb.a(git.class));
    this.c = ((gvj)parammbb.a(gvj.class));
    this.d = ((iev)parammbb.a(iev.class));
    this.e = parammbb.c(gqv.class);
  }
  
  public final void a(Bundle paramBundle)
  {
    this.f = new ArrayList();
  }
  
  public final void a(gqm paramgqm)
  {
    efj.e(paramgqm, "AcitonDescriptor cannot be null.");
    if ((paramgqm instanceof gqr))
    {
      ((gqr)paramgqm).b();
      b(paramgqm);
      return;
    }
    if ((paramgqm instanceof gqs))
    {
      gqs localgqs = (gqs)paramgqm;
      if (localgqs.c == 0)
      {
        Log.e("EaExecutorImpl", "Unknown uri type.");
        return;
      }
      String str1 = localgqs.b;
      if (localgqs.c == 2)
      {
        String str5 = this.d.a();
        if ((TextUtils.isEmpty(str5)) || (TextUtils.isEmpty(str1))) {
          str2 = null;
        }
        while (str2 == null)
        {
          Log.e("EaExecutorImpl", "Error appending partial url");
          return;
          if (str5.charAt(-1 + str5.length()) == '/') {}
          int k;
          String str8;
          for (int i = 1;; i = 0)
          {
            int j = str1.charAt(0);
            k = 0;
            if (j == 47) {
              k = 1;
            }
            if ((i == 0) || (k == 0)) {
              break label229;
            }
            str8 = String.valueOf(str5);
            String str9 = String.valueOf(str1.substring(1));
            if (str9.length() == 0) {
              break label215;
            }
            str2 = str8.concat(str9);
            break;
          }
          label215:
          str2 = new String(str8);
          continue;
          label229:
          if ((i != 0) || (k != 0))
          {
            String str6 = String.valueOf(str5);
            String str7 = String.valueOf(str1);
            if (str7.length() != 0) {
              str2 = str6.concat(str7);
            } else {
              str2 = new String(str6);
            }
          }
          else
          {
            str2 = 1 + String.valueOf(str5).length() + String.valueOf(str1).length() + str5 + "/" + str1;
          }
        }
      }
      String str2 = str1;
      Intent localIntent = a(Uri.parse(str2), localgqs.d, this.d.b());
      if ((localIntent != null) && (localIntent.resolveActivity(this.a.getPackageManager()) != null))
      {
        if (Build.VERSION.SDK_INT < 16) {
          this.a.startActivity(localIntent);
        }
        for (;;)
        {
          b(paramgqm);
          return;
          this.a.startActivity(localIntent, this.c.a());
        }
      }
      String str3 = String.valueOf(str2);
      if (str3.length() != 0) {}
      for (String str4 = "No activity that can resolve to url: ".concat(str3);; str4 = new String("No activity that can resolve to url: "))
      {
        Log.e("EaExecutorImpl", str4);
        return;
      }
    }
    Log.e("EaExecutorImpl", "ElementAction to be executed not one of defined types.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqx
 * JD-Core Version:    0.7.0.1
 */