import android.content.Intent;
import android.os.Bundle;

final class hnv
  implements guf
{
  hnv(hnu paramhnu) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if ((paramInt == -1) && (paramIntent != null))
    {
      hnu localhnu = this.a;
      localhnu.k().b(0, null, localhnu);
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null)
      {
        String str1 = localBundle.getString("clx_id");
        String str2 = localBundle.getString("clx_name");
        int i = localBundle.getInt("clx_acl");
        boolean bool = false;
        if (i == 2) {
          bool = true;
        }
        hps localhps = new hps(str1, str2, bool);
        hpr localhpr = hpp.a();
        localhpr.a = localhps;
        hpp localhpp = new hpp(localhpr);
        this.a.b.a();
        this.a.b.a(localhpp);
        this.a.c.a(-1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnv
 * JD-Core Version:    0.7.0.1
 */