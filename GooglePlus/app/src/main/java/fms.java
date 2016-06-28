import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

final class fms
  extends fmf
{
  private final eft<flh> a;
  
  public fms(eft<flh> parameft)
  {
    this.a = parameft;
  }
  
  public final void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder)
  {
    if (efj.d(3))
    {
      new StringBuilder("People callback: status=").append(paramInt).append("\nresolution=").append(paramBundle).append("\nholder=").append(paramDataHolder).toString();
      efj.d(3);
    }
    Status localStatus = fmq.a(paramInt, null, paramBundle);
    fnt localfnt = fmq.a(paramDataHolder);
    this.a.a(new fmw(localStatus, localfnt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fms
 * JD-Core Version:    0.7.0.1
 */