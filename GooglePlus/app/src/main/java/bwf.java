import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class bwf
  extends bj
  implements DialogInterface.OnClickListener
{
  String Z;
  private boolean aa;
  private TextView ab;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle = this.m;
    this.Z = localBundle.getString("album_url");
    this.aa = localBundle.getBoolean("is_public");
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    bp localbp = f();
    View localView = f().getLayoutInflater().inflate(efj.sC, null);
    this.ab = ((TextView)localView.findViewById(aaw.T));
    this.ab.setText(this.Z);
    this.ab.setOnClickListener(new bwg(this));
    AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(localbp);
    int i = aau.bZ;
    AlertDialog.Builder localBuilder2 = localBuilder1.setTitle(g().getString(i)).setCancelable(false).setView(localView).setPositiveButton(aau.mf, this);
    if (!this.aa) {
      localBuilder2.setNegativeButton(aau.sa, this);
    }
    return localBuilder2.create();
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((paramInt == -2) && ((this.n instanceof bwh))) {
      ((bwh)this.n).U_();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwf
 * JD-Core Version:    0.7.0.1
 */