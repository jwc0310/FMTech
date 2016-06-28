import android.os.Process;

final class ibl
  extends Thread
{
  ibl(ibk paramibk, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public final void run()
  {
    Process.setThreadPriority(this.a.a);
    super.run();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibl
 * JD-Core Version:    0.7.0.1
 */