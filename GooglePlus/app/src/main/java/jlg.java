final class jlg
  implements fsi<fsh>
{
  jlg(jkz paramjkz, String paramString, jjp paramjjp) {}
  
  public final void a(fsh paramfsh)
  {
    paramfsh.aN_();
    if (jid.a())
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramfsh.aN_().a());
      jid.a("MenageriePeopleService#requestSyncByUserAction", String.format("isSuccess: %s.", arrayOfObject));
    }
    jid.a(this.c.a, this.a, 20, paramfsh);
    this.b.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlg
 * JD-Core Version:    0.7.0.1
 */