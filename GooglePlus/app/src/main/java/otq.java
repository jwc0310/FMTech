public final class otq
  implements otn
{
  private final Class<? extends git> a;
  
  public otq(Class<? extends git> paramClass)
  {
    if (paramClass == null) {
      throw new NullPointerException("Null handler");
    }
    this.a = paramClass;
  }
  
  public final Class<? extends git> a()
  {
    return this.a;
  }
  
  public final Class<? extends otn> annotationType()
  {
    return otn.class;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof otn))
    {
      otn localotn = (otn)paramObject;
      return this.a.equals(localotn.a());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return 0x7C604DB6 ^ this.a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("@com.google.apps.tiktok.account.ActivityAccountHandler(");
    localStringBuilder.append("handler=");
    localStringBuilder.append(this.a);
    return ')';
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     otq
 * JD-Core Version:    0.7.0.1
 */