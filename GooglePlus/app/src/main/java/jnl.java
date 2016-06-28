import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class jnl
  extends mca
  implements giv, hrd, hrx, jhw
{
  private List<jnh> Z;
  boolean a;
  private jgu aa;
  private List<jgw> ab = Collections.emptyList();
  private iwj ac;
  private iwv ad;
  private jnn ae;
  private boolean af;
  private git b;
  private hrf c;
  private jiw d;
  
  private static void a(TextView paramTextView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt, 0, 0, 0);
      return;
    }
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(paramInt, 0, 0, 0);
  }
  
  private final void z()
  {
    boolean bool1 = this.af;
    if ((this.ae == null) || (this.ae.a())) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      this.af = bool2;
      if (bool1 != this.af) {
        y();
      }
      return;
    }
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.ab.get(paramInt);
  }
  
  public final void a()
  {
    this.ab = this.aa.a();
    y();
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jgw localjgw = (jgw)this.ab.get(paramInt);
    TextView localTextView = (TextView)paramView.findViewById(efj.SC);
    this.ad.a(paramView, paramBoolean);
    localTextView.setText(localjgw.c());
    a(localTextView, aau.AF);
  }
  
  public final void a(Context paramContext, View paramView)
  {
    TextView localTextView = (TextView)paramView.findViewById(efj.SC);
    localTextView.setText(paramContext.getText(efj.SG));
    a(localTextView, aau.AG);
    if (this.a)
    {
      paramView.findViewById(efj.SE).setVisibility(8);
      paramView.findViewById(efj.SD).setVisibility(0);
    }
    for (;;)
    {
      paramView.setOnClickListener(new jnm(this));
      return;
      paramView.findViewById(efj.SE).setVisibility(0);
      paramView.findViewById(efj.SD).setVisibility(8);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.a = paramBundle.getBoolean("is_expanded");
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof jgw))
    {
      jgw localjgw = (jgw)paramParcelable;
      Iterator localIterator = this.Z.iterator();
      while (localIterator.hasNext()) {
        ((jnh)localIterator.next()).a(localjgw);
      }
      this.ac.a(paramParcelable);
      this.ac.e();
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.c = paramhrf;
  }
  
  public final void a(jgu paramjgu)
  {
    this.aa = paramjgu;
    this.ab = paramjgu.a();
    y();
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramgiu2 == giu.c)
    {
      z();
      if (this.af) {
        this.d.a(this, this.b.c(), jgx.s);
      }
    }
  }
  
  public final View b(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.SF, null, false);
  }
  
  public final View c(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.SF, null, false);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((git)this.bo.a(git.class));
    this.d = ((jiw)this.bo.a(jiw.class));
    this.Z = this.bo.c(jnh.class);
    ((ikt)((ikt)this.bo.a(ikt.class)).a(this));
    this.ac = ((iwj)this.bo.a(iwj.class));
    this.ad = ((iwv)this.bo.a(iwv.class));
    this.ae = ((jnn)this.bo.b(jnn.class));
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("is_expanded", this.a);
  }
  
  public final void m()
  {
    super.m();
    z();
    if ((this.af) && (this.b.d())) {
      this.d.a(this, this.b.c(), jgx.s);
    }
  }
  
  public final void n()
  {
    super.n();
    if (this.aa != null) {
      this.aa.b();
    }
  }
  
  public final boolean v()
  {
    return this.af;
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final int x()
  {
    if (!this.af) {}
    while (!this.a) {
      return 0;
    }
    return this.ab.size();
  }
  
  final void y()
  {
    if (this.c != null) {
      this.c.aL_();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnl
 * JD-Core Version:    0.7.0.1
 */