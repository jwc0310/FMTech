import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class fmt
  extends fmf
{
  private final eft<aip> a;
  
  public fmt(eft<aip> parameft)
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
    int i;
    ArrayList localArrayList2;
    ArrayList localArrayList1;
    if (localStatus.g <= 0)
    {
      i = 1;
      if (i == 0) {
        break label116;
      }
      localArrayList2 = paramBundle2.getStringArrayList("added_circles");
      localArrayList1 = paramBundle2.getStringArrayList("removed_circles");
    }
    for (;;)
    {
      this.a.a(new fmu(localStatus, localArrayList2, localArrayList1));
      return;
      i = 0;
      break;
      label116:
      localArrayList1 = null;
      localArrayList2 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmt
 * JD-Core Version:    0.7.0.1
 */