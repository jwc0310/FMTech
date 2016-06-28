public final class kdb
{
  public mgj a;
  
  public kdb(byte[] paramArrayOfByte)
  {
    this.a = ((mgi)qat.b(new mgi(), paramArrayOfByte, 0, paramArrayOfByte.length)).a;
  }
  
  public final String a()
  {
    if ((this.a != null) && (this.a.c != null)) {
      for (int i = 0; i < this.a.c.length; i++)
      {
        mgk localmgk = this.a.c[i];
        if (localmgk.c != null) {
          return localmgk.c;
        }
      }
    }
    return null;
  }
  
  public final String b()
  {
    if ((this.a != null) && (this.a.c != null)) {
      for (int i = 0; i < this.a.c.length; i++)
      {
        mgk localmgk = this.a.c[i];
        if (localmgk.b != null) {
          return localmgk.b;
        }
      }
    }
    return null;
  }
  
  public final String c()
  {
    if (this.a != null)
    {
      if (this.a.b != null) {
        return this.a.b;
      }
      if (this.a.c != null) {
        for (int i = 0; i < this.a.c.length; i++)
        {
          mgk localmgk = this.a.c[i];
          if (localmgk.a != null) {
            return localmgk.a;
          }
        }
      }
    }
    return null;
  }
  
  public final String d()
  {
    if ((this.a != null) && (this.a.c != null)) {
      for (int i = 0; i < this.a.c.length; i++)
      {
        mgk localmgk = this.a.c[i];
        if (localmgk.d != null) {
          return localmgk.d;
        }
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdb
 * JD-Core Version:    0.7.0.1
 */