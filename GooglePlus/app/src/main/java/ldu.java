import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;

public final class ldu
  extends mby
  implements DialogInterface.OnClickListener
{
  CheckBox Z;
  CheckBox aa;
  private View ab;
  private View ac;
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun = new un(this.ad);
    View localView = LayoutInflater.from(this.ad).inflate(efj.XA, null);
    this.Z = ((CheckBox)localView.findViewById(efj.Xw));
    this.aa = ((CheckBox)localView.findViewById(efj.Xy));
    this.ab = localView.findViewById(efj.Xx);
    this.ac = localView.findViewById(efj.Xz);
    if (paramBundle != null)
    {
      this.Z.setChecked(paramBundle.getBoolean("also_remove"));
      this.aa.setChecked(paramBundle.getBoolean("also_report"));
    }
    for (;;)
    {
      v();
      this.aa.setOnCheckedChangeListener(new ldv(this));
      this.ab.setOnClickListener(new ldw(this));
      this.ac.setOnClickListener(new ldx(this));
      localun.a(localView);
      localun.a(ex.a);
      localun.a(17039370, this);
      localun.b(17039360, this);
      return localun.a();
      this.Z.setChecked(true);
      this.aa.setChecked(true);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putBoolean("also_remove", this.Z.isChecked());
    paramBundle.putBoolean("also_report", this.aa.isChecked());
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      String str1 = this.m.getString("gaia_id");
      String str2 = this.m.getString("square_id");
      String str3 = this.m.getString("activity_id");
      boolean bool1 = this.Z.isChecked();
      boolean bool2 = this.aa.isChecked();
      ((kyv)this.ae.a(kyv.class)).a(str1, str2, str3, bool1, bool2);
    }
  }
  
  final void v()
  {
    if (!this.aa.isChecked()) {}
    for (boolean bool = true;; bool = false)
    {
      this.Z.setEnabled(bool);
      this.ab.setEnabled(bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldu
 * JD-Core Version:    0.7.0.1
 */