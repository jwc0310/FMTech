import android.content.Context;

public final class blo
  extends cun<mrz, msa>
{
  private final String a;
  private final int b;
  private final String c;
  private final int d;
  private final byte[] e;
  
  public blo(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    super(paramContext, paramInt1, "eventrespond", new mrz(), new msa());
    this.c = paramString2;
    this.a = paramString1;
    this.b = paramInt2;
    this.d = paramInt3;
    this.e = paramArrayOfByte;
  }
  
  private final void h()
  {
    hxj localhxj = bqo.a(this.j, this.h, this.a);
    if (this.b == bqo.a(localhxj)) {
      bqo.a(this.j, this.h, this.a, this.d);
    }
    bqo.b(this.j, this.h, this.a);
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if ((paramInt != 200) || (paramException != null)) {
      h();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     blo
 * JD-Core Version:    0.7.0.1
 */