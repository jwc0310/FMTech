import android.app.Activity;
import android.widget.Toast;

public final class gqj
  implements gqh
{
  public int a;
  private final gqk b;
  
  public gqj(gqk paramgqk)
  {
    this.b = paramgqk;
  }
  
  public final boolean a(Activity paramActivity)
  {
    CharSequence localCharSequence = this.b.z();
    if (localCharSequence == null) {
      return false;
    }
    efj.a(paramActivity, localCharSequence);
    if (this.a != 0) {
      Toast.makeText(paramActivity, this.a, 0).show();
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqj
 * JD-Core Version:    0.7.0.1
 */