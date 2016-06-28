import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsSyncAdapterService;

public final class dmo
  extends gzf
{
  public dmo(Context paramContext)
  {
    super(paramContext, "MandatorySyncTask");
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    EsSyncAdapterService.d(this.e);
    return new hae(true);
  }
  
  protected final void a_(hae paramhae)
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Toast.makeText(this.e, "Triggered a data sync.", 0).show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmo
 * JD-Core Version:    0.7.0.1
 */