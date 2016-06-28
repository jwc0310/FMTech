import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fmr
  extends fmf
{
  private final eft<flf> a;
  
  public fmr(eft<flf> parameft)
  {
    this.a = parameft;
  }
  
  public final void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder)
  {
    if (efj.d(3))
    {
      new StringBuilder("Owner callback: status=").append(paramInt).append("\nresolution=").append(paramBundle).append("\nholder=").append(paramDataHolder).toString();
      efj.d(3);
    }
    Status localStatus = fmq.a(paramInt, null, paramBundle);
    fnq localfnq = null;
    if (paramDataHolder == null) {}
    for (;;)
    {
      this.a.a(new fmv(localStatus, localfnq));
      return;
      localfnq = new fnq(paramDataHolder);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmr
 * JD-Core Version:    0.7.0.1
 */