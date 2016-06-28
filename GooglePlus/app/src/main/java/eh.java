final class eh
  implements ep
{
  private String a;
  private int b;
  private String c;
  private boolean d;
  
  public eh(String paramString1, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = false;
  }
  
  public final void a(cs paramcs)
  {
    paramcs.a(this.a, this.b, this.c);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CancelTask[");
    localStringBuilder.append("packageName:").append(this.a);
    localStringBuilder.append(", id:").append(this.b);
    localStringBuilder.append(", tag:").append(this.c);
    localStringBuilder.append(", all:false");
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eh
 * JD-Core Version:    0.7.0.1
 */