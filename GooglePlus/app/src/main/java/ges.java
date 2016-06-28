import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

final class ges
  extends TimerTask
{
  int a;
  long b;
  Timer c;
  x d;
  
  public ges(gen paramgen, x paramx, int paramInt)
  {
    if (paramx == null) {
      throw new NullPointerException("Listener cannot be null");
    }
    this.c = new Timer();
    this.c.scheduleAtFixedRate(this, new Date(), paramInt);
    this.d = paramx;
  }
  
  public final void run()
  {
    this.e.post(new get(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ges
 * JD-Core Version:    0.7.0.1
 */