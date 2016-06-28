import android.os.ConditionVariable;
import java.util.ArrayList;

final class jlb
  implements jhy
{
  jlb(jkz paramjkz, ArrayList paramArrayList, ConditionVariable paramConditionVariable) {}
  
  public final void Q_() {}
  
  public final void a(jjr paramjjr)
  {
    synchronized (this.a)
    {
      this.a.addAll(paramjjr.a());
      paramjjr.b();
      this.b.open();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlb
 * JD-Core Version:    0.7.0.1
 */