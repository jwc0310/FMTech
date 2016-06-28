import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ProgressBar;

public final class hwk
  extends bj
{
  hwm Z;
  
  public final Dialog c(Bundle paramBundle)
  {
    return new AlertDialog.Builder(f()).setView(new ProgressBar(f())).setTitle(efj.Lo).setMessage(efj.Ln).setPositiveButton(efj.Lp, new hwl(this)).create();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwk
 * JD-Core Version:    0.7.0.1
 */