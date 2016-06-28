import android.content.Context;

public final class blf
  extends cun<mzp, mzq>
{
  private static mii b;
  private String a;
  
  static
  {
    mii localmii = new mii();
    b = localmii;
    localmii.b = 2;
    b.a = 1;
  }
  
  public blf(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, paramInt, "recordfeaturehintaction", new mzp(), new mzq());
    this.a = paramString;
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if (paramInt == 200) {
      lmp.i(this.j, this.h, this.a, true);
    }
    super.a(paramInt, paramString, paramException);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     blf
 * JD-Core Version:    0.7.0.1
 */