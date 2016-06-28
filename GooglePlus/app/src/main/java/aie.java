import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

public final class aie
  implements xz
{
  public xp a;
  private xl b;
  
  public aie(Toolbar paramToolbar) {}
  
  public final void a(Context paramContext, xl paramxl)
  {
    if ((this.b != null) && (this.a != null)) {
      this.b.b(this.a);
    }
    this.b = paramxl;
  }
  
  public final void a(Parcelable paramParcelable) {}
  
  public final void a(xl paramxl, boolean paramBoolean) {}
  
  public final void a(boolean paramBoolean)
  {
    int i;
    int j;
    if (this.a != null)
    {
      xl localxl = this.b;
      i = 0;
      if (localxl != null) {
        j = this.b.size();
      }
    }
    for (int k = 0;; k++)
    {
      i = 0;
      if (k < j)
      {
        if (this.b.getItem(k) == this.a) {
          i = 1;
        }
      }
      else
      {
        if (i == 0) {
          b(this.a);
        }
        return;
      }
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(xp paramxp)
  {
    Toolbar localToolbar = this.c;
    if (localToolbar.g == null)
    {
      localToolbar.g = new ImageButton(localToolbar.getContext(), null, aau.ae);
      localToolbar.g.setImageDrawable(localToolbar.e);
      localToolbar.g.setContentDescription(localToolbar.f);
      aif localaif2 = new aif(-2, -2);
      localaif2.a = (0x800003 | 0x70 & localToolbar.m);
      localaif2.b = 2;
      localToolbar.g.setLayoutParams(localaif2);
      localToolbar.g.setOnClickListener(new aid(localToolbar));
    }
    if (this.c.g.getParent() != this.c) {
      this.c.addView(this.c.g);
    }
    this.c.h = paramxp.getActionView();
    this.a = paramxp;
    if (this.c.h.getParent() != this.c)
    {
      aif localaif1 = new aif(-2, -2);
      localaif1.a = (0x800003 | 0x70 & this.c.m);
      localaif1.b = 2;
      this.c.h.setLayoutParams(localaif1);
      this.c.addView(this.c.h);
    }
    this.c.i();
    this.c.requestLayout();
    paramxp.e(true);
    if ((this.c.h instanceof ack)) {
      ((ack)this.c.h).a();
    }
    return true;
  }
  
  public final boolean a(ye paramye)
  {
    return false;
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final boolean b(xp paramxp)
  {
    if ((this.c.h instanceof ack)) {
      ((ack)this.c.h).b();
    }
    this.c.removeView(this.c.h);
    this.c.removeView(this.c.g);
    this.c.h = null;
    Toolbar localToolbar = this.c;
    for (int i = -1 + localToolbar.q.size(); i >= 0; i--) {
      localToolbar.addView((View)localToolbar.q.get(i));
    }
    localToolbar.q.clear();
    this.a = null;
    this.c.requestLayout();
    paramxp.g = false;
    paramxp.b.b(false);
    return true;
  }
  
  public final Parcelable c()
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aie
 * JD-Core Version:    0.7.0.1
 */