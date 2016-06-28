import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bef
  implements bek, mbo, mdz, mew, mez, mfd
{
  final List<View> a = new ArrayList();
  boolean b;
  private Animation c;
  private Animation d;
  private final bek e;
  private final bk f;
  private final bei g;
  private bej h;
  private tp i;
  
  public bef(bk parambk, mek parammek, bei parambei, bek parambek)
  {
    this.f = parambk;
    this.g = parambei;
    this.e = parambek;
    parammek.a(this);
  }
  
  public final void a(Activity paramActivity)
  {
    if (this.c == null)
    {
      this.c = AnimationUtils.loadAnimation(paramActivity, efj.iG);
      this.d = AnimationUtils.loadAnimation(paramActivity, efj.iI);
      this.c.setAnimationListener(new beg(this));
      this.d.setAnimationListener(new beh(this));
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.h = ((bej)parammbb.b(bej.class));
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b == paramBoolean) {
      return;
    }
    a(paramBoolean, false);
  }
  
  @TargetApi(14)
  final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramBoolean1;
    View localView1 = this.f.N;
    int k;
    int m;
    label58:
    View localView2;
    if ((Build.VERSION.SDK_INT >= 14) && (localView1 != null))
    {
      k = localView1.getSystemUiVisibility();
      if (paramBoolean1)
      {
        m = k | 0x1;
        localView1.setSystemUiVisibility(m);
      }
    }
    else
    {
      Iterator localIterator = this.a.iterator();
      if (!localIterator.hasNext()) {
        break label153;
      }
      localView2 = (View)localIterator.next();
      if (!paramBoolean2) {
        break label121;
      }
      if (!this.b) {
        break label115;
      }
    }
    label115:
    for (int j = 8;; j = 0)
    {
      localView2.setVisibility(j);
      break label58;
      m = k & 0xFFFFFFFE;
      break;
    }
    label121:
    if (this.b) {}
    for (Animation localAnimation = this.d;; localAnimation = this.c)
    {
      localView2.startAnimation(localAnimation);
      break;
    }
    label153:
    if (paramBoolean1) {
      if (this.i != null) {
        this.i.e();
      }
    }
    for (;;)
    {
      this.e.a(paramBoolean1);
      this.h.a(paramBoolean1);
      return;
      if (this.i != null) {
        this.i.d();
      }
    }
  }
  
  public final void b()
  {
    bp localbp = this.f.f();
    if ((localbp instanceof tt)) {}
    for (tp localtp = ((tt)localbp).e().a();; localtp = null)
    {
      this.i = localtp;
      this.a.clear();
      this.g.a(this.a);
      if (this.h != null)
      {
        this.h.a(this);
        a(this.h.a(), true);
      }
      return;
    }
  }
  
  public final void c()
  {
    this.a.clear();
    if (this.h != null) {
      this.h.b(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bef
 * JD-Core Version:    0.7.0.1
 */