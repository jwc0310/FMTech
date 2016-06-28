import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

final class mdd
  implements mct
{
  public final File a(Context paramContext)
  {
    return new File(paramContext.getFilesDir(), "paddingStart");
  }
  
  public final boolean a(Throwable paramThrowable)
  {
    return ((paramThrowable instanceof NumberFormatException)) && (Pattern.matches("Invalid int: \"[0-9]+(.[0-9]*)?(dip|dp|sp|mm|in|px)\"", paramThrowable.getMessage()));
  }
  
  public final bj b()
  {
    return new mde();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mdd
 * JD-Core Version:    0.7.0.1
 */