import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class aog
  implements mbo, mfd
{
  aud a;
  private final Activity b;
  private Context c;
  private git d;
  private final guf e = new aoh(this);
  private gug f;
  
  public aog(Activity paramActivity, mek parammek)
  {
    this.b = paramActivity;
    parammek.a(this);
  }
  
  public final void a()
  {
    gxx localgxx = (gxx)mbb.a(this.b, gxx.class);
    gxw localgxw = new gxw(this.c);
    localgxw.c = gxz.dc;
    localgxx.a(localgxw);
    ArrayList localArrayList = this.a.b.a(jpx.class);
    int i = this.d.c();
    Intent localIntent = efj.b(this.b, i, localArrayList);
    this.f.a(aaw.iZ, localIntent);
    this.b.overridePendingTransition(efj.iK, 0);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = paramContext;
    this.a = ((aud)parammbb.a(aud.class));
    this.d = ((git)parammbb.a(git.class));
    this.f = ((gug)parammbb.a(gug.class));
    this.f.a(aaw.iZ, this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aog
 * JD-Core Version:    0.7.0.1
 */