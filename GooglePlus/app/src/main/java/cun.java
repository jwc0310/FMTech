import android.content.Context;

public abstract class cun<RQ extends qat, RS extends qat>
  extends kde<RQ, RS>
{
  @Deprecated
  public final int h;
  
  public cun(Context paramContext, int paramInt, String paramString, RQ paramRQ, RS paramRS)
  {
    this(paramContext, new kcg(paramContext, paramInt), paramInt, paramString, paramRQ, paramRS);
  }
  
  public cun(Context paramContext, kcg paramkcg, int paramInt, String paramString, RQ paramRQ, RS paramRS)
  {
    super(paramContext, paramkcg, paramString, paramRQ, paramRS);
    this.h = paramInt;
    int i = this.h;
    if (i == -1) {
      throw new IllegalStateException(60 + "Cannot execute operation on an inactive account: " + i);
    }
  }
  
  public abstract void a(RS paramRS);
  
  protected final void a_(RS paramRS)
  {
    a(paramRS);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cun
 * JD-Core Version:    0.7.0.1
 */