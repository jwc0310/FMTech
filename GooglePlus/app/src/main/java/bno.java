import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class bno
  extends gzf
{
  public final int a;
  public final String b;
  public ArrayList<String> c;
  public ArrayList<String> d;
  private Context l;
  private String m;
  private boolean n;
  private boolean o;
  private boolean p;
  private String q;
  private String r;
  private String s;
  private String t;
  private hgg u;
  private List<jjs> v;
  
  protected bno(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString4, String paramString5, String paramString6)
  {
    super(paramContext, paramString1);
    this.l = paramContext;
    this.a = paramInt1;
    this.b = paramString2;
    this.m = paramString3;
    this.c = paramArrayList1;
    this.d = paramArrayList2;
    this.n = paramBoolean1;
    this.o = paramBoolean2;
    this.p = paramBoolean3;
    this.q = paramString4;
    this.r = paramString5;
    this.s = paramString6;
    this.u = ((hgg)mbb.a(paramContext, hgg.class));
    this.v = mbb.c(paramContext, jjs.class);
  }
  
  private static List<String> a(ArrayList<String> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; (paramArrayList != null) && (i < paramArrayList.size()); i++)
    {
      String str = (String)paramArrayList.get(i);
      if (str.startsWith("f.")) {
        str = str.substring(2);
      }
      localArrayList.add(str);
    }
    return localArrayList;
  }
  
  private final void b(hae paramhae)
  {
    int i;
    if (paramhae.b != 200) {
      i = 1;
    }
    while (i == 0)
    {
      int j = this.v.size();
      Object localObject1 = null;
      int i1;
      if ((this.n) && (!this.o)) {
        i1 = 0;
      }
      for (;;)
      {
        if (i1 < j) {}
        try
        {
          ((jjs)this.v.get(i1)).a(this.a, this.b);
          localObject3 = localObject1;
          label83:
          i1++;
        }
        catch (Exception localException2)
        {
          Object localObject3;
          boolean bool1;
          boolean bool2;
          int k;
          break label83;
        }
        localObject1 = localObject3;
        continue;
        i = 0;
        break;
        bool1 = this.n;
        localObject1 = null;
        if (!bool1)
        {
          bool2 = this.o;
          localObject1 = null;
          if (bool2)
          {
            k = 0;
            while (k < j)
            {
              try
              {
                ((jjs)this.v.get(k)).b(this.a, this.b);
                localObject2 = localObject1;
                label166:
                k++;
              }
              catch (Exception localException1)
              {
                Object localObject2;
                break label166;
              }
              localObject1 = localObject2;
            }
          }
        }
      }
      if (localObject1 != null) {
        throw new RuntimeException(localObject1);
      }
    }
  }
  
  protected final hae a()
  {
    if (this.p)
    {
      hgg localhgg3 = this.u;
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      localhgg3.a(this.e, this.a, this.b, this.p);
    }
    jjy localjjy = new jjy(this.l, this.a, this.b, a(this.c), a(this.d));
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    lta locallta = (lta)mbb.a(this.e, lta.class);
    d();
    locallta.a(this.a, 8L, 1L, "[GMS Call start] updatePersonCirclesTask.");
    hae localhae1 = gzj.a(localjjy);
    locallta.a(this.a, 8L, 1L, "[GMS Call end] updatePersonCirclesTask.");
    int i;
    label320:
    int j;
    Exception localException;
    int k;
    label348:
    String str1;
    if (localhae1.b != 200)
    {
      i = 1;
      if (i == 0) {
        break label435;
      }
      if (Log.isLoggable("ModifyCircleMemberships", 3))
      {
        String str3 = String.valueOf("ModifyCircleMembershipsTask failed with ");
        int i2 = localhae1.b;
        new StringBuilder(11 + String.valueOf(str3).length()).append(str3).append(i2);
      }
      if (this.p)
      {
        hgg localhgg2 = this.u;
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        localhgg2.a(this.e, this.a, this.b, this.m, false);
      }
      int i1 = localhae1.b;
      String str2 = this.m;
      if (i1 == 101)
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        this.t = this.e.getString(aau.cN, new Object[] { str2 });
      }
      e();
      j = localhae1.b;
      localException = localhae1.c;
      if (localhae1.b == 200) {
        break label537;
      }
      k = 1;
      if (k == 0) {
        break label552;
      }
      if (!TextUtils.isEmpty(this.t)) {
        break label543;
      }
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      str1 = this.e.getString(aau.uV);
    }
    for (;;)
    {
      hae localhae2 = new hae(j, localException, str1);
      localhae2.a().putString("extra_person_id", this.b);
      b(localhae2);
      a(localhae2);
      return localhae2;
      i = 0;
      break;
      label435:
      brn.d(this.l, this.a);
      if (this.p)
      {
        hgg localhgg1 = this.u;
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        localhgg1.a(this.e, this.a, this.b, this.m, true);
      }
      if (((jaq)mbb.a(this.l, jaq.class)).d()) {
        break label320;
      }
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      dkk.a(this.e, this.a);
      break label320;
      label537:
      k = 0;
      break label348;
      label543:
      str1 = this.t;
      continue;
      label552:
      str1 = this.q;
    }
  }
  
  protected void a(hae paramhae) {}
  
  public final String b()
  {
    if (this.p) {
      return null;
    }
    if (!TextUtils.isEmpty(this.r)) {
      return this.r;
    }
    if (this.n)
    {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      return this.e.getString(aau.bK);
    }
    if (this.o)
    {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      return this.e.getString(aau.rZ);
    }
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.dq);
  }
  
  public final String c()
  {
    if (this.p) {
      return null;
    }
    return this.s;
  }
  
  protected void d() {}
  
  protected void e() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bno
 * JD-Core Version:    0.7.0.1
 */