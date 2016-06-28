import java.util.Collections;
import java.util.Map;

public final class ids
{
  public qzz a;
  public Map<String, qzz> b;
  private int c = -1;
  
  public final idr a()
  {
    efj.e(this.a, "A valid card must be set.");
    if (this.b == null) {
      this.b = Collections.emptyMap();
    }
    return new idr(this.a, this.b, this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ids
 * JD-Core Version:    0.7.0.1
 */