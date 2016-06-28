import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.plus.phone.HostStreamPhotosHomeTileActivity;
import java.util.Arrays;

public final class cye
  implements dha, mbo, mfd
{
  private git a;
  private final bk b;
  private jov c;
  private jpd d;
  
  public cye(bk parambk, mek parammek)
  {
    this.b = parambk;
    parammek.a(this);
  }
  
  public final void a()
  {
    jov localjov = this.c;
    jpd localjpd = this.d;
    int i = aaw.iU;
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "android.permission.CAMERA";
    arrayOfString[1] = "android.permission.READ_EXTERNAL_STORAGE";
    arrayOfString[2] = "android.permission.WRITE_EXTERNAL_STORAGE";
    localjov.a(localjpd, i, Arrays.asList(arrayOfString));
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((git)parammbb.a(git.class));
    this.c = ((jov)parammbb.a(jov.class));
    this.d = ((jpd)parammbb.a(jpd.class));
  }
  
  public final void a(String paramString)
  {
    int i = this.a.c();
    String str = jrf.a(null, this.a.f().b("gaia_id"), paramString, "ALBUM");
    Intent localIntent = efj.a(this.b.f(), i, jrf.a(3, new String[] { str }), 3, false, 1, null, true, 480, 270);
    this.b.a(localIntent, 104);
  }
  
  public final void a(boolean paramBoolean)
  {
    dbt localdbt = new dbt(this.b.f(), HostStreamPhotosHomeTileActivity.class, this.a.c());
    localdbt.a = Integer.valueOf(1);
    localdbt.f = Integer.valueOf(1);
    localdbt.g = Integer.valueOf(250);
    localdbt.h = Integer.valueOf(250);
    localdbt.c = Boolean.valueOf(true);
    localdbt.b = Integer.valueOf(1);
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      localdbt.e = Integer.valueOf(i);
      localdbt.m = Boolean.valueOf(true);
      Intent localIntent = localdbt.a();
      this.b.a(localIntent, 103);
      return;
    }
  }
  
  public final void b()
  {
    Intent localIntent = efj.a(this.b.f(), this.a.c(), jrf.a(1, new String[0]), 1, 1, false, 1, null, 250, 250);
    this.b.a(localIntent, 103);
  }
  
  public final void b(boolean paramBoolean)
  {
    dbt localdbt = new dbt(this.b.f(), HostStreamPhotosHomeTileActivity.class, this.a.c());
    localdbt.a = Integer.valueOf(1);
    localdbt.f = Integer.valueOf(3);
    localdbt.g = Integer.valueOf(480);
    localdbt.h = Integer.valueOf(270);
    localdbt.c = Boolean.valueOf(true);
    localdbt.b = Integer.valueOf(1);
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      localdbt.e = Integer.valueOf(i);
      localdbt.m = Boolean.valueOf(true);
      Intent localIntent = localdbt.a();
      this.b.a(localIntent, 104);
      return;
    }
  }
  
  public final void c()
  {
    Intent localIntent = efj.a(this.b.f(), this.a.c(), jrf.a(1, new String[0]), 1, 3, false, 1, null, 480, 270);
    this.b.a(localIntent, 104);
  }
  
  public final void d()
  {
    String str = jrf.a(null, "115239603441691718952", "5745127577944303633", "ALBUM");
    Intent localIntent = efj.a(this.b.f(), this.a.c(), jrf.a(3, new String[] { str }), 3, false, 1, null, true, 480, 270);
    this.b.a(localIntent, 109);
  }
  
  public final void e()
  {
    if (!this.b.i()) {
      return;
    }
    Context localContext = this.b.aI_();
    try
    {
      Intent localIntent = efj.a(this.b.f(), this.a.c(), jrf.a(1, new String[0]), 1, false, 1, Integer.valueOf(1), true, 250, 250);
      this.b.a(localIntent, 103);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      int i = aau.dp;
      efj.a(localContext, localContext.getResources().getText(i), 1).show();
    }
  }
  
  public final void f()
  {
    if (!this.b.i()) {
      return;
    }
    Context localContext = this.b.aI_();
    try
    {
      Intent localIntent = efj.a(this.b.f(), this.a.c(), jrf.a(1, new String[0]), 3, false, 1, Integer.valueOf(1), true, 480, 270);
      this.b.a(localIntent, 104);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      int i = aau.dp;
      efj.a(localContext, localContext.getResources().getText(i), 1).show();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cye
 * JD-Core Version:    0.7.0.1
 */