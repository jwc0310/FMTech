import android.content.Context;
import java.io.File;

final class mcz
  implements mct
{
  public final File a(Context paramContext)
  {
    return new File(paramContext.getFilesDir(), "corrupted_install");
  }
  
  public final boolean a(Throwable paramThrowable)
  {
    return paramThrowable instanceof UnsatisfiedLinkError;
  }
  
  public final bj b()
  {
    return new mdc();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mcz
 * JD-Core Version:    0.7.0.1
 */