import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.social.accountswitcher.AccountActionView;
import java.util.Iterator;
import java.util.List;

public final class gmk
  extends mca
  implements hrd, hrx
{
  private gxq Z;
  private gkz a;
  private hrf b;
  private List<gky> c;
  private gkv d;
  
  static final Bundle a(gkv paramgkv, gxq paramgxq)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("AccountActionDataKey", paramgkv);
    localBundle.putSerializable("AccountActionVEKey", paramgxq);
    return localBundle;
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return this.d;
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    AccountActionView localAccountActionView = (AccountActionView)paramView;
    gkv localgkv = this.d;
    int i = localgkv.b;
    efj.a(localAccountActionView.a, i, 0, 0, 0);
    int j = localgkv.c;
    localAccountActionView.a.setText(localAccountActionView.getContext().getText(j));
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.m != null)
    {
      this.d = ((gkv)this.m.getParcelable("AccountActionDataKey"));
      this.Z = ((gxq)this.m.getSerializable("AccountActionVEKey"));
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof gkv))
    {
      gkv localgkv = (gkv)paramParcelable;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((gky)localIterator.next()).a(localgkv.a);
      }
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.b = paramhrf;
  }
  
  public final View b(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(efj.De, null);
    efj.a(localView, this.Z);
    return localView;
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((gkz)this.bo.a(gkz.class));
    this.c = this.bo.c(gky.class);
    if (this.b != null) {
      this.b.aL_();
    }
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
    return 1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gmk
 * JD-Core Version:    0.7.0.1
 */