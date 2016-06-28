public class eyf<M extends eyf<M>>
  extends eyk
{
  public eyh a;
  
  protected int a()
  {
    int i = 0;
    if (this.a != null)
    {
      j = 0;
      while (i < this.a.b)
      {
        j += this.a.a[i].a();
        i++;
      }
    }
    int j = 0;
    return j;
  }
  
  public void a(eyd parameyd)
  {
    if (this.a == null) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.a.b; i++) {
        this.a.a[i].a(parameyd);
      }
    }
  }
  
  protected final boolean a(M paramM)
  {
    int j;
    if (this.a != null)
    {
      if (this.a.b == 0)
      {
        j = 1;
        if (j == 0) {
          break label65;
        }
      }
    }
    else if (paramM.a != null) {
      if (paramM.a.b != 0) {
        break label60;
      }
    }
    label60:
    for (int i = 1;; i = 0)
    {
      boolean bool = false;
      if (i != 0) {
        bool = true;
      }
      return bool;
      j = 0;
      break;
    }
    label65:
    return this.a.equals(paramM.a);
  }
  
  protected final int b()
  {
    if (this.a != null) {
      if (this.a.b != 0) {
        break label25;
      }
    }
    label25:
    for (int i = 1; i != 0; i = 0) {
      return 0;
    }
    return this.a.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyf
 * JD-Core Version:    0.7.0.1
 */