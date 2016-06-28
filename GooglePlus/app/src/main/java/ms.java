import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class ms
{
  public static final mw a = new mw();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      a = new mv();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new mu();
      return;
    }
    if (Build.VERSION.SDK_INT >= 5)
    {
      a = new mt();
      return;
    }
  }
  
  public static int a(MotionEvent paramMotionEvent)
  {
    return 0xFF & paramMotionEvent.getAction();
  }
  
  public static int b(MotionEvent paramMotionEvent)
  {
    return 0xFF & paramMotionEvent.getAction() >> 8;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ms
 * JD-Core Version:    0.7.0.1
 */