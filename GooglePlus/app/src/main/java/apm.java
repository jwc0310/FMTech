public final class apm
{
  public final apn a;
  public final long b;
  public final long c;
  public final long d;
  public final String e;
  public final ipf f;
  public final ojf g;
  
  public apm(apn paramapn, long paramLong1, long paramLong2, long paramLong3, String paramString, ipf paramipf, ojf paramojf)
  {
    this.a = paramapn;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramLong3;
    this.e = paramString;
    this.f = paramipf;
    this.g = paramojf;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf("AllPhotosRowItem{id: ");
    long l = this.b;
    String str2 = String.valueOf(this.a.name());
    String str3 = String.valueOf(this.f);
    String str4 = this.e;
    return 67 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + str1 + l + ", dataOptions: " + str2 + ", mediaRef: " + str3 + ", localContentUri: " + str4 + "}";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apm
 * JD-Core Version:    0.7.0.1
 */