public class jtz
  implements Runnable
{
  public nuc a;
  public boolean b;
  
  public jtz(jwe paramjwe) {}
  
  public void a(nuc paramnuc)
  {
    synchronized (this.c.k)
    {
      this.a = paramnuc;
      this.b = true;
      return;
    }
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public void run()
  {
    for (;;)
    {
      jxg localjxg;
      int k;
      synchronized (this.c.k)
      {
        localjxg = (jxg)this.c.c();
        if ((!this.b) || (this.a == null) || (localjxg.w)) {
          return;
        }
        long l1 = efj.a(this.a.b);
        if (l1 == this.c.c.e) {
          break label295;
        }
        this.c.c.e = Math.max(0L, l1);
        i = 1;
        break label301;
        if (j < this.a.a.length)
        {
          nug localnug = this.a.a[j].c;
          if (localnug == null) {
            break label313;
          }
          l2 = localnug.a.longValue();
          long l3 = efj.a(Long.valueOf(l2));
          llz localllz = this.c.c.h[j];
          if (l3 == localllz.c) {
            break label307;
          }
          localllz.c = Math.max(0L, l3);
          i = 1;
          break label307;
        }
        if (i != 0)
        {
          this.c.j().b(this.c.b);
          localjxg.a(this.c.c);
          boolean bool = localjxg.c.e < 0L;
          k = 0;
          if (!bool) {
            localjxg.j();
          }
        }
        else
        {
          this.b = false;
          return;
        }
      }
      while (k < localjxg.y)
      {
        localjxg.b(k);
        localjxg.c(k);
        k++;
      }
      localjxg.k();
      continue;
      label295:
      int i = 0;
      label301:
      int j = 0;
      continue;
      label307:
      j++;
      continue;
      label313:
      long l2 = 0L;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jtz
 * JD-Core Version:    0.7.0.1
 */