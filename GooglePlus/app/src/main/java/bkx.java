import android.content.Context;

public class bkx
  extends cun<myj, myk>
{
  public final String a;
  public final boolean b;
  private int c;
  private boolean d;
  private byte[] e;
  
  public bkx(Context paramContext, int paramInt1, int paramInt2, String paramString, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte)
  {
    super(paramContext, paramInt1, "plusone", new myj(), new myk());
    this.c = paramInt2;
    this.a = paramString;
    this.b = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramArrayOfByte;
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if ((paramInt != 200) || (paramException != null)) {
      b();
    }
    super.a(paramInt, paramString, paramException);
  }
  
  protected void a(oks paramoks) {}
  
  protected void b() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bkx
 * JD-Core Version:    0.7.0.1
 */