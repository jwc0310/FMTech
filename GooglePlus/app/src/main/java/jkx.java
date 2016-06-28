import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class jkx
  extends lut
{
  public static void a(bk parambk, int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    bz localbz = parambk.x;
    if (((bj)localbz.a(paramString1) == null) && (parambk.f() != null))
    {
      jkx localjkx = new jkx();
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      paramBundle.putString("personName", paramString2);
      paramBundle.putString("defaultCircleName", paramString3);
      paramBundle.putInt("account_id", paramInt);
      localjkx.f(paramBundle);
      localjkx.n = parambk;
      localjkx.p = 0;
      localjkx.a(localbz, paramString1);
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    bp localbp = f();
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localbp);
    String str = this.m.getString("defaultCircleName");
    localBuilder.setTitle(g().getString(eb.e, new Object[] { str }));
    localBuilder.setNegativeButton(eb.b, this);
    localBuilder.setPositiveButton(eb.c, this);
    localBuilder.setCancelable(true);
    View localView = LayoutInflater.from(localbp).inflate(aau.AD, null);
    ((TextView)localView.findViewById(efj.Sd)).setText(g().getString(eb.d, new Object[] { str }));
    localBuilder.setView(localView);
    return localBuilder.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      bp localbp = f();
      int i = this.m.getInt("account_id");
      ((jia)mbb.a(localbp, jia.class)).b(localbp, i);
      jlx localjlx = new jlx(localbp, i);
      localjlx.b = true;
      gzj.a(localbp, localjlx);
    }
    super.onClick(paramDialogInterface, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkx
 * JD-Core Version:    0.7.0.1
 */