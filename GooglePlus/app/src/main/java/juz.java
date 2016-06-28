import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

public class juz
{
  final ArrayList<juw> a = new ArrayList();
  final int b;
  boolean c;
  ArrayList<jux> d = new ArrayList(2);
  String e;
  long f = 0L;
  final Context g;
  boolean h = true;
  
  juz(Context paramContext, int paramInt)
  {
    this.g = paramContext;
    this.b = paramInt;
  }
  
  public jux a(int paramInt)
  {
    if (paramInt < this.d.size()) {
      return (jux)this.d.get(paramInt);
    }
    return null;
  }
  
  public void a()
  {
    o();
  }
  
  public void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      this.d = new ArrayList(2);
      for (int i = 0; i < 2; i++) {
        this.d.add(new jux());
      }
    }
    this.d = paramBundle.getParcelableArrayList("OPTIONS");
    this.c = paramBundle.getBoolean("HAS_POLL");
    this.e = paramBundle.getString("QUESTION");
    this.h = paramBundle.getBoolean("IMG1_HEADER_CANDIDATE");
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      jux localjux = (jux)localIterator.next();
      if (localjux != null) {
        localjux.b = this;
      }
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    this.e = paramString;
    if (paramBoolean) {
      p();
    }
  }
  
  public void a(juw paramjuw)
  {
    this.a.add(paramjuw);
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
    q();
  }
  
  public void b()
  {
    p();
  }
  
  public void b(int paramInt)
  {
    if (this.d.size() == 2) {
      throw new IllegalStateException("Must have at least 2 options");
    }
    int i = this.d.size();
    if ((!l()) && (i > 2) && (paramInt == 0))
    {
      jux localjux = (jux)this.d.get(paramInt);
      ((jux)this.d.get(1)).a(this.g, localjux.a(), localjux.b(), false);
    }
    this.d.remove(paramInt);
    if ((c() == 2) && (((jux)this.d.get(0)).a() == null) && (((jux)this.d.get(1)).a() != null))
    {
      m();
      b(true);
    }
    e(i);
  }
  
  public void b(Bundle paramBundle)
  {
    paramBundle.putParcelableArrayList("OPTIONS", this.d);
    paramBundle.putBoolean("HAS_POLL", this.c);
    paramBundle.putString("QUESTION", this.e);
    paramBundle.putBoolean("IMG1_HEADER_CANDIDATE", this.h);
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public int c()
  {
    return this.d.size();
  }
  
  void c(int paramInt)
  {
    Toast.makeText(this.g, paramInt, 0).show();
  }
  
  boolean c(boolean paramBoolean)
  {
    boolean bool = l();
    int i = c();
    if (i < 2) {
      return false;
    }
    label45:
    label110:
    label116:
    for (int j = 0;; j++)
    {
      if (j >= i) {
        break label122;
      }
      jux localjux = a(j);
      int k;
      if (j == i - 1)
      {
        k = 1;
        if ((!TextUtils.isEmpty(localjux.a)) || (localjux.a() != null)) {
          break label110;
        }
      }
      for (int m = 1;; m = 0)
      {
        if (((m != 0) && (k != 0) && (i > 2)) || (localjux.a(bool))) {
          break label116;
        }
        if (!paramBoolean) {
          break;
        }
        c(eyg.aD);
        return false;
        k = 0;
        break label45;
      }
    }
    label122:
    return true;
  }
  
  public boolean d()
  {
    return this.c;
  }
  
  public boolean d(int paramInt)
  {
    if ((paramInt & 0x2) != 0) {}
    for (boolean bool = true;; bool = false) {
      return c(bool);
    }
  }
  
  void e(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((juw)localIterator.next()).a(paramInt);
    }
  }
  
  public boolean e()
  {
    if (!TextUtils.isEmpty(this.e)) {
      return true;
    }
    int i = this.d.size();
    for (int j = 0; j < i; j++)
    {
      if (!TextUtils.isEmpty(((jux)this.d.get(j)).a)) {
        return true;
      }
      if (((jux)this.d.get(j)).a() != null) {
        return true;
      }
    }
    return false;
  }
  
  public void f()
  {
    this.e = null;
    ArrayList localArrayList = new ArrayList();
    int i = this.d.size();
    for (int j = 0; j < i; j++)
    {
      ((jux)this.d.get(j)).a(null);
      ((jux)this.d.get(j)).a(this.g, null, null, false);
      if (j >= 2) {
        localArrayList.add(this.d.get(j));
      }
    }
    int k = localArrayList.size();
    for (int m = 0; m < k; m++) {
      this.d.remove(localArrayList.get(m));
    }
  }
  
  public String g()
  {
    return this.e;
  }
  
  public jux h()
  {
    if (this.d.size() >= j())
    {
      long l = j();
      throw new IllegalStateException(42 + "Cannot exceed " + l + " options");
    }
    jux localjux = new jux();
    localjux.b = this;
    int i = this.d.size();
    this.d.add(localjux);
    e(i);
    return localjux;
  }
  
  public ArrayList<jux> i()
  {
    return this.d;
  }
  
  public long j()
  {
    if (this.f == 0L) {
      this.f = ((hyi)mbb.a(this.g, hyi.class)).c(jwq.a, this.b).longValue();
    }
    return this.f;
  }
  
  public boolean k()
  {
    int i = this.d.size();
    for (int j = 0; j < i; j++) {
      if (((jux)this.d.get(j)).a() != null) {
        return true;
      }
    }
    return false;
  }
  
  public boolean l()
  {
    if ((!this.h) && (((jux)this.d.get(0)).a() != null)) {
      return true;
    }
    for (int i = 1;; i++)
    {
      if (i >= this.d.size()) {
        break label62;
      }
      if (((jux)this.d.get(i)).a() != null) {
        break;
      }
    }
    label62:
    return false;
  }
  
  public void m()
  {
    if (((jux)this.d.get(0)).a() != null) {}
    int j;
    label63:
    do
    {
      return;
      int i = 1;
      j = -1;
      for (;;)
      {
        if (i >= this.d.size()) {
          break label63;
        }
        if (((jux)this.d.get(i)).a() != null)
        {
          if (j != -1) {
            break;
          }
          j = i;
        }
        i++;
      }
    } while (j == -1);
    jux localjux = (jux)this.d.get(j);
    ((jux)this.d.get(0)).a(this.g, localjux.a(), localjux.b(), false);
    localjux.a(this.g, null, null, false);
  }
  
  public boolean n()
  {
    if (!d()) {}
    while (this.d.size() >= j()) {
      return false;
    }
    return this.d.size() > 2;
  }
  
  void o()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((juw)localIterator.next()).a();
    }
  }
  
  void p()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((juw)localIterator.next()).b();
    }
  }
  
  void q()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((juw)localIterator.next()).c();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     juz
 * JD-Core Version:    0.7.0.1
 */