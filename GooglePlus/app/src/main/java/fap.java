import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

final class fap
  extends fah
{
  private final eft<fkx> a;
  
  public fap(eft<fkx> parameft)
  {
    this.a = parameft;
  }
  
  public final void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    if (paramBundle != null) {}
    for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent");; localPendingIntent = null)
    {
      Status localStatus = new Status(paramInt1, null, localPendingIntent);
      this.a.a(new faf(localStatus, paramIntent, paramInt2));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fap
 * JD-Core Version:    0.7.0.1
 */