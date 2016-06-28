import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class hzg
  implements hyh
{
  private final SharedPreferences a;
  
  public hzg(Context paramContext)
  {
    this.a = paramContext.getSharedPreferences("ExperimentOverrideStoreImpl", 0);
  }
  
  public final String a(hyf paramhyf)
  {
    return this.a.getString(paramhyf.a, null);
  }
  
  public final boolean a()
  {
    return this.a.edit().clear().commit();
  }
  
  public final boolean a(hyf paramhyf, String paramString)
  {
    return this.a.edit().putString(paramhyf.a, paramString).commit();
  }
  
  public final boolean b(hyf paramhyf)
  {
    return this.a.edit().remove(paramhyf.a).commit();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzg
 * JD-Core Version:    0.7.0.1
 */