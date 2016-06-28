import android.os.Bundle;
import com.google.android.gms.common.api.Status;

public final class fmy
  extends fmf
{
  private final eft<flj> a;
  
  public fmy(eft<flj> parameft)
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
    String str1;
    String str2;
    if (paramBundle2 == null)
    {
      str1 = null;
      str2 = null;
      if (paramBundle2 != null) {
        break label103;
      }
    }
    for (;;)
    {
      this.a.a(new fmz(localStatus, str1, str2));
      return;
      str1 = paramBundle2.getString("circle_id");
      break;
      label103:
      str2 = paramBundle2.getString("circle_name");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmy
 * JD-Core Version:    0.7.0.1
 */