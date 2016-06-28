import android.graphics.Bitmap;

final class ar
  implements Runnable
{
  ar(aq paramaq) {}
  
  public final void run()
  {
    int i;
    synchronized (this.a.c)
    {
      if (this.a.e) {
        return;
      }
      i = this.a.l;
      if (i < 0) {
        return;
      }
    }
    Bitmap localBitmap1 = this.a.g;
    this.a.h = 2;
    int j = i - 2;
    long l1 = aq.a(this.a).a(i, localBitmap1, j);
    if (l1 < 20L) {
      l1 = 100L;
    }
    for (;;)
    {
      int m;
      synchronized (this.a.c)
      {
        if (this.a.e)
        {
          localBitmap2 = this.a.g;
          this.a.g = null;
          i1 = 0;
          long l2 = this.a.k;
          if (i1 != 0) {
            this.a.scheduleSelf(this.a, l2);
          }
          if (localBitmap2 != null) {
            this.a.d.a(localBitmap2);
          }
        }
        else
        {
          int k = this.a.l;
          m = 0;
          if (k < 0) {
            break label265;
          }
          int n = this.a.h;
          m = 0;
          if (n != 2) {
            break label265;
          }
          m = 1;
          this.a.k = (l1 + this.a.j);
          this.a.h = 3;
        }
      }
      return;
      label265:
      int i1 = m;
      Bitmap localBitmap2 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ar
 * JD-Core Version:    0.7.0.1
 */