import android.os.Handler;

final class ccg
  implements Runnable
{
  private boolean a;
  
  public ccg(cbs paramcbs, boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public final void run()
  {
    this.b.a(false);
    if (this.a) {
      efj.m().postDelayed(this, 60000L);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccg
 * JD-Core Version:    0.7.0.1
 */