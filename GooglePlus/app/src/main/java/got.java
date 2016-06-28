import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.libraries.social.acl2.DomainRestrictionToggleView;

public final class got
  implements mbo, mec, mfa, mfd
{
  private bk a;
  private git b;
  private gor c;
  private boolean d;
  
  public got(bk parambk, mek parammek)
  {
    this.a = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((git)parammbb.a(git.class));
    this.c = ((gor)parammbb.a(gor.class));
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    gjb localgjb = this.b.f();
    boolean bool1 = localgjb.c("is_default_restricted");
    Bundle localBundle = this.a.m;
    boolean bool2;
    DomainRestrictionToggleView localDomainRestrictionToggleView;
    boolean bool3;
    if (paramBundle != null)
    {
      this.d = paramBundle.getBoolean("DomainRestrictionToggleMixin.DISABLE_DOMAIN_RESTRICTION_TOGGLE");
      bool2 = paramBundle.getBoolean("DomainRestrictionToggleMixin.RESTRICT_TO_DOMAIN");
      localDomainRestrictionToggleView = (DomainRestrictionToggleView)paramView.findViewById(aau.xP);
      if ((localDomainRestrictionToggleView != null) && (localgjb.c("is_dasher_account")))
      {
        gor localgor = this.c;
        localgor.a = localDomainRestrictionToggleView;
        localDomainRestrictionToggleView.c.setOnCheckedChangeListener(localgor);
        localgor.a(localDomainRestrictionToggleView.c.isChecked());
        if (this.d) {
          break label279;
        }
        bool3 = true;
        label125:
        localDomainRestrictionToggleView.c.setEnabled(bool3);
        String str = localgjb.b("domain_name");
        if (localDomainRestrictionToggleView.getResources() != null)
        {
          localDomainRestrictionToggleView.a.setText(localDomainRestrictionToggleView.getResources().getString(efj.Et, new Object[] { str }));
          localDomainRestrictionToggleView.b.setText(localDomainRestrictionToggleView.getResources().getString(efj.Es, new Object[] { str }));
        }
        if (!localDomainRestrictionToggleView.c.isEnabled()) {
          break label285;
        }
        localDomainRestrictionToggleView.c.setChecked(bool2);
      }
    }
    for (;;)
    {
      localDomainRestrictionToggleView.setVisibility(0);
      return;
      if (localBundle != null)
      {
        this.d = localBundle.getBoolean("DomainRestrictionToggleMixin.DISABLE_DOMAIN_RESTRICTION_TOGGLE");
        bool2 = localBundle.getBoolean("DomainRestrictionToggleMixin.RESTRICT_TO_DOMAIN", bool1);
        break;
      }
      this.d = false;
      bool2 = bool1;
      break;
      label279:
      bool3 = false;
      break label125;
      label285:
      localDomainRestrictionToggleView.c.setEnabled(true);
      localDomainRestrictionToggleView.c.setChecked(bool2);
      localDomainRestrictionToggleView.c.setEnabled(false);
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("DomainRestrictionToggleMixin.RESTRICT_TO_DOMAIN", this.c.a());
    paramBundle.putBoolean("DomainRestrictionToggleMixin.DISABLE_DOMAIN_RESTRICTION_TOGGLE", this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     got
 * JD-Core Version:    0.7.0.1
 */