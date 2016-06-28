import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.locations.HostFriendLocationsActivity;
import java.util.List;

final class csn
  implements giv, ica
{
  private Activity a;
  private ibw b;
  private ikt c;
  
  public final void a()
  {
    ikt localikt = this.c;
    ilf localilf = new ilf();
    localilf.s = ilm.class;
    localilf.t = null;
    localikt.a(localilf);
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramActivity;
    this.b = paramibw;
    paramikt.g.add(this);
    this.c = ((ikt)paramikt);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      ibw localibw = this.b;
      Intent localIntent1 = this.a.getIntent();
      Intent localIntent2 = new Intent(this.a, HostFriendLocationsActivity.class);
      Bundle localBundle = localIntent1.getExtras();
      if (localBundle != null) {
        localIntent2.putExtras(localBundle);
      }
      localIntent2.putExtra("account_id", paramInt2);
      localibw.a(localIntent2);
      return;
    }
    this.b.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csn
 * JD-Core Version:    0.7.0.1
 */