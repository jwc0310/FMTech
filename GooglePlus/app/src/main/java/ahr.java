import android.content.Context;
import android.graphics.PointF;

final class ahr
  extends afd
{
  ahr(ahp paramahp, Context paramContext)
  {
    super(paramContext);
  }
  
  public final PointF a(int paramInt)
  {
    int i = this.g.a(paramInt);
    if (i == 0) {
      return null;
    }
    if (this.g.d == 0) {
      return new PointF(i, 0.0F);
    }
    return new PointF(0.0F, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ahr
 * JD-Core Version:    0.7.0.1
 */