import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class gma
  implements View.OnClickListener
{
  private final int b;
  private final AccountSwitcherView c;
  private final glk d;
  
  public gma(glz paramglz, int paramInt, AccountSwitcherView paramAccountSwitcherView, glk paramglk)
  {
    this.b = paramInt;
    this.c = paramAccountSwitcherView;
    this.d = paramglk;
  }
  
  public final void onClick(View paramView)
  {
    int i = this.d.a(this.b);
    gla localgla = new gla(i, this.a.a.a(i), this.a.c);
    this.a.d.a(false);
    gmb localgmb = new gmb(this, i);
    this.d.a = gln.b;
    AccountSwitcherView localAccountSwitcherView = this.c;
    int j = this.b;
    int k = glw.a[(j - 1)];
    AvatarView localAvatarView = null;
    Context localContext;
    String str;
    switch (k)
    {
    default: 
      localContext = localAccountSwitcherView.getContext();
      str = localgla.g;
      if (!localgla.h) {
        break;
      }
    }
    for (ipm localipm = ipm.d;; localipm = ipm.a)
    {
      ipf localipf = ipf.a(localContext, str, localipm);
      glo localglo = new glo(localAccountSwitcherView, localgla, localAvatarView, localgmb, localipf);
      localAccountSwitcherView.a(localipf, localgla.h, localglo);
      return;
      localAvatarView = localAccountSwitcherView.d;
      break;
      localAvatarView = localAccountSwitcherView.e;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gma
 * JD-Core Version:    0.7.0.1
 */