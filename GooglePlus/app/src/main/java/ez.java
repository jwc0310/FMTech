import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

public final class ez
{
  public Intent a = new Intent().setAction("android.intent.action.SEND");
  public CharSequence b;
  private ArrayList<Uri> c;
  
  public ez(Activity paramActivity)
  {
    this.a.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", paramActivity.getPackageName());
    this.a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", paramActivity.getComponentName());
    this.a.addFlags(524288);
  }
  
  public final Intent a()
  {
    if (this.a.getAction().equals("android.intent.action.SEND_MULTIPLE"))
    {
      this.a.setAction("android.intent.action.SEND");
      this.a.removeExtra("android.intent.extra.STREAM");
      this.c = null;
    }
    return Intent.createChooser(this.a, this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ez
 * JD-Core Version:    0.7.0.1
 */