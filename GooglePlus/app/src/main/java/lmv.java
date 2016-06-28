import android.content.Context;
import android.text.TextUtils;

public final class lmv
  extends kde<msl, msm>
{
  private final String A;
  private final boolean B;
  private final String C;
  private final byte[] D;
  private final int E;
  private final int F;
  private final String[] G;
  private final String[] H;
  private final boolean I;
  private final long J;
  private final String[] K;
  private gyx L;
  long a;
  String b;
  byte[] c;
  long d;
  private final int e;
  private final lln f;
  private final int g;
  private final String h;
  private final String z;
  
  public lmv(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, byte[] paramArrayOfByte, int paramInt3, String[] paramArrayOfString1, String[] paramArrayOfString2, kck paramkck, boolean paramBoolean2, long paramLong, String[] paramArrayOfString3)
  {
    super(paramContext, new kcg(paramContext, paramInt1, paramkck), "getactivities", new msl(), new msm());
    this.e = paramInt1;
    this.f = ((lln)mbb.a(this.j, lln.class));
    this.g = paramInt2;
    if ((!TextUtils.isEmpty(paramString1)) && (paramString1.startsWith("f."))) {
      paramString1 = paramString1.substring(2);
    }
    this.h = paramString1;
    this.z = paramString2;
    this.A = paramString3;
    this.B = paramBoolean1;
    this.C = paramString4;
    this.D = paramArrayOfByte;
    if (paramInt3 > 0) {}
    for (;;)
    {
      this.E = paramInt3;
      this.F = new hfa(paramContext, this.e, loh.a).a;
      this.G = paramArrayOfString1;
      this.H = paramArrayOfString2;
      this.I = paramBoolean2;
      this.J = paramLong;
      this.K = paramArrayOfString3;
      this.a = -1L;
      this.d = -1L;
      this.L = ((gyx)mbb.b(this.j, gyx.class));
      return;
      paramInt3 = 10;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmv
 * JD-Core Version:    0.7.0.1
 */