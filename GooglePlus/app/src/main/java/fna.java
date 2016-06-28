import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class fna
  extends fmf
{
  private final eft<fla> a;
  
  public fna(eft<fla> parameft)
  {
    this.a = parameft;
  }
  
  public final void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder)
  {
    if (efj.d(3))
    {
      new StringBuilder("Circles callback: status=").append(paramInt).append("\nresolution=").append(paramBundle).append("\nholder=").append(paramDataHolder).toString();
      efj.d(3);
    }
    Status localStatus = fmq.a(paramInt, null, paramBundle);
    fno localfno = null;
    if (paramDataHolder == null) {}
    for (;;)
    {
      this.a.a(new fmx(localStatus, localfno));
      return;
      localfno = new fno(paramDataHolder);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fna
 * JD-Core Version:    0.7.0.1
 */