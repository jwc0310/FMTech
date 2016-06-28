package com.google.android.libraries.social.ui.views.fab;

import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.widget.ImageButton;
import efj;
import ehr;

public final class FloatingActionButton
  extends ImageButton
{
  private final ShapeDrawable a;
  private final ShapeDrawable b;
  private final StateListDrawable c;
  
  public FloatingActionButton(Context paramContext)
  {
    super(paramContext);
    OvalShape localOvalShape = new OvalShape();
    this.a = new ShapeDrawable(localOvalShape);
    this.b = new ShapeDrawable(localOvalShape);
    this.c = new StateListDrawable();
    this.c.addState(new int[] { 16842919 }, this.b);
    this.c.addState(StateSet.WILD_CARD, this.a);
    Resources localResources = getResources();
    a(localResources.getColor(ehr.gF), localResources.getColor(ehr.gG));
    a(localResources.getColor(ehr.gH));
    a();
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    OvalShape localOvalShape = new OvalShape();
    this.a = new ShapeDrawable(localOvalShape);
    this.b = new ShapeDrawable(localOvalShape);
    this.c = new StateListDrawable();
    this.c.addState(new int[] { 16842919 }, this.b);
    this.c.addState(StateSet.WILD_CARD, this.a);
    Resources localResources = getResources();
    a(localResources.getColor(ehr.gF), localResources.getColor(ehr.gG));
    a(localResources.getColor(ehr.gH));
    a();
  }
  
  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    OvalShape localOvalShape = new OvalShape();
    this.a = new ShapeDrawable(localOvalShape);
    this.b = new ShapeDrawable(localOvalShape);
    this.c = new StateListDrawable();
    this.c.addState(new int[] { 16842919 }, this.b);
    this.c.addState(StateSet.WILD_CARD, this.a);
    Resources localResources = getResources();
    a(localResources.getColor(ehr.gF), localResources.getColor(ehr.gG));
    a(localResources.getColor(ehr.gH));
    a();
  }
  
  @TargetApi(21)
  private final void a()
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), efj.aaG));
      }
      return;
    }
  }
  
  private final void a(int paramInt)
  {
    int i;
    StateListDrawable localStateListDrawable;
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = 1;
      if (i == 0) {
        break label43;
      }
      localStateListDrawable = this.c;
    }
    label43:
    for (Object localObject = efj.a(localStateListDrawable, ColorStateList.valueOf(paramInt), localStateListDrawable);; localObject = this.c)
    {
      setBackgroundDrawable((Drawable)localObject);
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.getPaint().setColor(paramInt1);
    this.b.getPaint().setColor(paramInt2);
    int i = Color.red(paramInt2);
    int j = Color.green(paramInt2);
    int k = Color.blue(paramInt2);
    float f = Math.abs(-0.15F);
    a(Color.rgb((int)(f * (0 - i) + i), (int)(f * (0 - j) + j), (int)(f * (0 - k) + k)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.fab.FloatingActionButton
 * JD-Core Version:    0.7.0.1
 */