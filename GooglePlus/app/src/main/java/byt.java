import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;

public final class byt
  extends bj
  implements DialogInterface.OnClickListener
{
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    Resources localResources = g();
    un localun = new un(f());
    int i = aau.eO;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localBundle.getString("arg_circle_name");
    String str = localResources.getString(i, arrayOfObject);
    localun.a.e = str;
    int j = efj.tm;
    localun.a.t = null;
    localun.a.s = j;
    localun.a.u = false;
    localun.a(17039370, this);
    localun.b(17039360, this);
    localun.a.n = true;
    return localun.a();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      byl localbyl = (byl)this.n;
      localbyl.b(aau.eP);
      int i = localbyl.am.c();
      if (jid.a()) {
        jid.a("PeopleCircleListFmt", "Starting removeCircleTask.");
      }
      if (localbyl.a.startsWith("f.")) {}
      for (String str = localbyl.a.substring(2);; str = localbyl.a)
      {
        jju localjju = new jju(localbyl.bn, i, str);
        localbyl.ap.b(localjju);
        return;
      }
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byt
 * JD-Core Version:    0.7.0.1
 */