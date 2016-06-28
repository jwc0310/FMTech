import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.List;

public class mdt
  extends mek
{
  private mep c;
  private mep d;
  private mep e;
  private mep f;
  
  public mdt() {}
  
  public mdt(byte paramByte)
  {
    this();
  }
  
  public final void a()
  {
    this.e = a(new mdw(this));
  }
  
  public final void a(Intent paramIntent)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mdo)) {
        ((mdo)localmfd).a(paramIntent);
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    this.c = a(new mdu(this, paramBundle));
  }
  
  public void a(bk parambk)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mfk)) {
        ((mfk)localmfd).a(parambk);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    for (int i = 0; i < this.a.size(); i++) {
      this.a.get(i);
    }
  }
  
  public final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    for (int i = 0;; i++)
    {
      int j = this.a.size();
      boolean bool = false;
      if (i < j)
      {
        mfd localmfd = (mfd)this.a.get(i);
        if (((localmfd instanceof mdm)) && (((mdm)localmfd).a(paramInt))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public final boolean a(KeyEvent paramKeyEvent)
  {
    for (int i = 0;; i++)
    {
      int j = this.a.size();
      boolean bool = false;
      if (i < j)
      {
        mfd localmfd = (mfd)this.a.get(i);
        if (((localmfd instanceof mdh)) && (((mdh)localmfd).a(paramKeyEvent))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public final void b()
  {
    mep localmep = this.e;
    this.b.remove(localmep);
    super.b();
  }
  
  public final void b(Intent paramIntent)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mds)) {
        ((mds)localmfd).b(paramIntent);
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    this.d = a(new mdv(this, paramBundle));
  }
  
  public final boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    for (int i = 0;; i++)
    {
      int j = this.a.size();
      boolean bool = false;
      if (i < j)
      {
        mfd localmfd = (mfd)this.a.get(i);
        if (((localmfd instanceof mdn)) && (((mdn)localmfd).b(paramInt))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public final void c()
  {
    mep localmep1 = this.d;
    this.b.remove(localmep1);
    mep localmep2 = this.c;
    this.b.remove(localmep2);
    super.c();
  }
  
  public final void d()
  {
    this.f = a(new mdx(this));
  }
  
  @SuppressLint({"MissingSuperCall"})
  public final void e()
  {
    mep localmep = this.f;
    this.b.remove(localmep);
    for (int i = 0; i < this.a.size(); i++) {
      this.a.get(i);
    }
  }
  
  public final void f()
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mdr)) {
        ((mdr)localmfd).a();
      }
    }
  }
  
  public final void g()
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mdi)) {
        ((mdi)localmfd).d();
      }
    }
  }
  
  public final void h()
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mdk)) {
        ((mdk)localmfd).a();
      }
    }
  }
  
  public final void i()
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mdj)) {
        ((mdj)localmfd).b();
      }
    }
  }
  
  public final boolean j()
  {
    for (int i = 0;; i++)
    {
      int j = this.a.size();
      boolean bool = false;
      if (i < j)
      {
        mfd localmfd = (mfd)this.a.get(i);
        if (((localmfd instanceof mdl)) && (((mdl)localmfd).a())) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mdt
 * JD-Core Version:    0.7.0.1
 */