final class jsb
  extends jsd
{
  jsb(jsf paramjsf, jsa paramjsa, CharSequence paramCharSequence)
  {
    super(paramjsa, paramCharSequence);
  }
  
  public final int a(int paramInt)
  {
    int i = this.e.a.length();
    int j = this.b.length() - i;
    for (int k = paramInt; k <= j; k++) {
      for (int m = 0;; m++)
      {
        if (m >= i) {
          break label85;
        }
        if (this.b.charAt(m + k) != this.e.a.charAt(m)) {
          break;
        }
      }
    }
    k = -1;
    label85:
    return k;
  }
  
  public final int b(int paramInt)
  {
    return paramInt + this.e.a.length();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsb
 * JD-Core Version:    0.7.0.1
 */