import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class cy
  implements fw<Object>, fx<Object>
{
  final int a;
  cw<Object> b;
  fu<Object> c;
  boolean d;
  boolean e;
  Object f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  cy l;
  private Bundle m;
  private boolean n;
  
  public cy(int paramInt, Bundle paramBundle, cw<Object> paramcw)
  {
    this.a = paramBundle;
    this.m = paramcw;
    Object localObject;
    this.b = localObject;
  }
  
  final void a()
  {
    if ((this.h) && (this.i)) {
      this.g = true;
    }
    do
    {
      do
      {
        return;
      } while (this.g);
      this.g = true;
      if (cx.a) {
        new StringBuilder("  Starting: ").append(this);
      }
      if ((this.c == null) && (this.b != null)) {
        this.c = this.b.a(this.a, this.m);
      }
    } while (this.c == null);
    if ((this.c.getClass().isMemberClass()) && (!Modifier.isStatic(this.c.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.c);
    }
    if (!this.k)
    {
      fu localfu1 = this.c;
      int i1 = this.a;
      if (localfu1.j != null) {
        throw new IllegalStateException("There is already a listener registered");
      }
      localfu1.j = this;
      localfu1.i = i1;
      fu localfu2 = this.c;
      if (localfu2.k != null) {
        throw new IllegalStateException("There is already a listener registered");
      }
      localfu2.k = this;
      this.k = true;
    }
    this.c.j();
  }
  
  public final void a(fu<Object> paramfu, Object paramObject)
  {
    if (cx.a) {
      new StringBuilder("onLoadComplete: ").append(this);
    }
    if (this.n) {}
    for (;;)
    {
      return;
      lb locallb1 = this.o.b;
      int i1 = this.a;
      int i2 = kn.a(locallb1.c, locallb1.e, i1);
      if ((i2 < 0) || (locallb1.d[i2] == lb.a)) {}
      for (Object localObject1 = null; localObject1 == this; localObject1 = locallb1.d[i2])
      {
        cy localcy1 = this.l;
        if (localcy1 == null) {
          break label162;
        }
        if (cx.a) {
          new StringBuilder("  Switching to pending loader: ").append(localcy1);
        }
        this.l = null;
        this.o.b.a(this.a, null);
        c();
        this.o.a(localcy1);
        return;
      }
    }
    label162:
    if ((this.f != paramObject) || (!this.d))
    {
      this.f = paramObject;
      this.d = true;
      if (this.g) {
        b(paramfu, paramObject);
      }
    }
    lb locallb2 = this.o.c;
    int i3 = this.a;
    int i4 = kn.a(locallb2.c, locallb2.e, i3);
    Object localObject2 = null;
    if (i4 >= 0)
    {
      Object localObject3 = locallb2.d[i4];
      Object localObject4 = lb.a;
      localObject2 = null;
      if (localObject3 != localObject4) {
        break label396;
      }
    }
    for (;;)
    {
      cy localcy2 = (cy)localObject2;
      if ((localcy2 != null) && (localcy2 != this))
      {
        localcy2.e = false;
        localcy2.c();
        lb locallb3 = this.o.c;
        int i5 = this.a;
        int i6 = kn.a(locallb3.c, locallb3.e, i5);
        if ((i6 >= 0) && (locallb3.d[i6] != lb.a))
        {
          locallb3.d[i6] = lb.a;
          locallb3.b = true;
        }
      }
      if ((this.o.g == null) || (this.o.a())) {
        break;
      }
      this.o.g.d.h();
      return;
      label396:
      localObject2 = locallb2.d[i4];
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (;;)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.m);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(this.b);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.c);
      if (this.c != null) {
        this.c.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      if ((this.d) || (this.e))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(this.d);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(this.e);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(this.f);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.g);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.n);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(this.k);
      if (this.l == null) {
        break;
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.l);
      paramPrintWriter.println(":");
      this = this.l;
      paramString = paramString + "  ";
    }
  }
  
  final void b()
  {
    if (cx.a) {
      new StringBuilder("  Stopping: ").append(this);
    }
    this.g = false;
    if ((!this.h) && (this.c != null) && (this.k))
    {
      this.k = false;
      this.c.a(this);
      this.c.a(this);
      fu localfu = this.c;
      localfu.m = false;
      localfu.h();
    }
  }
  
  final void b(fu<Object> paramfu, Object paramObject)
  {
    String str2;
    if (this.b != null)
    {
      if (this.o.g == null) {
        break label186;
      }
      str2 = this.o.g.d.k;
      this.o.g.d.k = "onLoadFinished";
    }
    label186:
    for (String str1 = str2;; str1 = null) {
      try
      {
        if (cx.a)
        {
          StringBuilder localStringBuilder1 = new StringBuilder("  onLoadFinished in ").append(paramfu).append(": ");
          StringBuilder localStringBuilder2 = new StringBuilder(64);
          efj.a(paramObject, localStringBuilder2);
          localStringBuilder2.append("}");
          localStringBuilder1.append(localStringBuilder2.toString());
        }
        this.b.a(paramfu, paramObject);
        if (this.o.g != null) {
          this.o.g.d.k = str1;
        }
        this.e = true;
        return;
      }
      finally
      {
        if (this.o.g != null) {
          this.o.g.d.k = str1;
        }
      }
    }
  }
  
  final void c()
  {
    if (cx.a) {
      new StringBuilder("  Destroying: ").append(this);
    }
    this.n = true;
    boolean bool = this.e;
    this.e = false;
    String str1;
    if ((this.b != null) && (this.c != null) && (this.d) && (bool))
    {
      if (cx.a) {
        new StringBuilder("  Reseting: ").append(this);
      }
      if (this.o.g == null) {
        break label292;
      }
      String str2 = this.o.g.d.k;
      this.o.g.d.k = "onLoaderReset";
      str1 = str2;
    }
    for (;;)
    {
      label292:
      try
      {
        this.b.a(this.c);
        if (this.o.g != null) {
          this.o.g.d.k = str1;
        }
        this.b = null;
        this.f = null;
        this.d = false;
        if (this.c != null)
        {
          if (this.k)
          {
            this.k = false;
            this.c.a(this);
            this.c.a(this);
          }
          fu localfu = this.c;
          localfu.i();
          localfu.o = true;
          localfu.m = false;
          localfu.n = false;
          localfu.p = false;
          localfu.q = false;
        }
        if (this.l != null) {
          this = this.l;
        }
      }
      finally
      {
        if (this.o.g != null) {
          this.o.g.d.k = str1;
        }
      }
    }
  }
  
  public final void d()
  {
    if (cx.a) {
      new StringBuilder("onLoadCanceled: ").append(this);
    }
    if (this.n) {}
    label155:
    for (;;)
    {
      return;
      lb locallb = this.o.b;
      int i1 = this.a;
      int i2 = kn.a(locallb.c, locallb.e, i1);
      if ((i2 < 0) || (locallb.d[i2] == lb.a)) {}
      for (Object localObject = null;; localObject = locallb.d[i2])
      {
        if (localObject != this) {
          break label155;
        }
        cy localcy = this.l;
        if (localcy == null) {
          break;
        }
        if (cx.a) {
          new StringBuilder("  Switching to pending loader: ").append(localcy);
        }
        this.l = null;
        this.o.b.a(this.a, null);
        c();
        this.o.a(localcy);
        return;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    efj.a(this.c, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cy
 * JD-Core Version:    0.7.0.1
 */