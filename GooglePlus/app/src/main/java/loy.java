import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.google.android.libraries.social.stream.legacy.views.OneUpCommentViewGroup;
import java.util.ArrayList;

public class loy
  implements hdf, lxx
{
  public loy(baa parambaa) {}
  
  public void a(URLSpan paramURLSpan)
  {
    String str = paramURLSpan.getURL();
    if (aau.a(str))
    {
      this.a.ab.a(false);
      Bundle localBundle = gxy.a("extra_gaia_id", aau.b(str));
      this.a.aa.a(gxz.A, localBundle);
    }
    ((dfm)this.a.bo.a(lli.class)).a(null, null, null, str, null);
  }
  
  public void a(OneUpCommentViewGroup paramOneUpCommentViewGroup)
  {
    azx localazx;
    Resources localResources;
    bcp localbcp;
    boolean bool2;
    String str2;
    String str3;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    boolean bool3;
    boolean bool4;
    int j;
    label200:
    String[] arrayOfString;
    if (this.a.v())
    {
      localazx = this.a.ag;
      localResources = localazx.g();
      localbcp = localazx.c.b;
      String str1 = ((giz)localazx.bo.a(giz.class)).a(localazx.d).b("gaia_id");
      boolean bool1 = TextUtils.equals(str1, paramOneUpCommentViewGroup.a);
      bool2 = TextUtils.equals(str1, localbcp.j());
      str2 = paramOneUpCommentViewGroup.a;
      str3 = paramOneUpCommentViewGroup.b;
      localArrayList1 = new ArrayList(5);
      localArrayList2 = new ArrayList(5);
      bool3 = paramOneUpCommentViewGroup.h;
      bool4 = paramOneUpCommentViewGroup.i;
      if (!bool4)
      {
        if (!bool3) {
          break label429;
        }
        j = aau.ug;
        localArrayList1.add(localResources.getString(j));
        localArrayList2.add(Integer.valueOf(279));
      }
      if (!bool1) {
        break label437;
      }
      localArrayList1.add(localResources.getString(aau.ue));
      localArrayList2.add(Integer.valueOf(280));
      if ((!bool4) && ((bool2) || (bool1)))
      {
        localArrayList1.add(localResources.getString(aau.ud));
        localArrayList2.add(Integer.valueOf(284));
      }
      arrayOfString = new String[localArrayList1.size()];
      localArrayList1.toArray(arrayOfString);
      bdk localbdk = localazx.c;
      localbdk.e = false;
      localbdk.a.a();
      if (!bool4) {
        break label594;
      }
    }
    label429:
    label437:
    label594:
    for (int i = aau.uv;; i = aau.uo)
    {
      lut locallut = lut.a(localazx.g().getString(i), arrayOfString);
      locallut.m.putIntegerArrayList("comment_action", localArrayList2);
      locallut.m.putString("comment_id", paramOneUpCommentViewGroup.d);
      locallut.m.putByteArray("comment_content", lwh.a(paramOneUpCommentViewGroup.e));
      locallut.m.putBoolean("plusone_by_me", bool3);
      locallut.m.putLong("photo_id", localbcp.o());
      locallut.m.putString("comment_author_name", str3);
      locallut.m.putString("comment_author_id", str2);
      locallut.n = localazx;
      locallut.p = 0;
      locallut.a(localazx.x, "commentsdialog_delete_comment");
      return;
      j = aau.uh;
      break;
      if (bool4)
      {
        localArrayList1.add(localResources.getString(aau.uk));
        localArrayList2.add(Integer.valueOf(287));
        localArrayList1.add(localResources.getString(aau.un));
        localArrayList2.add(Integer.valueOf(281));
        if ((!bool2) || (localazx.a.contains(str2))) {
          break label200;
        }
        localArrayList1.add(localResources.getString(aau.ub, new Object[] { str3 }));
        localArrayList2.add(Integer.valueOf(293));
        break label200;
      }
      localArrayList1.add(localResources.getString(aau.uj));
      if (bool2)
      {
        localArrayList2.add(Integer.valueOf(283));
        break label200;
      }
      localArrayList2.add(Integer.valueOf(282));
      break label200;
    }
  }
  
  public void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    int i = this.a.b.c();
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      Intent localIntent = efj.a(this.a.f(), i, str2, null, 0, false);
      this.a.a(localIntent);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loy
 * JD-Core Version:    0.7.0.1
 */