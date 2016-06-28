import android.content.Context;
import java.util.List;

public final class kle
  extends gzf
{
  private final int a;
  private final khx b;
  private final klc c;
  
  public kle(klc paramklc, int paramInt, khx paramkhx)
  {
    super("ReshareTask");
    this.a = paramInt;
    this.b = paramkhx;
    this.c = paramklc;
  }
  
  protected final hae a(Context paramContext)
  {
    int i = 0;
    lln locallln = (lln)mbb.a(paramContext, lln.class);
    gnb localgnb1 = this.b.f;
    gnb localgnb2 = this.b.g;
    oqq localoqq = new oqq();
    localoqq.d = this.b.i;
    localoqq.a = this.b.j;
    localoqq.b = new qoh();
    localoqq.b.a = new qoi();
    localoqq.b.a.a = Boolean.valueOf(true);
    localoqq.j = efj.a(localgnb1, localgnb2);
    localoqq.r = 2;
    localoqq.t = new qbd();
    localoqq.t.a = locallln.a(paramContext, this.a);
    if (localgnb1.d.length > 0)
    {
      int j = localgnb1.d.length;
      localoqq.m = new oqv[j];
      for (int k = 0; k < j; k++)
      {
        lhp locallhp = localgnb1.d[k];
        oqv localoqv = new oqv();
        localoqv.a = locallhp.a;
        localoqv.b = locallhp.c;
        if (locallhp.c == null) {
          throw new IllegalArgumentException("Missing Square Stream Id.");
        }
        localoqq.m[k] = localoqv;
      }
    }
    if (localgnb1.e.length > 0)
    {
      oqt localoqt = new oqt();
      localoqt.a = 2;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localgnb1.e[0].a;
      localoqt.b = arrayOfString;
      localoqq.n = new oqt[] { localoqt };
    }
    ohy localohy = lmp.a(this.b.x);
    if (localohy != null)
    {
      localoqq.u = new opr();
      localoqq.u.a = localohy;
    }
    List localList = mbb.c(paramContext, khw.class);
    while (i < localList.size())
    {
      ((khw)localList.get(i)).a(paramContext, this.b, localoqq);
      i++;
    }
    lmp.a(paramContext, this.b.i, this.a);
    return this.c.a(paramContext, this.a, this.b, localoqq);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(et.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kle
 * JD-Core Version:    0.7.0.1
 */