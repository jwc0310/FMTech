import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public final class izr
  extends bj
{
  int Z;
  long aa;
  
  public final Dialog c(Bundle paramBundle)
  {
    this.Z = this.m.getInt("account_id");
    this.aa = this.m.getLong("item_id");
    return new AlertDialog.Builder(f()).setTitle(f().getString(efj.Qn)).setPositiveButton(efj.Qp, new izt(this)).setNegativeButton(efj.Qo, new izs(this)).create();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("account_id", this.Z);
    paramBundle.putLong("item_id", this.aa);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izr
 * JD-Core Version:    0.7.0.1
 */