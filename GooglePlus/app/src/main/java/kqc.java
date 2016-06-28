public final class kqc
{
  public final kqd a;
  public final long b;
  public final String c;
  
  public kqc(kqd paramkqd, long paramLong)
  {
    if (paramLong == -1L) {
      throw new IllegalArgumentException(67 + "LongId cannot equal INVALID_PHOTO_ID.  LongId: " + paramLong);
    }
    this.a = paramkqd;
    this.b = paramLong;
    this.c = null;
  }
  
  public kqc(kqd paramkqd, String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("StringId cannot be null.");
    }
    this.a = paramkqd;
    this.b = -1L;
    this.c = paramString;
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    if (this.c == null) {}
    for (String str = Long.toString(this.b);; str = this.c)
    {
      arrayOfObject[0] = str;
      arrayOfObject[1] = this.a;
      return String.format("{id: %s, type: %s}", arrayOfObject);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqc
 * JD-Core Version:    0.7.0.1
 */