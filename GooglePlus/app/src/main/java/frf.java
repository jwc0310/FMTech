final class frf
  implements fqn
{
  public final String a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("applicationId cannot be null");
    }
    StringBuilder localStringBuilder = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
    if (paramString != null)
    {
      String str = paramString.toUpperCase();
      if (!str.matches("[A-F0-9]+")) {
        throw new IllegalArgumentException("Invalid application ID: " + paramString);
      }
      localStringBuilder.append("/").append(str);
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     frf
 * JD-Core Version:    0.7.0.1
 */