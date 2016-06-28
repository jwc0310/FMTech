package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import gl;
import gm;
import tg;
import tj;
import xp;
import yc;

public class NavigationMenuItemView
  extends TextView
  implements yc
{
  private static final int[] c = { 16842912 };
  public xp a;
  public ColorStateList b;
  private int d;
  
  public NavigationMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.d = paramContext.getResources().getDimensionPixelSize(2131493238);
  }
  
  public final xp a()
  {
    return this.a;
  }
  
  public final void a(Drawable paramDrawable)
  {
    Drawable localDrawable1;
    if (paramDrawable != null)
    {
      Drawable localDrawable2 = paramDrawable.getConstantState().newDrawable();
      localDrawable1 = gl.a.c(localDrawable2).mutate();
      localDrawable1.setBounds(0, 0, this.d, this.d);
      ColorStateList localColorStateList = this.b;
      gl.a.a(localDrawable1, localColorStateList);
    }
    for (;;)
    {
      tg.a.a(this, localDrawable1, null, null, null);
      return;
      localDrawable1 = paramDrawable;
    }
  }
  
  public final void a(xp paramxp, int paramInt)
  {
    this.a = paramxp;
    int i;
    StateListDrawable localStateListDrawable;
    if (paramxp.isVisible())
    {
      i = 0;
      setVisibility(i);
      if (getBackground() == null)
      {
        TypedValue localTypedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(2130772374, localTypedValue, true)) {
          break label153;
        }
        localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(c, new ColorDrawable(localTypedValue.data));
        localStateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
      }
    }
    for (;;)
    {
      setBackgroundDrawable(localStateListDrawable);
      paramxp.isCheckable();
      refreshDrawableState();
      paramxp.isChecked();
      refreshDrawableState();
      setEnabled(paramxp.isEnabled());
      setText(paramxp.getTitle());
      a(paramxp.getIcon());
      return;
      i = 8;
      break;
      label153:
      localStateListDrawable = null;
    }
  }
  
  public final boolean b()
  {
    return false;
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((this.a != null) && (this.a.isCheckable()) && (this.a.isChecked())) {
      mergeDrawableStates(arrayOfInt, c);
    }
    return arrayOfInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.design.internal.NavigationMenuItemView
 * JD-Core Version:    0.7.0.1
 */