import com.google.android.apps.plus.views.PhotoView;

final class dyn
  implements Runnable
{
  private final int a;
  
  public dyn(dyl paramdyl, int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void run()
  {
    if (this.a != this.b.f) {
      return;
    }
    this.b.a = true;
    this.b.f();
    this.b.g.invalidate();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyn
 * JD-Core Version:    0.7.0.1
 */