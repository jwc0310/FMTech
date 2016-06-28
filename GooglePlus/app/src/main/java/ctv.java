import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class ctv
  extends mca
  implements giv, hrd, hrx
{
  private cud Z = new cud(this.bn, this.bp, this.d);
  private dtz a;
  private git b;
  private hrf c;
  private final ArrayList<cua> d = new ArrayList();
  
  private void y()
  {
    this.d.clear();
    if (this.Z.a())
    {
      if (this.a.a(this.bn, this.b.c())) {
        this.d.add(new cua(6, efj.zL, efj.Ac, pjs.g));
      }
      this.d.add(new cua(7, efj.zK, efj.Ab, pjs.f));
      z();
    }
    for (;;)
    {
      if (this.c != null) {
        this.c.aL_();
      }
      return;
      z();
    }
  }
  
  private void z()
  {
    this.d.add(new cua(8, efj.zO, efj.Ai, pjs.l));
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.d.get(paramInt);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    this.Z.a(paramInt, paramView, paramBoolean);
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    y();
  }
  
  public final void a(Parcelable paramParcelable)
  {
    this.Z.a(f(), paramParcelable);
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.c = paramhrf;
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
    this.b = ((git)this.bo.a(git.class));
    this.a = ((dtz)this.bo.a(dtz.class));
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
    return this.d.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctv
 * JD-Core Version:    0.7.0.1
 */