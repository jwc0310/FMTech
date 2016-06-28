import com.google.android.apps.plus.views.PhotoView;

public final class dys
  implements Runnable
{
  public float a;
  public float b;
  public final PhotoView c;
  public float d;
  public float e;
  public long f = -1L;
  public boolean g;
  public boolean h;
  private long i;
  
  public dys(PhotoView paramPhotoView)
  {
    this.c = paramPhotoView;
  }
  
  public final void a()
  {
    this.c.removeCallbacks(this);
    this.g = false;
    this.h = true;
    this.f = -1L;
  }
  
  public final void run()
  {
    if (this.h) {
      return;
    }
    long l1 = System.currentTimeMillis();
    float f1;
    float f2;
    if (this.f != -1L)
    {
      f1 = (float)(l1 - this.f);
      if (this.f == -1L)
      {
        this.i = l1;
        this.f = l1;
      }
      if (f1 < 250.0F) {
        break label178;
      }
      f2 = this.d;
    }
    label178:
    long l2;
    for (float f3 = this.e;; f3 = this.b * (float)l2)
    {
      this.i = l1;
      this.c.a(false, f2, f3, true);
      this.d -= f2;
      this.e -= f3;
      if (this.d == 0.0F) {
        this.a = 0.0F;
      }
      if (this.e == 0.0F) {
        this.b = 0.0F;
      }
      if ((this.a == 0.0F) && (this.b == 0.0F)) {
        a();
      }
      this.c.postDelayed(this, 1L);
      return;
      f1 = 0.0F;
      break;
      l2 = l1 - this.i;
      f2 = this.a * (float)l2;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dys
 * JD-Core Version:    0.7.0.1
 */