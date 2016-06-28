import android.app.PendingIntent;
import android.os.Bundle;

public final class dg
  extends ea
{
  final Bundle a;
  public int b;
  public CharSequence c;
  public PendingIntent d;
  private final eq[] e;
  
  static
  {
    new eb();
  }
  
  public dg(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramCharSequence, paramPendingIntent, new Bundle(), null);
  }
  
  dg(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, eq[] paramArrayOfeq)
  {
    this.b = paramInt;
    this.c = dk.a(paramCharSequence);
    this.d = paramPendingIntent;
    if (paramBundle != null) {}
    for (;;)
    {
      this.a = paramBundle;
      this.e = paramArrayOfeq;
      return;
      paramBundle = new Bundle();
    }
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final CharSequence b()
  {
    return this.c;
  }
  
  public final PendingIntent c()
  {
    return this.d;
  }
  
  public final Bundle d()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dg
 * JD-Core Version:    0.7.0.1
 */