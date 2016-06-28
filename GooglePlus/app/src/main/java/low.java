import android.graphics.Paint;
import android.os.Handler;

final class low
  implements Runnable
{
  low(lov paramlov) {}
  
  public final void run()
  {
    int i = (int)(255L - 255L * (this.a.h - System.currentTimeMillis()) / 250L);
    if (i > 255) {
      i = 255;
    }
    this.a.g.setAlpha(i);
    this.a.invalidate();
    if (i != 255) {
      efj.m().postDelayed(this, 16L);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     low
 * JD-Core Version:    0.7.0.1
 */