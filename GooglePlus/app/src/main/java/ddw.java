import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.plus.phone.PeopleHomePageActivity;

public final class ddw
  extends ci
  implements lzl
{
  private final Activity b;
  
  public ddw(PeopleHomePageActivity paramPeopleHomePageActivity, Activity paramActivity, bw parambw)
  {
    super(parambw);
    this.b = paramActivity;
  }
  
  public final bk a(int paramInt)
  {
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(33 + "Invalid item position " + paramInt);
    case 0: 
      return new byv(true);
    case 1: 
      if (this.c.h) {
        return new bxu();
      }
      return new cwr();
    }
    Object localObject;
    if (this.c.g)
    {
      localObject = new cah();
      localBundle.putBoolean("clear_db", true);
    }
    for (;;)
    {
      ((bk)localObject).f(localBundle);
      return localObject;
      localObject = new byh();
      localBundle.putInt("account_id", this.c.d.c());
      localBundle.putInt("people_view_type", 11);
      localBundle.putString("owner_id", this.c.d.f().b("gaia_id"));
      localBundle.putBoolean("use_cached_data", true);
    }
  }
  
  public final int b()
  {
    return 3;
  }
  
  public final CharSequence b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(33 + "Invalid item position " + paramInt);
    case 0: 
      return this.b.getString(aau.mu);
    case 1: 
      return this.b.getString(aau.mt);
    }
    return this.b.getString(aau.mv);
  }
  
  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    super.b(paramViewGroup, paramInt, paramObject);
    bk localbk = (bk)paramObject;
    if (this.c.f != localbk)
    {
      this.c.f = localbk;
      this.c.e.c();
    }
  }
  
  public final gxq c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(33 + "Invalid item position " + paramInt);
    case 0: 
      return new gxq(pkf.q);
    case 1: 
      return new gxq(pkf.m);
    }
    return new gxq(pkf.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddw
 * JD-Core Version:    0.7.0.1
 */