import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public final class ldy
  extends bj
  implements DialogInterface.OnClickListener
{
  public static ldy a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("square_id", paramString1);
    localBundle.putString("activity_id", paramString2);
    ldy localldy = new ldy();
    localldy.f(localBundle);
    return localldy;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun1 = new un(f());
    un localun2 = localun1.a(ex.f).b(ex.e).a(ex.c, this);
    int i = ex.d;
    localun2.a.l = localun2.a.a.getText(i);
    localun2.a.m = this;
    localun2.b(ex.b, this).a.n = true;
    return localun1.a();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bk localbk = this.n;
    kyw localkyw;
    if ((localbk instanceof kyw)) {
      localkyw = (kyw)localbk;
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
      case -1: 
      case -3: 
        do
        {
          do
          {
            return;
            bp localbp = f();
            if (!(localbp instanceof kyw)) {
              break label138;
            }
            localkyw = (kyw)localbp;
            break;
          } while (localkyw == null);
          localkyw.c(this.m.getString("square_id"), this.m.getString("activity_id"));
          return;
        } while (localkyw == null);
        localkyw.d(this.m.getString("square_id"), this.m.getString("activity_id"));
        return;
      }
      paramDialogInterface.dismiss();
      return;
      label138:
      localkyw = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldy
 * JD-Core Version:    0.7.0.1
 */