import android.content.Context;
import android.graphics.PointF;
import android.view.View;

final class aex
  extends afd
{
  aex(aew paramaew, Context paramContext)
  {
    super(paramContext);
  }
  
  public final PointF a(int paramInt)
  {
    int i = 1;
    aew localaew = this.g;
    if (localaew.l() == 0) {
      return null;
    }
    if (paramInt < ((agi)localaew.d(0).getLayoutParams()).c.c()) {}
    for (int j = i;; j = 0)
    {
      if (j != localaew.d) {
        i = -1;
      }
      if (localaew.b != 0) {
        break;
      }
      return new PointF(i, 0.0F);
    }
    return new PointF(0.0F, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aex
 * JD-Core Version:    0.7.0.1
 */