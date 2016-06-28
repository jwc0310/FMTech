package android.support.v7.internal.widget;

import aeu;
import afe;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import efj;
import ll;
import wb;
import yq;
import yv;
import yw;
import yx;
import yy;
import yz;
import za;

public final class ActivityChooserView
  extends ViewGroup
{
  public final yz a;
  public final aeu b;
  public final Drawable c;
  public final FrameLayout d;
  public final ImageView e;
  public final FrameLayout f;
  public final ImageView g;
  public ll h;
  public final DataSetObserver i = new yv(this);
  public boolean j;
  public int k = 4;
  public int l;
  private final za m;
  private final int n;
  private final ViewTreeObserver.OnGlobalLayoutListener o = new yw(this);
  private afe p;
  private boolean q;
  
  public ActivityChooserView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, wb.D, 0, 0);
    this.k = localTypedArray.getInt(wb.F, 4);
    Drawable localDrawable = localTypedArray.getDrawable(wb.E);
    localTypedArray.recycle();
    LayoutInflater.from(getContext()).inflate(efj.aS, this, true);
    this.m = new za(this);
    this.b = ((aeu)findViewById(efj.ak));
    this.c = this.b.getBackground();
    this.f = ((FrameLayout)findViewById(efj.ar));
    this.f.setOnClickListener(this.m);
    this.f.setOnLongClickListener(this.m);
    this.g = ((ImageView)this.f.findViewById(efj.av));
    FrameLayout localFrameLayout = (FrameLayout)findViewById(efj.at);
    localFrameLayout.setOnClickListener(this.m);
    localFrameLayout.setOnTouchListener(new yx(this, localFrameLayout));
    this.d = localFrameLayout;
    this.e = ((ImageView)localFrameLayout.findViewById(efj.av));
    this.e.setImageDrawable(localDrawable);
    this.a = new yz(this);
    this.a.registerDataSetObserver(new yy(this));
    Resources localResources = paramContext.getResources();
    this.n = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(efj.m));
  }
  
  public final void a(int paramInt)
  {
    if (this.a.a == null) {
      throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
    getViewTreeObserver().addOnGlobalLayoutListener(this.o);
    boolean bool;
    int i2;
    label61:
    label93:
    afe localafe;
    if (this.f.getVisibility() == 0)
    {
      bool = true;
      int i1 = this.a.a.a();
      if (!bool) {
        break label193;
      }
      i2 = 1;
      if ((paramInt == 2147483647) || (i1 <= i2 + paramInt)) {
        break label199;
      }
      this.a.a(true);
      this.a.a(paramInt - 1);
      localafe = c();
      if (!localafe.e.isShowing())
      {
        if ((!this.j) && (bool)) {
          break label218;
        }
        this.a.a(true, bool);
      }
    }
    for (;;)
    {
      localafe.a(Math.min(this.a.a(), this.n));
      localafe.b();
      if (this.h != null) {
        this.h.a(true);
      }
      localafe.f.setContentDescription(getContext().getString(efj.bi));
      return;
      bool = false;
      break;
      label193:
      i2 = 0;
      break label61;
      label199:
      this.a.a(false);
      this.a.a(paramInt);
      break label93;
      label218:
      this.a.a(false, false);
    }
  }
  
  public final boolean a()
  {
    if ((c().e.isShowing()) || (!this.q)) {
      return false;
    }
    this.j = false;
    a(this.k);
    return true;
  }
  
  public final boolean b()
  {
    if (c().e.isShowing())
    {
      c().c();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeGlobalOnLayoutListener(this.o);
      }
    }
    return true;
  }
  
  public final afe c()
  {
    if (this.p == null)
    {
      this.p = new afe(getContext());
      this.p.a(this.a);
      this.p.n = this;
      afe localafe1 = this.p;
      localafe1.r = true;
      localafe1.e.setFocusable(true);
      this.p.o = this.m;
      afe localafe2 = this.p;
      za localza = this.m;
      localafe2.e.setOnDismissListener(localza);
    }
    return this.p;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    yq localyq = this.a.a;
    if (localyq != null) {
      localyq.registerObserver(this.i);
    }
    this.q = true;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    yq localyq = this.a.a;
    if (localyq != null) {
      localyq.unregisterObserver(this.i);
    }
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver.isAlive()) {
      localViewTreeObserver.removeGlobalOnLayoutListener(this.o);
    }
    if (c().e.isShowing()) {
      b();
    }
    this.q = false;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!c().e.isShowing()) {
      b();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    aeu localaeu = this.b;
    if (this.f.getVisibility() != 0) {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    }
    measureChild(localaeu, paramInt1, paramInt2);
    setMeasuredDimension(localaeu.getMeasuredWidth(), localaeu.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActivityChooserView
 * JD-Core Version:    0.7.0.1
 */