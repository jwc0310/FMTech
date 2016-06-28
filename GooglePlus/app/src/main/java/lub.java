import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class lub<T extends lwu>
  extends rz
{
  private List<lwu> k;
  
  private lub(View paramView)
  {
    super(paramView);
  }
  
  public lub(View paramView, List<lwu> paramList)
  {
    this(paramView);
    this.k = paramList;
  }
  
  protected final void a(int paramInt, AccessibilityEvent paramAccessibilityEvent)
  {
    if (this.k != null) {
      paramAccessibilityEvent.setContentDescription(((lwu)this.k.get(paramInt)).ay_());
    }
  }
  
  protected final void a(int paramInt, pr parampr)
  {
    if (paramInt == -1) {}
    while (this.k == null) {
      return;
    }
    lwu locallwu = (lwu)this.k.get(paramInt);
    Rect localRect = locallwu.a();
    pr.a.c(parampr.b, localRect);
    CharSequence localCharSequence = locallwu.ay_();
    pr.a.b(parampr.b, localCharSequence);
    pr.a.a(parampr.b, 16);
  }
  
  protected final void a(List<Integer> paramList)
  {
    if (this.k != null) {
      for (int i = 0; i < this.k.size(); i++) {
        paramList.add(Integer.valueOf(i));
      }
    }
  }
  
  protected final boolean b(int paramInt1, int paramInt2)
  {
    if (this.k != null)
    {
      lwu locallwu = (lwu)this.k.get(paramInt1);
      if (paramInt2 == 16)
      {
        locallwu.a(true);
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lub
 * JD-Core Version:    0.7.0.1
 */