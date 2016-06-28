import android.content.Context;

public abstract class lhh
  extends hqe<lhi>
{
  public static final lhi d = new lhi();
  public final int e;
  public final String f;
  public final String h;
  public volatile kbw r;
  private lhi s;
  
  public lhh(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext);
    this.e = paramInt;
    this.f = paramString1;
    this.h = paramString2;
  }
  
  protected final void g()
  {
    if (this.s == null) {
      a();
    }
  }
  
  public final boolean k()
  {
    kbw localkbw = this.r;
    if (localkbw != null) {
      localkbw.j();
    }
    this.r = null;
    return super.k();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhh
 * JD-Core Version:    0.7.0.1
 */