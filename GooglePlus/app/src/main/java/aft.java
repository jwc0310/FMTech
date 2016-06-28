import android.graphics.Rect;
import android.view.View;

final class aft
  extends afs
{
  aft(agh paramagh)
  {
    super(paramagh, (byte)0);
  }
  
  public final int a(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return paramView.getLeft() - ((agi)paramView.getLayoutParams()).d.left - localagi.leftMargin;
  }
  
  public final void a(int paramInt)
  {
    this.a.e(paramInt);
  }
  
  public final int b()
  {
    return this.a.o();
  }
  
  public final int b(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return paramView.getRight() + ((agi)paramView.getLayoutParams()).d.right + localagi.rightMargin;
  }
  
  public final int c()
  {
    return this.a.m() - this.a.q();
  }
  
  public final int c(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return agh.a(paramView) + localagi.leftMargin + localagi.rightMargin;
  }
  
  public final int d()
  {
    return this.a.m();
  }
  
  public final int d(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return agh.b(paramView) + localagi.topMargin + localagi.bottomMargin;
  }
  
  public final int e()
  {
    return this.a.m() - this.a.o() - this.a.q();
  }
  
  public final int f()
  {
    return this.a.q();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aft
 * JD-Core Version:    0.7.0.1
 */