import android.content.Context;

final class ltf
  extends gzf
{
  private final ltj a;
  private final String b;
  
  public ltf(lte paramlte, Context paramContext, ltj paramltj, String paramString)
  {
    super(paramContext, "AddUrlToQueue");
    this.a = paramltj;
    this.b = paramString;
  }
  
  protected final hae a()
  {
    hae localhae = new hae(true);
    this.a.a(this.b);
    return localhae;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltf
 * JD-Core Version:    0.7.0.1
 */