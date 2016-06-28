import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class ehd
  implements Runnable
{
  private final int a;
  private final ConnectionResult b;
  
  public ehd(ehb paramehb, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
  }
  
  public final void run()
  {
    if ((!ehb.a(this.c)) || (ehb.b(this.c))) {
      return;
    }
    ehb.a(this.c, true);
    ehb.a(this.c, this.a);
    ehb.a(this.c, this.b);
    if (this.b.a()) {
      try
      {
        int i = 1 + (1 + this.c.f().b.a.d.f().indexOf(this.c) << 16);
        this.b.a(this.c.f(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        ehb.c(this.c);
        return;
      }
    }
    if (eer.b(this.b.c))
    {
      eer.a(this.b.c, this.c.f(), this.c, 2, this.c);
      return;
    }
    ehb.a(this.c, this.a, this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehd
 * JD-Core Version:    0.7.0.1
 */