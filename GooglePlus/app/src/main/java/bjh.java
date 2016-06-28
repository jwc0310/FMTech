import android.content.Context;
import java.util.List;

public final class bjh
  extends kcp
{
  final String a;
  final nsl b = b();
  final nti[] c;
  final String[] d;
  private final int f;
  
  public bjh(Context paramContext, int paramInt, String paramString, long paramLong)
  {
    this(paramContext, paramInt, paramString, new long[] { paramLong });
  }
  
  private bjh(Context paramContext, int paramInt, String paramString, long[] paramArrayOfLong)
  {
    super(paramContext, new kcg(paramContext, paramInt), "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    this.f = paramInt;
    this.a = paramString;
    this.c = new nti[1];
    this.d = new String[1];
    for (int i = 0; i <= 0; i++)
    {
      a(new bjj(this, paramContext, paramInt, paramArrayOfLong[0], 0));
      a(new bji(this, paramContext, paramInt, paramArrayOfLong[0], 0));
    }
  }
  
  public static nsl b()
  {
    nsl localnsl = new nsl();
    localnsl.m = Boolean.FALSE;
    localnsl.g = Boolean.FALSE;
    localnsl.i = Boolean.FALSE;
    localnsl.a = Boolean.TRUE;
    localnsl.l = Boolean.TRUE;
    localnsl.h = Boolean.TRUE;
    localnsl.k = Boolean.TRUE;
    localnsl.e = Boolean.FALSE;
    localnsl.f = Boolean.TRUE;
    localnsl.d = Boolean.TRUE;
    localnsl.b = Boolean.TRUE;
    localnsl.c = Boolean.TRUE;
    localnsl.j = 2;
    localnsl.n = new nse();
    localnsl.n.a = Boolean.TRUE;
    return localnsl;
  }
  
  protected final void a(List<kbw> paramList, boolean paramBoolean)
  {
    super.a(paramList, paramBoolean);
    int i = this.c.length;
    if (paramList.size() == i * 2) {}
    for (int j = 1; j == 0; j = 0) {
      throw new IllegalArgumentException();
    }
    for (int k = 0; k < i; k++)
    {
      kbw localkbw1 = (kbw)paramList.get(k * 2);
      kbw localkbw2 = (kbw)paramList.get(1 + k * 2);
      if ((!localkbw1.n()) && (!localkbw2.n()) && (this.c[k] != null))
      {
        okn localokn = this.c[k].a;
        okm localokm = (okm)localokn.b(okm.a);
        if ((localokm != null) && (localokm.b != null))
        {
          ojf localojf = localokm.b;
          if (this.d[k] != null)
          {
            oin localoin = new oin();
            localoin.a = this.d[k];
            localojf.M = new oin[] { localoin };
          }
          if ((localojf.a != null) && (localojf.a.a != null)) {
            localokn.e = localojf.a;
          }
          localokn.a(okm.a, localokm);
        }
        jrf.a(localokn, this.j, this.f);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bjh
 * JD-Core Version:    0.7.0.1
 */