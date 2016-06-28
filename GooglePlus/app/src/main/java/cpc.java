import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.RectF;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;

public final class cpc
  extends lut
{
  private cpd Z;
  private CheckBox aa;
  private cpe ac;
  
  public static cpc a(Long paramLong, cpd paramcpd, RectF paramRectF, cpe paramcpe)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("KEY_SHAPE_ACTION", paramcpd.ordinal());
    if (paramRectF != null) {
      localBundle.putParcelable("KEY_SHAPE_BOUNDS", paramRectF);
    }
    if (paramLong != null) {
      localBundle.putLong("KEY_SHAPE_ID", paramLong.longValue());
    }
    cpc localcpc = new cpc();
    localcpc.ac = paramcpe;
    localcpc.f(localBundle);
    return localcpc;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    String str = localBundle.getString("taggee_name");
    cpd[] arrayOfcpd = cpd.values();
    int i = localBundle.getInt("KEY_SHAPE_ACTION", 0);
    if (i >= arrayOfcpd.length) {}
    for (this.Z = cpd.a;; this.Z = arrayOfcpd[i])
    {
      Context localContext = ar_();
      View localView = LayoutInflater.from(localContext).inflate(efj.tk, null);
      this.aa = ((CheckBox)localView.findViewById(aaw.cK));
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
      localBuilder.setTitle(localContext.getString(aau.oa, new Object[] { str })).setView(localView).setPositiveButton(aau.mf, this).setNegativeButton(aau.cM, this);
      return localBuilder.create();
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case -1: 
      Bundle localBundle;
      long l;
      do
      {
        return;
        if (this.aa.isChecked()) {
          PreferenceManager.getDefaultSharedPreferences(f()).edit().putBoolean("shape.show_create_confirm", true).commit();
        }
        localBundle = this.m;
        l = localBundle.getLong("KEY_SHAPE_ID");
        if (this.Z.equals(cpd.b))
        {
          if (l != 0L)
          {
            this.ac.a(l, localBundle.getString("taggee_name"), localBundle.getString("taggee_email"), localBundle.getString("taggee_gaia_id"));
            return;
          }
          this.ac.a((RectF)localBundle.getParcelable("KEY_SHAPE_BOUNDS"), localBundle.getString("taggee_name"), localBundle.getString("taggee_email"), localBundle.getString("taggee_gaia_id"));
          return;
        }
      } while (!this.Z.equals(cpd.c));
      this.ac.a(l, localBundle.getString("taggee_gaia_id"));
      return;
    }
    a(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpc
 * JD-Core Version:    0.7.0.1
 */