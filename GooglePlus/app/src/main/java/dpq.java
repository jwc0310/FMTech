import android.app.Activity;
import android.content.Intent;

public final class dpq
  implements gqh
{
  private final int a;
  
  public dpq()
  {
    this(-1);
  }
  
  public dpq(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final boolean a(Activity paramActivity)
  {
    Intent localIntent = efj.d(paramActivity, ((git)mbb.a(paramActivity, git.class)).c());
    if (this.a >= 0) {
      paramActivity.startActivityForResult(localIntent, this.a);
    }
    for (;;)
    {
      return true;
      paramActivity.startActivity(localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpq
 * JD-Core Version:    0.7.0.1
 */