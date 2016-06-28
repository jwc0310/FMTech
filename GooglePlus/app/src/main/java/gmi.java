import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class gmi
  implements gky, mbo, mec, mfa, mfd
{
  public boolean a;
  private ImageView b;
  private AccountSwitcherView c;
  private List<gmh> d = Collections.emptyList();
  private gmg e;
  
  public gmi(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a()
  {
    ImageView localImageView = this.b;
    int i;
    AccountSwitcherView localAccountSwitcherView;
    Resources localResources;
    if (this.a)
    {
      i = efj.CJ;
      localImageView.setImageResource(i);
      localAccountSwitcherView = this.c;
      localResources = this.c.getResources();
      if (!this.a) {
        break label66;
      }
    }
    label66:
    for (int j = efj.CY;; j = efj.Da)
    {
      localAccountSwitcherView.setContentDescription(localResources.getString(j));
      return;
      i = efj.CI;
      break;
    }
  }
  
  public final void a(int paramInt)
  {
    this.a = false;
    a();
    b();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = parammbb.c(gmh.class);
    this.e = ((gmg)parammbb.b(gmg.class));
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.a = paramBundle.getBoolean("is_account_list_visible");
    }
    this.b = ((ImageView)paramView.findViewById(efj.CV));
    this.c = ((AccountSwitcherView)paramView.findViewById(efj.CM));
    this.c.setOnClickListener(new gxn(new gmj(this)));
    if (this.e != null)
    {
      AccountSwitcherView localAccountSwitcherView = this.c;
      View.OnClickListener localOnClickListener = this.e.a();
      CharSequence localCharSequence = this.e.b();
      localAccountSwitcherView.b.setOnClickListener(new gxn(localOnClickListener));
      localAccountSwitcherView.b.setContentDescription(localCharSequence);
    }
    a();
    b();
  }
  
  public final void b()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      gmh localgmh = (gmh)localIterator.next();
      if (this.a) {
        localgmh.c();
      } else {
        localgmh.d();
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("is_account_list_visible", this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gmi
 * JD-Core Version:    0.7.0.1
 */