import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

final class dqq
  implements Runnable
{
  dqq(dqp paramdqp, Integer paramInteger) {}
  
  public final void run()
  {
    dqo localdqo = this.b.a;
    int i = this.a.intValue();
    try
    {
      if (localdqo.b != null) {
        localdqo.b.dismiss();
      }
      label30:
      if (i > 0)
      {
        Resources localResources = localdqo.a.getResources();
        int j = efj.ye;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        String str = localResources.getQuantityString(j, i, arrayOfObject);
        Bundle localBundle = new Bundle();
        localBundle.putString("message", str);
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(localdqo.a);
        localBuilder.setTitle(aau.tD);
        localBuilder.setMessage(localBundle.getString("message"));
        localBuilder.setPositiveButton(aau.mf, localdqo.d);
        localBuilder.setNegativeButton(aau.cM, localdqo.d);
        localBuilder.setCancelable(false);
        localdqo.c = localBuilder.create();
        localdqo.c.show();
        return;
      }
      localdqo.b();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label30;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqq
 * JD-Core Version:    0.7.0.1
 */