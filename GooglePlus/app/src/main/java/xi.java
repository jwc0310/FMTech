public class xi<T>
{
  public final T d;
  
  xi(T paramT)
  {
    if (paramT == null) {
      throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    this.d = paramT;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     xi
 * JD-Core Version:    0.7.0.1
 */