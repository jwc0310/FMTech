import android.content.Context;

public final class bli
  extends cun<nab, nac>
{
  private final String a;
  private final String b;
  private final String c;
  private final int d;
  private final boolean e;
  private final String f;
  
  public bli(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this(paramContext, paramInt1, paramString1, paramString2, null, 1, false, null);
  }
  
  public bli(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean, String paramString3)
  {
    this(paramContext, paramInt1, paramString1, null, paramString2, paramInt2, paramBoolean, paramString3);
  }
  
  private bli(Context paramContext, int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean, String paramString4)
  {
    super(paramContext, paramInt1, "reportabuseactivity", new nab(), new nac());
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramInt2;
    this.e = paramBoolean;
    this.f = paramString4;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bli
 * JD-Core Version:    0.7.0.1
 */