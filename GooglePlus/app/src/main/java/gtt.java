import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Transformation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class gtt
  extends CardView
  implements oyw<gtu>
{
  private gtu b;
  private final TypedArray c = null;
  
  public gtt(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    if (this.b == null)
    {
      for (Context localContext = paramContext; ((localContext instanceof ContextWrapper)) && (!(localContext instanceof ozd)); localContext = ((ContextWrapper)localContext).getBaseContext()) {}
      if (localContext == null)
      {
        String str2 = String.valueOf(getContext());
        throw new IllegalStateException(36 + String.valueOf(str2).length() + "No Dagger wrapper found on context: " + str2);
      }
      paa localpaa;
      try
      {
        localpaa = new paa(this, null);
        if ((localContext instanceof ozc))
        {
          String str1 = String.valueOf(getClass().toString());
          throw new IllegalStateException(87 + String.valueOf(str1).length() + "Cannot attach View " + str1 + " to an Activity without @ViewWithoutFragmentDependencies annotation!");
        }
      }
      catch (ClassCastException localClassCastException)
      {
        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", localClassCastException);
      }
      this.b = ((gub)((ozf)((oyv)localContext).a()).a(localpaa)).b();
      if (localpaa.b != null)
      {
        localpaa.b.recycle();
        localpaa.b = null;
      }
    }
  }
  
  private final gtu c()
  {
    a(getContext());
    return this.b;
  }
  
  protected final boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    return super.addViewInLayout(paramView, paramInt, paramLayoutParams);
  }
  
  protected final boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    return super.addViewInLayout(paramView, paramInt, paramLayoutParams, paramBoolean);
  }
  
  protected final void attachLayoutAnimationParameters(View paramView, ViewGroup.LayoutParams paramLayoutParams, int paramInt1, int paramInt2)
  {
    super.attachLayoutAnimationParameters(paramView, paramLayoutParams, paramInt1, paramInt2);
  }
  
  protected final void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.attachViewToParent(paramView, paramInt, paramLayoutParams);
  }
  
  public final Class<gtu> au_()
  {
    return gtu.class;
  }
  
  protected final boolean awakenScrollBars()
  {
    return super.awakenScrollBars();
  }
  
  protected final boolean awakenScrollBars(int paramInt)
  {
    return super.awakenScrollBars(paramInt);
  }
  
  protected final boolean awakenScrollBars(int paramInt, boolean paramBoolean)
  {
    return super.awakenScrollBars(paramInt, paramBoolean);
  }
  
  protected final boolean canAnimate()
  {
    return super.canAnimate();
  }
  
  protected final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return super.checkLayoutParams(paramLayoutParams);
  }
  
  protected final void cleanupLayoutState(View paramView)
  {
    super.cleanupLayoutState(paramView);
  }
  
  protected final int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  protected final int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  protected final int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  protected final int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  protected final int computeVerticalScrollOffset()
  {
    return super.computeVerticalScrollOffset();
  }
  
  protected final int computeVerticalScrollRange()
  {
    return super.computeVerticalScrollRange();
  }
  
  protected final void debug(int paramInt)
  {
    super.debug(paramInt);
  }
  
  protected final void detachAllViewsFromParent()
  {
    super.detachAllViewsFromParent();
  }
  
  protected final void detachViewFromParent(int paramInt)
  {
    super.detachViewFromParent(paramInt);
  }
  
  protected final void detachViewFromParent(View paramView)
  {
    super.detachViewFromParent(paramView);
  }
  
  protected final void detachViewsFromParent(int paramInt1, int paramInt2)
  {
    super.detachViewsFromParent(paramInt1, paramInt2);
  }
  
  protected final void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
  }
  
  protected final void dispatchFreezeSelfOnly(SparseArray<Parcelable> paramSparseArray)
  {
    super.dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  protected final boolean dispatchGenericFocusedEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchGenericFocusedEvent(paramMotionEvent);
  }
  
  protected final boolean dispatchGenericPointerEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchGenericPointerEvent(paramMotionEvent);
  }
  
  protected final boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchHoverEvent(paramMotionEvent);
  }
  
  protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    super.dispatchRestoreInstanceState(paramSparseArray);
  }
  
  protected final void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    super.dispatchSaveInstanceState(paramSparseArray);
  }
  
  protected final void dispatchSetPressed(boolean paramBoolean)
  {
    super.dispatchSetPressed(paramBoolean);
  }
  
  protected final void dispatchThawSelfOnly(SparseArray<Parcelable> paramSparseArray)
  {
    super.dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected final void dispatchVisibilityChanged(View paramView, int paramInt)
  {
    super.dispatchVisibilityChanged(paramView, paramInt);
  }
  
  protected final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
  }
  
  @Deprecated
  protected final boolean fitSystemWindows(Rect paramRect)
  {
    return super.fitSystemWindows(paramRect);
  }
  
  protected final FrameLayout.LayoutParams generateDefaultLayoutParams()
  {
    return super.generateDefaultLayoutParams();
  }
  
  protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return super.generateLayoutParams(paramLayoutParams);
  }
  
  protected final float getBottomFadingEdgeStrength()
  {
    return super.getBottomFadingEdgeStrength();
  }
  
  protected final int getBottomPaddingOffset()
  {
    return super.getBottomPaddingOffset();
  }
  
  protected final int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    return super.getChildDrawingOrder(paramInt1, paramInt2);
  }
  
  protected final boolean getChildStaticTransformation(View paramView, Transformation paramTransformation)
  {
    return super.getChildStaticTransformation(paramView, paramTransformation);
  }
  
  protected final ContextMenu.ContextMenuInfo getContextMenuInfo()
  {
    return super.getContextMenuInfo();
  }
  
  protected final int getHorizontalScrollbarHeight()
  {
    return super.getHorizontalScrollbarHeight();
  }
  
  protected final float getLeftFadingEdgeStrength()
  {
    return super.getLeftFadingEdgeStrength();
  }
  
  protected final int getLeftPaddingOffset()
  {
    return super.getLeftPaddingOffset();
  }
  
  protected final float getRightFadingEdgeStrength()
  {
    return super.getRightFadingEdgeStrength();
  }
  
  protected final int getRightPaddingOffset()
  {
    return super.getRightPaddingOffset();
  }
  
  protected final int getSuggestedMinimumHeight()
  {
    return super.getSuggestedMinimumHeight();
  }
  
  protected final int getSuggestedMinimumWidth()
  {
    return super.getSuggestedMinimumWidth();
  }
  
  protected final float getTopFadingEdgeStrength()
  {
    return super.getTopFadingEdgeStrength();
  }
  
  protected final int getTopPaddingOffset()
  {
    return super.getTopPaddingOffset();
  }
  
  protected final int getWindowAttachCount()
  {
    return super.getWindowAttachCount();
  }
  
  @ViewDebug.ExportedProperty(category="drawing")
  protected final boolean isChildrenDrawingOrderEnabled()
  {
    return super.isChildrenDrawingOrderEnabled();
  }
  
  @Deprecated
  protected final boolean isChildrenDrawnWithCacheEnabled()
  {
    return super.isChildrenDrawnWithCacheEnabled();
  }
  
  protected final boolean isPaddingOffsetRequired()
  {
    return super.isPaddingOffsetRequired();
  }
  
  protected final void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    super.measureChild(paramView, paramInt1, paramInt2);
  }
  
  protected final void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected final void measureChildren(int paramInt1, int paramInt2)
  {
    super.measureChildren(paramInt1, paramInt2);
  }
  
  protected final void onAnimationEnd()
  {
    super.onAnimationEnd();
  }
  
  protected final void onAnimationStart()
  {
    super.onAnimationStart();
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected final void onCreateContextMenu(ContextMenu paramContextMenu)
  {
    super.onCreateContextMenu(paramContextMenu);
  }
  
  protected final int[] onCreateDrawableState(int paramInt)
  {
    return super.onCreateDrawableState(paramInt);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected final void onDisplayHint(int paramInt)
  {
    super.onDisplayHint(paramInt);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    a(getContext());
  }
  
  protected final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    gtu localgtu = c();
    int i = localgtu.b;
    int j = localgtu.b;
    localgtu.c.a(paramInt1, paramInt2, paramInt3, paramInt4);
    int k = (paramInt4 - paramInt2 - localgtu.i.getMeasuredHeight()) / 2;
    localgtu.c.a(localgtu.i, i, k);
    int m = i + (localgtu.i.getMeasuredWidth() + localgtu.b);
    if (localgtu.e.getVisibility() != 8)
    {
      localgtu.c.a(localgtu.e, m, j);
      j += localgtu.e.getMeasuredHeight();
    }
    if (localgtu.f.getVisibility() != 8)
    {
      localgtu.c.a(localgtu.f, m, j);
      j += localgtu.f.getMeasuredHeight();
    }
    if (localgtu.g.getVisibility() != 8)
    {
      localgtu.c.a(localgtu.g, m, j);
      m += localgtu.g.getMeasuredWidth() + localgtu.b;
    }
    if (localgtu.h.getVisibility() != 8) {
      localgtu.c.a(localgtu.h, m, j);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    gtu localgtu = c();
    Context localContext = localgtu.d.getContext();
    int i;
    int m;
    int n;
    int i1;
    int i2;
    if (View.MeasureSpec.getMode(paramInt1) == 0)
    {
      i = efj.K(localContext).widthPixels;
      int j = i - 2 * localgtu.b;
      int k = View.MeasureSpec.makeMeasureSpec(localgtu.a, 1073741824);
      localgtu.i.measure(k, k);
      m = 0 + localgtu.i.getMeasuredHeight();
      n = j - (localgtu.i.getMeasuredWidth() + localgtu.b);
      i1 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
      i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
      if (localgtu.e.getVisibility() == 8) {
        break label339;
      }
      localgtu.e.measure(i1, i2);
    }
    label339:
    for (int i3 = 0 + localgtu.e.getMeasuredHeight();; i3 = 0)
    {
      if (localgtu.f.getVisibility() != 8)
      {
        localgtu.f.measure(i1, i2);
        i3 += localgtu.f.getMeasuredHeight();
      }
      int i4 = localgtu.g.getVisibility();
      int i5 = 0;
      if (i4 != 8)
      {
        localgtu.g.measure(i1, i2);
        i5 = 0 + localgtu.g.getMeasuredHeight();
        n -= localgtu.g.getMeasuredWidth() + localgtu.b;
      }
      if (localgtu.h.getVisibility() != 8)
      {
        int i7 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
        localgtu.h.measure(i7, i2);
        i5 = Math.max(i5, localgtu.h.getMeasuredHeight());
      }
      int i6 = Math.max(i3 + i5, m);
      if (i6 > 0) {
        i6 += 2 * localgtu.b;
      }
      localgtu.d.setMeasuredDimension(i, i6);
      return;
      i = View.MeasureSpec.getSize(paramInt1);
      break;
    }
  }
  
  protected final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }
  
  protected final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    return super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(paramParcelable);
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    return super.onSaveInstanceState();
  }
  
  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected final boolean onSetAlpha(int paramInt)
  {
    return super.onSetAlpha(paramInt);
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected final void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
  }
  
  protected final void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
  }
  
  protected final boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
  }
  
  protected final void removeDetachedView(View paramView, boolean paramBoolean)
  {
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  protected final void setChildrenDrawingCacheEnabled(boolean paramBoolean)
  {
    super.setChildrenDrawingCacheEnabled(paramBoolean);
  }
  
  protected final void setChildrenDrawingOrderEnabled(boolean paramBoolean)
  {
    super.setChildrenDrawingOrderEnabled(paramBoolean);
  }
  
  @Deprecated
  protected final void setChildrenDrawnWithCacheEnabled(boolean paramBoolean)
  {
    super.setChildrenDrawnWithCacheEnabled(paramBoolean);
  }
  
  protected final void setStaticTransformationsEnabled(boolean paramBoolean)
  {
    super.setStaticTransformationsEnabled(paramBoolean);
  }
  
  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    return super.verifyDrawable(paramDrawable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gtt
 * JD-Core Version:    0.7.0.1
 */