import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public final class acl
  extends xg
  implements lm
{
  aco g;
  public boolean h;
  public boolean i;
  public int j;
  public boolean k;
  acq l;
  public acm m;
  public acn n;
  final acr o = new acr(this);
  int p;
  private int q;
  private int r;
  private int s;
  private final SparseBooleanArray t = new SparseBooleanArray();
  private View u;
  private xf v;
  
  public acl(Context paramContext)
  {
    super(paramContext, efj.aQ, efj.aP);
  }
  
  public final View a(xp paramxp, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramxp.getActionView();
    if ((localView == null) || (paramxp.f())) {
      localView = super.a(paramxp, paramView, paramViewGroup);
    }
    if (paramxp.isActionViewExpanded()) {}
    for (int i1 = 8;; i1 = 0)
    {
      localView.setVisibility(i1);
      ActionMenuView localActionMenuView = (ActionMenuView)paramViewGroup;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (!localActionMenuView.checkLayoutParams(localLayoutParams)) {
        localView.setLayoutParams(localActionMenuView.a(localLayoutParams));
      }
      return localView;
    }
  }
  
  public final yb a(ViewGroup paramViewGroup)
  {
    yb localyb = super.a(paramViewGroup);
    ActionMenuView localActionMenuView = (ActionMenuView)localyb;
    localActionMenuView.c = this;
    acl localacl = localActionMenuView.c;
    localacl.e = localActionMenuView;
    localActionMenuView.a = localacl.c;
    return localyb;
  }
  
  public final void a(Context paramContext, xl paramxl)
  {
    boolean bool = true;
    super.a(paramContext, paramxl);
    Resources localResources = paramContext.getResources();
    ws localws = new ws(paramContext);
    int i1;
    if (!this.i)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        this.h = bool;
      }
    }
    else
    {
      this.q = (localws.a.getResources().getDisplayMetrics().widthPixels / 2);
      this.j = localws.a.getResources().getInteger(efj.aN);
      i1 = this.q;
      if (!this.h) {
        break label202;
      }
      if (this.g == null)
      {
        this.g = new aco(this, this.a);
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.g.measure(i2, i2);
      }
      i1 -= this.g.getMeasuredWidth();
    }
    for (;;)
    {
      this.r = i1;
      this.s = ((int)(56.0F * localResources.getDisplayMetrics().density));
      this.u = null;
      return;
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(localws.a);
      if (!nu.a.b(localViewConfiguration)) {
        break;
      }
      bool = false;
      break;
      label202:
      this.g = null;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    acs localacs = (acs)paramParcelable;
    if (localacs.a > 0)
    {
      MenuItem localMenuItem = this.c.findItem(localacs.a);
      if (localMenuItem != null) {
        a((ye)localMenuItem.getSubMenu());
      }
    }
  }
  
  public final void a(ActionMenuView paramActionMenuView)
  {
    this.e = paramActionMenuView;
    paramActionMenuView.a = this.c;
  }
  
  public final void a(xl paramxl, boolean paramBoolean)
  {
    (e() | f());
    super.a(paramxl, paramBoolean);
  }
  
  public final void a(xp paramxp, yc paramyc)
  {
    paramyc.a(paramxp, 0);
    ActionMenuView localActionMenuView = (ActionMenuView)this.e;
    ActionMenuItemView localActionMenuItemView = (ActionMenuItemView)paramyc;
    localActionMenuItemView.b = localActionMenuView;
    if (this.v == null) {
      this.v = new xf(this);
    }
    localActionMenuItemView.c = this.v;
  }
  
  public final void a(boolean paramBoolean)
  {
    ((View)this.e).getParent();
    super.a(paramBoolean);
    ((View)this.e).requestLayout();
    if (this.c != null)
    {
      xl localxl2 = this.c;
      localxl2.h();
      ArrayList localArrayList2 = localxl2.e;
      int i4 = localArrayList2.size();
      for (int i5 = 0; i5 < i4; i5++)
      {
        ll localll = ((xp)localArrayList2.get(i5)).f;
        if (localll != null) {
          localll.b = this;
        }
      }
    }
    ArrayList localArrayList1;
    int i1;
    int i2;
    int i3;
    if (this.c != null)
    {
      xl localxl1 = this.c;
      localxl1.h();
      localArrayList1 = localxl1.f;
      boolean bool = this.h;
      i1 = 0;
      if (bool)
      {
        i1 = 0;
        if (localArrayList1 != null)
        {
          i2 = localArrayList1.size();
          if (i2 != 1) {
            break label302;
          }
          if (((xp)localArrayList1.get(0)).isActionViewExpanded()) {
            break label296;
          }
          i3 = 1;
          label174:
          i1 = i3;
        }
      }
      label178:
      if (i1 == 0) {
        break label316;
      }
      if (this.g == null) {
        this.g = new aco(this, this.a);
      }
      ViewGroup localViewGroup = (ViewGroup)this.g.getParent();
      if (localViewGroup != this.e)
      {
        if (localViewGroup != null) {
          localViewGroup.removeView(this.g);
        }
        ActionMenuView localActionMenuView = (ActionMenuView)this.e;
        aco localaco = this.g;
        acw localacw = ActionMenuView.a();
        localacw.a = true;
        localActionMenuView.addView(localaco, localacw);
      }
    }
    for (;;)
    {
      ((ActionMenuView)this.e).b = this.h;
      return;
      localArrayList1 = null;
      break;
      label296:
      i3 = 0;
      break label174;
      label302:
      i1 = 0;
      if (i2 <= 0) {
        break label178;
      }
      i1 = 1;
      break label178;
      label316:
      if ((this.g != null) && (this.g.getParent() == this.e)) {
        ((ViewGroup)this.e).removeView(this.g);
      }
    }
  }
  
  public final boolean a()
  {
    ArrayList localArrayList = this.c.g();
    int i1 = localArrayList.size();
    int i2 = this.j;
    int i3 = this.r;
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.e;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    xp localxp3;
    int i30;
    if (i8 < i1)
    {
      localxp3 = (xp)localArrayList.get(i8);
      if ((0x2 & localxp3.e) == 2)
      {
        i30 = 1;
        label83:
        if (i30 == 0) {
          break label124;
        }
        i5++;
        label91:
        if ((!this.k) || (!localxp3.isActionViewExpanded())) {
          break label715;
        }
      }
    }
    label155:
    label418:
    label566:
    label572:
    label708:
    label715:
    for (int i32 = 0;; i32 = i2)
    {
      i8++;
      i2 = i32;
      break;
      i30 = 0;
      break label83;
      label124:
      if ((0x1 & localxp3.e) == 1) {}
      for (int i31 = 1;; i31 = 0)
      {
        if (i31 == 0) {
          break label155;
        }
        i6++;
        break;
      }
      i7 = 1;
      break label91;
      if ((this.h) && ((i7 != 0) || (i5 + i6 > i2))) {
        i2--;
      }
      int i9 = i2 - i5;
      SparseBooleanArray localSparseBooleanArray = this.t;
      localSparseBooleanArray.clear();
      int i10 = 0;
      int i11 = i3;
      int i12 = i9;
      int i13 = 0;
      xp localxp1;
      int i14;
      label247:
      int i16;
      int i28;
      if (i10 < i1)
      {
        localxp1 = (xp)localArrayList.get(i10);
        if ((0x2 & localxp1.e) == 2)
        {
          i14 = 1;
          if (i14 == 0) {
            break label365;
          }
          View localView2 = a(localxp1, this.u, localViewGroup);
          if (this.u == null) {
            this.u = localView2;
          }
          localView2.measure(i4, i4);
          i16 = localView2.getMeasuredWidth();
          i28 = i11 - i16;
          if (i13 != 0) {
            break label708;
          }
        }
      }
      for (;;)
      {
        int i29 = localxp1.getGroupId();
        if (i29 != 0) {
          localSparseBooleanArray.put(i29, true);
        }
        localxp1.d(true);
        int i17 = i28;
        int i18 = i12;
        i10++;
        i12 = i18;
        i11 = i17;
        i13 = i16;
        break;
        i14 = 0;
        break label247;
        label365:
        int i15;
        label379:
        int i19;
        boolean bool1;
        boolean bool2;
        int i21;
        label482:
        int i27;
        label493:
        int i20;
        boolean bool3;
        if ((0x1 & localxp1.e) == 1)
        {
          i15 = 1;
          if (i15 == 0) {
            break label649;
          }
          i19 = localxp1.getGroupId();
          bool1 = localSparseBooleanArray.get(i19);
          if (((i12 <= 0) && (!bool1)) || (i11 <= 0)) {
            break label566;
          }
          bool2 = true;
          if (!bool2) {
            break label693;
          }
          View localView1 = a(localxp1, this.u, localViewGroup);
          if (this.u == null) {
            this.u = localView1;
          }
          localView1.measure(i4, i4);
          int i25 = localView1.getMeasuredWidth();
          int i26 = i11 - i25;
          if (i13 != 0) {
            break label686;
          }
          i21 = i25;
          if (i26 + i21 <= 0) {
            break label572;
          }
          i27 = 1;
          boolean bool4 = i27 & bool2;
          i20 = i26;
          bool3 = bool4;
        }
        for (;;)
        {
          int i22;
          if ((bool3) && (i19 != 0))
          {
            localSparseBooleanArray.put(i19, true);
            i22 = i12;
          }
          for (;;)
          {
            if (bool3) {
              i22--;
            }
            localxp1.d(bool3);
            i17 = i20;
            i18 = i22;
            i16 = i21;
            break;
            i15 = 0;
            break label379;
            bool2 = false;
            break label418;
            i27 = 0;
            break label493;
            if (bool1)
            {
              localSparseBooleanArray.put(i19, false);
              int i23 = i12;
              int i24 = 0;
              for (;;)
              {
                if (i24 < i10)
                {
                  xp localxp2 = (xp)localArrayList.get(i24);
                  if (localxp2.getGroupId() == i19)
                  {
                    if (localxp2.e()) {
                      i23++;
                    }
                    localxp2.d(false);
                  }
                  i24++;
                  continue;
                  localxp1.d(false);
                  i16 = i13;
                  i17 = i11;
                  i18 = i12;
                  break;
                  return true;
                }
              }
              i22 = i23;
            }
            else
            {
              i22 = i12;
            }
          }
          i21 = i13;
          break label482;
          bool3 = bool2;
          i20 = i11;
          i21 = i13;
        }
        i16 = i13;
      }
    }
  }
  
  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.g) {
      return false;
    }
    return super.a(paramViewGroup, paramInt);
  }
  
  public final boolean a(ye paramye)
  {
    if (!paramye.hasVisibleItems()) {
      return false;
    }
    for (ye localye = paramye; localye.o != this.c; localye = (ye)localye.o) {}
    MenuItem localMenuItem = localye.getItem();
    ViewGroup localViewGroup = (ViewGroup)this.e;
    int i2;
    Object localObject;
    if (localViewGroup != null)
    {
      int i1 = localViewGroup.getChildCount();
      i2 = 0;
      if (i2 < i1)
      {
        View localView = localViewGroup.getChildAt(i2);
        if (((localView instanceof yc)) && (((yc)localView).a() == localMenuItem)) {
          localObject = localView;
        }
      }
    }
    for (;;)
    {
      if (localObject == null)
      {
        if (this.g == null)
        {
          return false;
          i2++;
          break;
          localObject = null;
          continue;
        }
        localObject = this.g;
      }
    }
    this.p = paramye.getItem().getItemId();
    this.m = new acm(this, this.b, paramye);
    this.m.e = ((View)localObject);
    this.m.d();
    super.a(paramye);
    return true;
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.c.a(false);
  }
  
  public final Parcelable c()
  {
    acs localacs = new acs();
    localacs.a = this.p;
    return localacs;
  }
  
  public final boolean c(xp paramxp)
  {
    return paramxp.e();
  }
  
  public final boolean d()
  {
    if ((this.h) && (!g()) && (this.c != null) && (this.e != null) && (this.n == null))
    {
      xl localxl = this.c;
      localxl.h();
      if (!localxl.f.isEmpty())
      {
        this.n = new acn(this, new acq(this, this.b, this.c, this.g, true));
        ((View)this.e).post(this.n);
        super.a(null);
        return true;
      }
    }
    return false;
  }
  
  public final boolean e()
  {
    if ((this.n != null) && (this.e != null))
    {
      ((View)this.e).removeCallbacks(this.n);
      this.n = null;
      return true;
    }
    acq localacq = this.l;
    if (localacq != null)
    {
      if (localacq.f()) {
        localacq.f.c();
      }
      return true;
    }
    return false;
  }
  
  public final boolean f()
  {
    if (this.m != null)
    {
      acm localacm = this.m;
      if (localacm.f()) {
        localacm.f.c();
      }
      return true;
    }
    return false;
  }
  
  public final boolean g()
  {
    return (this.l != null) && (this.l.f());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acl
 * JD-Core Version:    0.7.0.1
 */