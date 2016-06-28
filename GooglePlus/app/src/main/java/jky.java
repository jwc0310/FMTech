import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

public final class jky
  implements jia
{
  private static boolean f(Context paramContext, int paramInt)
  {
    return ((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("add_circle_notice_shown");
  }
  
  private static boolean g(Context paramContext, int paramInt)
  {
    return ((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("one_click_add_circle_notice_shown");
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("add_circle_notice_shown", true).d();
  }
  
  public final void a(bk parambk, int paramInt, String paramString, Bundle paramBundle)
  {
    jkw.a(parambk, paramInt, paramString, paramBundle);
  }
  
  public final void a(bk parambk, int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    jkx.a(parambk, paramInt, paramString1, paramString2, paramString3, paramBundle);
  }
  
  public final void a(gje paramgje, osb paramosb)
  {
    if (paramosb != null)
    {
      if (efj.b(paramosb.a))
      {
        paramgje.c("add_circle_notice_shown", true);
        paramgje.c("add_circle_notice_one_time_sync", true);
      }
      if (efj.b(paramosb.b))
      {
        paramgje.c("one_click_add_circle_notice_shown", true);
        paramgje.c("one_click_add_circle_notice_one_time_sync", true);
      }
    }
  }
  
  public final boolean a(gjb paramgjb)
  {
    return paramgjb.c("add_circle_notice_one_time_sync");
  }
  
  public final void b(Context paramContext, int paramInt)
  {
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("one_click_add_circle_notice_shown", true).d();
  }
  
  public final boolean b(gjb paramgjb)
  {
    return paramgjb.c("one_click_add_circle_notice_one_time_sync");
  }
  
  public final void c(Context paramContext, int paramInt)
  {
    int i;
    int j;
    if ((!((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("add_circle_notice_one_time_sync")) && ((f(paramContext, paramInt)) || (PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("first_circle_picker", false))))
    {
      i = 1;
      if ((((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("one_click_add_circle_notice_one_time_sync")) || (!g(paramContext, paramInt))) {
        break label101;
      }
      j = 1;
      label86:
      if ((i != 0) || (j != 0)) {
        break label107;
      }
    }
    label101:
    label107:
    do
    {
      return;
      i = 0;
      break;
      j = 0;
      break label86;
      jlt localjlt = new jlt(paramContext, paramInt);
      if (i != 0)
      {
        boolean bool1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("is_plus_page");
        int m = 0;
        if (!bool1)
        {
          boolean bool3 = PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("first_circle_picker", false);
          m = 0;
          if (bool3) {
            m = 1;
          }
        }
        boolean bool2 = f(paramContext, paramInt);
        if ((m != 0) || (bool2))
        {
          if (m == 0) {
            break label272;
          }
          localjlt.c = true;
        }
      }
      for (;;)
      {
        if (j != 0) {
          localjlt.b = true;
        }
        localjlt.i();
        if (!localjlt.n()) {
          break;
        }
        int k = localjlt.o;
        Log.e("LegalNotifications", 38 + "Could not upload settings: " + k, localjlt.q);
        return;
        localjlt.a = true;
      }
      if (i != 0)
      {
        a(paramContext, paramInt);
        ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("add_circle_notice_one_time_sync", true).d();
      }
    } while (j == 0);
    label272:
    ((giz)mbb.a(paramContext, giz.class)).b(paramInt).b("one_click_add_circle_notice_one_time_sync", true).d();
  }
  
  public final boolean d(Context paramContext, int paramInt)
  {
    return !f(paramContext, paramInt);
  }
  
  public final boolean e(Context paramContext, int paramInt)
  {
    return !g(paramContext, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jky
 * JD-Core Version:    0.7.0.1
 */