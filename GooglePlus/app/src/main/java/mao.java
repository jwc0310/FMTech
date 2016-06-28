import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class mao
{
  final Context a;
  final String b;
  
  public mao(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  public InputStream a(map parammap)
  {
    if (this.b == null) {
      return new mai(this.a, null, parammap.a, parammap.c, parammap.d, parammap.b);
    }
    File localFile = new File(this.b);
    if (!localFile.exists())
    {
      String str3 = String.valueOf(localFile.getAbsolutePath());
      if (str3.length() != 0) {}
      for (String str4 = "File not found: ".concat(str3);; str4 = new String("File not found: ")) {
        throw new FileNotFoundException(str4);
      }
    }
    if (!localFile.canRead())
    {
      String str1 = String.valueOf(localFile.getAbsolutePath());
      if (str1.length() != 0) {}
      for (String str2 = "File cannot be read: ".concat(str1);; str2 = new String("File cannot be read: ")) {
        throw new IOException(str2);
      }
    }
    return new mai(this.a, localFile, parammap.a, parammap.c, parammap.d, parammap.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mao
 * JD-Core Version:    0.7.0.1
 */