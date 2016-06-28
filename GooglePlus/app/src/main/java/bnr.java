import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class bnr
  extends gzf
{
  private final int a;
  private final btj b;
  private final boolean c;
  private final giz d;
  
  public bnr(Context paramContext, int paramInt, btj parambtj, boolean paramBoolean)
  {
    super(paramContext, "MovePhotosToTrashTask");
    this.b = parambtj;
    this.a = paramInt;
    this.c = paramBoolean;
    this.d = ((giz)mbb.a(paramContext, giz.class));
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    ArrayList localArrayList1 = new ArrayList();
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    buy[] arrayOfbuy = this.b.a(localContext, this.a);
    int i = arrayOfbuy.length;
    int j = 0;
    if (j < i)
    {
      buy localbuy = arrayOfbuy[j];
      String str3 = localbuy.c;
      if ((!TextUtils.isEmpty(str3)) && (this.c)) {
        localArrayList2.add(str3);
      }
      if (!TextUtils.isEmpty(localbuy.a)) {
        localHashSet1.add(localbuy.a);
      }
      int k;
      if (this.c)
      {
        if (localbuy.b == 0L) {
          break label192;
        }
        k = 1;
        label167:
        if (k == 0) {
          break label198;
        }
        localHashSet2.add(Long.valueOf(localbuy.b));
      }
      for (;;)
      {
        j++;
        break;
        label192:
        k = 0;
        break label167;
        label198:
        if (!TextUtils.isEmpty(str3)) {
          localArrayList3.add(str3);
        }
      }
    }
    ArrayList localArrayList4;
    jrv localjrv;
    ArrayList localArrayList5;
    if (this.a != -1)
    {
      localArrayList4 = new ArrayList(localHashSet2);
      localArrayList1.add(jqx.a(localContext, this.a, localArrayList2, localArrayList4));
      localArrayList1.add(jrf.a(localContext, this.a, localArrayList4));
      if (!localArrayList3.isEmpty())
      {
        String str1 = this.d.a(this.a).b("gaia_id");
        localjrv = new jrv(localContext, this.a, str1, localArrayList3);
        localjrv.i();
        if (!localjrv.n())
        {
          Iterator localIterator = localArrayList3.iterator();
          while (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            if (localjrv.a.containsKey(str2)) {
              localHashSet2.add(Long.valueOf(localjrv.b(str2)));
            }
          }
          localArrayList5 = localArrayList4;
        }
      }
    }
    for (;;)
    {
      ArrayList localArrayList6 = new ArrayList(localHashSet1);
      boolean bool3;
      if (!localHashSet1.isEmpty()) {
        if (efj.a(localContext, localArrayList6) == localArrayList6.size()) {
          bool3 = true;
        }
      }
      label432:
      for (boolean bool1 = bool3;; bool1 = true)
      {
        boolean bool2;
        if (!localHashSet2.isEmpty())
        {
          bih localbih = new bih(localContext, this.a, (Long[])localHashSet2.toArray(new Long[localHashSet2.size()]), false, 1);
          localbih.i();
          if ((bool1) && (!localbih.n())) {
            bool2 = true;
          }
        }
        for (;;)
        {
          hae localhae = new hae(bool2);
          if ((bool2) && (!localArrayList1.isEmpty()))
          {
            jqx.a(localContext, this.a, localArrayList5, localArrayList2, localArrayList6);
            localhae.a().putParcelableArray("db_rows", (Parcelable[])localArrayList1.toArray(new jqu[localArrayList1.size()]));
          }
          localhae.a().putParcelable("resolver", this.b);
          return localhae;
          if (Log.isLoggable("MovePhotosToTrashTask", 6))
          {
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = localjrv.p;
            arrayOfObject[1] = Integer.valueOf(localjrv.o);
            Log.e("MovePhotosToTrashTask", String.format("Error checking if photos exist.  Reason: %s, Error Code: %d", arrayOfObject), localjrv.q);
          }
          localArrayList5 = localArrayList4;
          break;
          bool3 = false;
          break label432;
          bool2 = false;
          continue;
          bool2 = bool1;
        }
      }
      localArrayList5 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnr
 * JD-Core Version:    0.7.0.1
 */