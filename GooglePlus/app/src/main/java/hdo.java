import android.text.TextUtils;

public final class hdo
{
  private static final la<String, String> a = new la();
  private static final la<String, String> b = new la();
  
  static
  {
    a.put("lh3.googleusercontent.com", "~3");
    b.put("~3", "lh3.googleusercontent.com");
    a.put("lh4.googleusercontent.com", "~4");
    b.put("~4", "lh4.googleusercontent.com");
    a.put("lh5.googleusercontent.com", "~5");
    b.put("~5", "lh5.googleusercontent.com");
    a.put("lh6.googleusercontent.com", "~6");
    b.put("~6", "lh6.googleusercontent.com");
  }
  
  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    int i;
    if (paramString.startsWith("https://")) {
      i = 8;
    }
    for (;;)
    {
      int j = paramString.length();
      if (paramString.endsWith("/photo.jpg")) {}
      for (int k = j - 9;; k = j)
      {
        int m = paramString.indexOf('/', i);
        Object localObject = null;
        if (m == -1) {}
        for (;;)
        {
          if (localObject != null)
          {
            String str1 = String.valueOf(localObject);
            String str2 = String.valueOf(paramString.substring(m, k));
            if (str2.length() != 0)
            {
              return str1.concat(str2);
              if (paramString.startsWith("http://"))
              {
                i = 7;
                break;
              }
              if (!paramString.startsWith("//")) {
                break label170;
              }
              i = 2;
              break;
              localObject = (String)a.get(paramString.substring(i, m));
              continue;
            }
            return new String(str1);
          }
        }
        return paramString.substring(i, k);
      }
      label170:
      i = 0;
    }
  }
  
  public static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("https://");
    if (paramString.charAt(0) == '~')
    {
      int i = paramString.indexOf('/');
      localStringBuilder.append((String)b.get(paramString.substring(0, i)));
      localStringBuilder.append(paramString.substring(i));
    }
    for (;;)
    {
      if (paramString.endsWith("/")) {
        localStringBuilder.append("photo.jpg");
      }
      return localStringBuilder.toString();
      localStringBuilder.append(paramString);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdo
 * JD-Core Version:    0.7.0.1
 */