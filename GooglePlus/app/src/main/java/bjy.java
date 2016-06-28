import android.content.Context;

public class bjy
  extends kde<mwl, mwm>
{
  public otf a;
  private String b;
  private int c;
  
  public bjy(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    this(paramContext, paramInt1, "loadpeopleincommon", paramString, paramInt2);
  }
  
  public bjy(Context paramContext, int paramInt1, String paramString, int paramInt2, byte paramByte)
  {
    this(paramContext, paramInt1, "loadvisiblecirclemembers", paramString, paramInt2);
  }
  
  public bjy(Context paramContext, int paramInt1, String paramString, int paramInt2, char paramChar)
  {
    this(paramContext, paramInt1, "lookupownerincomingmembers", paramString, paramInt2);
  }
  
  public bjy(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    super(paramContext, new kcg(paramContext, paramInt1), paramString1, new mwl(), new mwm());
    this.b = paramString2;
    this.c = paramInt2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bjy
 * JD-Core Version:    0.7.0.1
 */