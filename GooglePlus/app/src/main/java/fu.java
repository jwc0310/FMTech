import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class fu<D>
{
  public int i;
  public fx<D> j;
  public fw<D> k;
  public Context l;
  public boolean m = false;
  public boolean n = false;
  public boolean o = true;
  public boolean p = false;
  public boolean q = false;
  
  public fu(Context paramContext)
  {
    this.l = paramContext.getApplicationContext();
  }
  
  public void a() {}
  
  public final void a(fw<D> paramfw)
  {
    if (this.k == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.k != paramfw) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.k = null;
  }
  
  public final void a(fx<D> paramfx)
  {
    if (this.j == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.j != paramfx) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.j = null;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.j);
    if ((this.m) || (this.p) || (this.q))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.m);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.q);
    }
    if ((this.n) || (this.o))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.o);
    }
  }
  
  public void b(D paramD)
  {
    if (this.j != null) {
      this.j.a(this, paramD);
    }
  }
  
  protected boolean b()
  {
    return false;
  }
  
  public void g() {}
  
  public void h() {}
  
  public void i() {}
  
  public final void j()
  {
    this.m = true;
    this.o = false;
    this.n = false;
    g();
  }
  
  public boolean k()
  {
    return b();
  }
  
  public void l() {}
  
  public final boolean m()
  {
    boolean bool = this.p;
    this.p = false;
    this.q = (bool | this.q);
    return bool;
  }
  
  public final void n()
  {
    if (this.m)
    {
      a();
      return;
    }
    this.p = true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    efj.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fu
 * JD-Core Version:    0.7.0.1
 */