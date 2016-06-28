final class iit
  extends ijn
{
  private final int a;
  private final int b;
  private final int c;
  
  iit(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  final int a()
  {
    return this.a;
  }
  
  final int b()
  {
    return this.b;
  }
  
  final int c()
  {
    return this.c;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ijn localijn;
    do
    {
      return true;
      if (!(paramObject instanceof ijn)) {
        break;
      }
      localijn = (ijn)paramObject;
    } while ((this.a == localijn.a()) && (this.b == localijn.b()) && (this.c == localijn.c()));
    return false;
    return false;
  }
  
  public final int hashCode()
  {
    return 1000003 * (1000003 * (0xF4243 ^ this.a) ^ this.b) ^ this.c;
  }
  
  public final String toString()
  {
    String str = String.valueOf("Options{numUpdates=");
    int i = this.a;
    int j = this.b;
    int k = this.c;
    return 62 + String.valueOf(str).length() + str + i + ", timeoutSeconds=" + j + ", priority=" + k + "}";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iit
 * JD-Core Version:    0.7.0.1
 */