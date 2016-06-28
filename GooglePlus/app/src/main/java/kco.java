import java.util.concurrent.TimeUnit;

final class kco
  extends kcm
{
  static final long a = TimeUnit.HOURS.toMillis(1L);
  private final la<String, kcn> b = new la();
  private final fpu c;
  
  kco(fpu paramfpu)
  {
    this.c = paramfpu;
  }
  
  public final kcn a(String paramString)
  {
    try
    {
      kcn localkcn = (kcn)this.b.get(paramString);
      if (localkcn == null)
      {
        localkcn = new kcn(paramString, this.c);
        this.b.put(paramString, localkcn);
      }
      return localkcn;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kco
 * JD-Core Version:    0.7.0.1
 */