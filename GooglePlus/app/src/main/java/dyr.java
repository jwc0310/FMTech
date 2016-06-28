import com.google.android.apps.plus.views.PhotoView;

public final class dyr
  implements Runnable
{
  private final PhotoView a;
  private boolean b;
  private float c;
  private float d;
  private float e;
  private long f;
  private boolean g;
  private boolean h;
  private long i;
  private boolean j = false;
  
  public dyr(PhotoView paramPhotoView1, PhotoView paramPhotoView2)
  {
    this.a = paramPhotoView2;
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((this.i > 0L) && (!paramBoolean)) {
      return;
    }
    this.a.removeCallbacks(this);
    this.g = false;
    this.h = true;
    this.j = false;
    this.i = 0L;
    PhotoView localPhotoView = this.k;
    localPhotoView.a(localPhotoView.h);
  }
  
  public final boolean a(float paramFloat1, float paramFloat2, long paramLong)
  {
    boolean bool1 = this.g;
    if ((this.g) && ((this.i == 0L) || (this.j))) {
      return false;
    }
    this.c = paramFloat2;
    this.f = -1L;
    this.d = paramFloat1;
    if (this.c > this.d) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      this.b = bool2;
      this.e = ((this.c - this.d) / 250.0F);
      this.g = true;
      this.h = false;
      this.i = paramLong;
      if (!bool1) {
        this.a.postDelayed(this, paramLong);
      }
      return true;
    }
  }
  
  public final void run()
  {
    if (this.h) {}
    do
    {
      return;
      if (((!this.b) && (this.k.y <= this.c)) || ((this.b) && (this.k.y >= this.c)))
      {
        a(true);
        return;
      }
      if (this.f == -1L) {
        this.f = System.currentTimeMillis();
      }
      this.j = true;
      long l = System.currentTimeMillis() - this.f;
      float f1 = this.d + this.e * (float)l;
      if (((!this.b) && (f1 < this.c)) || ((this.b) && (f1 > this.c))) {
        f1 = this.c;
      }
      this.a.a(f1, this.k.w, this.k.x);
    } while (this.h);
    this.a.post(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyr
 * JD-Core Version:    0.7.0.1
 */