import android.content.Context;
import android.text.TextUtils;

public final class bmt
  extends cun<nct, ncu>
{
  private static final int[] a = { 0, 1, 8, 3 };
  private final String b;
  private final String c;
  private final boolean d;
  private final giz e;
  
  public bmt(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, paramInt, "userphotoalbums", new nct(), new ncu());
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("Must specify a valid owner ID");
    }
    this.b = paramString1;
    this.d = paramBoolean;
    this.c = paramString2;
    this.e = ((giz)mbb.a(paramContext, giz.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmt
 * JD-Core Version:    0.7.0.1
 */