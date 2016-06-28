import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ld
{
  static final lf a;
  static final Object b;
  final Object c = a.a(this);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {
      a = new lg();
    }
    for (;;)
    {
      b = a.a();
      return;
      if (Build.VERSION.SDK_INT >= 14) {
        a = new le();
      } else {
        a = new lf();
      }
    }
  }
  
  public qb a(View paramView)
  {
    return a.a(b, paramView);
  }
  
  public void a(View paramView, pr parampr)
  {
    a.a(b, paramView, parampr);
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a.a(b, paramView, paramInt, paramBundle);
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(b, paramView, paramAccessibilityEvent);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(b, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.c(b, paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.b(b, paramView, paramAccessibilityEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ld
 * JD-Core Version:    0.7.0.1
 */