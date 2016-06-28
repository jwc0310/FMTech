import android.os.Build.VERSION;

public final class po
{
  public static final pq a = new pq();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new pp();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     po
 * JD-Core Version:    0.7.0.1
 */