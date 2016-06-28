import android.os.ConditionVariable;
import java.util.ArrayList;

final class jld
  implements jhx
{
  jld(jkz paramjkz, ArrayList paramArrayList, ConditionVariable paramConditionVariable) {}
  
  public final void a() {}
  
  public final void a(jil paramjil)
  {
    synchronized (this.a)
    {
      this.a.addAll(paramjil.a());
      paramjil.b();
      this.b.open();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jld
 * JD-Core Version:    0.7.0.1
 */