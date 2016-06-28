final class kmm
  implements iuu
{
  private static final int a = qws.a.b >>> 3;
  private static final int b = qwq.a.b >>> 3;
  
  public final void a(gjb paramgjb, kcx paramkcx)
  {
    paramkcx.a(qws.a, a);
    paramkcx.a(qwq.a, b);
  }
  
  public final void a(gje paramgje, kcx paramkcx)
  {
    qws localqws = (qws)paramkcx.a(paramkcx.a(a), qws.a);
    ome localome = localqws.b;
    if (localome != null)
    {
      if (localome.a == null)
      {
        omm[] arrayOfomm = localome.c;
        omf localomf = new omf();
        localomf.b = new omk();
        localomf.a = new omj();
        localomf.a.a = "pref:DEFAULT";
        if ((localqws.c != null) && (!efj.b(localqws.c)))
        {
          localomf.b.b = new omn();
          localomf.b.b.c = 2;
        }
        localomf.b.a = new omn[arrayOfomm.length];
        for (int i = 0; i < arrayOfomm.length; i++) {
          localomf.b.a[i] = arrayOfomm[i].a;
        }
        localome.a = new omf[] { localomf };
      }
      efj.a(paramgje, localome);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmm
 * JD-Core Version:    0.7.0.1
 */