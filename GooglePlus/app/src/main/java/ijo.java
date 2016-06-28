public class ijo
{
  Integer a;
  Integer b;
  Integer c;
  
  ijo() {}
  
  public ijo(byte paramByte)
  {
    this();
  }
  
  public ijn a()
  {
    String str1 = "";
    if (this.a == null) {
      str1 = String.valueOf(str1).concat(" numUpdates");
    }
    if (this.b == null) {
      str1 = String.valueOf(str1).concat(" timeoutSeconds");
    }
    if (this.c == null) {
      str1 = String.valueOf(str1).concat(" priority");
    }
    if (!str1.isEmpty())
    {
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {}
      for (String str3 = "Missing required properties:".concat(str2);; str3 = new String("Missing required properties:")) {
        throw new IllegalStateException(str3);
      }
    }
    return new iit(this.a.intValue(), this.b.intValue(), this.c.intValue());
  }
  
  public ijo a(int paramInt)
  {
    this.a = Integer.valueOf(paramInt);
    return this;
  }
  
  public ijo b(int paramInt)
  {
    this.b = Integer.valueOf(30);
    return this;
  }
  
  public ijo c(int paramInt)
  {
    this.c = Integer.valueOf(100);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijo
 * JD-Core Version:    0.7.0.1
 */