package android.support.v7.app;

import aam;
import aao;
import aas;
import aay;
import acg;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Toast;
import bj;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import efj;
import gl;
import gm;
import java.util.List;
import vn;
import vo;
import vs;
import vz;
import wa;

public class MediaRouteButton
  extends View
{
  private static final int[] l = { 16842912 };
  private static final int[] m = { 16842911 };
  boolean a;
  private final aao b;
  private final vn c;
  private aam d = aam.c;
  private wa e = wa.a;
  private boolean f;
  private Drawable g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  
  public MediaRouteButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, efj.bt);
  }
  
  public MediaRouteButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(efj.a(paramContext), paramAttributeSet, paramInt);
    Context localContext = getContext();
    this.b = aao.a(localContext);
    this.c = new vn(this);
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, acg.a, paramInt, 0);
    Drawable localDrawable = localTypedArray.getDrawable(acg.d);
    if (this.g != null)
    {
      this.g.setCallback(null);
      unscheduleDrawable(this.g);
    }
    this.g = localDrawable;
    if (localDrawable != null)
    {
      localDrawable.setCallback(this);
      localDrawable.setState(getDrawableState());
      if (getVisibility() != 0) {
        break label189;
      }
    }
    label189:
    for (boolean bool = true;; bool = false)
    {
      localDrawable.setVisible(bool, false);
      refreshDrawableState();
      this.j = localTypedArray.getDimensionPixelSize(acg.c, 0);
      this.k = localTypedArray.getDimensionPixelSize(acg.b, 0);
      localTypedArray.recycle();
      setClickable(true);
      setLongClickable(true);
      return;
    }
  }
  
  public final void a(aam paramaam)
  {
    if (paramaam == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (!this.d.equals(paramaam))
    {
      if (this.f)
      {
        aam localaam = this.d;
        localaam.a();
        if (!localaam.b.isEmpty()) {
          this.b.a(this.c);
        }
        paramaam.a();
        if (!paramaam.b.isEmpty()) {
          this.b.a(paramaam, this.c, 0);
        }
      }
      this.d = paramaam;
      b();
    }
  }
  
  public final void a(wa paramwa)
  {
    if (paramwa == null) {
      throw new IllegalArgumentException("factory must not be null");
    }
    this.e = paramwa;
  }
  
  public final boolean a()
  {
    if (!this.f) {
      return false;
    }
    Context localContext = getContext();
    if ((localContext instanceof ContextWrapper)) {
      if (!(localContext instanceof Activity)) {}
    }
    bz localbz;
    for (Activity localActivity = (Activity)localContext;; localActivity = null)
    {
      boolean bool = localActivity instanceof bp;
      localbz = null;
      if (bool) {
        localbz = ((bp)localActivity).b.a.d;
      }
      if (localbz != null) {
        break label91;
      }
      throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
      localContext = ((ContextWrapper)localContext).getBaseContext();
      break;
    }
    label91:
    aao.a();
    aay localaay = aao.b.b();
    if ((localaay.b()) || (!localaay.a(this.d)))
    {
      if (localbz.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
        return false;
      }
      vs localvs = wa.a();
      aam localaam = this.d;
      if (localaam == null) {
        throw new IllegalArgumentException("selector must not be null");
      }
      localvs.v();
      if (!localvs.Z.equals(localaam))
      {
        localvs.Z = localaam;
        Bundle localBundle = localvs.m;
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putBundle("selector", localaam.a);
        localvs.f(localBundle);
        vo localvo = (vo)localvs.d;
        if (localvo != null) {
          localvo.a(localaam);
        }
      }
      localvs.a(localbz, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
    }
    for (;;)
    {
      return true;
      if (localbz.a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
        return false;
      }
      wa.b().a(localbz, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
    }
  }
  
  public final void b()
  {
    boolean bool1;
    if (this.f)
    {
      aao.a();
      aay localaay = aao.b.b();
      if ((localaay.b()) || (!localaay.a(this.d))) {
        break label156;
      }
      bool1 = true;
      if ((!bool1) || (!localaay.g)) {
        break label161;
      }
    }
    label156:
    label161:
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool3 = this.h;
      int n = 0;
      if (bool3 != bool1)
      {
        this.h = bool1;
        n = 1;
      }
      if (this.i != bool2)
      {
        this.i = bool2;
        n = 1;
      }
      if (n != 0)
      {
        refreshDrawableState();
        if ((this.i) && ((this.g.getCurrent() instanceof AnimationDrawable)))
        {
          AnimationDrawable localAnimationDrawable = (AnimationDrawable)this.g.getCurrent();
          if (!localAnimationDrawable.isRunning()) {
            localAnimationDrawable.start();
          }
        }
      }
      setEnabled(aao.a(this.d, 1));
      return;
      bool1 = false;
      break;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.g != null)
    {
      int[] arrayOfInt = getDrawableState();
      this.g.setState(arrayOfInt);
      invalidate();
    }
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (getBackground() != null)
    {
      Drawable localDrawable2 = getBackground();
      gl.a.a(localDrawable2);
    }
    if (this.g != null)
    {
      Drawable localDrawable1 = this.g;
      gl.a.a(localDrawable1);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.f = true;
    aam localaam = this.d;
    localaam.a();
    if (!localaam.b.isEmpty()) {
      this.b.a(this.d, this.c, 0);
    }
    b();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.i) {
      mergeDrawableStates(arrayOfInt, m);
    }
    while (!this.h) {
      return arrayOfInt;
    }
    mergeDrawableStates(arrayOfInt, l);
    return arrayOfInt;
  }
  
  public void onDetachedFromWindow()
  {
    this.f = false;
    aam localaam = this.d;
    localaam.a();
    if (!localaam.b.isEmpty()) {
      this.b.a(this.c);
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.g != null)
    {
      int n = getPaddingLeft();
      int i1 = getWidth() - getPaddingRight();
      int i2 = getPaddingTop();
      int i3 = getHeight() - getPaddingBottom();
      int i4 = this.g.getIntrinsicWidth();
      int i5 = this.g.getIntrinsicHeight();
      int i6 = n + (i1 - n - i4) / 2;
      int i7 = i2 + (i3 - i2 - i5) / 2;
      this.g.setBounds(i6, i7, i6 + i4, i7 + i5);
      this.g.draw(paramCanvas);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = this.j;
    int i5;
    int i6;
    int i9;
    int i10;
    label134:
    int i11;
    if (this.g != null)
    {
      i5 = this.g.getIntrinsicWidth();
      i6 = Math.max(i4, i5);
      int i7 = this.k;
      Drawable localDrawable = this.g;
      int i8 = 0;
      if (localDrawable != null) {
        i8 = this.g.getIntrinsicHeight();
      }
      i9 = Math.max(i7, i8);
      switch (i2)
      {
      default: 
        i10 = i6 + getPaddingLeft() + getPaddingRight();
        switch (i3)
        {
        default: 
          i11 = i9 + getPaddingTop() + getPaddingBottom();
        }
        break;
      }
    }
    for (;;)
    {
      setMeasuredDimension(i10, i11);
      return;
      i5 = 0;
      break;
      i10 = n;
      break label134;
      i10 = Math.min(n, i6 + getPaddingLeft() + getPaddingRight());
      break label134;
      i11 = i1;
      continue;
      i11 = Math.min(i1, i9 + getPaddingTop() + getPaddingBottom());
    }
  }
  
  public boolean performClick()
  {
    boolean bool1 = super.performClick();
    if (!bool1) {
      playSoundEffect(0);
    }
    boolean bool2;
    if (!a())
    {
      bool2 = false;
      if (!bool1) {}
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public boolean performLongClick()
  {
    if (super.performLongClick()) {
      return true;
    }
    if (!this.a) {
      return false;
    }
    CharSequence localCharSequence = getContentDescription();
    if (TextUtils.isEmpty(localCharSequence)) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int n = getWidth();
    int i1 = getHeight();
    int i2 = arrayOfInt[1] + i1 / 2;
    int i3 = localContext.getResources().getDisplayMetrics().widthPixels;
    Toast localToast = Toast.makeText(localContext, localCharSequence, 0);
    if (i2 < localRect.height()) {
      localToast.setGravity(8388661, i3 - arrayOfInt[0] - n / 2, i1);
    }
    for (;;)
    {
      localToast.show();
      performHapticFeedback(0);
      return true;
      localToast.setGravity(81, 0, i1);
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    Drawable localDrawable;
    if (this.g != null)
    {
      localDrawable = this.g;
      if (getVisibility() != 0) {
        break label34;
      }
    }
    label34:
    for (boolean bool = true;; bool = false)
    {
      localDrawable.setVisible(bool, false);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.g);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.MediaRouteButton
 * JD-Core Version:    0.7.0.1
 */