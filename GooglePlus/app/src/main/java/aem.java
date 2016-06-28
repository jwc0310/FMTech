final class aem
{
  public agt a;
  public agt b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  private aem(agt paramagt1, agt paramagt2)
  {
    this.a = paramagt1;
    this.b = paramagt2;
  }
  
  aem(agt paramagt1, agt paramagt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramagt1, paramagt2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }
  
  public final String toString()
  {
    return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aem
 * JD-Core Version:    0.7.0.1
 */