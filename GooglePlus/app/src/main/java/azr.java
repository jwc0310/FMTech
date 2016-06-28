import android.content.Context;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.stream.legacy.views.OneUpCommentViewGroup;

public final class azr
  implements atq
{
  loy a;
  String b;
  String c;
  String d;
  String e;
  String f;
  boolean g;
  long h;
  boolean i;
  int j;
  private Context k;
  
  azr(Context paramContext)
  {
    this.k = paramContext;
  }
  
  public final int a()
  {
    return -1 + bao.a;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    OneUpCommentViewGroup localOneUpCommentViewGroup1 = (OneUpCommentViewGroup)paramView;
    if (localOneUpCommentViewGroup1 == null) {}
    for (OneUpCommentViewGroup localOneUpCommentViewGroup2 = (OneUpCommentViewGroup)((LayoutInflater)this.k.getSystemService("layout_inflater")).inflate(efj.vn, paramViewGroup, false);; localOneUpCommentViewGroup2 = localOneUpCommentViewGroup1)
    {
      String str1 = this.b;
      String str2 = this.c;
      String str3 = hdo.b(this.d);
      int n;
      label149:
      AvatarView localAvatarView;
      String str5;
      if (!TextUtils.equals(str1, localOneUpCommentViewGroup2.a))
      {
        localOneUpCommentViewGroup2.a = str1;
        localOneUpCommentViewGroup2.b = str2;
        localOneUpCommentViewGroup2.c = str3;
        if (localOneUpCommentViewGroup2.b == null)
        {
          localOneUpCommentViewGroup2.b = "";
          String str7 = String.valueOf(localOneUpCommentViewGroup2.a);
          if (str7.length() == 0) {
            break label389;
          }
          "===> Author name was null for gaia id: ".concat(str7);
        }
        if (localOneUpCommentViewGroup2.k != null)
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label402;
          }
          n = 1;
          if (n != 0)
          {
            localAvatarView = localOneUpCommentViewGroup2.k;
            str5 = String.valueOf(localOneUpCommentViewGroup2.a);
            if (str5.length() == 0) {
              break label408;
            }
          }
        }
      }
      label389:
      label402:
      label408:
      for (String str6 = "comment_author_avatar_".concat(str5);; str6 = new String("comment_author_avatar_"))
      {
        localAvatarView.setTransitionName(str6);
        localOneUpCommentViewGroup2.k.ap_();
        localOneUpCommentViewGroup2.k.a(localOneUpCommentViewGroup2.b, localOneUpCommentViewGroup2.c);
        localOneUpCommentViewGroup2.l = null;
        localOneUpCommentViewGroup2.m = null;
        localOneUpCommentViewGroup2.p = true;
        localOneUpCommentViewGroup2.j = false;
        String str4 = this.e;
        Spanned localSpanned = Html.fromHtml(this.f);
        boolean bool1 = this.g;
        localOneUpCommentViewGroup2.d = str4;
        localOneUpCommentViewGroup2.e = lww.a(localSpanned);
        localOneUpCommentViewGroup2.i = bool1;
        localOneUpCommentViewGroup2.o = null;
        localOneUpCommentViewGroup2.p = true;
        long l = this.h;
        localOneUpCommentViewGroup2.f = lwd.b(localOneUpCommentViewGroup2.getContext(), l).toString();
        localOneUpCommentViewGroup2.n = null;
        localOneUpCommentViewGroup2.p = true;
        boolean bool2 = this.i;
        int m = this.j;
        localOneUpCommentViewGroup2.h = bool2;
        localOneUpCommentViewGroup2.g = m;
        localOneUpCommentViewGroup2.p = true;
        localOneUpCommentViewGroup2.q = this.a;
        localOneUpCommentViewGroup2.requestLayout();
        return localOneUpCommentViewGroup2;
        new String("===> Author name was null for gaia id: ");
        break;
        n = 0;
        break label149;
      }
    }
  }
  
  public final void a(atr paramatr) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azr
 * JD-Core Version:    0.7.0.1
 */