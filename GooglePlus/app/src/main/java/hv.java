import android.os.Build.VERSION;
import android.os.IBinder.DeathRecipient;

public class hv
  implements IBinder.DeathRecipient
{
  final Object a;
  hw b;
  boolean c = false;
  
  public hv()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a = new ig(new if(this));
      return;
    }
    this.a = new hx(this);
  }
  
  public void a() {}
  
  public void a(hh paramhh) {}
  
  public void a(ir paramir) {}
  
  public void binderDied()
  {
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hv
 * JD-Core Version:    0.7.0.1
 */