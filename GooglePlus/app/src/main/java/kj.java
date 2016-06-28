import java.util.Locale;

public class kj
{
  public int a(Locale paramLocale)
  {
    int i = 1;
    if ((paramLocale != null) && (!paramLocale.equals(ki.b)))
    {
      String str = ju.a.a(paramLocale);
      if (str == null) {
        switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
        {
        default: 
          i = 0;
        }
      }
      while ((str.equalsIgnoreCase(ki.c)) || (str.equalsIgnoreCase(ki.d))) {
        return i;
      }
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kj
 * JD-Core Version:    0.7.0.1
 */