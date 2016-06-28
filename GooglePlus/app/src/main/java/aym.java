import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.plus.service.EsService;

final class aym
  implements bfg
{
  aym(ayk paramayk) {}
  
  public final void a()
  {
    bcp localbcp = this.a.a.b;
    if (localbcp.a().d != null) {}
    for (int i = 1; i != 0; i = 0)
    {
      efj.a(this.a.f(), localbcp.a());
      return;
    }
    int j = this.a.m.getInt("account_id", -1);
    bz localbz = this.a.x;
    ayk localayk1 = this.a;
    int k = aau.fl;
    coo.a(null, localayk1.g().getString(k), false).a(localbz, "ProgressDialogHelper:progress_dialog");
    ayk localayk2 = this.a;
    Context localContext = this.a.f().getApplicationContext();
    ipf localipf = localbcp.a();
    Intent localIntent = EsService.e.a(localContext, EsService.class);
    localIntent.putExtra("op", 103);
    localIntent.putExtra("account_id", j);
    localIntent.putExtra("media", localipf);
    localayk2.b = Integer.valueOf(EsService.a(localContext, localIntent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aym
 * JD-Core Version:    0.7.0.1
 */