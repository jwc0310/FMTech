import android.content.Context;

public final class lrx
  implements lrr
{
  private final Context a;
  private final long b;
  private final giz c;
  private final hyi d;
  private final hgs e;
  
  public lrx(lry paramlry)
  {
    this.a = paramlry.a;
    this.b = paramlry.b;
    this.c = ((giz)mbb.a(this.a, giz.class));
    this.d = ((hyi)mbb.a(this.a, hyi.class));
    this.e = ((hgs)mbb.a(this.a, hgs.class));
  }
  
  public final int a()
  {
    return 3;
  }
  
  public final boolean a(int paramInt)
  {
    String str = this.c.a(paramInt).b("account_name");
    if (!this.d.b(hyl.a, str)) {}
    long l;
    do
    {
      return true;
      l = this.d.b(str);
    } while (this.e.a() - l >= this.b);
    return false;
  }
  
  public final long b()
  {
    return 2147483647L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrx
 * JD-Core Version:    0.7.0.1
 */