import android.text.TextUtils;

public final class ebz
{
  public final eby a;
  
  public ebz(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Content ID cannot be empty");
    }
    this.a = new eby(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ebz
 * JD-Core Version:    0.7.0.1
 */