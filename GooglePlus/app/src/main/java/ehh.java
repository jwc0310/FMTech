import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class ehh
  implements Runnable
{
  private final int a;
  private final ConnectionResult b;
  
  public ehh(ehe paramehe, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
  }
  
  public final void run()
  {
    if (this.b.a()) {
      try
      {
        int i = 1 + (1 + this.c.f().b.a.d.f().indexOf(this.c) << 16);
        this.b.a(this.c.f(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        ehe.a(this.c);
        return;
      }
    }
    if (eer.b(this.b.c))
    {
      eer.a(this.b.c, this.c.f(), this.c, 2, this.c);
      return;
    }
    ehe.a(this.c, this.a, this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehh
 * JD-Core Version:    0.7.0.1
 */