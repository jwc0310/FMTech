final class bsc
{
  public final String a;
  public final String b;
  public final okn[] c;
  public final pre[] d;
  public final ojv e;
  
  public bsc(bjr parambjr)
  {
    this.a = parambjr.a.a;
    this.b = parambjr.a.b;
    okn[] arrayOfokn;
    ojv localojv;
    if (parambjr.a.c != null)
    {
      arrayOfokn = parambjr.a.c;
      this.c = arrayOfokn;
      if ((parambjr.a.d != null) && (parambjr.a.d.length != 0)) {
        break label111;
      }
      localojv = null;
      label72:
      this.e = localojv;
      if (parambjr.a.e == null) {
        break label124;
      }
    }
    label111:
    label124:
    for (pre[] arrayOfpre = parambjr.a.e;; arrayOfpre = new pre[0])
    {
      this.d = arrayOfpre;
      return;
      arrayOfokn = new okn[0];
      break;
      localojv = parambjr.a.d[0];
      break label72;
    }
  }
  
  public bsc(bjs parambjs)
  {
    this.a = parambjs.a.a;
    this.b = parambjs.a.b;
    okn[] arrayOfokn;
    if (parambjs.a.c != null)
    {
      arrayOfokn = parambjs.a.c;
      this.c = arrayOfokn;
      if ((parambjs.a.d != null) && (parambjs.a.d.length != 0)) {
        break label94;
      }
    }
    label94:
    for (ojv localojv = null;; localojv = parambjs.a.d[0])
    {
      this.e = localojv;
      this.d = new pre[0];
      return;
      arrayOfokn = new okn[0];
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsc
 * JD-Core Version:    0.7.0.1
 */