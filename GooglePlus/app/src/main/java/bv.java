import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class bv<E>
  extends bt
{
  final Activity a;
  final Context b;
  final Handler c;
  public final bz d = new bz();
  la<String, cv> e;
  cx f;
  boolean g;
  boolean h;
  private int i;
  
  private bv(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramContext;
    this.c = paramHandler;
    this.i = 0;
  }
  
  bv(bp parambp)
  {
    this(parambp, parambp, parambp.a, 0);
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  final cx a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e == null) {
      this.e = new la();
    }
    cx localcx = (cx)this.e.get(paramString);
    if (localcx == null)
    {
      if (paramBoolean2)
      {
        localcx = new cx(paramString, this, paramBoolean1);
        this.e.put(paramString, localcx);
      }
      return localcx;
    }
    localcx.g = this;
    return localcx;
  }
  
  void a(bk parambk) {}
  
  public void a(bk parambk, Intent paramIntent, int paramInt)
  {
    if (paramInt != -1) {
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    this.b.startActivity(paramIntent);
  }
  
  final void a(String paramString)
  {
    if (this.e != null)
    {
      cx localcx = (cx)this.e.get(paramString);
      if ((localcx != null) && (!localcx.f))
      {
        localcx.g();
        this.e.remove(paramString);
      }
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public boolean a()
  {
    return true;
  }
  
  public boolean b()
  {
    return true;
  }
  
  public LayoutInflater c()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }
  
  public void d() {}
  
  public boolean e()
  {
    return true;
  }
  
  public int f()
  {
    return this.i;
  }
  
  final la<String, cv> g()
  {
    int j = 0;
    int k;
    if (this.e != null)
    {
      int m = this.e.size();
      cx[] arrayOfcx = new cx[m];
      for (int n = m - 1; n >= 0; n--) {
        arrayOfcx[n] = ((cx)this.e.b[(1 + (n << 1))]);
      }
      k = 0;
      if (j < m)
      {
        cx localcx = arrayOfcx[j];
        if (localcx.f) {
          k = 1;
        }
        for (;;)
        {
          j++;
          break;
          localcx.g();
          this.e.remove(localcx.d);
        }
      }
    }
    else
    {
      k = 0;
    }
    if (k != 0) {
      return this.e;
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bv
 * JD-Core Version:    0.7.0.1
 */