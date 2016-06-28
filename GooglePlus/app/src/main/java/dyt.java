import com.google.android.apps.plus.views.PhotoView;

public final class dyt
  implements Runnable
{
  public final PhotoView a;
  public float b;
  public float c;
  public long d = -1L;
  public boolean e;
  public boolean f;
  
  public dyt(PhotoView paramPhotoView)
  {
    this.a = paramPhotoView;
  }
  
  public final void run()
  {
    if (this.f) {
      return;
    }
    long l = System.currentTimeMillis();
    float f1;
    label34:
    float f2;
    if (this.d != -1L)
    {
      f1 = (float)(l - this.d) / 1000.0F;
      this.a.a(false, f1 * this.b, f1 * this.c, false);
      this.d = l;
      f2 = f1 * 1000.0F;
      if (this.b <= 0.0F) {
        break label185;
      }
      this.b -= f2;
      if (this.b < 0.0F) {
        this.b = 0.0F;
      }
      label101:
      if (this.c <= 0.0F) {
        break label213;
      }
      this.c -= f2;
      if (this.c < 0.0F) {
        this.c = 0.0F;
      }
    }
    for (;;)
    {
      if ((this.b == 0.0F) && (this.c == 0.0F))
      {
        this.e = false;
        this.f = true;
      }
      if (this.f) {
        break;
      }
      this.a.post(this);
      return;
      f1 = 0.0F;
      break label34;
      label185:
      this.b = (f2 + this.b);
      if (this.b <= 0.0F) {
        break label101;
      }
      this.b = 0.0F;
      break label101;
      label213:
      this.c = (f2 + this.c);
      if (this.c > 0.0F) {
        this.c = 0.0F;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyt
 * JD-Core Version:    0.7.0.1
 */