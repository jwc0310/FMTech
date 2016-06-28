final class jlo
  implements Runnable
{
  jlo(jln paramjln) {}
  
  public final void run()
  {
    jlm localjlm = this.a.a;
    if (localjlm.c)
    {
      localjlm.c = false;
      localjlm.b.a(localjlm);
      return;
    }
    localjlm.b.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlo
 * JD-Core Version:    0.7.0.1
 */