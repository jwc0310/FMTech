import android.content.Context;
import android.content.res.Resources;

public final class lco
  implements hwv
{
  public final boolean a(Exception paramException, hwu paramhwu)
  {
    boolean bool1 = paramException instanceof kdd;
    boolean bool2 = false;
    Resources localResources;
    String str;
    int i;
    int j;
    if (bool1)
    {
      kdd localkdd = (kdd)paramException;
      localResources = paramhwu.a().getResources();
      str = localkdd.b;
      if (!"MODERATOR_TOO_NEW_FOR_OWNER".equals(str)) {
        break label82;
      }
      i = efj.Xc;
      j = efj.Xb;
    }
    for (;;)
    {
      paramhwu.a(localResources.getString(i), localResources.getString(j));
      bool2 = true;
      label82:
      boolean bool3;
      do
      {
        return bool2;
        if ("SQUARE_INVITE_TOO_MANY_INVITEES".equals(str))
        {
          i = efj.Xi;
          j = efj.Xh;
          break;
        }
        if ("SOLE_OWNER_LEAVING_SQUARE".equals(str))
        {
          i = efj.Xg;
          j = efj.Xf;
          break;
        }
        if ("SQUARE_INVITE_EMPTY_CIRCLES".equals(str))
        {
          i = efj.Xa;
          j = efj.WZ;
          break;
        }
        bool3 = "SQUARE_INVITE_NOBODY_INVITED".equals(str);
        bool2 = false;
      } while (!bool3);
      i = efj.Xe;
      j = efj.Xd;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lco
 * JD-Core Version:    0.7.0.1
 */