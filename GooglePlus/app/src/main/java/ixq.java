import android.content.ContentResolver;
import android.content.Context;

public final class ixq
  implements mbi<String>
{
  public final ContentResolver a;
  public final String b;
  public final boolean c;
  
  public ixq(Context paramContext, String paramString, boolean paramBoolean)
  {
    this.a = paramContext.getContentResolver();
    String str1 = String.valueOf("ozexperiment:");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      this.b = str3;
      this.c = paramBoolean;
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixq
 * JD-Core Version:    0.7.0.1
 */