import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class nn
  extends nm
{
  private static Field b;
  private static boolean c = false;
  
  public final void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    paramView.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public final void a(View paramView, ld paramld)
  {
    if (paramld == null) {}
    for (Object localObject = null;; localObject = paramld.c)
    {
      paramView.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
      return;
    }
  }
  
  public final void a(View paramView, pr parampr)
  {
    paramView.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)parampr.b);
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
  
  public final boolean b(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
  
  public final void c(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  public final boolean i(View paramView)
  {
    if (c) {}
    for (;;)
    {
      return false;
      if (b == null) {}
      try
      {
        Field localField = View.class.getDeclaredField("mAccessibilityDelegate");
        b = localField;
        localField.setAccessible(true);
      }
      catch (Throwable localThrowable2)
      {
        try
        {
          Object localObject = b.get(paramView);
          if (localObject == null) {
            continue;
          }
          return true;
        }
        catch (Throwable localThrowable1)
        {
          c = true;
        }
        localThrowable2 = localThrowable2;
        c = true;
        return false;
      }
    }
    return false;
  }
  
  public final ov j(View paramView)
  {
    if (this.a == null) {
      this.a = new WeakHashMap();
    }
    ov localov = (ov)this.a.get(paramView);
    if (localov == null)
    {
      localov = new ov(paramView);
      this.a.put(paramView, localov);
    }
    return localov;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nn
 * JD-Core Version:    0.7.0.1
 */