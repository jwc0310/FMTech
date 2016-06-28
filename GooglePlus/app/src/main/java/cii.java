import android.os.ConditionVariable;
import android.os.Process;

final class cii
  implements Runnable
{
  cii(cih paramcih, kbw paramkbw, ConditionVariable paramConditionVariable) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    this.a.i();
    this.b.open();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cii
 * JD-Core Version:    0.7.0.1
 */