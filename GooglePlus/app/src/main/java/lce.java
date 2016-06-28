import android.graphics.Point;
import android.view.View;
import android.view.View.DragShadowBuilder;

final class lce
  extends View.DragShadowBuilder
{
  private Point a;
  
  lce(lca paramlca, View paramView, Point paramPoint)
  {
    super(paramView);
    this.a = paramPoint;
  }
  
  public final void onProvideShadowMetrics(Point paramPoint1, Point paramPoint2)
  {
    super.onProvideShadowMetrics(paramPoint1, paramPoint2);
    paramPoint2.set(this.a.x, this.a.y);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lce
 * JD-Core Version:    0.7.0.1
 */