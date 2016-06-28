import android.content.Context;
import android.os.Process;

final class dki
  implements Runnable
{
  dki(Context paramContext) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    kck localkck = new kck();
    localkck.n = true;
    dkh.b(this.a, localkck);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dki
 * JD-Core Version:    0.7.0.1
 */