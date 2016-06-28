final class ckv
  implements Runnable
{
  ckv(cku paramcku, CharSequence paramCharSequence) {}
  
  public final void run()
  {
    String str;
    if ((this.a == null) || ((this.b.a.i) && (this.a.length() == 0))) {
      str = null;
    }
    for (;;)
    {
      this.b.a.b(str);
      return;
      if ((this.b.a.i) && (efj.a(this.a.charAt(0)))) {
        str = this.a.subSequence(1, this.a.length()).toString();
      } else {
        str = this.a.toString();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckv
 * JD-Core Version:    0.7.0.1
 */