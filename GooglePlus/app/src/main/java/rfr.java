@Deprecated
public final class rfr
{
  @Deprecated
  private rfq a;
  @Deprecated
  private rfq b;
  
  @Deprecated
  public rfr(rfq paramrfq1, rfq paramrfq2)
  {
    if (paramrfq1.b != paramrfq2.b)
    {
      String str1 = String.valueOf(paramrfq1);
      String str2 = String.valueOf(paramrfq2);
      throw new IllegalArgumentException(55 + String.valueOf(str1).length() + String.valueOf(str2).length() + "Ranges must have the same number of visible decimals: " + str1 + "~" + str2);
    }
    this.a = paramrfq1;
    this.b = paramrfq2;
  }
  
  @Deprecated
  public final String toString()
  {
    String str1 = String.valueOf(this.a);
    if (this.b == this.a) {}
    String str2;
    for (String str3 = "";; str3 = 1 + String.valueOf(str2).length() + "~" + str2)
    {
      return 0 + String.valueOf(str1).length() + String.valueOf(str3).length() + str1 + str3;
      str2 = String.valueOf(this.b);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rfr
 * JD-Core Version:    0.7.0.1
 */