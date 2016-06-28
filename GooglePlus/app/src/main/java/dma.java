import android.content.Intent;
import android.os.Handler;

public final class dma
  implements Runnable
{
  public dma(dlz paramdlz, kbw paramkbw, dmc paramdmc, Intent paramIntent) {}
  
  public final void run()
  {
    this.d.a.a(this.a);
    if (this.b != null)
    {
      dmb localdmb = new dmb(this);
      efj.m().post(localdmb);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dma
 * JD-Core Version:    0.7.0.1
 */