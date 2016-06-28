public final class hxj
{
  public qdt a;
  public qdj b;
  
  public hxj(qdj paramqdj)
  {
    if (paramqdj == null) {
      throw new IllegalArgumentException("HoaPlusEventV2 cannot be null");
    }
    this.b = paramqdj;
  }
  
  public hxj(qdt paramqdt)
  {
    if (paramqdt == null) {
      throw new IllegalArgumentException("PlusEvent cannot be null");
    }
    this.a = paramqdt;
  }
  
  public final String a()
  {
    if (this.a != null) {
      return this.a.g;
    }
    return this.b.g;
  }
  
  public final void a(qdc paramqdc)
  {
    if (this.a != null)
    {
      if (this.a.h == null)
      {
        this.a.h = new qbe();
        this.a.h.a = new int[] { 406 };
      }
      this.a.h.a(qdc.a, paramqdc);
      return;
    }
    if (this.b.h == null)
    {
      this.b.h = new qbe();
      this.b.h.a = new int[] { 406 };
    }
    this.b.h.a(qdc.a, paramqdc);
  }
  
  public final String b()
  {
    if (this.a != null) {
      return this.a.b;
    }
    return this.b.b;
  }
  
  public final void b(qdc paramqdc)
  {
    if (this.a != null)
    {
      if (this.a.i == null)
      {
        this.a.i = new qbe();
        this.a.i.a = new int[] { 406 };
      }
      this.a.i.a(qdc.a, paramqdc);
      return;
    }
    if (this.b.i == null)
    {
      this.b.i = new qbe();
      this.b.i.a = new int[] { 406 };
    }
    this.b.i.a(qdc.a, paramqdc);
  }
  
  public final String c()
  {
    if (this.a != null) {
      return this.a.d;
    }
    return this.b.d;
  }
  
  public final byte[] d()
  {
    if (this.a != null) {
      return qat.a(this.a);
    }
    return qat.a(this.b);
  }
  
  public final String e()
  {
    if (this.a != null) {
      return this.a.e;
    }
    return this.b.e;
  }
  
  public final qdu f()
  {
    if (this.a != null) {
      return this.a.l;
    }
    return this.b.l;
  }
  
  public final boolean g()
  {
    if (this.a != null) {
      if (efj.b(this.a.k)) {}
    }
    while (!efj.b(this.b.k))
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final qdo h()
  {
    if ((this.a != null) && (this.a.j != null)) {
      return (qdo)this.a.j.b(qdo.a);
    }
    if ((this.b != null) && (this.b.j != null)) {
      return (qdo)this.b.j.b(qdo.a);
    }
    return null;
  }
  
  public final qdc i()
  {
    if ((this.a != null) && (this.a.h != null)) {
      return (qdc)this.a.h.b(qdc.a);
    }
    if ((this.b != null) && (this.b.h != null)) {
      return (qdc)this.b.h.b(qdc.a);
    }
    return null;
  }
  
  public final qdc j()
  {
    if ((this.a != null) && (this.a.i != null)) {
      return (qdc)this.a.i.b(qdc.a);
    }
    if ((this.b != null) && (this.b.i != null)) {
      return (qdc)this.b.i.b(qdc.a);
    }
    return null;
  }
  
  public final long k()
  {
    qdc localqdc = j();
    if ((localqdc == null) || (localqdc.b == null)) {
      return 7200000L + i().b.longValue();
    }
    return localqdc.b.longValue();
  }
  
  public final qdq l()
  {
    if ((this.a != null) && (this.a.f != null)) {
      return (qdq)this.a.f.b(qdq.a);
    }
    if ((this.b != null) && (this.b.f != null)) {
      return (qdq)this.b.f.b(qdq.a);
    }
    return null;
  }
  
  public final String m()
  {
    if (this.a != null) {
      return this.a.c;
    }
    return this.b.c;
  }
  
  public final String toString()
  {
    if (this.a != null) {
      return this.a.toString();
    }
    return this.b.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxj
 * JD-Core Version:    0.7.0.1
 */