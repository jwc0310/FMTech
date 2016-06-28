import android.content.Context;

public final class bis
  extends cun<msf, msg>
{
  private static int[] A = { 3 };
  private static int[] B = { 2 };
  private static int[] C = { 2, 3, 4 };
  private static int D = -1;
  private static int[] f = { 1 };
  private static int[] g = { 2 };
  private static int[] z = { 1, 2, 4 };
  private final long E;
  private final byte[] F;
  private final brm G;
  private final int H;
  private final int I;
  public mjk[] a;
  public byte[] b;
  public byte[] c;
  public long d;
  public long e;
  
  public bis(Context paramContext, kcg paramkcg, int paramInt1, long paramLong, brm parambrm, int paramInt2, int paramInt3)
  {
    super(paramContext, paramkcg, paramInt1, "fetchnotifications", new msf(), new msg());
    this.E = paramLong;
    this.F = null;
    this.G = parambrm;
    this.H = paramInt2;
    this.I = paramInt3;
  }
  
  public bis(Context paramContext, kcg paramkcg, int paramInt1, byte[] paramArrayOfByte, brm parambrm, int paramInt2, int paramInt3)
  {
    super(paramContext, paramkcg, paramInt1, "fetchnotifications", new msf(), new msg());
    this.E = 0L;
    this.F = paramArrayOfByte;
    this.G = parambrm;
    this.H = paramInt2;
    this.I = paramInt3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bis
 * JD-Core Version:    0.7.0.1
 */