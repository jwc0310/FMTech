import android.os.Process;

final class jtg
  extends Thread
{
  jtg(jtf paramjtf, Runnable paramRunnable, String paramString)
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
 * Qualified Name:     jtg
 * JD-Core Version:    0.7.0.1
 */