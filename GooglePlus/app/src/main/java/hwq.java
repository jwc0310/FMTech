import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public final class hwq
  implements mec, mes, mew, mez, mfd
{
  public boolean a = true;
  public boolean b = true;
  public int c;
  public CharSequence d;
  public int e;
  public CharSequence f;
  public hwt g = hwt.a;
  public hwp h;
  private View i;
  private TextView j;
  private View k;
  private TextView l;
  private View.OnClickListener m;
  private boolean n;
  private boolean o;
  private final hws p = new hws(this);
  
  public hwq(mek parammek)
  {
    parammek.a(this);
  }
  
  private static void a(TextView paramTextView, int paramInt, CharSequence paramCharSequence)
  {
    if (paramTextView == null) {
      return;
    }
    if (paramInt != 0) {
      paramCharSequence = paramTextView.getContext().getString(paramInt);
    }
    paramTextView.setText(paramCharSequence);
  }
  
  public final hwq a(View.OnClickListener paramOnClickListener)
  {
    if (this.j == null) {}
    for (int i1 = 1; i1 == 0; i1 = 0) {
      throw new IllegalArgumentException();
    }
    this.m = paramOnClickListener;
    return this;
  }
  
  public final void a()
  {
    if ((!this.o) || (this.i == null)) {}
    label90:
    do
    {
      hws localhws;
      do
      {
        return;
        switch (hwr.a[this.g.ordinal()])
        {
        default: 
          throw new IllegalStateException();
        case 1: 
          if (!this.n) {
            break label90;
          }
          localhws = this.p;
        }
      } while (localhws.hasMessages(0));
      localhws.sendEmptyMessageDelayed(0, 800L);
      return;
      d();
      return;
      this.p.removeMessages(0);
      if (this.a)
      {
        this.k.setVisibility(8);
        this.i.setVisibility(0);
        this.j.setVisibility(0);
      }
      while (this.h != null)
      {
        this.h.a();
        return;
        this.i.setVisibility(8);
      }
      this.p.removeMessages(0);
      this.i.setVisibility(8);
    } while (this.h == null);
    this.h.c();
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.n = true;
    }
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    this.i = paramView.findViewById(16908292);
    if (this.i != null)
    {
      this.j = ((TextView)this.i.findViewById(efj.Lt));
      this.j.setOnClickListener(this.m);
      this.k = this.i.findViewById(efj.Lr);
      this.l = ((TextView)this.i.findViewById(efj.Ls));
      e();
    }
  }
  
  public final void a(hwt paramhwt)
  {
    if (paramhwt == null) {
      throw new NullPointerException();
    }
    this.g = ((hwt)paramhwt);
    a();
  }
  
  public final void b()
  {
    this.o = true;
    a();
  }
  
  public final void c()
  {
    this.o = false;
  }
  
  final void d()
  {
    if ((this.o) && (this.i != null) && (this.g == hwt.a))
    {
      if (!this.b) {
        break label71;
      }
      this.j.setVisibility(8);
      this.i.setVisibility(0);
      this.k.setVisibility(0);
    }
    for (;;)
    {
      if (this.h != null) {
        this.h.b();
      }
      return;
      label71:
      this.i.setVisibility(8);
    }
  }
  
  public final void e()
  {
    if (this.i == null) {
      return;
    }
    a(this.j, this.c, this.d);
    a(this.l, this.e, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwq
 * JD-Core Version:    0.7.0.1
 */