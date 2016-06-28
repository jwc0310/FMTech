public final class nhq
  extends qan<nhq>
{
  private qhs a = null;
  
  public nhq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      qhs localqhs = this.a;
      int j = qal.d(8);
      int k = localqhs.a();
      localqhs.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qhs localqhs = this.a;
      paramqal.c(10);
      if (localqhs.ak < 0) {
        localqhs.ak = localqhs.a();
      }
      paramqal.c(localqhs.ak);
      localqhs.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhq
 * JD-Core Version:    0.7.0.1
 */