import android.graphics.Rect;
import android.view.View;

final class afu
  extends afs
{
  afu(agh paramagh)
  {
    super(paramagh, (byte)0);
  }
  
  public final int a(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return paramView.getTop() - ((agi)paramView.getLayoutParams()).d.top - localagi.topMargin;
  }
  
  public final void a(int paramInt)
  {
    this.a.f(paramInt);
  }
  
  public final int b()
  {
    return this.a.p();
  }
  
  public final int b(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return paramView.getBottom() + ((agi)paramView.getLayoutParams()).d.bottom + localagi.bottomMargin;
  }
  
  public final int c()
  {
    return this.a.n() - this.a.r();
  }
  
  public final int c(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return agh.b(paramView) + localagi.topMargin + localagi.bottomMargin;
  }
  
  public final int d()
  {
    return this.a.n();
  }
  
  public final int d(View paramView)
  {
    agi localagi = (agi)paramView.getLayoutParams();
    return agh.a(paramView) + localagi.leftMargin + localagi.rightMargin;
  }
  
  public final int e()
  {
    return this.a.n() - this.a.p() - this.a.r();
  }
  
  public final int f()
  {
    return this.a.r();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afu
 * JD-Core Version:    0.7.0.1
 */