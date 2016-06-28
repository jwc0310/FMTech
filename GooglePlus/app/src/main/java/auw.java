import android.content.Context;
import android.util.Log;
import java.util.List;

public final class auw
{
  private final Context a;
  private final giz b;
  private aux c;
  
  public auw(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final void b()
  {
    if ((this.c == null) || (this.c.e)) {
      return;
    }
    aux localaux = this.c;
    localaux.c = true;
    auz localauz = localaux.d;
    if (localauz != null) {
      localauz.j = true;
    }
    if (Log.isLoggable("MediaSync", 3))
    {
      String str = String.valueOf(localauz);
      new StringBuilder(62 + String.valueOf(str).length()).append("Cancelling media store synchronizer current uri synchronizer: ").append(str);
    }
    try
    {
      this.c.join();
      return;
    }
    catch (Exception localException)
    {
      Log.e("MediaSync", "Unable to join local media sync thread", localException);
    }
  }
  
  public final void a()
  {
    try
    {
      b();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(boolean paramBoolean, aut paramaut)
  {
    for (;;)
    {
      try
      {
        List localList = this.b.a(new String[] { "logged_in" });
        auu localauu1 = auu.a(this.a, new aus(this.a), localList);
        if ((this.c != null) && (!this.c.c)) {
          if (this.c.e)
          {
            break label233;
            if (i != 0)
            {
              b();
              auu localauu2 = auu.a(this.a, new aur(this.a), localList);
              if (paramBoolean) {
                break label239;
              }
              aux localaux = this.c;
              bool1 = false;
              if (localaux != null)
              {
                boolean bool2 = this.c.e;
                bool1 = false;
                if (!bool2)
                {
                  boolean bool3 = this.c.b;
                  bool1 = false;
                  if (bool3) {
                    break label239;
                  }
                }
              }
              this.c = new aux(this.a, bool1, paramaut, localauu2, localauu1);
              this.c.start();
            }
          }
          else
          {
            boolean bool4 = localauu1.a(this.c.a).isEmpty();
            if (!bool4)
            {
              i = 1;
              continue;
            }
            i = 0;
            continue;
          }
        }
        int i = 1;
      }
      finally {}
      label233:
      continue;
      label239:
      boolean bool1 = true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auw
 * JD-Core Version:    0.7.0.1
 */