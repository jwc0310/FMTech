import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ajy
  extends akx
{
  private static final List<Integer> a;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(16);
    arrayOfInteger[1] = Integer.valueOf(15);
    Collections.addAll(localArrayList, arrayOfInteger);
    a = Collections.unmodifiableList(localArrayList);
  }
  
  protected final List<Integer> C()
  {
    return a;
  }
  
  public final gxq v()
  {
    return new gxq(pjw.h);
  }
  
  public final int w()
  {
    return 13;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajy
 * JD-Core Version:    0.7.0.1
 */