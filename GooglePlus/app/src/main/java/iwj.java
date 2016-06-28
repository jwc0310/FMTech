import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.navdrawer.TouchInterceptorLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class iwj
  implements giv, gmh, mbo, mes, mez, mfb, mfc, mfd
{
  public static final Uri a = Uri.parse("content://com.google.android.libraries.social.navdrawer/cover_photo");
  private static final String[] q = { "Accounts" };
  private hrg A;
  final bk b;
  public final mek c;
  public final glk d;
  public final hrs e;
  public final gmi f;
  BaseAdapter g;
  public BaseAdapter h;
  public TouchInterceptorLinearLayout i;
  public TextView j;
  public ListView k;
  public AccountSwitcherView l;
  ikt m;
  boolean n;
  public rf o;
  public iwi p;
  private final String[] r;
  private final String[] s;
  private final glz t;
  private final iwp u;
  private git v;
  private giz w;
  private gld x;
  private gmc y;
  private hrg z;
  
  public iwj(bk parambk, mek parammek, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this.b = parambk;
    this.c = parammek;
    this.r = paramArrayOfString1;
    this.s = ((String[])efj.a(q, paramArrayOfString2));
    this.t = new glz(parammek);
    this.d = new glk(parammek);
    this.e = new hry(parammek);
    this.f = new gmi(parammek);
    this.u = new iwp(this, null);
    new gxj(parammek, (byte)0).a = true;
    parambk.f(false);
    parammek.a(this);
  }
  
  public static int a(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = efj.K(paramActivity);
    int i1 = localDisplayMetrics.widthPixels;
    int i2 = efj.y(paramActivity);
    if (efj.b(efj.K(paramActivity))) {}
    for (int i3 = 64;; i3 = 56)
    {
      int i4 = (int)(i3 * localDisplayMetrics.density);
      return Math.min(i1 - i2, i4 * 5);
    }
  }
  
  private static hrg a(List<? extends hrh> paramList, String[] paramArrayOfString)
  {
    hrg localhrg = new hrg();
    int i1 = paramArrayOfString.length;
    int i2 = 0;
    String str1;
    if (i2 < i1)
    {
      str1 = paramArrayOfString[i2];
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        hrh localhrh = (hrh)localIterator.next();
        if (mfx.a(str1, localhrh.a())) {
          localhrg.addAll(localhrh.c());
        }
      }
    }
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 == 0)
      {
        String str2 = String.valueOf(str1);
        if (str2.length() != 0) {}
        for (String str3 = "Couldn't find a factory for the provider name: ".concat(str2);; str3 = new String("Couldn't find a factory for the provider name: ")) {
          throw new IllegalArgumentException(str3);
        }
      }
      i2++;
      break;
      return localhrg;
    }
  }
  
  public final rf a(View paramView)
  {
    for (View localView = paramView;; localView = (View)localView.getParent())
    {
      if (localView == null) {
        return null;
      }
      if ((localView instanceof rf)) {
        return (rf)localView;
      }
    }
  }
  
  public final void a()
  {
    this.b.f().getContentResolver().registerContentObserver(a, false, this.u);
  }
  
  final void a(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this.b.f(), paramInt);
    localAnimation.setAnimationListener(paramAnimationListener);
    this.k.clearAnimation();
    this.k.startAnimation(localAnimation);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.v = ((git)parammbb.a(git.class));
    this.w = ((giz)parammbb.a(giz.class));
    this.x = ((gld)parammbb.a(gld.class));
    this.y = ((gmc)parammbb.a(gmc.class));
    this.m = ((ikt)parammbb.a(ikt.class));
    ((ikt)this.m.a(this));
    this.p = ((iwi)parammbb.a(iwi.class));
    this.p.a((mca)this.b, new ArrayList());
    this.z = a(parammbb.c(hrp.class), this.r);
    this.A = a(parammbb.c(hrc.class), this.s);
  }
  
  public final void a(Bundle paramBundle)
  {
    new hri(this.A, "AccountSwitcher", new iwl(this), this.b.h(), this.c, null);
    new hri(this.z, "Navigation", new iwm(this), this.b.h(), this.c, null);
  }
  
  public final void a(Parcelable paramParcelable)
  {
    this.e.a(paramParcelable);
    if (this.h != null) {
      this.h.notifyDataSetChanged();
    }
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (!this.v.d())
    {
      glk localglk2 = this.d;
      localglk2.a();
      int i3 = localglk2.a(glm.a);
      localglk2.a(glm.a, -1);
      if (i3 == -1)
      {
        List localList = this.w.a(new String[] { "logged_in" });
        if (!localList.isEmpty()) {
          i3 = ((Integer)localList.get(0)).intValue();
        }
      }
      if (i3 == -1)
      {
        this.j.setVisibility(0);
        this.l.setVisibility(8);
        this.k.setVisibility(8);
        return;
      }
      this.x.a(new gme(i3));
      return;
    }
    glz localglz = this.t;
    AccountSwitcherView localAccountSwitcherView = this.l;
    glk localglk1 = this.d;
    gla localgla = new gla(paramInt2, localglz.a.a(paramInt2), localglz.c);
    int i1;
    if ((paramInt1 != -1) && (paramInt2 != -1) && (paramInt1 != paramInt2))
    {
      i1 = localglk1.a(glm.a);
      int i2 = localglk1.a(glm.b);
      if (localglk1.a == gln.b)
      {
        if (paramInt2 == i1) {
          break label383;
        }
        if (paramInt2 == i2) {
          localglk1.a(glm.b, paramInt1);
        }
        localglz.a(localAccountSwitcherView, localgla);
        localglz.a(localAccountSwitcherView, localglk1);
        if ((localglk1.a != gln.c) && (localglz.f != null)) {
          localglz.f.a(localAccountSwitcherView.getContext());
        }
        localglk1.a = gln.a;
      }
    }
    for (;;)
    {
      if ((paramInt2 != -1) && (paramInt1 != paramInt2))
      {
        gmi localgmi = localglz.e;
        localgmi.a = false;
        localgmi.a();
        localgmi.b();
      }
      h();
      return;
      if (paramInt2 != i1) {
        localglk1.a(glm.b, i1);
      }
      label383:
      localglk1.a(glm.a, paramInt1);
      break;
      localglz.a(localAccountSwitcherView, localgla);
      localglz.a(localAccountSwitcherView, localglk1);
    }
  }
  
  public final void aK_()
  {
    this.b.f().getContentResolver().unregisterContentObserver(this.u);
  }
  
  public final void b()
  {
    i();
  }
  
  public final void c()
  {
    if (!this.b.s)
    {
      f();
      return;
    }
    a(17432577, new iwn(this));
  }
  
  public final void d()
  {
    if ((!this.n) || (!this.b.s))
    {
      g();
      return;
    }
    a(17432577, new iwo(this));
  }
  
  public final void e()
  {
    if (this.o != null) {
      this.o.c(8388611);
    }
  }
  
  final void f()
  {
    this.n = true;
    this.k.setAdapter(this.g);
    efj.a(this.k, new gxq(pjl.a));
  }
  
  final void g()
  {
    this.n = false;
    this.k.setAdapter(this.h);
    efj.a(this.k, new gxq(pjs.i));
  }
  
  public final void h()
  {
    if (this.v.d())
    {
      this.j.setVisibility(8);
      this.l.setVisibility(0);
      this.k.setVisibility(0);
    }
  }
  
  final void i()
  {
    if (this.v.d())
    {
      gla localgla = new gla(this.v.c(), this.v.f(), this.y);
      this.t.a(this.l, localgla);
      this.t.a(this.l, this.d);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iwj
 * JD-Core Version:    0.7.0.1
 */