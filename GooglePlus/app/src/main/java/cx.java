import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class cx
  extends cv
{
  public static boolean a = false;
  final lb<cy> b = new lb();
  final lb<cy> c = new lb();
  final String d;
  boolean e;
  boolean f;
  bv g;
  private boolean h;
  
  cx(String paramString, bv parambv, boolean paramBoolean)
  {
    this.d = paramString;
    this.g = parambv;
    this.e = paramBoolean;
  }
  
  private final cy c(int paramInt, Bundle paramBundle, cw<Object> paramcw)
  {
    cy localcy = new cy(this, paramInt, paramBundle, paramcw);
    localcy.c = paramcw.a(paramInt, paramBundle);
    return localcy;
  }
  
  private final cy d(int paramInt, Bundle paramBundle, cw<Object> paramcw)
  {
    try
    {
      this.h = true;
      cy localcy = c(paramInt, paramBundle, paramcw);
      a(localcy);
      return localcy;
    }
    finally
    {
      this.h = false;
    }
  }
  
  public final <D> fu<D> a(int paramInt, Bundle paramBundle, cw<D> paramcw)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    lb locallb = this.b;
    int i = kn.a(locallb.c, locallb.e, paramInt);
    Object localObject;
    cy localcy;
    if ((i < 0) || (locallb.d[i] == lb.a))
    {
      localObject = null;
      localcy = (cy)localObject;
      if (a) {
        new StringBuilder("initLoader in ").append(this).append(": args=").append(paramBundle);
      }
      if (localcy != null) {
        break label181;
      }
      localcy = d(paramInt, paramBundle, paramcw);
      if (a) {
        new StringBuilder("  Created new loader ").append(localcy);
      }
    }
    for (;;)
    {
      if ((localcy.d) && (this.e)) {
        localcy.b(localcy.c, localcy.f);
      }
      return localcy.c;
      localObject = locallb.d[i];
      break;
      label181:
      if (a) {
        new StringBuilder("  Re-using existing loader ").append(localcy);
      }
      localcy.b = paramcw;
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (a) {
      new StringBuilder("destroyLoader in ").append(this).append(" of ").append(paramInt);
    }
    int i = this.b.f(paramInt);
    if (i >= 0)
    {
      cy localcy2 = (cy)this.b.e(i);
      this.b.c(i);
      localcy2.c();
    }
    int j = this.c.f(paramInt);
    if (j >= 0)
    {
      cy localcy1 = (cy)this.c.e(j);
      this.c.c(j);
      localcy1.c();
    }
    if ((this.g != null) && (!a())) {
      this.g.d.h();
    }
  }
  
  final void a(cy paramcy)
  {
    this.b.a(paramcy.a, paramcy);
    if (this.e) {
      paramcy.a();
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    lb locallb1 = this.b;
    if (locallb1.b) {
      locallb1.a();
    }
    if (locallb1.e > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0;; j++)
      {
        lb locallb4 = this.b;
        if (locallb4.b) {
          locallb4.a();
        }
        if (j >= locallb4.e) {
          break;
        }
        cy localcy2 = (cy)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localcy2.toString());
        localcy2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    lb locallb2 = this.c;
    if (locallb2.b) {
      locallb2.a();
    }
    if (locallb2.e > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      for (;;)
      {
        lb locallb3 = this.c;
        if (locallb3.b) {
          locallb3.a();
        }
        if (i >= locallb3.e) {
          break;
        }
        cy localcy1 = (cy)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localcy1.toString());
        localcy1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }
  
  public final boolean a()
  {
    lb locallb = this.b;
    if (locallb.b) {
      locallb.a();
    }
    int i = locallb.e;
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      cy localcy = (cy)this.b.e(j);
      if ((localcy.g) && (!localcy.e)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }
  
  public final <D> fu<D> b(int paramInt)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    lb locallb = this.b;
    int i = kn.a(locallb.c, locallb.e, paramInt);
    if ((i < 0) || (locallb.d[i] == lb.a)) {}
    cy localcy;
    for (Object localObject = null;; localObject = locallb.d[i])
    {
      localcy = (cy)localObject;
      fu localfu = null;
      if (localcy != null)
      {
        if (localcy.l == null) {
          break;
        }
        localfu = localcy.l.c;
      }
      return localfu;
    }
    return localcy.c;
  }
  
  public final <D> fu<D> b(int paramInt, Bundle paramBundle, cw<D> paramcw)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    lb locallb1 = this.b;
    int i = kn.a(locallb1.c, locallb1.e, paramInt);
    Object localObject1;
    cy localcy1;
    lb locallb2;
    int j;
    Object localObject2;
    if ((i < 0) || (locallb1.d[i] == lb.a))
    {
      localObject1 = null;
      localcy1 = (cy)localObject1;
      if (a) {
        new StringBuilder("restartLoader in ").append(this).append(": args=").append(paramBundle);
      }
      if (localcy1 != null)
      {
        locallb2 = this.c;
        j = kn.a(locallb2.c, locallb2.e, paramInt);
        if ((j >= 0) && (locallb2.d[j] != lb.a)) {
          break label250;
        }
        localObject2 = null;
        label146:
        cy localcy2 = (cy)localObject2;
        if (localcy2 == null) {
          break label416;
        }
        if (!localcy1.d) {
          break label263;
        }
        if (a) {
          new StringBuilder("  Removing last inactive loader: ").append(localcy1);
        }
        localcy2.e = false;
        localcy2.c();
      }
    }
    for (;;)
    {
      fu localfu = localcy1.c;
      localfu.n = true;
      localfu.l();
      this.c.a(paramInt, localcy1);
      for (;;)
      {
        return d(paramInt, paramBundle, paramcw).c;
        localObject1 = locallb1.d[i];
        break;
        label250:
        localObject2 = locallb2.d[j];
        break label146;
        label263:
        if (localcy1.g) {
          break label288;
        }
        this.b.a(paramInt, null);
        localcy1.c();
      }
      label288:
      if (a) {
        new StringBuilder("  Canceling: ").append(localcy1);
      }
      if ((localcy1.g) && (localcy1.c != null) && (localcy1.k) && (!localcy1.c.k())) {
        localcy1.d();
      }
      if (localcy1.l != null)
      {
        if (a) {
          new StringBuilder("  Removing pending loader: ").append(localcy1.l);
        }
        localcy1.l.c();
        localcy1.l = null;
      }
      localcy1.l = c(paramInt, paramBundle, paramcw);
      return localcy1.l.c;
      label416:
      if (a) {
        new StringBuilder("  Making last loader inactive: ").append(localcy1);
      }
    }
  }
  
  final void b()
  {
    if (a) {
      new StringBuilder("Starting in ").append(this);
    }
    if (this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStart when already started: ").append(this);
    }
    for (;;)
    {
      return;
      this.e = true;
      lb locallb = this.b;
      if (locallb.b) {
        locallb.a();
      }
      for (int i = -1 + locallb.e; i >= 0; i--) {
        ((cy)this.b.e(i)).a();
      }
    }
  }
  
  final void c()
  {
    if (a) {
      new StringBuilder("Stopping in ").append(this);
    }
    if (!this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStop when not started: ").append(this);
      return;
    }
    lb locallb = this.b;
    if (locallb.b) {
      locallb.a();
    }
    for (int i = -1 + locallb.e; i >= 0; i--) {
      ((cy)this.b.e(i)).b();
    }
    this.e = false;
  }
  
  final void d()
  {
    if (a) {
      new StringBuilder("Retaining in ").append(this);
    }
    if (!this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doRetain when not started: ").append(this);
    }
    for (;;)
    {
      return;
      this.f = true;
      this.e = false;
      lb locallb = this.b;
      if (locallb.b) {
        locallb.a();
      }
      for (int i = -1 + locallb.e; i >= 0; i--)
      {
        cy localcy = (cy)this.b.e(i);
        if (a) {
          new StringBuilder("  Retaining: ").append(localcy);
        }
        localcy.h = true;
        localcy.i = localcy.g;
        localcy.g = false;
        localcy.b = null;
      }
    }
  }
  
  final void e()
  {
    lb locallb = this.b;
    if (locallb.b) {
      locallb.a();
    }
    for (int i = -1 + locallb.e; i >= 0; i--) {
      ((cy)this.b.e(i)).j = true;
    }
  }
  
  final void f()
  {
    lb locallb = this.b;
    if (locallb.b) {
      locallb.a();
    }
    for (int i = -1 + locallb.e; i >= 0; i--)
    {
      cy localcy = (cy)this.b.e(i);
      if ((localcy.g) && (localcy.j))
      {
        localcy.j = false;
        if (localcy.d) {
          localcy.b(localcy.c, localcy.f);
        }
      }
    }
  }
  
  final void g()
  {
    if (!this.f)
    {
      if (a) {
        new StringBuilder("Destroying Active in ").append(this);
      }
      lb locallb2 = this.b;
      if (locallb2.b) {
        locallb2.a();
      }
      for (int j = -1 + locallb2.e; j >= 0; j--) {
        ((cy)this.b.e(j)).c();
      }
      this.b.c();
    }
    if (a) {
      new StringBuilder("Destroying Inactive in ").append(this);
    }
    lb locallb1 = this.c;
    if (locallb1.b) {
      locallb1.a();
    }
    for (int i = -1 + locallb1.e; i >= 0; i--) {
      ((cy)this.c.e(i)).c();
    }
    this.c.c();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    efj.a(this.g, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cx
 * JD-Core Version:    0.7.0.1
 */