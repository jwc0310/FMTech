import android.content.Context;
import java.util.List;

final class cme
  extends hqe<List<onj>>
{
  private final int d;
  private final String e;
  private List<onj> f;
  
  public cme(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext);
    this.d = paramInt;
    this.e = paramString;
  }
  
  private void a(List<onj> paramList)
  {
    this.f = paramList;
    if (this.m) {
      super.b(paramList);
    }
  }
  
  protected final void g()
  {
    if (this.f != null)
    {
      a(this.f);
      return;
    }
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cme
 * JD-Core Version:    0.7.0.1
 */