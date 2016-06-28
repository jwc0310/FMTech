import java.util.ArrayList;

public final class kgy
  implements ljb
{
  public final void a(qzz paramqzz, ljc paramljc)
  {
    Object localObject = paramqzz.b(qvv.c);
    if (localObject == null) {
      throw new NullPointerException();
    }
    qvv localqvv = (qvv)localObject;
    pyg localpyg = (pyg)localqvv.l();
    int i = localqvv.a.size();
    for (int j = 0; j < i; j++)
    {
      qzz localqzz = (qzz)localqvv.a.get(j);
      pye localpye2 = (pye)((rab)qzz.d.l()).o(localqzz.c).a(rac.b).e();
      if (!localpye2.ao_()) {
        throw new pzr();
      }
      localpyg.a(j, (qzz)localpye2);
      String str1 = paramqzz.c;
      String str2 = localqzz.c;
      paramljc.c.add(new kx(str1, str2));
      paramljc.a(localqzz);
    }
    rab localrab = (rab)paramqzz.l();
    pyl localpyl = qvv.c;
    pye localpye1 = (pye)localpyg.e();
    if (!localpye1.ao_()) {
      throw new pzr();
    }
    paramljc.a((rab)localrab.a(localpyl, (pye)localpye1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgy
 * JD-Core Version:    0.7.0.1
 */