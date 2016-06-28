import android.content.Context;

public final class kzf
{
  private static final int b = qxz.a.b >>> 3;
  private static final int c = qzc.a.b >>> 3;
  private static final int d = qyw.a.b >>> 3;
  private static final int e = qzf.a.b >>> 3;
  private static final int f = qyy.a.b >>> 3;
  private static final int g = qze.a.b >>> 3;
  private static final int h = qza.a.b >>> 3;
  private static final int i = qys.a.b >>> 3;
  public final kcx a;
  
  public kzf(Context paramContext, kcg paramkcg, String paramString)
  {
    this.a = new kcx(paramContext, paramkcg);
    qxy localqxy = new qxy();
    localqxy.b = paramString;
    qyx localqyx = new qyx();
    localqyx.b = paramString;
    qzd localqzd = new qzd();
    localqzd.b = paramString;
    qyz localqyz = new qyz();
    localqyz.b = paramString;
    qyv localqyv = new qyv();
    localqyv.b = paramString;
    qzb localqzb = new qzb();
    localqzb.b = paramString;
    qzf localqzf = new qzf();
    localqzf.b = paramString;
    qyr localqyr = new qyr();
    localqyr.b = paramString;
    this.a.a(qxy.a, localqxy, b);
    this.a.a(qyx.a, localqyx, f);
    this.a.a(qzd.a, localqzd, g);
    this.a.a(qyz.a, localqyz, h);
    this.a.a(qyv.a, localqyv, d);
    this.a.a(qzb.a, localqzb, c);
    this.a.a(qzf.a, localqzf, e);
    this.a.a(qyr.a, localqyr, i);
  }
  
  public final void a()
  {
    this.a.i();
    this.a.c("GetSquareOperation");
  }
  
  public final kyf b()
  {
    if (this.a.n()) {
      return null;
    }
    int j = this.a.a(b);
    if (j == -1) {
      return null;
    }
    qxz localqxz = (qxz)this.a.a(j, qxz.a);
    if (localqxz == null) {
      return null;
    }
    kyf localkyf = new kyf(localqxz.b);
    int k = this.a.a(d);
    int m;
    int n;
    int i1;
    label110:
    int i2;
    int i3;
    if (k == -1)
    {
      m = 0;
      if (m != 0)
      {
        n = this.a.a(g);
        if (n != -1) {
          break label186;
        }
        i1 = 0;
        if (i1 != 0)
        {
          i2 = this.a.a(i);
          if (i2 != -1) {
            break label232;
          }
          i3 = 0;
        }
      }
    }
    for (;;)
    {
      if (i3 != 0) {
        break label300;
      }
      return null;
      qyw localqyw = (qyw)this.a.a(k, qyw.a);
      if (localqyw == null)
      {
        m = 0;
        break;
      }
      localkyf.a(localqyw.b);
      m = 1;
      break;
      label186:
      qze localqze = (qze)this.a.a(n, qze.a);
      if (localqze == null)
      {
        i1 = 0;
        break label110;
      }
      localkyf.k = localqze.b.booleanValue();
      i1 = 1;
      break label110;
      label232:
      qys localqys = (qys)this.a.a(i2, qys.a);
      if (localqys.b == null)
      {
        i3 = 0;
      }
      else
      {
        qxp localqxp = localqys.b;
        localkyf.w = localqxp.b.booleanValue();
        localkyf.v = localqxp.a.booleanValue();
        i3 = 1;
      }
    }
    label300:
    int i4 = this.a.a(e);
    if (i4 != -1)
    {
      qzg localqzg = (qzg)this.a.a(i4, qzg.a);
      if (localqzg != null) {
        localkyf.i = localqzg.b;
      }
    }
    int i5 = this.a.a(c);
    if (i5 != -1)
    {
      qzc localqzc = (qzc)this.a.a(i5, qzc.a);
      if (localqzc != null)
      {
        qxs localqxs = localqzc.b;
        localkyf.r = new odr();
        localkyf.r.a = new odq[localqxs.a.length];
        for (int i8 = 0; i8 < localkyf.r.a.length; i8++)
        {
          localkyf.r.a[i8] = new odq();
          localkyf.r.a[i8].a = localqxs.a[i8].a;
          localkyf.r.a[i8].b = localqxs.a[i8].b;
          localkyf.r.a[i8].c = localqxs.a[i8].c;
        }
      }
    }
    int i6 = this.a.a(f);
    if (i6 != -1)
    {
      qyy localqyy = (qyy)this.a.a(i6, qyy.a);
      if (localqyy != null) {
        localkyf.a(localqyy.b);
      }
    }
    int i7 = this.a.a(h);
    qxu localqxu;
    if (i7 != -1)
    {
      qza localqza = (qza)this.a.a(i7, qza.a);
      if (localqza != null)
      {
        localqxu = localqza.b;
        if (localkyf.q != null) {
          break label644;
        }
        localkyf.q = null;
      }
    }
    for (;;)
    {
      return localkyf;
      label644:
      localkyf.q = new qek();
      localkyf.q.a = localqxu.a;
      localkyf.q.b = localqxu.b;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzf
 * JD-Core Version:    0.7.0.1
 */