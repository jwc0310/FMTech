import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class bjq
  extends cun<mvb, mvc>
{
  private final String a;
  private final String b;
  private final int c;
  private HashMap<String, ojv> d;
  
  public bjq(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, paramInt, "getuserhighlights", new mvb(), new mvc());
    String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    if ((paramString1 == null) || (str.equals(paramString1))) {
      this.a = str;
    }
    for (this.c = 1;; this.c = 2)
    {
      this.b = paramString2;
      return;
      this.a = paramString1;
    }
  }
  
  private final okn[] a(nqo paramnqo)
  {
    HashMap localHashMap1 = new HashMap();
    for (int i = 0; i < paramnqo.b.length; i++) {
      localHashMap1.put(((okl)paramnqo.b[i].b(okl.a)).b.a, paramnqo.b[i]);
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    int j = 0;
    if (j < paramnqo.c.length)
    {
      okm localokm = (okm)paramnqo.c[j].b(okm.a);
      ojf localojf = localokm.b;
      if (localojf.y.length > 0)
      {
        String str4 = localojf.y[0].a;
        ArrayList localArrayList3 = (ArrayList)localLinkedHashMap.get(str4);
        if (localArrayList3 == null)
        {
          localArrayList3 = new ArrayList();
          localLinkedHashMap.put(str4, localArrayList3);
        }
        localArrayList3.add(paramnqo.c[j]);
      }
      HashMap localHashMap2 = this.d;
      if (localojf.h != null) {}
      for (String str3 = localojf.h.a;; str3 = null)
      {
        localojf.g = ((ojv)localHashMap2.get(str3));
        paramnqo.c[j].a(okm.a, localokm);
        j++;
        break;
      }
    }
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = localLinkedHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      okn localokn = (okn)localHashMap1.get(str1);
      if (localokn == null)
      {
        if (!Log.isLoggable("HttpOperation", 5)) {
          break;
        }
      }
      else
      {
        ArrayList localArrayList2 = (ArrayList)localLinkedHashMap.get(str1);
        if ((localokn.e == null) && (localArrayList2.size() > 0)) {
          localokn.e = ((okn)localArrayList2.get(0)).e;
        }
        localokn.i = ((okn[])localArrayList2.toArray(new okn[localArrayList2.size()]));
        okl localokl = (okl)localokn.b(okl.a);
        ojv localojv = (ojv)this.d.get(localokl.b.f.a);
        oif localoif = localokl.b;
        if (localojv == null) {}
        for (String str2 = null;; str2 = localojv.b)
        {
          localoif.e = str2;
          localokn.a(okl.a, localokl);
          localArrayList1.add(localokn);
          break;
        }
      }
    }
    return (okn[])localArrayList1.toArray(new okn[localArrayList1.size()]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bjq
 * JD-Core Version:    0.7.0.1
 */