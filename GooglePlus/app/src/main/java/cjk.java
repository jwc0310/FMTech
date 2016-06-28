import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;

public final class cjk
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    Resources localResources = g();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(f());
    int i = efj.xo;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(1);
    localBuilder.setTitle(localResources.getQuantityString(i, 1, arrayOfObject1));
    int j = efj.xn;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(1);
    localBuilder.setMessage(localResources.getQuantityString(j, 1, arrayOfObject2));
    localBuilder.setPositiveButton(17039370, this);
    localBuilder.setNegativeButton(17039360, this);
    localBuilder.setCancelable(true);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      cjd localcjd = (cjd)this.n;
      localcjd.b(aau.eP);
      int i = localcjd.am.c();
      if (jid.a()) {
        jid.a("PeopleCircleListFmt", "Starting removeCircleTask.");
      }
      if (localcjd.a.startsWith("f.")) {}
      for (String str = localcjd.a.substring(2);; str = localcjd.a)
      {
        jju localjju = new jju(localcjd.bn, i, str);
        localcjd.ap.b(localjju);
        return;
      }
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjk
 * JD-Core Version:    0.7.0.1
 */