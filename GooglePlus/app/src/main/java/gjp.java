import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gjp
  implements git, gjh, mbo, mes, meu, mez, mfa, mfb, mfd
{
  public int a = -1;
  public boolean b = true;
  private final Activity c;
  private List<giv> d = new ArrayList();
  private giz e;
  private boolean f;
  
  public gjp(Activity paramActivity, mek parammek)
  {
    this.c = paramActivity;
    parammek.a(this);
  }
  
  public gjp(Activity paramActivity, mek parammek, giz paramgiz, gix paramgix)
  {
    if (paramgix == null) {
      throw new NullPointerException();
    }
    this.c = paramActivity;
    this.e = paramgiz;
    parammek.a(this);
  }
  
  private final void h()
  {
    boolean bool;
    if (this.a == -1) {
      if (!this.b) {
        bool = true;
      }
    }
    for (;;)
    {
      if (!bool)
      {
        if (Log.isLoggable("IntentAccountHandler", 3))
        {
          int i = this.a;
          String str = String.valueOf(this.c.getClass().getName());
          new StringBuilder(62 + String.valueOf(str).length()).append("Invalid account state with accountId ").append(i).append(" for activity ").append(str);
        }
        this.a = -1;
        this.c.finish();
      }
      return;
      bool = false;
      continue;
      bool = this.e.c(this.a);
    }
  }
  
  public final git a(giv paramgiv)
  {
    this.d.add(paramgiv);
    return this;
  }
  
  public final gjp a(mbb parammbb)
  {
    parammbb.a(git.class, this);
    return this;
  }
  
  public final void a()
  {
    this.f = true;
    h();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    if (this.e == null) {
      this.e = ((giz)parammbb.a(giz.class));
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      this.a = this.c.getIntent().getIntExtra("account_id", -1);
      h();
      Iterator localIterator = this.d.iterator();
      if (localIterator.hasNext())
      {
        giv localgiv = (giv)localIterator.next();
        giu localgiu1 = giu.a;
        if (this.a != -1) {}
        for (giu localgiu2 = giu.c;; localgiu2 = giu.b)
        {
          localgiv.a(true, localgiu1, localgiu2, -1, this.a);
          break;
        }
      }
    }
    else
    {
      this.a = paramBundle.getInt("state_account_id");
    }
    this.f = true;
    this.e.a(this);
  }
  
  public final void az_()
  {
    if (this.f) {
      h();
    }
  }
  
  public final void b()
  {
    this.f = true;
    h();
  }
  
  public final void b(Bundle paramBundle)
  {
    this.f = false;
    paramBundle.putInt("state_account_id", this.a);
  }
  
  public final int c()
  {
    efj.k();
    return this.a;
  }
  
  public final boolean d()
  {
    efj.k();
    return this.a != -1;
  }
  
  public final boolean e()
  {
    efj.k();
    return (this.a != -1) && (this.e.a(this.a).a());
  }
  
  public final gjb f()
  {
    efj.k();
    return this.e.a(this.a);
  }
  
  public final void m_()
  {
    this.e.b(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjp
 * JD-Core Version:    0.7.0.1
 */