import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

@TargetApi(18)
final class iad
  implements iae
{
  public final long a()
  {
    return new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
  }
  
  public final long b()
  {
    return new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iad
 * JD-Core Version:    0.7.0.1
 */