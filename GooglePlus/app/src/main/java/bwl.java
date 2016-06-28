public final class bwl
  implements bwk
{
  private final bwk a;
  private int b = -1;
  private int c = -1;
  
  public bwl(bwk parambwk)
  {
    this.a = parambwk;
  }
  
  public final int a()
  {
    if (this.c == -1) {
      this.c = this.a.a();
    }
    return this.c;
  }
  
  public final void a(mbb parammbb)
  {
    parammbb.a(bwk.class, this);
  }
  
  public final int b()
  {
    if (this.b == -1) {
      this.b = this.a.b();
    }
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwl
 * JD-Core Version:    0.7.0.1
 */