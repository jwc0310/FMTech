import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class oj
  extends ld
{
  public oj(ViewPager paramViewPager) {}
  
  private final boolean a()
  {
    return (this.d.c != null) && (this.d.c.b() > 1);
  }
  
  public final void a(View paramView, pr parampr)
  {
    super.a(paramView, parampr);
    String str = ViewPager.class.getName();
    pr.a.a(parampr.b, str);
    boolean bool = a();
    pr.a.f(parampr.b, bool);
    if (this.d.canScrollHorizontally(1)) {
      pr.a.a(parampr.b, 4096);
    }
    if (this.d.canScrollHorizontally(-1)) {
      pr.a.a(parampr.b, 8192);
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 4096: 
      if (this.d.canScrollHorizontally(1))
      {
        this.d.b(1 + this.d.d);
        return true;
      }
      return false;
    }
    if (this.d.canScrollHorizontally(-1))
    {
      this.d.b(-1 + this.d.d);
      return true;
    }
    return false;
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.c(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    qj localqj = new qj(qj.a.a());
    boolean bool = a();
    qj.a.a(localqj.b, bool);
    if ((paramAccessibilityEvent.getEventType() == 4096) && (this.d.c != null))
    {
      int i = this.d.c.b();
      qj.a.b(localqj.b, i);
      int j = this.d.d;
      qj.a.a(localqj.b, j);
      int k = this.d.d;
      qj.a.c(localqj.b, k);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oj
 * JD-Core Version:    0.7.0.1
 */