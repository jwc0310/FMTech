import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

final class bxv
  implements had
{
  bxv(bxu parambxu) {}
  
  public final void a(hae paramhae)
  {
    bxu localbxu = this.a;
    if (jid.a()) {
      jid.a("CirclesWithFollowingFragment", "AddCircleTask completed.");
    }
    if (paramhae.b != 200) {}
    for (int i = 1; i != 0; i = 0)
    {
      if (jid.a()) {
        jid.a("CirclesWithFollowingFragment", "Add circle failed.");
      }
      Toast.makeText(localbxu.bn, aau.uV, 0).show();
      return;
    }
    if (jid.a())
    {
      jid.a("CirclesWithFollowingFragment", "Add circle succeeded.");
      jid.a("CirclesWithFollowingFragment", "Circle added getTopPeopleInCircles.");
    }
    String str1 = paramhae.a().getString("circle_name");
    int j = aau.uR;
    Object[] arrayOfObject = { str1 };
    String str2 = localbxu.g().getString(j, arrayOfObject);
    Toast.makeText(localbxu.bn, str2, 0).show();
    localbxu.b.b(localbxu.Z.a(localbxu.bn, localbxu.a.c()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxv
 * JD-Core Version:    0.7.0.1
 */