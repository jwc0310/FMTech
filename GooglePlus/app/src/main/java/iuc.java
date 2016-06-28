import android.net.Uri;

final class iuc
  implements iwy
{
  ito a;
  private final Uri b;
  private final long c;
  private final long d;
  private long e = 0L;
  
  public iuc(itz paramitz, Uri paramUri, long paramLong1, long paramLong2)
  {
    this.b = paramUri;
    this.c = paramLong1;
    this.d = paramLong2;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    if (paramLong1 - this.e > itz.a) {
      this.e = paramLong1;
    }
    try
    {
      this.f.b();
      if (paramLong1 + this.d < paramLong2) {
        this.f.c.a(this.b, paramLong1 + this.d, this.c);
      }
      return;
    }
    catch (ito localito)
    {
      for (;;)
      {
        this.a = localito;
        this.f.a();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iuc
 * JD-Core Version:    0.7.0.1
 */