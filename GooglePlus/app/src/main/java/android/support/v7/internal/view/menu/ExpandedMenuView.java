package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import xl;
import xn;
import xp;
import yb;
import zw;

public final class ExpandedMenuView
  extends ListView
  implements AdapterView.OnItemClickListener, xn, yb
{
  private static final int[] a = { 16842964, 16843049 };
  private xl b;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    zw localzw = zw.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (localzw.a.hasValue(0)) {
      setBackgroundDrawable(localzw.a(0));
    }
    if (localzw.a.hasValue(1)) {
      setDivider(localzw.a(1));
    }
    localzw.a.recycle();
  }
  
  public final void a(xl paramxl)
  {
    this.b = paramxl;
  }
  
  public final boolean a(xp paramxp)
  {
    return this.b.a(paramxp, null, 0);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((xp)getAdapter().getItem(paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ExpandedMenuView
 * JD-Core Version:    0.7.0.1
 */