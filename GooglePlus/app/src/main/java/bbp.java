import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;

final class bbp
  implements ckx
{
  bbp(bbf parambbf) {}
  
  public final void T_() {}
  
  public final void a(String paramString1, String paramString2, String paramString3) {}
  
  public final void a(String paramString1, String paramString2, jjd paramjjd, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      gxx localgxx = (gxx)this.a.bo.a(gxx.class);
      gxw localgxw = new gxw(this.a.bn, this.a.ar);
      localgxw.c = gxz.ed;
      localgxw.d = gya.ad;
      if (paramBundle != null) {
        localgxw.h.putAll(paramBundle);
      }
      localgxx.a(localgxw);
    }
    bcp localbcp = this.a.al.b;
    bbc localbbc = this.a.ab;
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a.f());
    String str1 = paramjjd.b;
    String str2 = paramjjd.c;
    String str3 = paramjjd.a;
    if (str3 == null) {}
    do
    {
      return;
      if (Collections.unmodifiableList(this.a.an.c).contains(str3))
      {
        bbf localbbf7;
        int i2;
        if (TextUtils.equals(localbcp.j(), str3))
        {
          localbbf7 = this.a;
          i2 = aau.ob;
        }
        bbf localbbf6;
        int i1;
        Object[] arrayOfObject3;
        for (String str7 = localbbf7.g().getString(i2);; str7 = localbbf6.g().getString(i1, arrayOfObject3))
        {
          Toast.makeText(this.a.f(), str7, 0).show();
          bbf.a(this.a);
          return;
          localbbf6 = this.a;
          i1 = aau.nU;
          arrayOfObject3 = new Object[] { str1 };
        }
      }
      if ((!localbcp.I()) && (!str3.equals(localbcp.j())) && (!str3.equals(this.a.as)))
      {
        bbf localbbf1 = this.a;
        int i = aau.nY;
        String str4 = localbbf1.g().getString(i);
        bbf localbbf5;
        int n;
        Object[] arrayOfObject2;
        if (!TextUtils.isEmpty(localbcp.m()))
        {
          localbbf5 = this.a;
          n = aau.nX;
          arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = str1;
          arrayOfObject2[1] = localbcp.m();
        }
        bbf localbbf2;
        int j;
        Object[] arrayOfObject1;
        for (String str5 = localbbf5.g().getString(n, arrayOfObject2);; str5 = localbbf2.g().getString(j, arrayOfObject1))
        {
          bbf localbbf3 = this.a;
          int k = aau.mf;
          String str6 = localbbf3.g().getString(k);
          bbf localbbf4 = this.a;
          int m = aau.cM;
          lut locallut = lut.b(str4, str5, str6, localbbf4.g().getString(m));
          locallut.ab = this.a;
          Long localLong = localbbc.C;
          if (localLong != null) {
            locallut.m.putLong("shape_id", localLong.longValue());
          }
          RectF localRectF = localbbc.c();
          locallut.m.putParcelable("bounds", localRectF);
          locallut.m.putString("taggee_name", str1);
          locallut.m.putString("taggee_email", str2);
          locallut.m.putString("taggee_gaia_id", str3);
          locallut.a(this.a.x, "pouf_create_shape_and_share");
          return;
          localbbf2 = this.a;
          j = aau.nZ;
          arrayOfObject1 = new Object[] { str1 };
        }
      }
      if ((localSharedPreferences.getBoolean("shape.show_create_confirm", false)) || (str3.equals(localbcp.j())) || (str3.equals(this.a.as)))
      {
        if (localbbc.C != null)
        {
          bbf.b(this.a).a(localbbc.C.longValue(), str1, str2, str3);
          return;
        }
        bbf.b(this.a).a(localbbc.c(), str1, str2, str3);
        return;
      }
    } while (this.a.x.a("pouf_create_shape") != null);
    cpc localcpc = cpc.a(localbbc.C, cpd.b, localbbc.c(), bbf.b(this.a));
    Bundle localBundle = localcpc.m;
    localBundle.putString("taggee_name", str1);
    localBundle.putString("taggee_email", str2);
    localBundle.putString("taggee_gaia_id", str3);
    localcpc.a(this.a.x, "pouf_create_shape");
    localcpc.n = this.a;
    localcpc.p = 0;
  }
  
  public final void a(String paramString, jgs paramjgs) {}
  
  public final void b(String paramString1, String paramString2, String paramString3) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbp
 * JD-Core Version:    0.7.0.1
 */