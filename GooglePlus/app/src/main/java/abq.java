import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;

final class abq
{
  final Context a;
  final Handler b;
  boolean c;
  final BroadcastReceiver d = new abr(this);
  final Runnable e = new abs(this);
  private final abt f;
  private final PackageManager g;
  private final ArrayList<abj> h = new ArrayList();
  
  public abq(Context paramContext, abt paramabt)
  {
    this.a = paramContext;
    this.f = paramabt;
    this.b = new Handler();
    this.g = paramContext.getPackageManager();
  }
  
  private final int a(String paramString1, String paramString2)
  {
    int i = this.h.size();
    for (int j = 0; j < i; j++)
    {
      abj localabj = (abj)this.h.get(j);
      if ((localabj.j.getPackageName().equals(paramString1)) && (localabj.j.getClassName().equals(paramString2))) {}
      for (int k = 1; k != 0; k = 0) {
        return j;
      }
    }
    return -1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abq
 * JD-Core Version:    0.7.0.1
 */