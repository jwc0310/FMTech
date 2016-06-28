import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

public final class dh
{
  public ArrayList<eq> a;
  private final int b;
  private final CharSequence c;
  private final PendingIntent d;
  private final Bundle e;
  
  public dh(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramCharSequence, paramPendingIntent, new Bundle());
  }
  
  private dh(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle)
  {
    this.b = paramInt;
    this.c = dk.a(paramCharSequence);
    this.d = paramPendingIntent;
    this.e = paramBundle;
  }
  
  public dh(dg paramdg)
  {
    this(paramdg.b, paramdg.c, paramdg.d, new Bundle(paramdg.a));
  }
  
  public final dg a()
  {
    if (this.a != null) {}
    for (eq[] arrayOfeq = (eq[])this.a.toArray(new eq[this.a.size()]);; arrayOfeq = null) {
      return new dg(this.b, this.c, this.d, this.e, arrayOfeq);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dh
 * JD-Core Version:    0.7.0.1
 */