import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.plus.service.EsService;

public class bbr
{
  bbr(bbf parambbf) {}
  
  public void a()
  {
    if (this.a.ak != null) {
      this.a.ak.b(true);
    }
  }
  
  public void a(long paramLong, String paramString1, String paramString2)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a.f());
    String str2;
    if ((!this.a.al.b.I()) && (paramString1 != null) && (!paramString1.equals(this.a.al.b.j())) && (!paramString1.equals(this.a.as)))
    {
      bbf localbbf1 = this.a;
      int i = aau.nY;
      String str1 = localbbf1.g().getString(i);
      if (!TextUtils.isEmpty(this.a.al.b.m()))
      {
        bbf localbbf5 = this.a;
        int n = aau.nX;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramString2;
        arrayOfObject2[1] = this.a.al.b.m();
        str2 = localbbf5.g().getString(n, arrayOfObject2);
        bbf localbbf3 = this.a;
        int k = aau.mf;
        String str3 = localbbf3.g().getString(k);
        bbf localbbf4 = this.a;
        int m = aau.cM;
        lut locallut = lut.b(str1, str2, str3, localbbf4.g().getString(m));
        locallut.n = this.a;
        locallut.p = 0;
        locallut.m.putLong("shape_id", paramLong);
        locallut.m.putString("taggee_name", paramString2);
        locallut.m.putString("taggee_gaia_id", paramString1);
        locallut.a(this.a.x, "pouf_accept_shape_and_share");
      }
    }
    do
    {
      return;
      bbf localbbf2 = this.a;
      int j = aau.nZ;
      Object[] arrayOfObject1 = { paramString2 };
      str2 = localbbf2.g().getString(j, arrayOfObject1);
      break;
      if ((localSharedPreferences.getBoolean("shape.show_create_confirm", false)) || (paramString1 == null) || (paramString1.equals(this.a.al.b.j())) || (paramString1.equals(this.a.as)))
      {
        bbf.b(this.a).a(paramLong, paramString1);
        return;
      }
    } while (this.a.x.a("pouf_create_shape") != null);
    cpc localcpc = cpc.a(Long.valueOf(paramLong), cpd.c, null, bbf.b(this.a));
    Bundle localBundle = localcpc.m;
    localBundle.putString("taggee_gaia_id", paramString1);
    localBundle.putString("taggee_name", paramString2);
    localcpc.a(this.a.x, "pouf_create_shape");
    localcpc.n = this.a;
    localcpc.p = 0;
  }
  
  public void a(long paramLong, boolean paramBoolean)
  {
    String str = this.a.m.getString("view_id");
    this.a.ao = Integer.valueOf(EsService.a(this.a.f(), this.a.ar, this.a.al.b.j(), this.a.al.b.o(), paramLong, this.a.al.b.k(), str, false, null, paramBoolean, null));
    bz localbz = this.a.x;
    coo.a(null, this.a.f().getString(aau.po), false).a(localbz, "ProgressDialogHelper:progress_dialog");
  }
  
  public void b()
  {
    bbf.a(this.a);
    if (this.a.ak != null) {
      this.a.ak.b(false);
    }
  }
  
  public void b(long paramLong, boolean paramBoolean)
  {
    bbf localbbf1 = this.a;
    int i = aau.tk;
    String str1 = localbbf1.g().getString(i);
    bbf localbbf2 = this.a;
    int j = aau.tj;
    String str2 = localbbf2.g().getString(j);
    bbf localbbf3 = this.a;
    int k = aau.vS;
    String str3 = localbbf3.g().getString(k);
    bbf localbbf4 = this.a;
    int m = aau.cM;
    lut locallut = lut.b(str1, str2, str3, localbbf4.g().getString(m));
    locallut.n = this.a;
    locallut.p = 0;
    locallut.m.putLong("shape_id", paramLong);
    locallut.m.putBoolean("permanent_delete", paramBoolean);
    locallut.a(this.a.x, "pouf_delete_shape");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbr
 * JD-Core Version:    0.7.0.1
 */