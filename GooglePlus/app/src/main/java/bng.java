import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class bng
  extends gzf
{
  private final int a;
  private final String b;
  private final int c;
  private final boolean d;
  private final nve[] l;
  
  public bng(Context paramContext, int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    this(paramContext, paramInt1, null, 0, false, null);
  }
  
  public bng(Context paramContext, int paramInt1, String paramString, int paramInt2, boolean paramBoolean, nve[] paramArrayOfnve)
  {
    super(paramContext, "GetFriendLocationsTask");
    this.k = haf.a;
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramBoolean;
    this.l = paramArrayOfnve;
  }
  
  public static nve[] a(hae paramhae)
  {
    if ((paramhae == null) || (paramhae.a() == null)) {
      return null;
    }
    hqy localhqy = (hqy)paramhae.a().getParcelable("user_device_locations");
    if (localhqy == null) {
      return null;
    }
    return (nve[])localhqy.a(new nve[0]);
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext1 = this.e;
    int i = this.a;
    ijb localijb = new ijb(localContext1, i, this.c, this.d);
    ijc localijc = new ijc(localContext1, i);
    kcg localkcg = new kcg(localContext1, i);
    kcp localkcp = kdg.a(localContext1, localkcg);
    localkcp.a(localijb);
    localkcp.a(localijc);
    boolean bool = TextUtils.isEmpty(this.b);
    jyd localjyd = null;
    if (!bool)
    {
      localjyd = new jyd(localContext1, localkcg, i, this.b);
      localkcp.a(localjyd);
    }
    localkcp.i();
    Object localObject1 = localijb.a;
    nvd localnvd = localijc.a;
    int j = localijb.b;
    int k = localkcp.o;
    Exception localException = localkcp.q;
    int m;
    String str1;
    label210:
    hae localhae;
    nxl localnxl;
    Object localObject3;
    if ((localkcp.n()) && (this.c <= 1))
    {
      m = 1;
      if (m == 0) {
        break label404;
      }
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      str1 = this.e.getString(aau.uV);
      localhae = new hae(k, localException, str1);
      Bundle localBundle = localhae.a();
      if (localjyd != null)
      {
        localnxl = localjyd.a;
        if ((localObject1 != null) && (localnxl != null) && (localnxl.d != null) && (localnxl.e != null) && (localnxl.e.n != null) && (localnxl.e.n.a != null) && (localnxl.e.n.a.length != 0)) {
          break label410;
        }
        localObject3 = localObject1;
        label314:
        localBundle.putParcelable("target_profile", new hqw(localnxl));
        localObject1 = localObject3;
      }
      localBundle.putParcelable("user_device_locations", new hqy((qat[])localObject1));
      localBundle.putParcelable("owner_device_location", new hqw(localnvd));
      localBundle.putInt("delay_interval", j);
      if ((localObject1 != null) && (this.l != null) && (this.c > 1)) {
        break label564;
      }
    }
    for (;;)
    {
      return localhae;
      m = 0;
      break;
      label404:
      str1 = null;
      break label210;
      label410:
      String str3 = localnxl.a;
      for (int i5 = 0;; i5++)
      {
        if (i5 >= localObject1.length) {
          break label457;
        }
        if (str3.equals(localObject1[i5].a))
        {
          localObject3 = localObject1;
          break;
        }
      }
      label457:
      nve localnve4 = new nve();
      localnve4.a = str3;
      localnve4.c = localnxl.g;
      localnve4.d = localnxl.d.f;
      localnve4.b = localnxl.e.n.a;
      nve[] arrayOfnve2 = new nve[1 + localObject1.length];
      arrayOfnve2[0] = localnve4;
      for (int i6 = 0; i6 < localObject1.length; i6++) {
        arrayOfnve2[(i6 + 1)] = localObject1[i6];
      }
      localObject3 = arrayOfnve2;
      break label314;
      label564:
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      Context localContext2 = this.e;
      String str2 = ((giz)mbb.a(localContext2, giz.class)).a(this.a).b("account_name");
      HashMap localHashMap = new HashMap();
      int n = localObject1.length;
      for (int i1 = 0; i1 < n; i1++)
      {
        Object localObject2 = localObject1[i1];
        localHashMap.put(localObject2.a, localObject2);
      }
      long l1 = System.currentTimeMillis();
      nve[] arrayOfnve1 = this.l;
      int i2 = arrayOfnve1.length;
      int i3 = 0;
      if (i3 < i2)
      {
        nve localnve2 = arrayOfnve1[i3];
        int i4;
        if (!localHashMap.containsKey(localnve2.a))
        {
          i4 = 4;
          localHashMap.remove(localnve2.a);
        }
        for (;;)
        {
          new kqm(str2, i4, this.c).b(localContext2);
          nvv localnvv1;
          nvv localnvv2;
          do
          {
            nve localnve3;
            do
            {
              i3++;
              break;
              localnve3 = (nve)localHashMap.get(localnve2.a);
              localHashMap.remove(localnve2.a);
            } while ((localnve2.b == null) || (localnve2.b.length == 0) || (localnve3.b == null) || (localnve3.b.length == 0));
            localnvv1 = efj.a(localnve2.b);
            localnvv2 = efj.a(localnve3.b);
          } while ((localnvv1.a == 2) || (localnvv2.a == 2));
          long l2 = localnvv1.d.longValue();
          long l3 = localnvv2.d.longValue();
          if (l1 - l2 < 120000L) {
            i4 = 3;
          } else if (l1 - l3 < 120000L) {
            i4 = 0;
          } else if (l3 > l2) {
            i4 = 1;
          } else {
            i4 = 2;
          }
        }
      }
      Iterator localIterator = localHashMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        nve localnve1 = (nve)((Map.Entry)localIterator.next()).getValue();
        if ((localnve1.b != null) && (localnve1.b.length != 0) && (!efj.b(localnve1.b))) {
          new kqm(str2, 5, this.c).b(localContext2);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bng
 * JD-Core Version:    0.7.0.1
 */