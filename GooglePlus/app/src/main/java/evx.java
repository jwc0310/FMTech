import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

final class evx
  extends ewa
{
  evx(evw paramevw, efd paramefd, Intent paramIntent, Bitmap paramBitmap, Activity paramActivity)
  {
    super(paramefd);
  }
  
  protected final void a(ewf paramewf)
  {
    try
    {
      paramewf.a((GoogleHelp)this.a.getParcelableExtra("EXTRA_GOOGLE_HELP"), this.h, new evy(this));
      return;
    }
    catch (Exception localException)
    {
      Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", localException);
      c(evw.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     evx
 * JD-Core Version:    0.7.0.1
 */