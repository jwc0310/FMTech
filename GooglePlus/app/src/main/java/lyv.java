import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lyv
{
  public final List<lyu> a;
  
  public lyv()
  {
    this(Arrays.asList(arrayOflyu));
  }
  
  protected lyv(List<lyu> paramList)
  {
    this.a = Collections.unmodifiableList(paramList);
  }
  
  public lyu a(lyu paramlyu)
  {
    return paramlyu.e;
  }
  
  public lyu b(lyu paramlyu)
  {
    return c(paramlyu.f);
  }
  
  public lyu c(lyu paramlyu)
  {
    return paramlyu;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyv
 * JD-Core Version:    0.7.0.1
 */