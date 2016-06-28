import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.MessageQueue.IdleHandler;
import java.util.ArrayList;
import java.util.List;

final class ifv
  implements MessageQueue.IdleHandler
{
  final igb a;
  volatile boolean b = true;
  private final List<ifw> c = new ArrayList(3);
  private int d = 0;
  
  public ifv(igo paramigo, igb paramigb, int paramInt1, int paramInt2)
  {
    this.a = paramigb;
    ifw localifw1 = a(paramigo, paramInt1, (int)(1.3F * paramInt1));
    if (localifw1 != null) {
      this.c.add(localifw1);
    }
    ifw localifw2 = a(paramigo, (int)(1.3F * paramInt1), paramInt1);
    if (localifw2 != null) {
      this.c.add(localifw2);
    }
    this.c.add(new ifw(paramInt2, paramInt2, 12));
  }
  
  private static ifw a(igo paramigo, int paramInt1, int paramInt2)
  {
    int i = paramigo.b / (3 * (paramInt1 * paramInt2 << 2));
    ifw localifw = null;
    if (i > 0) {
      localifw = new ifw(paramInt1, paramInt2, i);
    }
    return localifw;
  }
  
  public final boolean queueIdle()
  {
    Bitmap localBitmap;
    if ((this.b) && (this.a.d() < 0.85F))
    {
      if (this.d < this.c.size()) {
        break label55;
      }
      localBitmap = null;
    }
    for (;;)
    {
      if (localBitmap != null) {
        this.a.a(localBitmap);
      }
      return this.b;
      label55:
      ifw localifw = (ifw)this.c.get(this.d);
      if (localifw == null)
      {
        localBitmap = null;
      }
      else
      {
        int i = -1 + localifw.c;
        localifw.c = i;
        if (i == 0) {
          this.d = (1 + this.d);
        }
        localBitmap = Bitmap.createBitmap(localifw.a, localifw.b, Bitmap.Config.ARGB_8888);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifv
 * JD-Core Version:    0.7.0.1
 */