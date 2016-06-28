import android.content.Context;
import java.util.Arrays;

final class jcp
  extends kde<mvt, mvu>
{
  private static final String a = jdr.a("RegisterDeviceOp");
  private qqu b;
  
  jcp(Context paramContext, kcg paramkcg, qqu paramqqu)
  {
    super(paramContext, paramkcg, "gnsregisterdevice", new mvt(), new mvu());
    this.b = paramqqu;
  }
  
  static int a(qqu paramqqu)
  {
    mji localmji = paramqqu.b.a;
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramqqu.c.a.a;
    arrayOfObject[1] = paramqqu.a;
    arrayOfObject[2] = paramqqu.b.b;
    arrayOfObject[3] = paramqqu.b.c;
    arrayOfObject[4] = Integer.valueOf(localmji.a);
    arrayOfObject[5] = localmji.b;
    arrayOfObject[6] = localmji.c;
    return Arrays.hashCode(arrayOfObject);
  }
  
  static qqu a(Context paramContext, String paramString, jaj paramjaj)
  {
    mlb localmlb = new mlb();
    mla localmla = new mla();
    localmla.a = paramString;
    localmlb.a = localmla;
    int i = jcq.a[paramjaj.ordinal()];
    int j = 0;
    switch (i)
    {
    }
    for (;;)
    {
      localmlb.b = j;
      mkz localmkz = new mkz();
      localmkz.a = new jdo(paramContext).a();
      localmkz.b = Integer.toString(efj.E(paramContext));
      jao localjao = (jao)mbb.b(paramContext, jao.class);
      if (localjao != null) {
        localmkz.c = localjao.a();
      }
      qqu localqqu = new qqu();
      localqqu.a = ((jaq)mbb.a(paramContext, jaq.class)).a();
      localqqu.c = localmlb;
      localqqu.b = localmkz;
      jdr.a(a, localqqu.toString());
      return localqqu;
      j = 1;
      continue;
      j = 2;
      continue;
      j = 3;
      continue;
      j = 4;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcp
 * JD-Core Version:    0.7.0.1
 */