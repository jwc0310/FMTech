import android.os.Looper;

public final class egw<L>
{
  public final egx a;
  public volatile L b;
  
  egw(Looper paramLooper, L paramL)
  {
    this.a = new egx(this, paramLooper);
    this.b = efj.b(paramL, "Listener must not be null");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egw
 * JD-Core Version:    0.7.0.1
 */