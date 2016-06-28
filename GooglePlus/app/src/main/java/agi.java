import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class agi
  extends ViewGroup.MarginLayoutParams
{
  public agt c;
  public final Rect d = new Rect();
  public boolean e = true;
  boolean f = false;
  
  public agi(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public agi(agi paramagi)
  {
    super(paramagi);
  }
  
  public agi(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public agi(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public agi(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public final boolean a()
  {
    return (0x8 & this.c.i) != 0;
  }
  
  public final boolean b()
  {
    return (0x40 & this.c.i) != 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agi
 * JD-Core Version:    0.7.0.1
 */