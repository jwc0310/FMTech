public final class kkv
{
  public kjp a;
  public lma b;
  public llu c;
  
  public kkv(kkt paramkkt)
  {
    if (paramkkt == null) {}
    label70:
    label369:
    for (;;)
    {
      return;
      qbe localqbe1 = paramkkt.a(null);
      qcy localqcy;
      String str;
      if (localqbe1 != null)
      {
        localqcy = (qcy)localqbe1.b(qcy.a);
        if ((localqcy != null) && (localqcy.c != null) && (localqcy.c.a != null))
        {
          qbk localqbk = localqcy.d;
          str = null;
          if (localqbk == null) {
            this.c = new llu(localqcy.c.a, localqcy.c.b, str);
          }
        }
      }
      for (qbe localqbe2 = localqcy.b;; localqbe2 = localqbe1)
      {
        if (localqbe2 == null) {
          break label369;
        }
        if (localqbe2.b(qei.a) != null)
        {
          this.a = new kjp((qei)localqbe2.b(qei.a));
          return;
          str = localqcy.d.a;
          break label70;
        }
        if (localqbe2.b(qcx.a) != null)
        {
          this.a = new kjp((qcx)localqbe2.b(qcx.a));
          return;
        }
        if (localqbe2.b(qeh.a) != null)
        {
          this.a = new kjp((qeh)localqbe2.b(qeh.a));
          return;
        }
        if (localqbe2.b(qdr.a) != null)
        {
          this.b = new lma((qdr)localqbe2.b(qdr.a));
          return;
        }
        if (localqbe2.b(qds.a) != null)
        {
          this.b = new lma((qds)localqbe2.b(qds.a));
          return;
        }
        if (localqbe2.b(qeg.a) != null)
        {
          this.a = new kjp((qeg)localqbe2.b(qeg.a));
          return;
        }
        if (localqbe2.b(qcj.a) != null)
        {
          this.a = new kjp((qcj)localqbe2.b(qcj.a));
          return;
        }
        if (localqbe2.b(qef.a) != null) {
          break;
        }
        efj.a(6, "PreviewEmbed", "Found an embed we don't understand without a THING!");
        return;
      }
    }
  }
  
  public final boolean a()
  {
    return (this.a != null) || (this.b != null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkv
 * JD-Core Version:    0.7.0.1
 */