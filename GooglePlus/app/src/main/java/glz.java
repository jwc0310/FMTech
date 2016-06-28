import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class glz
  implements mbo, mfd
{
  public giz a;
  gld b;
  public gmc c;
  gmd d;
  public gmi e;
  public glh f;
  private ipb g;
  private gmg h;
  
  public glz(mek parammek)
  {
    parammek.a(this);
  }
  
  private final void a(int paramInt, AccountSwitcherView paramAccountSwitcherView, glk paramglk)
  {
    int i = paramglk.a(paramInt);
    if (i == -1)
    {
      switch (glw.a[(paramInt - 1)])
      {
      default: 
        return;
      case 1: 
        paramAccountSwitcherView.d.setVisibility(8);
        return;
      }
      paramAccountSwitcherView.e.setVisibility(8);
      return;
    }
    gla localgla = new gla(i, this.a.a(i), this.c);
    gma localgma = new gma(this, paramInt, paramAccountSwitcherView, paramglk);
    ipb localipb = this.g;
    int j = glw.a[(paramInt - 1)];
    AvatarView localAvatarView = null;
    Context localContext1;
    String str;
    switch (j)
    {
    default: 
      localContext1 = paramAccountSwitcherView.getContext();
      str = localgla.g;
      if (!localgla.h) {
        break;
      }
    }
    for (ipm localipm = ipm.d;; localipm = ipm.a)
    {
      localipb.b(ipf.a(localContext1, str, localipm), 0, 0);
      AccountSwitcherView.a(localAvatarView);
      localAvatarView.a(localgla.b, localgla.e);
      localAvatarView.setOnClickListener(new gxn(localgma));
      localAvatarView.setClickable(paramAccountSwitcherView.f);
      localAvatarView.setVisibility(0);
      Context localContext2 = paramAccountSwitcherView.getContext();
      int k = efj.Dc;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localgla.c;
      arrayOfObject[1] = localgla.d;
      localAvatarView.setContentDescription(localContext2.getString(k, arrayOfObject));
      return;
      localAvatarView = paramAccountSwitcherView.d;
      break;
      localAvatarView = paramAccountSwitcherView.e;
      break;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((giz)parammbb.a(giz.class));
    this.b = ((gld)parammbb.a(gld.class));
    this.c = ((gmc)parammbb.a(gmc.class));
    this.g = ((ipb)parammbb.a(ipb.class));
    this.d = ((gmd)parammbb.a(gmd.class));
    this.e = ((gmi)parammbb.a(gmi.class));
    this.f = ((glh)parammbb.b(glh.class));
    this.h = ((gmg)parammbb.b(gmg.class));
  }
  
  public final void a(AccountSwitcherView paramAccountSwitcherView, gla paramgla)
  {
    AccountSwitcherView.a(paramAccountSwitcherView.b);
    String str1 = paramgla.b;
    String str2 = paramgla.e;
    paramAccountSwitcherView.b.a(str1, str2);
    paramAccountSwitcherView.a(paramgla.c, paramgla.d);
    String str3 = paramgla.g;
    boolean bool = paramgla.h;
    Context localContext = paramAccountSwitcherView.getContext();
    if (bool) {}
    for (ipm localipm = ipm.d;; localipm = ipm.a)
    {
      ipf localipf = ipf.a(localContext, str3, localipm);
      paramAccountSwitcherView.a(localipf, bool, new glt(paramAccountSwitcherView, localipf, bool));
      if (this.h != null)
      {
        gxq localgxq = this.h.a(paramAccountSwitcherView.getContext());
        efj.a(paramAccountSwitcherView.b, localgxq);
      }
      return;
    }
  }
  
  public final void a(AccountSwitcherView paramAccountSwitcherView, glk paramglk)
  {
    paramglk.a();
    a(glm.a, paramAccountSwitcherView, paramglk);
    a(glm.b, paramAccountSwitcherView, paramglk);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glz
 * JD-Core Version:    0.7.0.1
 */