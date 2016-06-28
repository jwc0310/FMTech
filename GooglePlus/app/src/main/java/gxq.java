import java.io.Serializable;
import java.util.Locale;

public class gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public final gxt a;
  
  public gxq(gxt paramgxt)
  {
    this.a = paramgxt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (paramObject != null)
    {
      Class localClass1 = getClass();
      Class localClass2 = paramObject.getClass();
      bool = false;
      if (localClass1 == localClass2)
      {
        gxq localgxq = (gxq)paramObject;
        int i = this.a.a;
        int j = localgxq.a.a;
        bool = false;
        if (i == j) {
          bool = true;
        }
      }
    }
    return bool;
  }
  
  public int hashCode()
  {
    return 527 + this.a.a;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format(localLocale, "VisualElement {tag: %s}", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxq
 * JD-Core Version:    0.7.0.1
 */