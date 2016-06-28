import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;

public final class ayc
  implements bfg
{
  final hwi a = new hwi(this.b.bp, new hwm(this));
  
  ayc(axz paramaxz) {}
  
  public final void a()
  {
    Context localContext = this.b.f().getApplicationContext();
    ConnectivityManager localConnectivityManager = (ConnectivityManager)localContext.getSystemService("connectivity");
    boolean bool1 = efj.J(localContext);
    int i;
    if ((bool1) && (iv.a.a(localConnectivityManager)))
    {
      i = 1;
      if ((!bool1) || (i != 0)) {
        break label98;
      }
    }
    boolean bool2;
    label98:
    for (int j = 1;; j = 0)
    {
      bool2 = hvu.b(localContext);
      if ((!bool2) && (j != 0)) {
        hvu.a(localContext);
      }
      if (!hvu.c(localContext)) {
        break label104;
      }
      this.a.b();
      return;
      i = 0;
      break;
    }
    label104:
    if ((bool2) || (i == 0))
    {
      b();
      return;
    }
    ayd localayd = new ayd(this);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.b.f());
    localBuilder.setMessage(aau.fo);
    localBuilder.setCancelable(true);
    localBuilder.setPositiveButton(aau.fj, localayd);
    localBuilder.setNegativeButton(aau.vM, localayd);
    localBuilder.create().show();
  }
  
  public final void b()
  {
    bp localbp = this.b.f();
    int i = this.b.m.getInt("account_id", -1);
    Intent localIntent;
    if (localbp != null)
    {
      bcp localbcp = this.b.Z.b;
      localIntent = localbcp.a(localbp, i);
      if (!localbcp.T()) {
        this.b.d.a(aaw.iE, localIntent);
      }
    }
    else
    {
      return;
    }
    this.b.d.a(aaw.iC, localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayc
 * JD-Core Version:    0.7.0.1
 */