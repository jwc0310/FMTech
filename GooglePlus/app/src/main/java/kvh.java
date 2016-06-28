import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class kvh
  extends gxq
{
  public final List<String> b;
  public final List<String> c;
  public final List<Integer> d;
  
  public kvh(gxt paramgxt, List<Integer> paramList)
  {
    super(paramgxt);
    if (paramList != null)
    {
      this.d = Collections.unmodifiableList(paramList);
      this.b = Collections.emptyList();
      this.c = Collections.emptyList();
      return;
    }
    throw new IllegalStateException("Argument 'localNotificationTypes' is null");
  }
  
  public kvh(gxt paramgxt, List<String> paramList1, List<String> paramList2)
  {
    super(paramgxt);
    if (paramList1 != null)
    {
      this.b = Collections.unmodifiableList(paramList1);
      if (paramList2 == null) {
        break label47;
      }
    }
    label47:
    for (this.c = Collections.unmodifiableList(paramList2);; this.c = Collections.emptyList())
    {
      this.d = Collections.emptyList();
      return;
      this.b = Collections.emptyList();
      break;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = super.equals(paramObject);
    boolean bool2 = false;
    if (bool1)
    {
      kvh localkvh = (kvh)paramObject;
      boolean bool3 = efj.c(this.b, localkvh.b);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = efj.c(this.c, localkvh.c);
        bool2 = false;
        if (bool4)
        {
          boolean bool5 = efj.c(this.d, localkvh.d);
          bool2 = false;
          if (bool5) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = Integer.valueOf(super.hashCode());
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvh
 * JD-Core Version:    0.7.0.1
 */