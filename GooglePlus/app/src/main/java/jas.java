import android.net.Uri;

public class jas
{
  Integer a;
  Integer b;
  Integer c;
  Uri d;
  Boolean e;
  Boolean f;
  Boolean g;
  
  public jar a()
  {
    String str1 = "";
    if (this.a == null) {
      str1 = String.valueOf(str1).concat(" iconResourceId");
    }
    if (this.b == null) {
      str1 = String.valueOf(str1).concat(" appNameResourceId");
    }
    if (this.e == null) {
      str1 = String.valueOf(str1).concat(" ringtoneEnabled");
    }
    if (this.f == null) {
      str1 = String.valueOf(str1).concat(" vibrate");
    }
    if (this.g == null) {
      str1 = String.valueOf(str1).concat(" pushEnabled");
    }
    if (!str1.isEmpty())
    {
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {}
      for (String str3 = "Missing required properties:".concat(str2);; str3 = new String("Missing required properties:")) {
        throw new IllegalStateException(str3);
      }
    }
    return new jap(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), null, this.g.booleanValue());
  }
  
  public jas a(Uri paramUri)
  {
    this.d = paramUri;
    return this;
  }
  
  public jas a(Integer paramInteger)
  {
    this.a = paramInteger;
    return this;
  }
  
  public jas a(boolean paramBoolean)
  {
    this.e = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public jas b(Integer paramInteger)
  {
    this.b = paramInteger;
    return this;
  }
  
  public jas b(boolean paramBoolean)
  {
    this.f = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public jas c(Integer paramInteger)
  {
    this.c = paramInteger;
    return this;
  }
  
  public jas c(boolean paramBoolean)
  {
    this.g = Boolean.valueOf(paramBoolean);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jas
 * JD-Core Version:    0.7.0.1
 */