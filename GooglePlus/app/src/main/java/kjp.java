import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kjp
{
  public llx a;
  qeg b;
  qei c;
  qcx d;
  public int e = -1;
  boolean f;
  private List<qdl> g = Collections.emptyList();
  
  public kjp(qcj paramqcj)
  {
    this.a = new llx(paramqcj);
  }
  
  public kjp(qcx paramqcx)
  {
    this.a = new llx(paramqcx);
    this.d = paramqcx;
    this.g = new ArrayList(paramqcx.f.length);
    for (int i = 0; i < paramqcx.f.length; i++)
    {
      this.g.add(paramqcx.f[i].b(qdl.a));
      if (TextUtils.equals(paramqcx.c, ((qdl)this.g.get(i)).c)) {
        this.e = i;
      }
    }
  }
  
  public kjp(qeg paramqeg)
  {
    this.a = new llx(paramqeg);
    this.b = paramqeg;
    this.g = new ArrayList(paramqeg.f.length);
    for (int i = 0; i < paramqeg.f.length; i++)
    {
      this.g.add(paramqeg.f[i].b(qdl.a));
      if (TextUtils.equals(paramqeg.c, ((qdl)this.g.get(i)).c)) {
        this.e = i;
      }
    }
  }
  
  public kjp(qeh paramqeh)
  {
    this.a = new llx(paramqeh);
  }
  
  public kjp(qei paramqei)
  {
    this.a = new llx(paramqei);
    this.c = paramqei;
    this.g = new ArrayList(paramqei.f.length);
    for (int i = 0; i < paramqei.f.length; i++)
    {
      this.g.add(paramqei.f[i].b(qdl.a));
      if (TextUtils.equals(paramqei.c, ((qdl)this.g.get(i)).c)) {
        this.e = i;
      }
    }
  }
  
  private static qbe c()
  {
    qbe localqbe = new qbe();
    localqbe.a = new int[] { 339, 338, 336, 335 };
    return localqbe;
  }
  
  public final boolean a()
  {
    return this.g.size() > 1;
  }
  
  public final void b()
  {
    if (!a()) {}
    label304:
    do
    {
      qdl localqdl;
      String str;
      do
      {
        return;
        this.f = true;
        if (this.e == -1 + this.g.size()) {}
        for (int i = -1;; i = 1 + this.e)
        {
          this.e = i;
          if (this.e < 0) {
            break label304;
          }
          localqdl = (qdl)this.g.get(this.e);
          str = localqdl.d.a;
          this.a.e = str;
          this.a.k = ((short)efj.a(localqdl.e));
          this.a.l = ((short)efj.a(localqdl.f));
          if (this.b == null) {
            break;
          }
          this.b.c = str;
          if (this.b.g == null) {
            this.b.g = c();
          }
          this.b.g.b = str;
          this.b.g.a(qdl.a, localqdl);
          return;
        }
        if (this.c != null)
        {
          this.c.c = str;
          if (this.c.g == null) {
            this.c.g = c();
          }
          this.c.g.b = str;
          this.c.g.a(qdl.a, localqdl);
          return;
        }
      } while (this.d == null);
      this.d.c = str;
      if (this.d.g == null) {
        this.d.g = c();
      }
      this.d.g.b = str;
      this.d.g.a(qdl.a, localqdl);
      return;
      this.a.e = "";
      this.a.k = 0;
      this.a.l = 0;
      if (this.b != null)
      {
        this.b.c = "";
        this.b.g = null;
        return;
      }
      if (this.c != null)
      {
        this.c.c = "";
        this.c.g = null;
        return;
      }
    } while (this.d == null);
    this.d.c = "";
    this.d.g = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjp
 * JD-Core Version:    0.7.0.1
 */