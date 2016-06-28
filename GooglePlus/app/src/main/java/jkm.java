final class jkm
  implements Runnable
{
  jkm(jkl paramjkl) {}
  
  public final void run()
  {
    jkk localjkk = this.a.a;
    if (localjkk.d)
    {
      localjkk.d = false;
      localjkk.c.a(localjkk);
      return;
    }
    localjkk.c.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkm
 * JD-Core Version:    0.7.0.1
 */