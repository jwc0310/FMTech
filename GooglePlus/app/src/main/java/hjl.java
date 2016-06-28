import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.libraries.social.collexions.impl.alert.CollexionPrivacyAlertView;
import java.util.ArrayList;
import java.util.List;

public final class hjl
  implements hgv, mbo, mes, meu, mfa, mfd
{
  final bp a;
  final bk b;
  git c;
  hot d;
  String e;
  int f;
  final la<String, hgy> g;
  final ArrayList<hgy> h;
  private gzj i;
  private CollexionPrivacyAlertView j;
  private String k;
  private String l;
  private Uri m;
  private CheckBox n;
  private hjo o;
  private hjp p;
  private hjn q;
  private hjr r;
  private hjq s;
  private ill t;
  
  public hjl(bk parambk, mek parammek)
  {
    this.b = parambk;
    this.a = parambk.f();
    this.o = new hjo(this);
    this.p = new hjp(this);
    this.q = new hjn(this);
    this.r = new hjr(this);
    this.s = new hjq(this);
    parammek.a(this);
    this.g = new la();
    this.h = new ArrayList();
  }
  
  private final void a(String paramString1, String paramString2, int paramInt, Uri paramUri)
  {
    if (b()) {
      return;
    }
    this.e = paramString1;
    this.l = paramString2;
    this.f = paramInt;
    this.m = paramUri;
    if ((this.d.b(this.c.c())) || (paramInt == 2))
    {
      c();
      return;
    }
    hln localhln = new hln(this.c.c(), true);
    this.i.c(localhln);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((git)parammbb.a(git.class));
    this.i = ((gzj)parammbb.a(gzj.class));
    gzj localgzj = this.i;
    hjo localhjo = this.o;
    localgzj.a.add(localhjo);
    hjp localhjp = this.p;
    localgzj.a.add(localhjp);
    hjn localhjn = this.q;
    localgzj.a.add(localhjn);
    hjr localhjr = this.r;
    localgzj.a.add(localhjr);
    hjq localhjq = this.s;
    localgzj.a.add(localhjq);
    this.d = ((hot)parammbb.a(hot.class));
    ill localill = new ill(paramContext, this.c.c());
    localill.a.add(ine.class);
    this.t = localill;
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.e = paramBundle.getString("state_activity_id");
      this.l = paramBundle.getString("state_collexion_id");
      this.f = paramBundle.getInt("state_follow_state");
      String str = paramBundle.getString("state_content_uri");
      if (str != null) {
        this.m = Uri.parse(str);
      }
    }
  }
  
  public final void a(hgy paramhgy)
  {
    this.h.add(paramhgy);
  }
  
  public final void a(String paramString)
  {
    this.g.remove(paramString);
  }
  
  public final void a(String paramString, int paramInt, Uri paramUri)
  {
    a(null, paramString, paramInt, paramUri);
  }
  
  public final void a(String paramString, AlertDialog paramAlertDialog)
  {
    label32:
    int i1;
    switch (paramString.hashCode())
    {
    default: 
      i1 = -1;
    }
    for (;;)
    {
      switch (i1)
      {
      default: 
        return;
        if (!paramString.equals("collexion_privacy_alert_dialog")) {
          break label32;
        }
        i1 = 0;
        continue;
        if (!paramString.equals("delete_collexion_alert_dialog")) {
          break label32;
        }
        i1 = 1;
      }
    }
    this.j = ((CollexionPrivacyAlertView)paramAlertDialog.findViewById(efj.If));
    return;
    this.n = ((CheckBox)paramAlertDialog.findViewById(efj.Ie));
    paramAlertDialog.getButton(-1).setEnabled(this.n.isChecked());
    this.n.setOnCheckedChangeListener(new hjm(this, paramAlertDialog));
  }
  
  public final void a(String paramString, hgy paramhgy)
  {
    this.g.put(paramString, paramhgy);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    hjs.a(aau.zp, this.a.getString(az.c), this.a.getString(az.b), this.a.getString(az.i), this.a.getString(az.a)).a(this.b.h(), "delete_collexion_alert_dialog");
    this.k = paramString1;
    this.l = paramString2;
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    a(paramString1, paramString2, paramInt, null);
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putString("state_collexion_id", this.l);
    paramBundle.putString("state_activity_id", this.e);
    paramBundle.putInt("state_follow_state", this.f);
    if (this.m != null) {
      paramBundle.putString("state_content_uri", this.m.toString());
    }
  }
  
  public final void b(String paramString)
  {
    int i1 = -1;
    switch (paramString.hashCode())
    {
    default: 
      switch (i1)
      {
      }
      break;
    }
    label188:
    do
    {
      return;
      if (!paramString.equals("collexion_privacy_alert_dialog")) {
        break;
      }
      i1 = 0;
      break;
      if (!paramString.equals("delete_collexion_alert_dialog")) {
        break;
      }
      i1 = 1;
      break;
      int i2;
      String str1;
      String str2;
      if (this.j.a.isChecked())
      {
        i2 = 2;
        str1 = String.valueOf(this.a.getString(az.f));
        str2 = String.valueOf(this.a.getString(az.g));
        if (str2.length() == 0) {
          break label188;
        }
      }
      for (String str3 = str1.concat(str2);; str3 = new String(str1))
      {
        hlr localhlr = new hlr(this.c.c(), 2, str3, i2, true);
        this.i.c(localhlr);
        return;
        i2 = 1;
        break;
      }
    } while (!this.n.isChecked());
    hkz localhkz = new hkz(this.c.c(), this.k, this.l);
    this.i.c(localhkz);
  }
  
  public final boolean b()
  {
    if (!this.t.a())
    {
      this.a.startActivity(this.t.b());
      return true;
    }
    return false;
  }
  
  final void c()
  {
    boolean bool1 = true;
    if (this.e == null)
    {
      String str3 = this.l;
      int i2 = this.f;
      Uri localUri = this.m;
      boolean bool2;
      if (str3 != null)
      {
        bool2 = bool1;
        efj.c(bool2, "Collexion id must be set for calling UpdateFollowStateTask");
        if (localUri == null) {
          break label98;
        }
      }
      for (;;)
      {
        efj.c(bool1, "Content uri must be set for calling UpdateFollowStateTask");
        hlv localhlv = new hlv(this.c.c(), str3, hlu.a(i2), localUri);
        this.i.c(localhlv);
        return;
        bool2 = false;
        break;
        label98:
        bool1 = false;
      }
    }
    String str1 = this.e;
    String str2 = this.l;
    int i1 = this.f;
    if (str1 != null) {}
    for (;;)
    {
      efj.c(bool1, "Activity id must be set for calling UpdateFollowStateInStreamTask");
      hlu localhlu = new hlu(this.c.c(), str1, str2, i1);
      this.i.c(localhlu);
      return;
      bool1 = false;
    }
  }
  
  public final void m_()
  {
    gzj localgzj = this.i;
    hjo localhjo = this.o;
    localgzj.a.remove(localhjo);
    hjp localhjp = this.p;
    localgzj.a.remove(localhjp);
    hjn localhjn = this.q;
    localgzj.a.remove(localhjn);
    hjr localhjr = this.r;
    localgzj.a.remove(localhjr);
    hjq localhjq = this.s;
    localgzj.a.remove(localhjq);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjl
 * JD-Core Version:    0.7.0.1
 */