import android.content.Context;

final class ley
  extends kde<mzn, mzo>
{
  private static final int[] e = { 2, 3, 4, 6, 5 };
  private final String a;
  private final int b;
  private final String c;
  private final int d;
  
  public ley(Context paramContext, kcg paramkcg, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    super(paramContext, paramkcg, "readsquaremembers", new mzn(), new mzo());
    this.a = paramString1;
    this.b = paramInt1;
    this.c = paramString2;
    this.d = Math.min(paramInt2, 100);
  }
  
  private final odm a(int paramInt, String paramString)
  {
    odm localodm = new odm();
    localodm.a = paramInt;
    localodm.c = paramString;
    localodm.b = Integer.valueOf(this.d);
    localodm.e = Boolean.valueOf(true);
    return localodm;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ley
 * JD-Core Version:    0.7.0.1
 */