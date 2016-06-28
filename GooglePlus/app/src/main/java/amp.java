import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class amp
  extends akx
{
  private static final List<Integer> a;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[5];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(1);
    arrayOfInteger[2] = Integer.valueOf(2);
    arrayOfInteger[3] = Integer.valueOf(20);
    arrayOfInteger[4] = Integer.valueOf(11);
    Collections.addAll(localArrayList, arrayOfInteger);
    a = Collections.unmodifiableList(localArrayList);
  }
  
  protected final List<Integer> C()
  {
    return a;
  }
  
  public final gxq v()
  {
    return new gxq(pjw.y);
  }
  
  public final int w()
  {
    return 4;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amp
 * JD-Core Version:    0.7.0.1
 */