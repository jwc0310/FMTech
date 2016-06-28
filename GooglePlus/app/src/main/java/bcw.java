import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.EnumMap;

public abstract class bcw
{
  public long A;
  public long B;
  public String C;
  public long D;
  public Bundle d;
  public int e;
  public EnumMap<bcx, ipf> f = new EnumMap(bcx.class);
  public oih g;
  public oih h;
  public ojx i;
  public ojx j;
  public ojf k;
  public isq l;
  public String m;
  public String n;
  public String o;
  public String p;
  public String q;
  public String r;
  public Integer s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;
  public boolean x;
  public boolean y;
  public long z;
  
  public abstract bcp a();
  
  public bcw a(Context paramContext, Bundle paramBundle)
  {
    this.d = paramBundle;
    a((ipf)paramBundle.getParcelable("photo_ref"));
    this.e = paramBundle.getInt("account_id", -1);
    this.z = paramBundle.getLong("media_attr", 0L);
    this.A = paramBundle.getLong("user_actions", 0L);
    this.u = paramBundle.getBoolean("selectable");
    return this;
  }
  
  public final bcw a(Context paramContext, dfw paramdfw)
  {
    if (!((ixf)mbb.a(paramContext, ixf.class)).a()) {
      return this;
    }
    ojf localojf = paramdfw.a;
    String str1;
    long l1;
    String str2;
    label77:
    String str3;
    ipf localipf1;
    int[] arrayOfInt;
    Object localObject;
    if (localojf.g == null)
    {
      str1 = ((ipf)this.f.get(bcx.a)).b.b;
      l1 = Long.parseLong(localojf.d);
      if (localojf.a == null) {
        break label524;
      }
      str2 = localojf.a.a;
      ipm localipm = jqx.b(localojf);
      str3 = jqx.c(localojf);
      localipf1 = ipf.a(paramContext, ((ipf)this.f.get(bcx.a)).a, str1, l1, str2, ((ipf)this.f.get(bcx.a)).d, localipm);
      if (localojf.l != null) {
        this.i = localojf.l;
      }
      if (localojf.a != null) {
        this.s = localojf.a.d;
      }
      if (paramdfw.b != 0L) {
        this.z = paramdfw.b;
      }
      if (localojf.r != null)
      {
        ipf localipf4 = ipf.a(paramContext, localojf.r.a, localipm);
        bcx localbcx3 = bcx.b;
        if (localipf4 != null) {
          this.f.put(localbcx3, localipf4);
        }
      }
      if (localojf.s != null)
      {
        ipf localipf3 = ipf.a(paramContext, localojf.s.a, localipm);
        bcx localbcx2 = bcx.c;
        if (localipf3 != null) {
          this.f.put(localbcx2, localipf3);
        }
      }
      if ((localojf.M != null) && (localojf.M.length > 0)) {
        this.p = localojf.M[0].a;
      }
      if ((localojf.x != null) && (localojf.x.length != 0))
      {
        oif localoif = localojf.x[0];
        this.r = localoif.g;
        this.o = localoif.b;
      }
      if (!ipm.a.equals(localipm)) {
        break label662;
      }
      arrayOfInt = localojf.H;
      if ((arrayOfInt != null) && (localojf.r != null)) {
        break label545;
      }
      localObject = null;
      label374:
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        break label668;
      }
      ipf localipf2 = ipf.a(paramContext, (String)localObject, localipm);
      bcx localbcx1 = bcx.d;
      if (localipf2 != null) {
        this.f.put(localbcx1, localipf2);
      }
    }
    for (;;)
    {
      this.t = paramdfw.e;
      this.A = paramdfw.c;
      this.m = str1;
      this.B = l1;
      this.C = str3;
      a(localipf1);
      this.q = localojf.b;
      if (this.g == null) {
        this.g = localojf.F;
      }
      this.h = localojf.F;
      this.j = localojf.l;
      this.q = localojf.b;
      this.D = paramdfw.d;
      return this;
      str1 = localojf.g.b;
      break;
      label524:
      str2 = ((ipf)this.f.get(bcx.a)).c;
      break label77;
      label545:
      SparseBooleanArray localSparseBooleanArray = new SparseBooleanArray(4);
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        localSparseBooleanArray.put(arrayOfInt[i1], true);
      }
      if (localSparseBooleanArray.get(2))
      {
        localObject = localojf.r.a;
        break label374;
      }
      if (localSparseBooleanArray.get(1))
      {
        if (localojf.I != -2147483648)
        {
          localObject = null;
          break label374;
        }
        localObject = localojf.r.a;
        break label374;
      }
      if (localSparseBooleanArray.get(3))
      {
        localObject = localojf.r.a;
        break label374;
      }
      label662:
      localObject = null;
      break label374;
      label668:
      this.f.remove(bcx.a);
    }
  }
  
  public bcw a(bcp parambcp)
  {
    if ((parambcp instanceof bcv))
    {
      localbcv = (bcv)parambcp;
      this.d = localbcv.d;
      this.e = localbcv.e;
      this.f = localbcv.f;
      this.g = localbcv.g;
      this.h = localbcv.h;
      this.i = localbcv.i;
      this.j = localbcv.j;
      this.k = localbcv.k;
      this.l = localbcv.l;
      this.m = localbcv.m;
      this.n = localbcv.n;
      this.o = localbcv.o;
      this.p = localbcv.p;
      this.q = localbcv.q;
      this.r = localbcv.r;
      this.s = localbcv.s;
      this.t = localbcv.t;
      this.u = localbcv.u;
      this.v = localbcv.v;
      this.x = localbcv.x;
      this.w = localbcv.w;
      this.y = localbcv.y;
      this.z = localbcv.z;
      this.A = localbcv.A;
      this.B = localbcv.B;
      this.C = localbcv.C;
      this.D = localbcv.D;
    }
    while (parambcp == null)
    {
      bcv localbcv;
      return this;
    }
    throw new IllegalArgumentException("Can't mergeFromProxy with this type of proxy.");
  }
  
  public final bcw a(ipf paramipf)
  {
    if (paramipf != null) {
      this.f.put(bcx.a, paramipf);
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bcw
 * JD-Core Version:    0.7.0.1
 */