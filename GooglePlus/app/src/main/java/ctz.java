import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class ctz
  extends mca
  implements giv, hrd, hrx
{
  private hrf a;
  private final ArrayList<cua> b = new ArrayList();
  private cud c = new cud(this.bn, this.bp, this.b);
  
  private void y()
  {
    this.b.clear();
    if (this.c.a())
    {
      this.b.add(new cua(9, efj.zJ, efj.Ah, pjs.k));
      this.b.add(new cua(5, efj.zN, efj.Ag, pjs.j));
    }
    if (this.a != null) {
      this.a.aL_();
    }
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.b.get(paramInt);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    this.c.a(paramInt, paramView, paramBoolean);
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    y();
  }
  
  public final void a(Parcelable paramParcelable)
  {
    this.c.a(f(), paramParcelable);
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.a = paramhrf;
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramgiu2 == giu.c) {
      y();
    }
  }
  
  public final View b(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Aa, (ViewGroup)this.N, false);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
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
    return this.b.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctz
 * JD-Core Version:    0.7.0.1
 */