import android.content.Context;
import android.os.Bundle;
import android.util.Log;

final class jwj
  implements gzi
{
  jwj(jwe paramjwe) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (paramhae.a() == null)) {}
    for (;;)
    {
      return;
      if ((jvz.a.equals(paramString)) || (juk.a.equals(paramString))) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label183;
        }
        Bundle localBundle1 = paramhae.a();
        if (!this.a.d.equals(localBundle1.getString("activity_id"))) {
          break;
        }
        int j = paramhae.b;
        int k = 0;
        if (j != 200) {
          k = 1;
        }
        if (k == 0) {
          break label185;
        }
        Bundle localBundle2 = paramhae.a();
        jxn.a(this.a.b).a(this.a.b.getString(eyg.aN));
        this.a.l().a(localBundle2.getInt("previous_voted_option_index"), localBundle2.getInt("voted_option_index"));
        jxg localjxg2 = (jxg)this.a.c();
        localjxg2.I = true;
        if (localjxg2.w) {
          break;
        }
        localjxg2.l();
        return;
      }
      label183:
      continue;
      label185:
      byte[] arrayOfByte = paramhae.a().getByteArray("poll_data");
      if (arrayOfByte != null) {
        try
        {
          nuc localnuc = (nuc)qat.b(new nuc(), arrayOfByte, 0, arrayOfByte.length);
          this.a.m().a(localnuc);
          jxg localjxg1 = (jxg)this.a.c();
          localjxg1.I = false;
          if (!localjxg1.w)
          {
            localjxg1.m();
            return;
          }
        }
        catch (qas localqas)
        {
          Log.e(jwe.a, "Failed to retrieve fresh poll data after voting operation", localqas);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwj
 * JD-Core Version:    0.7.0.1
 */