import android.os.ConditionVariable;
import java.util.ArrayList;

final class jla
  implements jhw
{
  jla(jkz paramjkz, ArrayList paramArrayList, ConditionVariable paramConditionVariable) {}
  
  public final void a() {}
  
  public final void a(jgu paramjgu)
  {
    synchronized (this.a)
    {
      this.a.addAll(paramjgu.a());
      paramjgu.b();
      this.b.open();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jla
 * JD-Core Version:    0.7.0.1
 */