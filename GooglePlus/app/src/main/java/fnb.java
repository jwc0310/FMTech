import android.os.Bundle;
import android.os.Message;

final class fnb
  extends fmf
{
  final egw<flo> a;
  
  public fnb(egw<flo> paramegw)
  {
    this.a = paramegw;
  }
  
  public final void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (efj.d(3))
    {
      new StringBuilder("Bundle callback: status=").append(paramInt).append("\nresolution=").append(paramBundle1).append("\nbundle=").append(paramBundle2).toString();
      efj.d(3);
    }
    if (paramInt != 0)
    {
      efj.d(5);
      return;
    }
    egw localegw = this.a;
    egy localegy = new egy(paramBundle2.getString("account"), paramBundle2.getString("pagegaiaid"), paramBundle2.getInt("scope"));
    efj.b(localegy, "Notifier must not be null");
    Message localMessage = localegw.a.obtainMessage(1, localegy);
    localegw.a.sendMessage(localMessage);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fnb
 * JD-Core Version:    0.7.0.1
 */