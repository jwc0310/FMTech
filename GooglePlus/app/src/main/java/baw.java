import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class baw
  extends mca
{
  private final bay Z = new bay(this);
  bdk a;
  private final baz aa = new baz(this);
  private final bba ab = new bba(this);
  private final bbb ac = new bbb(this);
  private beu ad;
  private Toast ae;
  private Toast af;
  int b;
  boolean c;
  Button d;
  
  public baw()
  {
    new jeq(this.bp, new bax(this), '\000');
  }
  
  private final void w()
  {
    if (this.ae != null) {
      this.ae.cancel();
    }
    this.ae = null;
  }
  
  private final boolean x()
  {
    if ((this.af != null) && (this.af.getView().getWindowToken() != null))
    {
      this.af.cancel();
      this.af = null;
      return true;
    }
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d = ((Button)paramLayoutInflater.inflate(efj.vL, paramViewGroup, false));
    this.d.setOnClickListener(this.Z);
    this.d.setOnLongClickListener(this.aa);
    this.d.setOnTouchListener(this.ab);
    return this.d;
  }
  
  final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.a == null) || (paramBoolean1 == this.a.e) || ((paramBoolean1) && (!v()))) {
      return;
    }
    bdk localbdk = this.a;
    localbdk.e = paramBoolean1;
    localbdk.a.a();
    w();
    x();
    String str;
    if (paramBoolean2)
    {
      if (!this.a.e) {
        break label162;
      }
      str = g().getString(aau.ng);
    }
    for (;;)
    {
      this.ae = Toast.makeText(f(), str, 0);
      this.ae.setGravity(49, 0, 0);
      this.ae.show();
      if (this.ad == null) {
        break;
      }
      switch (this.b)
      {
      default: 
        return;
      case 1: 
        this.ad.a(gxz.dk);
        return;
        label162:
        if (this.b == 1) {
          str = g().getString(aau.mZ);
        } else {
          str = g().getString(aau.na);
        }
        break;
      }
    }
    this.ad.a(gxz.dl);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ad = ((beu)this.bo.a(beu.class));
    this.a = ((bdk)this.bo.a(bdk.class));
  }
  
  public final void d_()
  {
    super.d_();
    w();
    x();
  }
  
  public final void f_()
  {
    super.f_();
    a(false, false);
  }
  
  public final void m()
  {
    super.m();
    if (this.ad != null) {
      this.ad.a(this.ac);
    }
  }
  
  public final void n()
  {
    super.n();
    if (this.ad != null) {
      this.ad.b(this.ac);
    }
  }
  
  final boolean v()
  {
    return (this.b == 2) || (this.b == 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     baw
 * JD-Core Version:    0.7.0.1
 */