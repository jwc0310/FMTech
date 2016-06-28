import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.social.accountswitcher.providers.plus.AccountPagePickerView;
import java.util.Iterator;
import java.util.List;

public final class gmv
  extends mca
  implements giv, hrd, hrx
{
  private hrf Z;
  private final gms a = new gms(efj.Dk);
  private boolean aa;
  private boolean ab;
  private gld ac;
  private final gms b = new gms(efj.Dl);
  private giz c;
  private gmx d;
  
  private final void y()
  {
    List localList = this.c.a(new String[] { "logged_in" });
    this.aa = false;
    this.ab = false;
    Iterator localIterator = localList.iterator();
    if (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      gjb localgjb = this.c.a(localInteger.intValue());
      if ((!this.aa) && (localgjb.c("is_plus_page"))) {
        this.aa = true;
      }
      boolean bool1 = this.ab;
      if (((localgjb.c("is_plus_page")) && (localgjb.c("is_managed_account"))) || (localgjb.a("page_count", 0) != 0)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        this.ab = (bool2 | bool1);
        break;
      }
    }
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    if (this.aa) {
      return this.b;
    }
    return this.a;
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    AccountPagePickerView localAccountPagePickerView = (AccountPagePickerView)paramView;
    if (this.aa) {}
    for (gms localgms = this.b;; localgms = this.a)
    {
      int i = localgms.a;
      localAccountPagePickerView.a.setText(i);
      return;
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    y();
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof gms)) {
      this.ac.a(new gmw(this));
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.Z = paramhrf;
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    y();
    if (this.Z != null) {
      this.Z.aL_();
    }
  }
  
  public final View b(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Dj, null);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((giz)this.bo.a(giz.class));
    this.d = ((gmx)this.bo.a(gmx.class));
    this.ac = ((gld)this.bo.a(gld.class));
    ikt localikt = (ikt)this.bo.a(ikt.class);
    localikt.g.add(this);
    ((ikt)localikt);
  }
  
  public final View d(Context paramContext)
  {
    return null;
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
    if (this.ab) {
      return 1;
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gmv
 * JD-Core Version:    0.7.0.1
 */