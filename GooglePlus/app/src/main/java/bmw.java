import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bmw
  extends gzf
{
  private final int a;
  private List<ipf> b;
  private final int c;
  
  public bmw(Context paramContext, int paramInt1, List<ipf> paramList, int paramInt2)
  {
    super(paramContext, "CreateMediaBundleTask");
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
  }
  
  private static String a(String paramString, long paramLong)
  {
    String str = String.valueOf(Long.toString(paramLong));
    return 8 + String.valueOf(paramString).length() + String.valueOf(str).length() + "CKEY:p:" + paramString + ":" + str;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    List localList = jrf.b(this.e, this.a, this.b);
    btd localbtd = new btd();
    localbtd.a = localList;
    localbtd.b = this.c;
    HashMap localHashMap1;
    HashMap localHashMap2;
    ipf localipf2;
    hae localhae;
    for (;;)
    {
      try
      {
        localHashMap1 = new HashMap();
        localHashMap2 = new HashMap();
        Iterator localIterator1 = localList.iterator();
        if (!localIterator1.hasNext()) {
          break label270;
        }
        localipf2 = (ipf)localIterator1.next();
        if (localipf2.b.a != 0L)
        {
          i = 1;
          if (i == 0) {
            break;
          }
          localHashMap1.put(localipf2, a(localipf2.b.b, localipf2.b.a));
          continue;
          Bundle localBundle;
          return localhae;
        }
      }
      catch (bmx localbmx)
      {
        localhae = new hae(false);
        localBundle = localhae.a();
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        localBundle.putString("hint_message", this.e.getString(aau.jE));
      }
      label194:
      int i = 0;
    }
    if (localipf2.d != null) {}
    for (int j = 1;; j = 0)
    {
      if (j != 0)
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        localHashMap2.put(hco.a(this.e).a(localipf2.d.toString(), false), localipf2);
        break;
      }
      throw new bmx(this);
      label270:
      if (localHashMap2.size() > 0)
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        String str1 = ((giz)mbb.a(this.e, giz.class)).a(this.a).b("gaia_id");
        ArrayList localArrayList = new ArrayList(localHashMap2.keySet());
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        kbu localkbu = (kbu)mbb.a(this.e, kbu.class);
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        jrv localjrv = new jrv(this.e, this.a, str1, localArrayList);
        localkbu.a(localjrv);
        Iterator localIterator2 = localHashMap2.keySet().iterator();
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          ipf localipf1 = (ipf)localHashMap2.get(str2);
          if (!localjrv.a.containsKey(str2)) {
            throw new bmx(this);
          }
          localHashMap1.put(localipf1, a(str1, localjrv.b(str2)));
        }
      }
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      bia localbia = new bia(this.e, this.a, localbtd, localHashMap1);
      localbia.i();
      localhae = new hae(localbia.o, localbia.q, null);
      if (localbia.a != null) {
        localhae.a().putParcelable("result_media", localbia.a);
      }
      if (localbia.b == null) {
        break label194;
      }
      localhae.a().putString("hint_message", localbia.b);
      return localhae;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmw
 * JD-Core Version:    0.7.0.1
 */