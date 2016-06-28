import android.content.Context;

public final class bmm
  extends cun<nbx, nby>
{
  private static final int[] b = { 15 };
  public String a;
  private final String c;
  private final String d;
  private Boolean e;
  private Boolean f;
  
  public bmm(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, paramInt, "collectionupdate", new nbx(), new nby());
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.e = Boolean.valueOf(paramBoolean);
    if (this.e.booleanValue()) {
      b(false);
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    this.f = Boolean.valueOf(paramBoolean);
    if (this.f.booleanValue()) {
      a(false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmm
 * JD-Core Version:    0.7.0.1
 */