import android.content.Context;

final class ksg
  implements gwy
{
  final ksi a;
  final int b;
  private final kqy c = new kqy();
  
  ksg(Context paramContext)
  {
    this.a = new ksi(paramContext);
    this.b = mbb.a(paramContext, "com.google.android.libraries.social.appid", 300);
    if (this.b == 300) {
      throw new IllegalStateException("Context must have a bound AppId.");
    }
  }
  
  public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    return new ksh(this, paramUncaughtExceptionHandler);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ksg
 * JD-Core Version:    0.7.0.1
 */