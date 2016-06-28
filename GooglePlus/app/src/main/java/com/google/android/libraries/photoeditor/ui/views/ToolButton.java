package com.google.android.libraries.photoeditor.ui.views;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import gft;

public class ToolButton
  extends LinearLayout
{
  private static Integer c = Integer.valueOf(1);
  private static Integer d = Integer.valueOf(2);
  public ImageView a;
  public TextView b;
  private boolean e;
  private int f;
  
  public ToolButton(Context paramContext)
  {
    super(paramContext);
    a(1);
  }
  
  public ToolButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public ToolButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private final void a()
  {
    this.b.setVisibility(8);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2, 17.0F);
    this.a.setLayoutParams(localLayoutParams);
    setGravity(17);
    requestLayout();
  }
  
  private final void a(int paramInt)
  {
    this.a = new ImageView(getContext());
    this.a.setTag(c);
    this.a.setDuplicateParentStateEnabled(true);
    if (Build.VERSION.SDK_INT >= 16) {
      this.a.setImportantForAccessibility(2);
    }
    this.b = new TextView(getContext());
    this.b.setTag(d);
    this.b.setDuplicateParentStateEnabled(true);
    if (Build.VERSION.SDK_INT >= 16) {
      this.b.setImportantForAccessibility(2);
    }
    setOrientation(paramInt);
    addView(this.a, b(paramInt));
    TextView localTextView = this.b;
    if (paramInt == 1) {
      this.b.setPadding(0, this.f, 0, 0);
    }
    for (LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2, 81.0F);; localLayoutParams = new LinearLayout.LayoutParams(-2, -2, 8388629.0F))
    {
      addView(localTextView, localLayoutParams);
      setClickable(true);
      return;
      a(this.b, this.f, 0, 0, 0);
    }
  }
  
  private final void a(AttributeSet paramAttributeSet)
  {
    Resources localResources = getResources();
    int i = paramAttributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "orientation", 1);
    this.e = true;
    a(i);
    int j = paramAttributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", 0);
    if (j != 0)
    {
      Drawable localDrawable = localResources.getDrawable(j);
      this.a.setImageDrawable(localDrawable);
    }
    int k = paramAttributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0);
    if (k != 0) {
      this.b.setText(k);
    }
    int m = paramAttributeSet.getStyleAttribute();
    if (m != 0) {
      this.b.setTextAppearance(getContext(), m);
    }
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, gft.G);
    int n = -1 + localTypedArray.getIndexCount();
    if (n >= 0)
    {
      int i1 = gft.G[n];
      int i2 = localTypedArray.getIndex(n);
      if (i2 == gft.I)
      {
        boolean bool = localTypedArray.getBoolean(i2, true);
        this.e = bool;
        if (bool) {
          b();
        }
      }
      for (;;)
      {
        n--;
        break;
        a();
        continue;
        if (i2 == gft.H)
        {
          int i4 = localTypedArray.getDimensionPixelSize(i2, localResources.getDimensionPixelSize(aau.xx));
          this.f = i4;
          if (getOrientation() == 1) {
            this.b.setPadding(0, i4, 0, 0);
          } else {
            a(this.b, i4, 0, 0, 0);
          }
        }
        else if (i1 == 16843087)
        {
          int i3 = localTypedArray.getResourceId(i2, 0);
          if (i3 > 0) {
            a(localResources.getString(i3));
          } else {
            a(localTypedArray.getText(i2));
          }
        }
      }
    }
    localTypedArray.recycle();
  }
  
  private final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getLayoutDirection() == 1)
    {
      paramView.setPadding(0, 0, paramInt1, 0);
      return;
    }
    paramView.setPadding(paramInt1, 0, 0, 0);
  }
  
  private static LinearLayout.LayoutParams b(int paramInt)
  {
    if (paramInt == 1) {
      return new LinearLayout.LayoutParams(-2, -2, 49.0F);
    }
    return new LinearLayout.LayoutParams(-2, -2, 8388627.0F);
  }
  
  private final void b()
  {
    this.b.setVisibility(0);
    int i = getOrientation();
    this.a.setLayoutParams(b(i));
    setOrientation(i);
    requestLayout();
  }
  
  public final BitmapDrawable a(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, i, j);
    paramDrawable.setAlpha(110);
    paramDrawable.draw(localCanvas);
    paramDrawable.setAlpha(255);
    return new BitmapDrawable(getResources(), localBitmap);
  }
  
  public final BitmapDrawable a(Drawable paramDrawable, int paramInt)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, i, j);
    paramDrawable.setColorFilter(new LightingColorFilter(paramInt, 1));
    paramDrawable.draw(localCanvas);
    paramDrawable.setColorFilter(null);
    return new BitmapDrawable(getResources(), localBitmap);
  }
  
  @Deprecated
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return;
    }
    Resources localResources = getResources();
    StateListDrawable localStateListDrawable = new StateListDrawable();
    if (paramInt2 != 0)
    {
      Drawable localDrawable2 = localResources.getDrawable(paramInt2);
      localStateListDrawable.addState(new int[] { 16842910, 16842913 }, localDrawable2);
    }
    Drawable localDrawable1 = localResources.getDrawable(paramInt1);
    if (paramInt3 == 0) {}
    for (Object localObject = a(localDrawable1);; localObject = localResources.getDrawable(paramInt3))
    {
      localStateListDrawable.addState(new int[] { -16842910 }, (Drawable)localObject);
      localStateListDrawable.addState(new int[] { -16842910, 16842913 }, (Drawable)localObject);
      localStateListDrawable.addState(StateSet.WILD_CARD, localDrawable1);
      this.a.setImageDrawable(localStateListDrawable);
      return;
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
    setContentDescription(paramCharSequence);
    if ((!this.e) || (paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      a();
      return;
    }
    b();
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Button");
  }
  
  public void setOrientation(int paramInt)
  {
    super.setOrientation(paramInt);
    if (paramInt == 1)
    {
      setGravity(1);
      return;
    }
    setGravity(16);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    sendAccessibilityEvent(4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.ui.views.ToolButton
 * JD-Core Version:    0.7.0.1
 */