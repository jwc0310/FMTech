import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public final class gkx
  implements gky, mbo, mdz, meu, mfd
{
  private Activity a;
  private gle b;
  private ikt c;
  private glk d;
  
  public gkx(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(int paramInt)
  {
    this.d.a = gln.c;
    switch (paramInt)
    {
    }
    do
    {
      return;
      ikt localikt = this.c;
      ilf localilf = new ilf();
      localilf.s = ikq.class;
      localilf.t = null;
      localikt.a(localilf);
      return;
      this.b.a();
      return;
    } while (this.a == null);
    Intent localIntent = new Intent("android.settings.SYNC_SETTINGS");
    localIntent.putExtra("settings", new String[] { "google" });
    localIntent.setFlags(268435456);
    try
    {
      this.a.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("AccountActionSelectedHandler", localActivityNotFoundException.toString());
    }
  }
  
  public final void a(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((gle)parammbb.a(gle.class));
    this.c = ((ikt)parammbb.a(ikt.class));
    this.d = ((glk)parammbb.a(glk.class));
  }
  
  public final void m_()
  {
    this.a = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkx
 * JD-Core Version:    0.7.0.1
 */