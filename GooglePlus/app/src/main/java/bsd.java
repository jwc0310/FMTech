import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

final class bsd
{
  LinkedHashMap<String, okn> a = new LinkedHashMap();
  LinkedHashMap<String, LinkedHashMap<String, okn>> b = new LinkedHashMap();
  private Context c;
  private int d;
  private bup e;
  private int f;
  private HashMap<String, String> g = new HashMap();
  
  bsd(Context paramContext, int paramInt, bup parambup)
  {
    this.c = paramContext;
    this.d = paramInt;
    this.e = parambup;
    this.f = aum.b(paramContext, paramInt).c.intValue();
  }
  
  public final void a()
  {
    int i = this.d;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      okn localokn = (okn)this.a.get(str2);
      oif localoif = ((okl)localokn.b(okl.a)).b;
      okn[] arrayOfokn = { localokn };
      String str3 = jrf.a(3, new String[] { jrf.a(str2, localoif.e, localoif.b, localoif.c) });
      jrf.b(this.c, i, str3, (String)this.g.get(str2), true);
      jrf.a(this.c, i, str3, arrayOfokn, true, false, null, true);
      for (int j = 0; j < localokn.i.length; j++) {
        if (((okm)localokn.i[j].b(okm.a)).b.l != null) {
          localArrayList.add(localokn.i[j]);
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      String str1 = jrf.a(5, new String[] { "#videos" });
      jrf.a(this.c, i, str1, (okn[])localArrayList.toArray(new okn[0]), true, false, null, true);
    }
  }
  
  final void a(ArrayList<String> paramArrayList)
  {
    if (((this.e != null) && (this.e.b())) || (this.f == 0) || (paramArrayList.isEmpty())) {}
    label436:
    label566:
    label697:
    for (;;)
    {
      return;
      Object localObject = null;
      int i = this.d;
      HashMap localHashMap = new HashMap();
      int j = 0;
      String str1;
      if ((this.e == null) || (!this.e.b()))
      {
        if (Log.isLoggable("EsTileSync", 4)) {
          new StringBuilder(46).append("Getting collections by ID, request ").append(j);
        }
        if (this.e != null)
        {
          bup localbup2 = this.e;
          localbup2.d = (this.f + localbup2.d);
        }
        bld localbld = new bld(this.c, new kcg(this.c, i, this.e), i, paramArrayList, false, Integer.valueOf(this.f), (String)localObject);
        localbld.i();
        localbld.d("EsTileSync");
        localHashMap.putAll(localbld.b);
        okn[] arrayOfokn1 = localbld.a.c;
        if (this.e != null)
        {
          bup localbup1 = this.e;
          localbup1.e = (arrayOfokn1.length + localbup1.e);
        }
        for (int k = 0; k < arrayOfokn1.length; k++)
        {
          ojf localojf = ((okm)arrayOfokn1[k].b(okm.a)).b;
          if (localojf.y.length > 0)
          {
            String str5 = localojf.y[0].a;
            LinkedHashMap localLinkedHashMap = (LinkedHashMap)this.b.get(str5);
            if (localLinkedHashMap == null)
            {
              localLinkedHashMap = new LinkedHashMap();
              this.b.put(str5, localLinkedHashMap);
            }
            localLinkedHashMap.put(localojf.e, arrayOfokn1[k]);
          }
        }
        for (npt localnpt : localbld.a.e)
        {
          String str4 = localnpt.a.a;
          this.g.put(str4, localnpt.b);
        }
        str1 = localbld.a.a;
        if ((TextUtils.isEmpty(str1)) || (!str1.equals(localObject))) {
          break label566;
        }
        if (!Log.isLoggable("EsTileSync", 5)) {}
      }
      Iterator localIterator = this.b.keySet().iterator();
      for (;;)
      {
        label450:
        if (!localIterator.hasNext()) {
          break label697;
        }
        String str2 = (String)localIterator.next();
        okn localokn = (okn)localHashMap.get(str2);
        if (localokn != null)
        {
          okn[] arrayOfokn2 = (okn[])((LinkedHashMap)this.b.get(str2)).values().toArray(new okn[0]);
          localokn.i = arrayOfokn2;
          if ((localokn.e == null) && (arrayOfokn2.length > 0)) {
            localokn.e = arrayOfokn2[0].e;
          }
          for (;;)
          {
            this.a.put(str2, localokn);
            break label450;
            int i1 = j + 1;
            if ((str1 == null) || (str1.length() <= 0)) {
              break label436;
            }
            j = i1;
            localObject = str1;
            break;
            if ((arrayOfokn2.length == 0) && (Log.isLoggable("EsTileSync", 5))) {
              new StringBuilder(79 + String.valueOf(str2).length()).append("processCollectionTile: Collection ID ").append(str2).append(" has no children - This should not happen!");
            }
          }
        }
        if (Log.isLoggable("EsTileSync", 5))
        {
          String str3 = String.valueOf(str2);
          if (str3.length() != 0) {
            "CollectionSyncer.sync: No collection found for id ".concat(str3);
          } else {
            new String("CollectionSyncer.sync: No collection found for id ");
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsd
 * JD-Core Version:    0.7.0.1
 */