import com.google.android.apps.plus.views.DreamViewFlipper;

public final class dvv
  implements Runnable
{
  public dvv(DreamViewFlipper paramDreamViewFlipper) {}
  
  public final void run()
  {
    if (this.a.l)
    {
      if (this.a.j) {
        this.a.b();
      }
    }
    else {
      return;
    }
    this.a.k = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvv
 * JD-Core Version:    0.7.0.1
 */