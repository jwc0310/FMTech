import android.content.Context;

public final class biu
  extends cun<msj, msk>
{
  private static final Long a = Long.valueOf(1000L);
  private static final Long b = Long.valueOf(0L);
  private final String[] c;
  private final String d;
  private final boolean e;
  private final lln f = (lln)mbb.a(this.j, lln.class);
  private final int g;
  
  public biu(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramContext, paramInt, paramString1, paramString2, paramBoolean, 0);
  }
  
  public biu(Context paramContext, int paramInt1, String paramString1, String paramString2, boolean paramBoolean, int paramInt2)
  {
    super(paramContext, paramInt1, "getactivitiesbyid", new msj(), new msk());
    this.c = new String[] { paramString1 };
    this.d = paramString2;
    this.e = paramBoolean;
    this.g = paramInt2;
  }
  
  public biu(Context paramContext, kcg paramkcg, int paramInt1, String[] paramArrayOfString, String paramString, boolean paramBoolean, int paramInt2)
  {
    super(paramContext, paramkcg, paramInt1, "getactivitiesbyid", new msj(), new msk());
    this.c = paramArrayOfString;
    this.d = null;
    this.e = false;
    this.g = 8;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     biu
 * JD-Core Version:    0.7.0.1
 */