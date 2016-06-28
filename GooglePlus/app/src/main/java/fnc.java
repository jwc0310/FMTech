import android.os.Bundle;
import com.google.android.gms.common.api.Status;

public final class fnc
  extends fmf
{
  private final eft<efn> a;
  
  public fnc(eft<efn> parameft)
  {
    this.a = parameft;
  }
  
  public final void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (efj.d(3))
    {
      new StringBuilder("Bundle callback: status=").append(paramInt).append("\nresolution=").append(paramBundle1).append("\nbundle=").append(paramBundle2).toString();
      efj.d(3);
    }
    Status localStatus = fmq.a(paramInt, null, paramBundle1);
    this.a.a(new fnd(localStatus));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fnc
 * JD-Core Version:    0.7.0.1
 */