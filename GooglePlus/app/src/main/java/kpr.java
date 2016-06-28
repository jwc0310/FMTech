import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public final class kpr
  implements kpn
{
  private final Context a;
  
  kpr(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final boolean a()
  {
    Intent localIntent = ((gcn)mbb.a(this.a, gcn.class)).a().a();
    return !this.a.getPackageManager().queryIntentActivities(localIntent, 0).isEmpty();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpr
 * JD-Core Version:    0.7.0.1
 */