import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public final class hhq
  implements gzi, hgx, mbo, mfd
{
  private git a;
  private gzj b;
  private final bp c;
  
  public hhq(bk parambk, mek parammek)
  {
    this.c = parambk.f();
    parammek.a(this);
  }
  
  public final void a()
  {
    hln localhln = new hln(this.a.c(), false);
    this.b.b(localhln);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((git)parammbb.a(git.class));
    this.b = ((gzj)parammbb.a(gzj.class));
    this.b.a.add(this);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (!"ReadCollectorSettingsTask".equals(paramString)) || (paramhae.a().getBoolean("trigger_follow_state_update", false))) {}
    for (;;)
    {
      return;
      if (paramhae.b != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(this.c, this.c.getString(aaw.os), 0).show();
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hhq
 * JD-Core Version:    0.7.0.1
 */