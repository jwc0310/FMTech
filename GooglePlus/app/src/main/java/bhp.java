import android.content.Intent;
import android.os.Bundle;

public final class bhp
{
  public final bp a;
  public final int b;
  
  public bhp(bp parambp, int paramInt)
  {
    this.a = parambp;
    this.b = paramInt;
  }
  
  public final void a(bk parambk)
  {
    int i = this.b;
    Object localObject = this.a.getIntent().getExtras();
    Bundle localBundle1 = parambk.m;
    if (localBundle1 == null) {
      if (localObject == null) {
        localObject = new Bundle();
      }
    }
    for (;;)
    {
      parambk.f((Bundle)localObject);
      bz localbz = this.a.b.a.d;
      cl localcl = localbz.a();
      localcl.b(i, parambk, "default");
      localcl.a(0);
      localcl.c();
      localbz.b();
      return;
      if (localObject == null)
      {
        localObject = localBundle1;
      }
      else
      {
        Bundle localBundle2 = new Bundle(((Bundle)localObject).size() + localBundle1.size());
        localBundle2.putAll((Bundle)localObject);
        localBundle2.putAll(localBundle1);
        localObject = localBundle2;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bhp
 * JD-Core Version:    0.7.0.1
 */