import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

final class cws
  implements had
{
  cws(cwr paramcwr) {}
  
  public final void a(hae paramhae)
  {
    cwr localcwr = this.a;
    if (jid.a()) {
      jid.a("CirclesFragment", "AddCircleTask completed.");
    }
    if (paramhae.b != 200) {}
    for (int i = 1; i != 0; i = 0)
    {
      if (jid.a()) {
        jid.a("CirclesFragment", "Add circle failed.");
      }
      Toast.makeText(localcwr.bn, eyg.m, 0).show();
      return;
    }
    if (jid.a())
    {
      jid.a("CirclesFragment", "Add circle succeeded.");
      jid.a("CirclesFragment", "Circle added getTopPeopleInCircles.");
    }
    String str1 = paramhae.a().getString("circle_name");
    int j = eyg.l;
    Object[] arrayOfObject = { str1 };
    String str2 = localcwr.g().getString(j, arrayOfObject);
    Toast.makeText(localcwr.bn, str2, 0).show();
    localcwr.b.b(localcwr.d.a(localcwr.bn, localcwr.a.c()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cws
 * JD-Core Version:    0.7.0.1
 */