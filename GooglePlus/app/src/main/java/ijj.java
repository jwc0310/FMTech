import android.content.Intent;
import android.util.Log;

final class ijj
  implements Runnable
{
  ijj(iji paramiji, Intent paramIntent) {}
  
  public final void run()
  {
    this.b.b.b.g = this.b.a;
    if (Log.isLoggable("GmsLocationReporting", 4))
    {
      String str = String.valueOf(this.b.b.b.g);
      new StringBuilder(13 + String.valueOf(str).length()).append("onConnected: ").append(str);
    }
    if (this.a != null) {
      this.b.b.b.h = this.a;
    }
    this.b.b.b.k();
    if (this.b.b.a) {
      this.b.b.b.i();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijj
 * JD-Core Version:    0.7.0.1
 */