import android.text.TextUtils;

public abstract class kbq
  implements kcf
{
  private static final mfl a = new mfl("debug.plus.apiary_token", "");
  private static final mfl b = new mfl("debug.plus.backend.url", "");
  private static final mcq c = new mcq("debug.plus.tracing_enabled");
  private static final mfl d = new mfl("debug.plus.tracing_token", "");
  private static final mfl e = new mfl("debug.plus.tracing_path", "");
  private static final mfl f = new mfl("debug.plus.tracing_level", "");
  private static final mfl g = new mfl("debug.plus.experiment_override", "");
  
  public String a()
  {
    return f.a;
  }
  
  public final String b()
  {
    return a.a;
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final String d()
  {
    return d.a;
  }
  
  public final String e()
  {
    String str = e.a;
    if (str != null) {
      str = str.trim();
    }
    if (TextUtils.isEmpty(str)) {
      str = ".*";
    }
    return str;
  }
  
  public final String f()
  {
    return g.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbq
 * JD-Core Version:    0.7.0.1
 */