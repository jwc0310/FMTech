import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class mek
{
  private static final Bundle d = new Bundle();
  public final List<mfd> a = new ArrayList();
  public final List<mep> b = new ArrayList();
  private HashSet<String> c = new HashSet();
  private mep e;
  private mep f;
  private mep g;
  private mep h;
  
  static String b(mfd parammfd)
  {
    boolean bool = parammfd instanceof mfa;
    String str = null;
    if (bool)
    {
      if ((parammfd instanceof mfe)) {
        str = ((mfe)parammfd).a();
      }
    }
    else {
      return str;
    }
    return parammfd.getClass().getName();
  }
  
  public final Bundle a(mfd parammfd, Bundle paramBundle)
  {
    Bundle localBundle = null;
    if (paramBundle != null)
    {
      String str = b(parammfd);
      if (str != null) {
        localBundle = paramBundle.getBundle(str);
      }
    }
    else
    {
      return localBundle;
    }
    return d;
  }
  
  public final mep a(mep parammep)
  {
    for (int i = 0; i < this.a.size(); i++) {
      parammep.a((mfd)this.a.get(i));
    }
    this.b.add(parammep);
    return parammep;
  }
  
  public final <T extends mfd> T a(T paramT)
  {
    String str = b(paramT);
    if (str != null)
    {
      if (this.c.contains(str)) {
        throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[] { str }));
      }
      this.c.add(str);
    }
    this.a.add(paramT);
    for (int i = 0; i < this.b.size(); i++) {
      ((mep)this.b.get(i)).a(paramT);
    }
    return paramT;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof meq)) {
        ((meq)localmfd).a(paramInt1, paramInt2, paramIntent);
      }
    }
  }
  
  public final void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mey)) {
        ((mey)localmfd).a(paramInt, paramArrayOfString, paramArrayOfInt);
      }
    }
  }
  
  public final void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public final boolean a(Menu paramMenu)
  {
    Iterator localIterator = this.a.iterator();
    boolean bool1 = false;
    mfd localmfd;
    if (localIterator.hasNext())
    {
      localmfd = (mfd)localIterator.next();
      if (!(localmfd instanceof met)) {
        break label63;
      }
    }
    label63:
    for (boolean bool2 = bool1 | ((met)localmfd).a(paramMenu);; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      return bool1;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      mfd localmfd = (mfd)localIterator.next();
      if (((localmfd instanceof mer)) && (((mer)localmfd).a())) {
        return true;
      }
    }
    return false;
  }
  
  public void b()
  {
    mep localmep = this.g;
    this.b.remove(localmep);
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mew)) {
        ((mew)localmfd).c();
      }
    }
  }
  
  public final boolean b(Menu paramMenu)
  {
    Iterator localIterator = this.a.iterator();
    boolean bool1 = false;
    if (localIterator.hasNext()) {
      if (!((mfd)localIterator.next() instanceof mex)) {
        break label49;
      }
    }
    label49:
    for (boolean bool2 = bool1 | true;; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      return bool1;
    }
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      mfd localmfd = (mfd)localIterator.next();
      if (((localmfd instanceof mev)) && (((mev)localmfd).a(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void c()
  {
    mep localmep1 = this.h;
    this.b.remove(localmep1);
    mep localmep2 = this.e;
    this.b.remove(localmep2);
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof meu)) {
        ((meu)localmfd).m_();
      }
    }
  }
  
  public final void c(Bundle paramBundle)
  {
    this.e = a(new mel(this, paramBundle));
  }
  
  public final void d(Bundle paramBundle)
  {
    this.h = a(new meo(this, paramBundle));
  }
  
  public final void k()
  {
    this.f = a(new mem(this));
  }
  
  public final void l()
  {
    this.g = a(new men(this));
  }
  
  public final void m()
  {
    mep localmep = this.f;
    this.b.remove(localmep);
    for (int i = 0; i < this.a.size(); i++)
    {
      mfd localmfd = (mfd)this.a.get(i);
      if ((localmfd instanceof mfc)) {
        ((mfc)localmfd).aK_();
      }
    }
  }
  
  public final void n()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mek
 * JD-Core Version:    0.7.0.1
 */