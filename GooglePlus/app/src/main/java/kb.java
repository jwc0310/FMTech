public abstract class kb
{
  final kf a;
  
  public kb(kf paramkf)
  {
    this.a = paramkf;
  }
  
  protected abstract boolean a();
  
  public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence == null) || (paramInt2 < 0) || (paramCharSequence.length() - paramInt2 < 0)) {
      throw new IllegalArgumentException();
    }
    if (this.a == null) {
      return a();
    }
    return b(paramCharSequence, 0, paramInt2);
  }
  
  boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    switch (this.a.a(paramCharSequence, paramInt1, paramInt2))
    {
    default: 
      return a();
    case 0: 
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kb
 * JD-Core Version:    0.7.0.1
 */