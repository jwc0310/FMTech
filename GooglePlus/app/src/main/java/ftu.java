import android.app.ApplicationErrorReport;

public final class ftu
  extends ftt
  implements ftm, ftn
{
  private evk b = new evk();
  
  public ftu()
  {
    this.a = this.b;
  }
  
  public final ftl a()
  {
    return new fts(this.b.a());
  }
  
  public final ftn a(int paramInt)
  {
    this.b.h.crashInfo.throwLineNumber = paramInt;
    return this;
  }
  
  public final ftn d(String paramString)
  {
    this.b.h.crashInfo.exceptionClassName = paramString;
    return this;
  }
  
  public final ftn e(String paramString)
  {
    this.b.h.crashInfo.throwFileName = paramString;
    return this;
  }
  
  public final ftn f(String paramString)
  {
    this.b.h.crashInfo.throwClassName = paramString;
    return this;
  }
  
  public final ftn g(String paramString)
  {
    this.b.h.crashInfo.throwMethodName = paramString;
    return this;
  }
  
  public final ftn h(String paramString)
  {
    this.b.h.crashInfo.stackTrace = paramString;
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ftu
 * JD-Core Version:    0.7.0.1
 */