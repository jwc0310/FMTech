import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.autobackup.FingerprintScannerIntentService;
import java.util.ArrayList;

public final class boc
  extends gzf
{
  public String a;
  private final int b;
  private final ArrayList<String> c;
  private final boolean d;
  private final bti l;
  private final jqu[] m;
  
  public boc(Context paramContext, int paramInt, bti parambti, jqu[] paramArrayOfjqu)
  {
    super(paramContext, "RemovePhotosFromTrashTask");
    this.b = paramInt;
    this.d = true;
    this.c = null;
    this.l = parambti;
    this.m = paramArrayOfjqu;
  }
  
  public boc(Context paramContext, int paramInt, ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    super(paramContext, "RemovePhotosFromTrashTask");
    this.b = paramInt;
    this.c = paramArrayList;
    this.d = paramBoolean;
    this.l = null;
    this.m = null;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    ArrayList localArrayList1;
    label91:
    ArrayList localArrayList3;
    label150:
    int k;
    label182:
    ArrayList localArrayList4;
    boolean bool1;
    if (this.l != null)
    {
      localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      buy[] arrayOfbuy = this.l.a(localContext, this.b);
      int i = arrayOfbuy.length;
      int j = 0;
      if (j < i)
      {
        buy localbuy = arrayOfbuy[j];
        int i2;
        if (!TextUtils.isEmpty(localbuy.c))
        {
          i2 = 1;
          if (i2 != 0) {
            localArrayList1.add(localbuy.c);
          }
          if (localbuy.b == 0L) {
            break label150;
          }
        }
        for (int i3 = 1;; i3 = 0)
        {
          if (i3 != 0) {
            localArrayList2.add(Long.valueOf(localbuy.b));
          }
          j++;
          break;
          i2 = 0;
          break label91;
        }
      }
      localArrayList3 = localArrayList2;
      if ((localArrayList1 == null) || (localArrayList1.size() <= 0) || (!bvf.a(localContext, localArrayList1))) {
        break label436;
      }
      k = 1;
      localArrayList4 = new ArrayList();
      if ((localArrayList1 == null) || (localArrayList1.isEmpty())) {
        break label467;
      }
      if (!bvf.a(localContext, this.b, localArrayList1, false, this.d, localArrayList4)) {
        break label442;
      }
      bool1 = true;
    }
    for (;;)
    {
      label224:
      int i1;
      label271:
      boolean bool3;
      if ((localArrayList3 != null) && (!localArrayList3.isEmpty()))
      {
        int n = this.b;
        Long[] arrayOfLong = (Long[])localArrayList3.toArray(new Long[localArrayList3.size()]);
        if (this.d)
        {
          i1 = 3;
          bih localbih = new bih(localContext, n, arrayOfLong, false, i1);
          localbih.i();
          if ((!bool1) || (localbih.n())) {
            break label454;
          }
          bool3 = true;
        }
      }
      label309:
      for (boolean bool2 = bool3;; bool2 = bool1)
      {
        if ((bool2) && (this.m != null))
        {
          jrf.a(localContext, this.b, this.m);
          jqx.a(localContext, this.b, this.m);
        }
        if (k != 0)
        {
          ((dka)mbb.a(localContext, dka.class)).a(false);
          FingerprintScannerIntentService.a(localContext);
        }
        hae localhae = new hae(bool2);
        localhae.a().putBoolean("restore", this.d);
        localhae.a().putParcelableArrayList("restored_uris", localArrayList4);
        localhae.a().putParcelable("resolver", this.l);
        return localhae;
        localArrayList1 = this.c;
        localArrayList3 = null;
        break;
        k = 0;
        break label182;
        label442:
        bool1 = false;
        break label224;
        i1 = 2;
        break label271;
        label454:
        bool3 = false;
        break label309;
      }
      label436:
      label467:
      bool1 = true;
    }
  }
  
  public final String b()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boc
 * JD-Core Version:    0.7.0.1
 */