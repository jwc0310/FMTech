import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

final class fph
  extends ContentObserver
{
  fph(fpg paramfpg, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    try
    {
      fpf.b.clear();
      fpf.c = new Object();
      if (fpf.d.length > 0) {
        fpf.a(this.a.a, fpf.d);
      }
      return;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fph
 * JD-Core Version:    0.7.0.1
 */