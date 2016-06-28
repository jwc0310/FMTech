import android.os.Bundle;
import java.util.ArrayList;

final class abn
  extends aaj
{
  private final String a;
  private boolean b;
  private int c = -1;
  private int d;
  private abk e;
  private int f;
  
  public abn(abj paramabj, String paramString)
  {
    this.a = paramString;
  }
  
  public final void a()
  {
    abj localabj = this.g;
    localabj.l.remove(this);
    d();
    localabj.b();
  }
  
  public final void a(int paramInt)
  {
    this.b = false;
    if (this.e != null)
    {
      abk localabk = this.e;
      int i = this.f;
      Bundle localBundle = new Bundle();
      localBundle.putInt("unselectReason", paramInt);
      int j = localabk.c;
      localabk.c = (j + 1);
      localabk.a(6, j, i, null, localBundle);
    }
  }
  
  public final void a(abk paramabk)
  {
    this.e = paramabk;
    String str = this.a;
    int i = paramabk.d;
    paramabk.d = (i + 1);
    Bundle localBundle = new Bundle();
    localBundle.putString("routeId", str);
    int j = paramabk.c;
    paramabk.c = (j + 1);
    paramabk.a(3, j, i, null, localBundle);
    this.f = i;
    if (this.b)
    {
      paramabk.a(this.f);
      if (this.c >= 0)
      {
        paramabk.a(this.f, this.c);
        this.c = -1;
      }
      if (this.d != 0)
      {
        paramabk.b(this.f, this.d);
        this.d = 0;
      }
    }
  }
  
  public final void b()
  {
    this.b = true;
    if (this.e != null) {
      this.e.a(this.f);
    }
  }
  
  public final void b(int paramInt)
  {
    if (this.e != null)
    {
      this.e.a(this.f, paramInt);
      return;
    }
    this.c = paramInt;
    this.d = 0;
  }
  
  public final void c()
  {
    a(0);
  }
  
  public final void c(int paramInt)
  {
    if (this.e != null)
    {
      this.e.b(this.f, paramInt);
      return;
    }
    this.d = (paramInt + this.d);
  }
  
  public final void d()
  {
    if (this.e != null)
    {
      abk localabk = this.e;
      int i = this.f;
      int j = localabk.c;
      localabk.c = (j + 1);
      localabk.a(4, j, i, null, null);
      this.e = null;
      this.f = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abn
 * JD-Core Version:    0.7.0.1
 */