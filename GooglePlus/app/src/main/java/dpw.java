import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public final class dpw
  extends mca
  implements cpk, gzi, kds
{
  ket Z;
  bui a;
  ket aa;
  private bui ab;
  private final guf ac = new dpx(this);
  private final gug ad;
  private kdp ae;
  private kez af;
  private git ag;
  private kfx ah;
  private CheckBoxPreference ai;
  private List<ket> aj;
  private cw<bui> ak;
  final gzj b;
  int c;
  dog d;
  
  public dpw()
  {
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    this.ad = localgug.a(aaw.iA, this.ac);
    this.ae = new kdp(this, this.bp);
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.b = localgzj;
    this.aj = new ArrayList();
    this.ak = new dpy(this, this, this.ae, this.bp);
  }
  
  public final void I()
  {
    Intent localIntent = efj.a(f(), this.ag.c(), aau.qq, this.a.d);
    this.ad.a(aaw.iA, localIntent);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("notification_settings"))) {
      this.a = ((bui)paramBundle.getParcelable("notification_settings"));
    }
  }
  
  final void a(gnb paramgnb)
  {
    buk localbuk = buk.a();
    localbuk.a = this.a.a;
    localbuk.b = this.a.b;
    localbuk.d = paramgnb;
    bui localbui = localbuk.b();
    dnv localdnv = new dnv(this.bn, this.c, localbui);
    localbuk.c = this.a.c;
    localbuk.e = this.a.e;
    localbuk.f = this.a.f;
    localbuk.a = this.a.a;
    localbuk.b = this.a.b;
    localbuk.d = paramgnb;
    this.ab = localbuk.b();
    gzj localgzj = this.b;
    localgzj.d.a(localdnv, false);
    localgzj.b(localdnv);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    int i;
    if ("ChangeNotificationSettingsTask".equals(paramString))
    {
      kdp localkdp1 = this.ae;
      if (localkdp1.e != null)
      {
        kdr localkdr2 = localkdp1.e;
        if (localkdr2.a != null)
        {
          localkdr2.a.b(true);
          localkdr2.a = null;
        }
      }
      if (paramhae.b == 200) {
        break label184;
      }
      i = 1;
      if ((i == 0) || (this.aa == null)) {
        break label196;
      }
      if ((this.aa instanceof CheckBoxPreference))
      {
        localCheckBoxPreference = (CheckBoxPreference)this.aa;
        if (((CheckBoxPreference)this.aa).b) {
          break label190;
        }
        bool = true;
        localCheckBoxPreference.a(bool);
        localkdp2 = this.ae;
        if (localkdp2.e != null)
        {
          localkdr1 = localkdp2.e;
          if (localkdr1.a != null)
          {
            localkdr1.a.b(true);
            localkdr1.a = null;
          }
        }
        this.aa = null;
      }
      k().b(2, null, this.ak);
    }
    label184:
    label190:
    label196:
    while (this.aa != this.Z) {
      for (;;)
      {
        CheckBoxPreference localCheckBoxPreference;
        kdp localkdp2;
        kdr localkdr1;
        return;
        i = 0;
        break;
        boolean bool = false;
      }
    }
    this.aa = null;
    this.a = this.ab;
    v();
  }
  
  final void a(boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.b(paramBoolean);
    }
    if (this.ai != null) {
      this.ai.b(paramBoolean);
    }
    if (this.Z != null) {
      this.Z.b(paramBoolean);
    }
    for (int i = 0; i < this.aj.size(); i++) {
      ((ket)this.aj.get(i)).b(paramBoolean);
    }
    if (this.ah != null) {
      this.ah.b(true);
    }
  }
  
  public final void b(String paramString1, int paramInt, String paramString2)
  {
    gnb localgnb = new gnb(new jgs(paramString1, paramInt, paramString2, 1));
    if (!efj.a(this.bn, localgnb, this.a.d)) {
      a(localgnb);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ag = ((git)this.bo.a(git.class));
    this.c = this.ag.c();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.a != null) {
      paramBundle.putParcelable("notification_settings", this.a);
    }
  }
  
  final void v()
  {
    if (this.ah == null) {
      return;
    }
    this.ah.a(cux.a(this.bn, this.c));
    Context localContext;
    String str;
    if (this.a != null)
    {
      bui localbui = this.a;
      gnb localgnb = localbui.d;
      if ((localgnb != null) && (this.Z != null))
      {
        localContext = this.Z.l;
        str = localbui.f;
        jgs[] arrayOfjgs;
        if ((localContext != null) && (localgnb != null) && (!localgnb.b()))
        {
          arrayOfjgs = localgnb.c;
          if (arrayOfjgs != null) {
            if (arrayOfjgs.length != 1) {
              break label258;
            }
          }
        }
        switch (arrayOfjgs[0].c)
        {
        default: 
          str = localContext.getString(aau.bs);
        }
      }
    }
    for (;;)
    {
      this.Z.a_(str);
      a(this.ah.b);
      return;
      str = localContext.getString(aau.bz);
      continue;
      str = localContext.getString(aau.br);
      continue;
      str = localContext.getString(aau.bu);
      continue;
      str = localContext.getString(aau.bs);
      continue;
      str = localContext.getString(aau.bi);
      continue;
      label258:
      str = localContext.getString(aau.bi);
    }
  }
  
  public final void x()
  {
    k().a(2, null, this.ak);
  }
  
  public final void y()
  {
    k().b(2, null, this.ak);
  }
  
  public final void z()
  {
    this.af = new kez(this.bn);
    kez localkez1 = this.af;
    int i = aau.ma;
    this.ah = localkez1.d(g().getString(i), null);
    this.ah.d("notifications_enabled");
    this.ah.a(Boolean.valueOf(true));
    this.ah.b(this.ag.e());
    kdp localkdp1 = this.ae;
    kfx localkfx = this.ah;
    localkdp1.d.b(localkfx);
    this.ah.o = new dpz(this);
    this.d = new dog(this.bn);
    dog localdog1 = this.d;
    int j = aau.mc;
    localdog1.b(g().getString(j));
    this.d.d("notifications_ringtone");
    this.d.a = 2;
    Ringtone localRingtone;
    Object localObject;
    label239:
    int i1;
    if (cux.d(this.bn, this.c))
    {
      Uri localUri = cux.c(this.bn, this.c);
      localRingtone = RingtoneManager.getRingtone(this.bn, localUri);
      if (localRingtone == null)
      {
        localObject = null;
        this.d.a(localUri.toString());
        this.d.a_((CharSequence)localObject);
        this.d.o = new dqa(this);
        kdp localkdp2 = this.ae;
        dog localdog3 = this.d;
        localkdp2.d.b(localdog3);
        kez localkez2 = this.af;
        int m = aau.md;
        this.ai = localkez2.c(g().getString(m), null);
        this.ai.d("notifications_vibrate");
        this.ai.a(cux.b(this.bn, this.c));
        this.ai.o = new dqb(this);
        kdp localkdp3 = this.ae;
        CheckBoxPreference localCheckBoxPreference1 = this.ai;
        localkdp3.d.b(localCheckBoxPreference1);
        kez localkez3 = this.af;
        int n = aau.me;
        this.Z = localkez3.a(g().getString(n), null);
        this.Z.d("notifications_who_can_notify_me");
        this.Z.p = new dqc(this);
        kdp localkdp4 = this.ae;
        ket localket = this.Z;
        localkdp4.d.b(localket);
        this.aj.clear();
        i1 = this.a.a();
      }
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 >= i1) {
        return;
      }
      bug localbug = this.a.c[i2];
      PreferenceCategory localPreferenceCategory = this.af.a(localbug.a);
      this.ae.d.b(localPreferenceCategory);
      int i3 = localbug.b.length;
      int i4 = 0;
      for (;;)
      {
        if (i4 < i3)
        {
          obg localobg = localbug.b[i4];
          CheckBoxPreference localCheckBoxPreference2 = this.af.e(localobg.a, null);
          localCheckBoxPreference2.a(localobg.c.booleanValue());
          localCheckBoxPreference2.o = new dqd(this, localobg);
          this.ae.a(localCheckBoxPreference2);
          localPreferenceCategory.b(localCheckBoxPreference2);
          this.aj.add(localCheckBoxPreference2);
          i4++;
          continue;
          localObject = localRingtone.getTitle(this.bn);
          break;
          dog localdog2 = this.d;
          int k = aau.ti;
          localdog2.a_(localdog2.l.getString(k));
          this.d.a(null);
          break label239;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpw
 * JD-Core Version:    0.7.0.1
 */