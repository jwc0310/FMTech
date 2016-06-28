import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class xx
  implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, xz
{
  static final int a = efj.ba;
  final LayoutInflater b;
  final xl c;
  final boolean d;
  public View e;
  public afe f;
  public ya g;
  public boolean h;
  public int i = 0;
  private final Context j;
  private final xy k;
  private final int l;
  private final int m;
  private final int n;
  private ViewTreeObserver o;
  private ViewGroup p;
  private boolean q;
  private int r;
  
  public xx(Context paramContext, xl paramxl, View paramView)
  {
    this(paramContext, paramxl, paramView, false, aau.X);
  }
  
  public xx(Context paramContext, xl paramxl, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramxl, paramView, paramBoolean, paramInt, 0);
  }
  
  public xx(Context paramContext, xl paramxl, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.j = paramContext;
    this.b = LayoutInflater.from(paramContext);
    this.c = paramxl;
    this.k = new xy(this, this.c);
    this.d = paramBoolean;
    this.m = paramInt1;
    this.n = paramInt2;
    Resources localResources = paramContext.getResources();
    this.l = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(efj.m));
    this.e = paramView;
    paramxl.a(this, paramContext);
  }
  
  public final void a(Context paramContext, xl paramxl) {}
  
  public final void a(Parcelable paramParcelable) {}
  
  public final void a(xl paramxl, boolean paramBoolean)
  {
    if (paramxl != this.c) {}
    do
    {
      return;
      if (f()) {
        this.f.c();
      }
    } while (this.g == null);
    this.g.a(paramxl, paramBoolean);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.q = false;
    if (this.k != null) {
      this.k.notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(xp paramxp)
  {
    return false;
  }
  
  public final boolean a(ye paramye)
  {
    xx localxx;
    int i2;
    if (paramye.hasVisibleItems())
    {
      localxx = new xx(this.j, paramye, this.e);
      localxx.g = this.g;
      int i1 = paramye.size();
      i2 = 0;
      if (i2 >= i1) {
        break label118;
      }
      MenuItem localMenuItem = paramye.getItem(i2);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null)) {}
    }
    label118:
    for (boolean bool = true;; bool = false)
    {
      localxx.h = bool;
      if (localxx.e())
      {
        if (this.g != null) {
          this.g.a_(paramye);
        }
        return true;
        i2++;
        break;
      }
      return false;
    }
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final boolean b(xp paramxp)
  {
    return false;
  }
  
  public final Parcelable c()
  {
    return null;
  }
  
  public final void d()
  {
    if (!e()) {
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
  }
  
  public final boolean e()
  {
    int i1 = 0;
    this.f = new afe(this.j, null, this.m, this.n);
    this.f.e.setOnDismissListener(this);
    this.f.o = this;
    this.f.a(this.k);
    afe localafe = this.f;
    localafe.r = true;
    localafe.e.setFocusable(true);
    View localView1 = this.e;
    int i6;
    View localView2;
    View localView3;
    label210:
    int i9;
    if (localView1 != null)
    {
      if (this.o == null) {}
      for (int i2 = 1;; i2 = 0)
      {
        this.o = localView1.getViewTreeObserver();
        if (i2 != 0) {
          this.o.addOnGlobalLayoutListener(this);
        }
        this.f.n = localView1;
        this.f.k = this.i;
        if (!this.q)
        {
          xy localxy = this.k;
          int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i5 = localxy.getCount();
          i6 = 0;
          int i7 = 0;
          localView2 = null;
          if (i6 < i5)
          {
            int i8 = localxy.getItemViewType(i6);
            if (i8 == i7) {
              break label354;
            }
            i7 = i8;
            localView3 = null;
            if (this.p == null) {
              this.p = new FrameLayout(this.j);
            }
            localView2 = localxy.getView(i6, localView3, this.p);
            localView2.measure(i3, i4);
            i9 = localView2.getMeasuredWidth();
            if (i9 < this.l) {
              break;
            }
            i1 = this.l;
          }
          this.r = i1;
          this.q = true;
        }
        this.f.a(this.r);
        this.f.e.setInputMethodMode(2);
        this.f.b();
        this.f.f.setOnKeyListener(this);
        return true;
      }
    }
    return false;
    if (i9 > i1) {}
    for (;;)
    {
      i6++;
      i1 = i9;
      break;
      label354:
      localView3 = localView2;
      break label210;
      i9 = i1;
    }
  }
  
  public final boolean f()
  {
    return (this.f != null) && (this.f.e.isShowing());
  }
  
  public void onDismiss()
  {
    this.f = null;
    this.c.close();
    if (this.o != null)
    {
      if (!this.o.isAlive()) {
        this.o = this.e.getViewTreeObserver();
      }
      this.o.removeGlobalOnLayoutListener(this);
      this.o = null;
    }
  }
  
  public void onGlobalLayout()
  {
    if (f())
    {
      View localView = this.e;
      if ((localView != null) && (localView.isShown())) {
        break label38;
      }
      if (f()) {
        this.f.c();
      }
    }
    label38:
    while (!f()) {
      return;
    }
    this.f.b();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    xy localxy = this.k;
    localxy.a.a((xp)localxy.getItem(paramInt), null, 0);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      if (f()) {
        this.f.c();
      }
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     xx
 * JD-Core Version:    0.7.0.1
 */