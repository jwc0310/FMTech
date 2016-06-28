import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

public final class duf
  implements iiq
{
  final Context a;
  private int b = 10;
  private bk c;
  private String d;
  private final String e;
  
  public duf(bk parambk, Context paramContext, int paramInt, String paramString)
  {
    this.c = parambk;
    this.a = paramContext;
    this.e = paramString;
  }
  
  public final void a(String paramString1, String paramString2, List<String> paramList, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    this.d = paramString2;
    Bundle localBundle = gxy.a("extra_creation_source_id", this.d);
    int i = ((git)mbb.a(this.a, git.class)).c();
    String str1 = efj.c(this.a, paramList);
    gxx localgxx3;
    gxw localgxw3;
    if (!TextUtils.isEmpty(str1))
    {
      Intent localIntent2 = efj.a(this.a, str1, paramString3, paramBoolean);
      if (localIntent2 != null) {
        try
        {
          this.c.a(localIntent2);
          gxx localgxx4 = (gxx)mbb.a(this.a, gxx.class);
          gxw localgxw4 = new gxw(this.a, i);
          if (paramBoolean) {}
          for (gxz localgxz4 = gxz.bg;; localgxz4 = gxz.aZ)
          {
            localgxw4.c = localgxz4;
            if (localBundle != null) {
              localgxw4.h.putAll(localBundle);
            }
            localgxx4.a(localgxw4);
            return;
          }
          String str2;
          if (TextUtils.isEmpty(paramString4)) {
            return;
          }
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          if (Log.isLoggable(this.e, 5))
          {
            str2 = String.valueOf(localIntent2);
            new StringBuilder(42 + String.valueOf(str2).length()).append("Failed to start deep linked Activity with ").append(str2);
          }
        }
      }
      iis.a(this.a, i, paramString4, this.d, paramString1);
      if (TextUtils.isEmpty(str1)) {
        break label471;
      }
      localgxx3 = (gxx)mbb.a(this.a, gxx.class);
      localgxw3 = new gxw(this.a, i);
      if (!paramBoolean) {
        break label463;
      }
    }
    label455:
    label463:
    for (gxz localgxz3 = gxz.bh;; localgxz3 = gxz.ba)
    {
      localgxw3.c = localgxz3;
      if (localBundle != null) {
        localgxw3.h.putAll(localBundle);
      }
      localgxx3.a(localgxw3);
      return;
      Intent localIntent1 = efj.d(paramList);
      bk localbk = this.c;
      int j = this.b;
      int k;
      gxx localgxx1;
      gxw localgxw1;
      if (paramBoolean)
      {
        k = 2;
        localbk.a(localIntent1, k + j);
        new dug(this, i, efj.e(paramList), paramString1, paramString5, paramBoolean).execute(new Void[0]);
        localgxx1 = (gxx)mbb.a(this.a, gxx.class);
        localgxw1 = new gxw(this.a, i);
        if (!paramBoolean) {
          break label455;
        }
      }
      for (gxz localgxz1 = gxz.be;; localgxz1 = gxz.aX)
      {
        localgxw1.c = localgxz1;
        if (localBundle != null) {
          localgxw1.h.putAll(localBundle);
        }
        localgxx1.a(localgxw1);
        return;
        k = 1;
        break;
      }
    }
    label471:
    if (!duk.a(this.a.getPackageManager()))
    {
      gxx localgxx2 = (gxx)mbb.a(this.a, gxx.class);
      gxw localgxw2 = new gxw(this.a, i);
      if (paramBoolean) {}
      for (gxz localgxz2 = gxz.bf;; localgxz2 = gxz.aY)
      {
        localgxw2.c = localgxz2;
        if (localBundle != null) {
          localgxw2.h.putAll(localBundle);
        }
        localgxx2.a(localgxw2);
        return;
      }
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - this.b;
    boolean bool;
    Bundle localBundle;
    int j;
    int k;
    if (i != 1)
    {
      bool = false;
      if (i != 2) {}
    }
    else
    {
      localBundle = gxy.a("extra_creation_source_id", this.d);
      j = ((git)mbb.a(this.a, git.class)).c();
      if (i != 2) {
        break label153;
      }
      k = 1;
      if (this.c.f() != null)
      {
        if (paramInt2 != -1) {
          break label167;
        }
        if (k == 0) {
          break label159;
        }
      }
    }
    Object localObject;
    label153:
    label159:
    for (gxz localgxz2 = gxz.bi;; localgxz2 = gxz.bb)
    {
      localObject = localgxz2;
      gxx localgxx = (gxx)mbb.a(this.a, gxx.class);
      gxw localgxw = new gxw(this.a, j);
      localgxw.c = ((gxz)localObject);
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      bool = true;
      return bool;
      k = 0;
      break;
    }
    label167:
    if (k != 0) {}
    for (gxz localgxz1 = gxz.bj;; localgxz1 = gxz.bc)
    {
      localObject = localgxz1;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duf
 * JD-Core Version:    0.7.0.1
 */