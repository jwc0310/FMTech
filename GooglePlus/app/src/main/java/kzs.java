import android.net.Uri;
import android.net.Uri.Builder;

public final class kzs
  implements kyx
{
  private static final Uri a;
  private static final Uri b;
  
  static
  {
    Uri localUri = Uri.parse("content://com.google.android.libraries.social.squares/squares");
    a = localUri;
    String str = String.valueOf(localUri);
    b = Uri.parse(8 + String.valueOf(str).length() + str + "/members");
  }
  
  public final Uri a()
  {
    return Uri.parse("content://com.google.android.libraries.social.squares/squares");
  }
  
  public final Uri a(String paramString)
  {
    return a.buildUpon().appendPath(paramString).build();
  }
  
  public final Uri b()
  {
    return Uri.withAppendedPath(Uri.parse("content://com.google.android.libraries.social.squares/squares"), "myvisible");
  }
  
  public final Uri b(String paramString)
  {
    return b.buildUpon().appendPath(paramString).build();
  }
  
  public final Uri c()
  {
    return Uri.withAppendedPath(Uri.parse("content://com.google.android.libraries.social.squares/squares"), "uservisible");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzs
 * JD-Core Version:    0.7.0.1
 */