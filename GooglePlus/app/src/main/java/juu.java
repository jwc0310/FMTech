import android.os.Bundle;
import java.util.ArrayList;

final class juu
  implements gzi
{
  juu(juo paramjuo) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (paramhae == null) {}
    while (!jwr.a.equals(paramString)) {
      return;
    }
    ArrayList localArrayList = paramhae.a().getParcelableArrayList("media_refs_with_photo_ids");
    juo localjuo = this.a;
    ipf localipf = (ipf)localArrayList.get(0);
    int i = this.a.ad;
    if (i == -2)
    {
      localjuo.ac.b(true);
      localjuo.ac.a(0).a(localjuo.bn, localipf, null, true);
    }
    for (;;)
    {
      this.a.ad = -1;
      return;
      if ((i >= 0) && (i < localjuo.ac.c()))
      {
        localjuo.ac.b(false);
        localjuo.ac.a(i).a(localjuo.bn, localipf, null, true);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     juu
 * JD-Core Version:    0.7.0.1
 */