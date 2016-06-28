import android.content.Context;

public final class hnd
  implements khw
{
  public final boolean a(Context paramContext, khx paramkhx, oqq paramoqq)
  {
    if (paramkhx == null) {}
    do
    {
      return false;
      qbe localqbe = paramkhx.e;
      if ((localqbe != null) && (localqbe.a != null) && (localqbe.a.length != 0) && (localqbe.a[0] == 413)) {
        paramoqq.q = paramkhx.e;
      }
    } while ((paramkhx.f == null) || (paramkhx.f.e.length == 0));
    hps localhps = paramkhx.f.e[0];
    oqt localoqt = new oqt();
    localoqt.a = 2;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = localhps.a;
    localoqt.b = arrayOfString;
    paramoqq.n = new oqt[] { localoqt };
    omw localomw = new omw();
    localomw.b = "collexions";
    localomw.a = localhps.a;
    omn localomn1 = new omn();
    localomn1.f = localomw;
    omk localomk = new omk();
    localomk.a = new omn[] { localomn1 };
    if (localhps.c)
    {
      omn localomn2 = new omn();
      localomn2.c = 2;
      localomk.b = localomn2;
    }
    paramoqq.j = localomk;
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnd
 * JD-Core Version:    0.7.0.1
 */