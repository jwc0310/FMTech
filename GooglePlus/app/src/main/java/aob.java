import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;

public final class aob
  extends bj
  implements DialogInterface.OnClickListener
{
  public static aob a(isq paramisq)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("selected_media", paramisq);
    aob localaob = new aob();
    localaob.f(localBundle);
    return localaob;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    isq localisq = (isq)this.m.getParcelable("selected_media");
    int i;
    int j;
    label36:
    int k;
    int m;
    if (localisq.f > 0)
    {
      i = 1;
      if ((i == 0) || (!localisq.b())) {
        break label159;
      }
      j = 1;
      if (j == 0) {
        break label165;
      }
      k = efj.xJ;
      m = efj.xH;
    }
    for (;;)
    {
      ArrayList localArrayList = localisq.a(bvj.class);
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(f()).setTitle(g().getQuantityString(k, localArrayList.size()));
      Resources localResources = g();
      int n = localArrayList.size();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(localArrayList.size());
      return localBuilder.setMessage(localResources.getQuantityString(m, n, arrayOfObject)).setPositiveButton(aau.vS, this).setNegativeButton(aau.ly, this).create();
      i = 0;
      break;
      label159:
      j = 0;
      break label36;
      label165:
      if (i != 0)
      {
        k = efj.xP;
        m = efj.xN;
      }
      else
      {
        k = efj.xM;
        m = efj.xK;
      }
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      ((anu)mbb.a(f(), anu.class)).a.a();
      return;
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aob
 * JD-Core Version:    0.7.0.1
 */