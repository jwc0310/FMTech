import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.accountswitcher.AccountItemView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.Collections;
import java.util.List;

public final class gmo
  extends mca
  implements giv, gjh, hrd, hrx
{
  private List<Integer> Z = Collections.EMPTY_LIST;
  private giz a;
  private gld aa;
  private gmc ab;
  private git b;
  private glc c;
  private hrf d;
  
  private final List<Integer> y()
  {
    List localList = this.a.a(new String[] { "logged_in" });
    localList.addAll(this.a.a(new String[] { "has_irrecoverable_error" }));
    localList.remove(Integer.valueOf(this.b.c()));
    return localList;
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    int i = ((Integer)this.Z.get(paramInt)).intValue();
    return new gla(i, this.a.a(i), this.ab);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    int i = ((Integer)this.Z.get(paramInt)).intValue();
    gjb localgjb = this.a.a(i);
    AccountItemView localAccountItemView = (AccountItemView)paramView;
    gla localgla = new gla(i, localgjb, this.ab);
    String str1 = localgla.b;
    String str2 = localgla.e;
    localAccountItemView.a.a(str1, str2);
    String str3 = localgla.c;
    localAccountItemView.b.setText(str3);
    String str4 = localgla.d;
    localAccountItemView.c.setText(str4);
    boolean bool = localgla.f;
    localAccountItemView.e = bool;
    if (bool)
    {
      localAccountItemView.b.setVisibility(8);
      localAccountItemView.c.setTextColor(localAccountItemView.getResources().getColor(aau.xy));
      localAccountItemView.d.setVisibility(0);
      return;
    }
    localAccountItemView.b.setVisibility(0);
    localAccountItemView.c.setTextColor(localAccountItemView.getResources().getColor(aau.xz));
    localAccountItemView.d.setVisibility(8);
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a.a(this);
    this.Z = y();
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof gla))
    {
      gla localgla = (gla)paramParcelable;
      this.aa.a(new gme(localgla.a));
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.d = paramhrf;
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    az_();
  }
  
  public final void az_()
  {
    this.Z = y();
    if (this.d != null) {
      this.d.aL_();
    }
  }
  
  public final View b(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(efj.Df, null);
    efj.a(localView, new gxq(pjl.f));
    return localView;
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((giz)this.bo.a(giz.class));
    this.b = ((git)this.bo.a(git.class));
    this.c = ((glc)this.bo.a(glc.class));
    this.aa = ((gld)this.bo.a(gld.class));
    this.ab = ((gmc)this.bo.a(gmc.class));
    ikt localikt = (ikt)this.bo.a(ikt.class);
    localikt.g.add(this);
    ((ikt)localikt);
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void o()
  {
    super.o();
    this.a.b(this);
  }
  
  public final boolean v()
  {
    return false;
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final int x()
  {
    return this.Z.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gmo
 * JD-Core Version:    0.7.0.1
 */