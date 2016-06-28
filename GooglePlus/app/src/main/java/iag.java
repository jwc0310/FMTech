import java.lang.ref.WeakReference;

public abstract class iag<T>
{
  private T a;
  private WeakReference<T> b;
  private boolean c = false;
  
  public abstract T a();
  
  final void a(int paramInt)
  {
    Object localObject1 = null;
    iag localiag;
    if (20 <= paramInt) {
      localiag = this;
    }
    for (;;)
    {
      try
      {
        localiag.a = localObject1;
        return;
      }
      finally {}
      if (this.b == null)
      {
        localiag = this;
        localObject1 = null;
      }
      else
      {
        Object localObject3 = this.b.get();
        localObject1 = localObject3;
        localiag = this;
      }
    }
  }
  
  public final T b()
  {
    Object localObject2;
    for (;;)
    {
      try
      {
        if (!this.c)
        {
          this.c = true;
          iah.a(this);
        }
        if (this.b == null)
        {
          localObject2 = null;
          if (localObject2 != null) {
            break label84;
          }
          localObject2 = a();
          if (localObject2 != null) {
            break;
          }
          throw new NullPointerException();
        }
      }
      finally {}
      localObject2 = this.b.get();
    }
    this.a = localObject2;
    this.b = new WeakReference(this.a);
    label84:
    return localObject2;
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iag
 * JD-Core Version:    0.7.0.1
 */