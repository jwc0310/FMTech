final class gdo<M extends qat, E>
  extends gdi
{
  private final geh d;
  private final gcx<M> e;
  private final gdg<M, E> f;
  private final String g;
  
  gdo(gdg<M, E> paramgdg, geh paramgeh, gcx<M> paramgcx, gdh paramgdh, String paramString, Integer paramInteger)
  {
    super(paramgdh, paramInteger);
    this.d = paramgeh;
    this.e = paramgcx;
    this.f = paramgdg;
    this.g = paramString;
  }
  
  protected final void b(String paramString, E paramE)
  {
    qat localqat = this.f.a(paramE);
    rhf localrhf = this.e.a(localqat);
    localrhf.e = new rgx();
    localrhf.e.a = this.g;
    if (paramString != null) {
      localrhf.c = paramString;
    }
    this.d.a(localrhf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gdo
 * JD-Core Version:    0.7.0.1
 */