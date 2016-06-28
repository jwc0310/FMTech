import android.os.Build.VERSION;
import android.os.CancellationSignal;

public final class jb
{
  public boolean a;
  public Object b;
  
  public final boolean a()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally {}
  }
  
  public final Object b()
  {
    if (Build.VERSION.SDK_INT < 16) {
      return null;
    }
    try
    {
      if (this.b == null)
      {
        this.b = new CancellationSignal();
        if (this.a) {
          ((CancellationSignal)this.b).cancel();
        }
      }
      Object localObject2 = this.b;
      return localObject2;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jb
 * JD-Core Version:    0.7.0.1
 */