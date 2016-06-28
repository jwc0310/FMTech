import android.app.Activity;
import android.content.Intent;

final class lzt
  implements mds, mfd
{
  private final Activity a;
  
  public lzt(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  static boolean a(Activity paramActivity)
  {
    boolean bool1;
    if (paramActivity.getCallingActivity() == null)
    {
      boolean bool2 = paramActivity.getIntent().getBooleanExtra("task_launched_for_result", false);
      bool1 = false;
      if (!bool2) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public final void b(Intent paramIntent)
  {
    if (a(this.a)) {
      paramIntent.putExtra("task_launched_for_result", true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzt
 * JD-Core Version:    0.7.0.1
 */